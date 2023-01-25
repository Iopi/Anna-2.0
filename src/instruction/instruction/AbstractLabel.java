package instruction.instruction;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AbstractLabel implements IAbstractInstruction {

    private static int counter = 0;

    private String label = "L" + (counter++);

    private int address;

    @Override
    public String toString() {
        return String.format("%s", address != 0 ? address : label);
    }
}
