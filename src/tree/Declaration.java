package tree;

import lombok.Getter;
import lombok.Setter;
import type.DataType;

@Getter
public class Declaration extends Symbol {

    private final DataType dataType;

    private final boolean isConstant;
    @Setter
    private boolean isParameter = false;

    private final Initialization initialization;

    public Declaration(String ident, DataType dataType, boolean isConstant, Initialization initialization) {
        setIdent(ident);
        this.dataType = dataType;
        this.isConstant = isConstant;
        this.initialization = initialization;
    }

    public Declaration(String ident, DataType dataType, boolean isConstant, Initialization initialization, boolean isParameter) {
        setIdent(ident);
        this.dataType = dataType;
        this.isConstant = isConstant;
        this.initialization = initialization;
        this.isParameter = isParameter;
    }
}
