package visitor;

import antlr.GrammarBaseVisitor;
import antlr.GrammarParser;
import tree.Assignment;
import tree.expression.Expression;
import tree.value.*;
import type.DataType;

public class AssignmentVisitor extends GrammarBaseVisitor<Assignment> {
    @Override
    public Assignment visitAssignment(GrammarParser.AssignmentContext ctx) {
//        String ident = null;
        StringValue value = null;
        Expression exp = null;
        if (ctx.expression() != null) {
            exp = new ExpressionVisitor().visit(ctx.expression());
        } else if (ctx.STRING() != null) {
            String val = ctx.STRING().getText();
            value = new StringValue(val, DataType.STRING);
        } else if (ctx.ARRAY() != null) {
            // TODO
//            value = ctx.STRING().getText();
        }

        return new Assignment(value, exp);
    }
}
