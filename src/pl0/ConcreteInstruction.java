package pl0;

import lombok.AllArgsConstructor;
import pl0.type.InstructionType;

/**
 * Represents a single PL/0+ instruction.
 */
@AllArgsConstructor
public class ConcreteInstruction {

    private final long address;
    private final InstructionType instructionType;
    private final int level;
    private final int par;

    @Override
    public String toString() {
        return String.format("%s %s %s %s", address, instructionType, level, par);
    }
}
