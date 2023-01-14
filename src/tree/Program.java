package tree;

import lombok.Getter;

import java.util.HashMap;
import java.util.List;

@Getter
public class Program {

    HashMap<String, Symbol> symbolTable;
    List<Initialization> initializations;

    public Program(List<Declaration> declarations, List<Function> functions, List<Initialization> initializations) {
        this.symbolTable = new HashMap<>();
        for (Symbol symbol : declarations) symbolTable.put(symbol.getIdent(), symbol);
        for (Symbol symbol : functions) symbolTable.put(symbol.getIdent(), symbol);
        this.initializations = initializations;
    }
}
