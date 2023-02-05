package tree;

import lombok.Getter;

import java.util.HashMap;
import java.util.List;

@Getter
public class Function extends Symbol {

    private final List<Body> funcBody;
    // table of symbols of function
    private final HashMap<String, Symbol> symbolTable;
    public int offset;

    public Function(String ident, List<Body> funcBody) {
        setIdent(ident);
        this.symbolTable = new HashMap<>();
        for (Body member : funcBody) {
            if (member.getClass().equals(Declaration.class) || member.getClass().equals(Function.class)) {
                Symbol symbol = (Symbol) member;
                symbolTable.put(symbol.getIdent(), symbol);
            }
        }
        this.funcBody = funcBody;

    }

}
