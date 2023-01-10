package tree;


import lombok.Getter;
import type.DataType;

public class Variable extends Symbol {

    @Getter
    private final DataType type;

    public Variable(String ident, DataType type) {
        setName(ident);
        this.type = type;
    }
}
