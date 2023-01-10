package visitor;

import antlr.GrammarBaseVisitor;
import antlr.GrammarParser;
import tree.Variable;

import java.util.List;

public class DeclarationVisitor extends GrammarBaseVisitor<List<Variable>> {

    @Override
    public List<Variable> visitDeclaration(GrammarParser.DeclarationContext ctx) {

        return super.visitDeclaration(ctx);
    }
}
