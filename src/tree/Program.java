package tree;

import lombok.Getter;

import java.util.HashMap;
import java.util.List;

/**
 * Root object Program
 */
@Getter
public class Program {

    private final List<Body> mainBody;

    // global table of symbols
    private final HashMap<String, Symbol> symbolTable;

    public Program(List<Body> mainBody) {
        this.symbolTable = new HashMap<>();
        for (Body member: mainBody) {
            if (member.getClass().equals(Declaration.class) || member.getClass().equals(Function.class)) {
                Symbol symbol = (Symbol) member;
                symbolTable.put(symbol.getIdent(), symbol);
            }
        }
        this.mainBody = mainBody;

    }
}
