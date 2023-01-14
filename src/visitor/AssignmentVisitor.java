package visitor;

import antlr.GrammarBaseVisitor;
import antlr.GrammarParser;
import tree.Assignment;
import tree.Initialization;

public class AssignmentVisitor extends GrammarBaseVisitor<Assignment> {
    @Override
    public Assignment visitAssignment(GrammarParser.AssignmentContext ctx) {
        String ident = "";
        String value = "";
        if (ctx.expression() != null) {
            if (ctx.expression().IDENTIFIER() != null)
                ident = ctx.expression().IDENTIFIER().getText();
            else
                value = ctx.expression().getText();

        } else if (ctx.STRING() != null) {
            value = ctx.STRING().getText();
        }
        else if (ctx.ARRAY() != null) {
            value = ctx.STRING().getText();
        }

        return new Assignment(ident, value);
    }
}
