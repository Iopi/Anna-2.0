package tree.value;

import type.DataType;

public class IntValue extends Value {
    public IntValue(int value, DataType dataType) {
        setDataType(dataType);
        setValue(value);
    }
}
