package tree.value;

import type.DataType;

public class StringValue extends Value {
    public StringValue(String value, DataType dataType) {
        setDataType(dataType);
        setValue(value);
    }
}
