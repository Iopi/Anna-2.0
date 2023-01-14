package tree;

import lombok.AllArgsConstructor;
import lombok.Getter;
import type.DataType;

@Getter
public class Declaration extends Symbol {

//    private Variable variable;
    private final DataType dataType;

    private final boolean isConstant;

    private final Initialization initialization;

    public Declaration(String ident, DataType dataType, boolean isConstant, Initialization initialization) {
        setIdent(ident);
        this.dataType = dataType;
        this.isConstant = isConstant;
        this.initialization = initialization;
    }
}
