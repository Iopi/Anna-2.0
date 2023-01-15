package tree.value;

import type.DataType;

public class BoolValue extends Value {
    public BoolValue(boolean value, DataType dataType) {
        setDataType(dataType);
        setValue(value);
    }
}
