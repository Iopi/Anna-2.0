package tree.value;

import lombok.Getter;
import lombok.Setter;
import type.DataType;

@Getter
@Setter
public abstract class Value {
    private DataType dataType;
    private Object value;
}
