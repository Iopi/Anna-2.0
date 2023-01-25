package instruction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import pl0.type.InstructionType;
import pl0.type.OperationType;

@Builder
@AllArgsConstructor
@Getter
public class PL0Instruction {

    private final InstructionType instructionType;
    private final OperationType operationType;
    private final Integer value;
    private final Label label;
    private Integer level = 0;

    @Override
    public String toString() {
        String opOrVal = (operationType == null) ? value.toString() : "" + OperationType.valueOf(operationType.name()).ordinal();
        return String.format("%s %s %s %s", 0, instructionType, 0, opOrVal);
    }
}
