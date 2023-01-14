package visitor;

import antlr.GrammarBaseVisitor;
import antlr.GrammarParser;
import tree.Cycle;
import tree.Expression;

public class ExpressionVisitor extends GrammarBaseVisitor<Expression> {
    @Override
    public Expression visitExpression(GrammarParser.ExpressionContext ctx) {
        return new Expression();
    }
}
