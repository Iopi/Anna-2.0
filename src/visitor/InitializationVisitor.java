package visitor;

import antlr.GrammarBaseVisitor;
import antlr.GrammarParser;
import tree.Assignment;
import tree.Initialization;


public class InitializationVisitor extends GrammarBaseVisitor<Initialization> {

    @Override
    public Initialization visitInitialization(GrammarParser.InitializationContext ctx) {
        String ident = ctx.IDENTIFIER().getText();
        Assignment assignment = new AssignmentVisitor().visit(ctx.assignment());

        return new Initialization(ident, assignment);
    }
}
