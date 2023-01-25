package instruction.generator;

import instruction.InstructionGenerator;
import instruction.instruction.AbstractInstruction;
import pl0.type.InstructionType;
import tree.Declaration;

public class DeclarationGenerator {

    public static void generateDeclarationInstructions(Declaration d, InstructionGenerator generator, int storage) {
        /* TODO refactor */
        int integerValue = (Integer) d.getInitialization().getAssignment().getExpression().getValue().getValue();

        /* store */
        var litInstruction = AbstractInstruction.builder()
                .instructionType(InstructionType.LIT)
                .level(0)
                .par(integerValue)
                .build();
        var stoInstruction = AbstractInstruction.builder()
                .instructionType(InstructionType.STO)
                .level(0)
                .par(storage)
                .build();
        generator.instructions.add(litInstruction);
        generator.instructions.add(stoInstruction);
    }
}
