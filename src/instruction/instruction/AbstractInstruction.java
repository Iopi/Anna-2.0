package instruction.instruction;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import pl0.type.InstructionType;

@Getter
@Setter
@Builder
public class AbstractInstruction implements IAbstractInstruction {
    private int address;
    private AbstractLabel labelAddress;
    private InstructionType instructionType;
    private int par;
    private int level;
    private AbstractLabel label;

    @Override
    public String toString() {
        return String.format("%s %s %s %s",
                labelAddress == null ? address : labelAddress.toString(),
                instructionType, level, label != null ? label.toString() : par);
    }

    public void calculateAddress(int address) {
        if (labelAddress != null) {
            labelAddress.setAddress(address);
        } else {
            this.setAddress(address);
        }
    }
}
