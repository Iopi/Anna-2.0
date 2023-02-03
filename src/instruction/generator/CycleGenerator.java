package instruction.generator;

import instruction.InstructionGenerator;
import instruction.instruction.AbstractInstruction;
import instruction.instruction.AbstractInstructionFactory;
import instruction.instruction.AbstractLabel;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import pl0.type.InstructionType;
import pl0.type.OperationType;
import tree.*;
import tree.cycle.*;
import type.DataType;

import java.util.Map;

import static instruction.instruction.AbstractInstructionFactory.createInstruction;

@AllArgsConstructor
public class CycleGenerator {

    private final InstructionGenerator gen;
    private final Map<String, InstructionGenerator.DeclarationPayload> ctx;

    public void generateCycle(@NonNull Cycle c, @NonNull Function f) {
        switch (c.getCycleType()) {
            case WHILE:
                generateWhileCycleInstructions(c, f);
                break;
            case DO_WHILE:
                generateDoWhileCycleInstructions(c, f);
                break;
            case REPEAT:
                generateUntilCycleInstructions(c, f);
                break;
            case FOR:
                generateForCycleInstructions(c, f);
                break;
            case SWITCH:
                generateSwitchCycleInstruction(c, f);
                break;
        }
    }

    private void generateWhileCycleInstructions(@NonNull Cycle c, @NonNull Function f) {
        var cycle = (WhileCycle) c;
        var decGen = new DeclarationGenerator(gen, ctx);

        var baseLabel = new AbstractLabel();
        gen.instructions.add(baseLabel);
        decGen.generateExpressionInstructions(cycle.getExp(), DataType.INT);
        var jmpLabel = new AbstractLabel();
        gen.instructions.add(createInstruction(InstructionType.JMC, jmpLabel));
        /* body */
        var stGen = new StatementGenerator(gen, ctx);
        stGen.generateStatementInstructions(cycle.getStatement(), f);
        gen.instructions.add(createInstruction(InstructionType.CAL, baseLabel));
        gen.instructions.add(jmpLabel);
    }

    private void generateDoWhileCycleInstructions(@NonNull Cycle c, @NonNull Function f) {
        var cycle = (DoWhileCycle) c;
        var decGen = new DeclarationGenerator(gen, ctx);

        var baseLabel = new AbstractLabel();
        /* body */
        gen.instructions.add(baseLabel);
        var stGen = new StatementGenerator(gen, ctx);
        stGen.generateStatementInstructions(cycle.getStatement(), f);
        /* condition */
        decGen.generateExpressionInstructions(cycle.getExp(), DataType.INT);
        gen.instructions.add(createInstruction(InstructionType.JMC, baseLabel));
    }

    private void generateUntilCycleInstructions(@NonNull Cycle c, @NonNull Function f) {
        var cycle = (DoWhileCycle) c;
        var decGen = new DeclarationGenerator(gen, ctx);

        var baseLabel = new AbstractLabel();
        /* body */
        gen.instructions.add(baseLabel);
        var stGen = new StatementGenerator(gen, ctx);
        stGen.generateStatementInstructions(cycle.getStatement(), f);
        /* condition */
        decGen.generateExpressionInstructions(cycle.getExp(), DataType.INT);
        var i = gen.instructions;
        i.add(createInstruction(InstructionType.LIT, 1));
        i.add(createInstruction(InstructionType.OPR, OperationType.MINUS.ordinal()));
        i.add(createInstruction(InstructionType.LIT, -1));
        i.add(createInstruction(InstructionType.OPR, OperationType.MULTIPLICATION.ordinal()));
        gen.instructions.add(createInstruction(InstructionType.JMC, baseLabel));
    }

    private void generateForCycleInstructions(@NonNull Cycle c, @NonNull Function f) {
        var cycle = (ForCycle) c;
        var decGen = new DeclarationGenerator(gen, ctx);

        decGen.generateDeclarationInstructions(cycle.getDeclarations().get(0), ctx.size() + 1, 0);

        var baseLabel = new AbstractLabel();
        gen.instructions.add(baseLabel);
        decGen.generateExpressionInstructions(cycle.getExp(), DataType.INT);
        var jmpLabel = new AbstractLabel();
        gen.instructions.add(createInstruction(InstructionType.JMC, jmpLabel));

        /* body */
        var stGen = new StatementGenerator(gen, ctx);
        stGen.generateStatementInstructions(cycle.getStatement(), f);

        decGen.generateDeclarationInstructions(
                new Declaration(cycle.getInitialization().getName(), DataType.INT, false, cycle.getInitialization(), false),
                ctx.get(cycle.getInitialization().getName()).getAddress(), 0
        );

        gen.instructions.add(createInstruction(InstructionType.CAL, baseLabel));
        gen.instructions.add(jmpLabel);
    }

    private void generateSwitchCycleInstruction(@NonNull Cycle c, @NonNull Function f) {
        var cycle = (SwitchCycle) c;

        var decGen = new DeclarationGenerator(gen, ctx);
        decGen.generateDeclarationInstructions(
                new Declaration("__i", DataType.INT, false,
                        new Initialization("__i", new Assignment(cycle.getExp()))),
                ctx.size() + 1, 0);

        for (Case _case : cycle.getCases()) {
            /* cmp */
            gen.instructions.add(createInstruction(InstructionType.LOD, ctx.get("__i").getAddress()));
            decGen.generateExpressionInstructions(_case.getAssignment().getExpression(), DataType.INT);
            gen.instructions.add(createInstruction(InstructionType.OPR, OperationType.EQUAL.ordinal()));

            var endLabel = new AbstractLabel();
            gen.instructions.add(createInstruction(InstructionType.JMC, endLabel));

            /* body */
            StatementGenerator statGen = new StatementGenerator(gen, ctx);
            statGen.generateStatementInstructions(new Statement(_case.getStatementBody()), f);

            gen.instructions.add(endLabel);
        }

        return;
    }
}
