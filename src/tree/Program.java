package tree;

import lombok.Getter;

import java.util.HashMap;
import java.util.List;

@Getter
public class Program {

    HashMap<String, Symbol> symbolTable;
    List<InicialVariable> iniVariables;

    public Program(List<Variable> declarations, List<Function> functions, List<InicialVariable> iniVariables) {
        this.symbolTable = new HashMap<>();
        for (Symbol symbol : declarations) symbolTable.put(symbol.getName(), symbol);
        for (Symbol symbol : functions) symbolTable.put(symbol.getName(), symbol);
        this.iniVariables = iniVariables;
    }
}
