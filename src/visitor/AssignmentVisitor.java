package visitor;

import antlr.GrammarBaseVisitor;
import antlr.GrammarParser;
import tree.Assignment;
import tree.expression.Expression;
import tree.value.StringValue;
import type.DataType;

/**
 * Visitor for Assignment
 */
public class AssignmentVisitor extends GrammarBaseVisitor<Assignment> {

    /**
     * Visit method for Assignment
     *
     * @param ctx context for Assignment
     * @return Assignment object
     */
    @Override
    public Assignment visitAssignment(GrammarParser.AssignmentContext ctx) {
        Expression exp = null;
        if (ctx.expression() != null) {
            exp = new ExpressionVisitor().visit(ctx.expression());
        } else if (ctx.STRING() != null) {
            String val = ctx.STRING().getText();
            exp = new Expression(null, new StringValue(val, DataType.STRING), null);
        }

        return new Assignment(exp);
    }
}
