package instruction.generator;

import instruction.InstructionGenerator;
import instruction.instruction.AbstractInstruction;
import pl0.type.InstructionType;
import tree.expression.Expression;

public class ExpressionGenerator {

    public static void generateBooleanExpressionInstructions(Expression expression, InstructionGenerator generator) {
        boolean value = (Boolean) expression.getValue().getValue();

        var expResult = AbstractInstruction.builder()
                .instructionType(InstructionType.LIT)
                .level(0)
                .par(value ? 1 : 0)
                .build();
        generator.instructions.add(expResult);

        return;
    }
}
