package visitor;

import antlr.GrammarBaseVisitor;
import antlr.GrammarParser;
import tree.Assignment;
import tree.Initialization;

/**
 * Visitor for Initialization
 */
public class InitializationVisitor extends GrammarBaseVisitor<Initialization> {

    /**
     * Visit method for Initialization
     * @param ctx context for Initialization
     * @return Initialization object
     */
    @Override
    public Initialization visitInitialization(GrammarParser.InitializationContext ctx) {
        String ident = ctx.IDENTIFIER().getText();
        Assignment assignment = new AssignmentVisitor().visit(ctx.assignment());

        return new Initialization(ident, assignment);
    }
}
