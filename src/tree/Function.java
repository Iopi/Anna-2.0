package tree;

import lombok.AllArgsConstructor;
import lombok.Getter;
import type.DataType;

import java.util.HashMap;
import java.util.List;

@Getter
public class Function extends Symbol{

//    private DataType type;

    private final HashMap<String, Symbol> symbolTable;
    private final Statement statement;

    public Function(/*DataType type, */String ident, List<Declaration> parameters, Statement statement) {
//        this.type = type;
        setIdent(ident);
        this.statement = statement;
        this.symbolTable = new HashMap<>();
        for (Symbol var : parameters) symbolTable.put(var.getIdent(), var);

    }
}
