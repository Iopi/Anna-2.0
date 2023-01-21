package tree;

import lombok.Getter;
import type.DataType;

@Getter
public class Parameter extends Symbol {
    private final DataType dataType;

    public Parameter(String ident, DataType dataType) {
        this.dataType = dataType;
        setIdent(ident);
    }
}
