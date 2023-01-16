package tree.value;

import tree.value.Value;
import type.DataType;

public class RatioValue extends Value {

    public RatioValue(int[] value, DataType dataType) {
        setDataType(dataType);
        setValue(value);
    }
}
