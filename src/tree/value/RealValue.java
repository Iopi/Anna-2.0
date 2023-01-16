package tree.value;

import type.DataType;

public class RealValue extends Value {

    public RealValue(int[] value, DataType dataType) {
        setDataType(dataType);
        setValue(value);
    }
}
