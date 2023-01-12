package tree;

import lombok.AllArgsConstructor;
import lombok.Getter;
import type.DataType;

import java.util.HashMap;
import java.util.List;

@Getter
@AllArgsConstructor
public class Function extends Symbol {

//    private DataType type;

    HashMap<String, Symbol> symbolTable;

    public Function(/*DataType type, */String ident, List<Variable> parameters) {
        super();
        setName(ident);
//        this.type = type;
        this.symbolTable = new HashMap<>();
        for (Symbol symbol : parameters) symbolTable.put(symbol.getName(), symbol);

    }
}
