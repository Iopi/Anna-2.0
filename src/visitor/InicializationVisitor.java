package visitor;

import antlr.GrammarBaseVisitor;
import antlr.GrammarParser;
import tree.InicialVariable;
import tree.Program;

import java.util.List;

public class InicializationVisitor extends GrammarBaseVisitor<List<InicialVariable>> {

    @Override
    public List<InicialVariable> visitProgram(GrammarParser.ProgramContext ctx) {
        return null;
    }
}
