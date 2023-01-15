package visitor;

import antlr.GrammarBaseVisitor;
import antlr.GrammarParser;
import tree.Assignment;
import tree.value.StringValue;
import tree.value.Value;
import type.DataType;

public class AssignmentVisitor extends GrammarBaseVisitor<Assignment> {
    @Override
    public Assignment visitAssignment(GrammarParser.AssignmentContext ctx) {
        String ident = null;
        Value value = null;
        if (ctx.expression() != null) {
            if (ctx.expression().IDENTIFIER() != null)
                ident = ctx.expression().IDENTIFIER().getText();
//            else // TODO
//                value = ctx.expression().getText();

        } else if (ctx.STRING() != null) {
            String val = ctx.STRING().getText();
            value = new StringValue(val, DataType.STRING);
        }
        else if (ctx.ARRAY() != null) {
            // TODO
//            value = ctx.STRING().getText();
        }

        return new Assignment(ident, value);
    }
}
