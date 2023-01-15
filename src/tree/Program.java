package tree;

import lombok.Getter;

import java.util.HashMap;
import java.util.List;

@Getter
public class Program {

    private final HashMap<String, Symbol> symbolTable;
    private final List<Initialization> initializations;
    private final List<StatementBody> statementBodies;

    public Program(List<Declaration> declarations, List<Function> functions, List<Initialization> initializations,
                   List<StatementBody> statementBodies) {
        this.symbolTable = new HashMap<>();
        for (Symbol symbol : declarations) symbolTable.put(symbol.getIdent(), symbol);
        for (Symbol symbol : functions) symbolTable.put(symbol.getIdent(), symbol);
        this.initializations = initializations;
        this.statementBodies = statementBodies;
    }
}
