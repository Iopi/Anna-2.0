package type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum DataType {
    VOID("void"),
    INT("int"),
    REAL("real"),
    RATIO("ratio"),
    BOOLEAN("boolean"),
    STRING("string"),
    ARRAY("array");

    @Getter
    private final String syntax;

    public static DataType getType(String name) {
        for (DataType type: DataType.values()) {
            if (type.syntax.equals(name)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown data type - " + name);
    }
}

