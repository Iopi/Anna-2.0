package instruction.generator;

import instruction.InstructionGenerator;
import instruction.instruction.AbstractInstruction;
import instruction.instruction.AbstractInstructionFactory;
import instruction.instruction.AbstractLabel;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import pl0.type.InstructionType;
import pl0.type.OperationType;
import tree.Function;
import tree.cycle.Cycle;
import tree.cycle.DoWhileCycle;
import tree.cycle.WhileCycle;
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
                break;
            case SWITCH:
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
}
