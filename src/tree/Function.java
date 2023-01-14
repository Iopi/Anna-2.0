package tree;

import lombok.AllArgsConstructor;
import lombok.Getter;
import type.DataType;

import java.util.HashMap;
import java.util.List;

@Getter
@AllArgsConstructor
public class Function extends Symbol{

//    private DataType type;

    private HashMap<String, Symbol> symbolTable;

    public Function(/*DataType type, */String ident, List<Declaration> parameters) {
//        this.type = type;
        setIdent(ident);
        this.symbolTable = new HashMap<>();
        for (Symbol var : parameters) symbolTable.put(var.getIdent(), var);

    }
}
