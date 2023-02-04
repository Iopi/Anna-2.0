package instruction;

import lombok.AllArgsConstructor;
import lombok.Data;
import type.DataType;

/**
 * All necessary info for processing instructions.
 */
@Data
@AllArgsConstructor
public class DeclarationPayload {
    Integer address;
    DataType type;
    boolean isConstant;
    boolean isParameter;
    int level;
}
