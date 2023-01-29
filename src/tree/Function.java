package tree;

import lombok.AllArgsConstructor;
import lombok.Getter;
import type.DataType;

import java.util.HashMap;
import java.util.List;

@Getter
public class Function extends Symbol {

//    private DataType type;

    private final List<Body> funcBody;

    private final HashMap<String, Symbol> symbolTable;
    public int offset;

    public Function(String ident, List<Body> funcBody) {
        setIdent(ident);
        this.symbolTable = new HashMap<>();
        for (Body member: funcBody) {
            if (member.getClass().equals(Declaration.class) || member.getClass().equals(Function.class)) {
                Symbol symbol = (Symbol) member;
                symbolTable.put(symbol.getIdent(), symbol);
            }
        }
        this.funcBody = funcBody;

    }
//    public Function(/*DataType type, */String ident, List<Declaration> parameters, Statement statement) {
////        this.type = type;
//        setIdent(ident);
//        this.statement = statement;
//        this.symbolTable = new HashMap<>();
//        for (Symbol var : parameters) symbolTable.put(var.getIdent(), var);
//
//    }
}
