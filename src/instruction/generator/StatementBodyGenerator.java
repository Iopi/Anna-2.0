package instruction.generator;

import instruction.InstructionGenerator;
import instruction.Label;
import instruction.instruction.AbstractInstruction;
import instruction.instruction.AbstractLabel;
import pl0.type.InstructionType;
import tree.StatementBody;

public class StatementBodyGenerator {

    public static void generateStatementBodyInstructions(StatementBody body, InstructionGenerator generator) {
        if (body.getCalledFunction() != null) {
            if (body.getCalledFunction().equals("main"))
                throw new RuntimeException("Cannot call main function!");
            var callInstruction = AbstractInstruction.builder().
                    instructionType(InstructionType.CAL).
                    label(generator.labels.get(body.getCalledFunction())).level(generator.currentLevel + 1)
                    .build();
            generator.instructions.add(callInstruction);
        } else if (body.getConditionals() != null) {
            var conditional = body.getConditionals();
            ExpressionGenerator.generateBooleanExpressionInstructions(conditional.getIc().getExp(), generator);
            /* cmp */
            var elseJump = new AbstractLabel();
            var jmpInst = AbstractInstruction.builder().instructionType(InstructionType.JMC)
                    .label(elseJump).level(0).build();
            generator.instructions.add(jmpInst);
            /* process if */
            /* process else*/
            generator.instructions.add(elseJump);
        }
    }
}
