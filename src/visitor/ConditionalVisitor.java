package visitor;

import antlr.GrammarBaseVisitor;
import antlr.GrammarParser;
import tree.*;
import tree.condition.Conditional;
import tree.condition.ElseCond;
import tree.condition.IfCond;
import tree.expression.Expression;
/**
 * Visitor for Conditional
 */
public class ConditionalVisitor extends GrammarBaseVisitor<Conditional> {

    /**
     * Visit method for Conditional
     * @param ctx context for Conditional
     * @return Conditional object
     */
    @Override
    public Conditional visitConditional(GrammarParser.ConditionalContext ctx) {
        Expression exp = new ExpressionVisitor().visit(ctx.if_part().expression());
        Statement ifStatement = new StatementVisitor().visit(ctx.if_part().statement());

        Statement elseStatement = null;
        if (ctx.else_part() != null) {
            elseStatement = new StatementVisitor().visit(ctx.else_part().statement());
        }
        IfCond ic = new IfCond(exp, ifStatement);
        ElseCond ec = new ElseCond(elseStatement);

        return new Conditional(ic, ec);
    }
}
