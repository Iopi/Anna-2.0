package instruction.instruction;

import pl0.type.InstructionType;
import pl0.type.OperationType;

public class AbstractInstructionFactory {

    public static AbstractInstruction createInstruction(InstructionType instType, int par) {
        return AbstractInstruction.builder().instructionType(instType).par(par).build();
    }

    public static AbstractInstruction createInstruction(InstructionType instType, AbstractLabel label) {
        return AbstractInstruction.builder().instructionType(instType).label(label).build();
    }

    public static AbstractInstruction createInstruction(InstructionType instType, AbstractLabel label, int level) {
        return AbstractInstruction.builder().instructionType(instType).label(label).level(level).build();
    }
}
