package instruction.generator;

import instruction.DeclarationPayload;
import instruction.InstructionGenerator;
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
    private final Map<String, DeclarationPayload> ctx;

    public void generateCycle(@NonNull Cycle c, @NonNull Function f) {
        switch (c.getCycleType()) {
            case WHILE:
                generateWhileCycleInstructions((WhileCycle) c, f);
                break;
            case DO_WHILE:
                generateDoWhileCycleInstructions((DoWhileCycle) c, f);
                break;
            case REPEAT:
                generateUntilCycleInstructions((RepeatCycle) c, f);
                break;
            case FOR:
                generateForCycleInstructions((ForCycle) c, f);
                break;
            case SWITCH:
                generateSwitchCycleInstruction((SwitchCycle) c, f);
                break;
        }
    }

    private void generateWhileCycleInstructions(@NonNull WhileCycle c, @NonNull Function f) {
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
        gen.instructions.add(createInstruction(InstructionType.JMP, baseLabel));
        gen.instructions.add(jmpLabel);
    }

    private void generateDoWhileCycleInstructions(@NonNull DoWhileCycle c, @NonNull Function f) {
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

    private void generateUntilCycleInstructions(@NonNull RepeatCycle c, @NonNull Function f) {
        var cycle = (RepeatCycle) c;
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

    private void generateForCycleInstructions(@NonNull ForCycle c, @NonNull Function f) {
        var cycle = (ForCycle) c;


        var init = cycle.getDeclarations().get(0);
        ctx.putIfAbsent(init.getIdent(), new DeclarationPayload(
                gen.declBase + f.offset++, init.getDataType(), init.isConstant(), init.isParameter(), 0
        ));
        var decGen = new DeclarationGenerator(gen, ctx);
        gen.instructions.add(createInstruction(InstructionType.INT, 1));
        decGen.generateDeclarationInstructions(cycle.getDeclarations().get(0), ctx.get(init.getIdent()).getAddress(), 0);

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

        gen.instructions.add(createInstruction(InstructionType.JMP, baseLabel));
        gen.instructions.add(jmpLabel);
    }

    private void generateSwitchCycleInstruction(@NonNull SwitchCycle c, @NonNull Function f) {
        var cycle = (SwitchCycle) c;

        String identifier = "__i";
        Declaration d = new Declaration(identifier, DataType.INT, false,
                new Initialization(identifier, new Assignment(cycle.getExp())));
        ctx.putIfAbsent(d.getIdent(), new DeclarationPayload(
                gen.declBase + f.offset++, d.getDataType(), d.isConstant(), d.isParameter(), 0
        ));
        var decGen = new DeclarationGenerator(gen, ctx);
        gen.instructions.add(createInstruction(InstructionType.INT, 1));
        decGen.generateDeclarationInstructions(d, ctx.get(identifier).getAddress(), 0);

        for (Case _case : cycle.getCases()) {
            /* cmp */
            gen.instructions.add(createInstruction(InstructionType.LOD, ctx.get(identifier).getAddress()));
            decGen.generateOnlyExpressionInstructions(_case.getAssignment().getExpression(), d.getDataType());
            gen.instructions.add(createInstruction(InstructionType.OPR, OperationType.EQUAL.ordinal()));

            var endLabel = new AbstractLabel();
            gen.instructions.add(createInstruction(InstructionType.JMC, endLabel));

            /* body */
            StatementGenerator statGen = new StatementGenerator(gen, ctx);
            statGen.generateStatementInstructions(new Statement(_case.getStatementBody()), f);

            gen.instructions.add(endLabel);
        }
    }
}
