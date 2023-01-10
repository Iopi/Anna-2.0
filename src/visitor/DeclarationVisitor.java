package visitor;

import antlr.GrammarBaseVisitor;
import antlr.GrammarParser;
import tree.Node;
import tree.SingleDeclaration;

import java.util.List;

public class DeclarationVisitor extends GrammarBaseVisitor<List<SingleDeclaration>> {

    @Override
    public List<SingleDeclaration> visitDeclaration(GrammarParser.DeclarationContext ctx) {

        return super.visitDeclaration(ctx);
    }
}
