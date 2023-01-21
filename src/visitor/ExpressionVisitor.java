package visitor;

import antlr.GrammarBaseVisitor;
import antlr.GrammarParser;
import tree.expression.*;
import tree.Assignment;
import tree.value.*;
import type.DataType;
import type.OperatorType;


public class ExpressionVisitor extends GrammarBaseVisitor<Expression> {
    @Override
    public Expression visitExpression(GrammarParser.ExpressionContext ctx) {
        Value value = null;
        String ident = null;
        AdvExpression advExp = null;

        if (ctx.IDENTIFIER() != null){
            ident = ctx.IDENTIFIER().getText();

        } else if (ctx.INT() != null) {
            int val = Integer.parseInt(ctx.INT().getText());
            if (ctx.MINUS() != null)
                val *= -1;
            value = new IntValue(val, DataType.INT);

        } else if (ctx.real() != null) {
            int [] val = getReal(ctx.real());
            if (ctx.MINUS() != null)
                val[0] *= -1;
            value = new RealValue(val, DataType.REAL);

        } else if (ctx.ratio() != null) {
            int [] val = getRatio(ctx.ratio());
            if (ctx.MINUS() != null)
                val[0] *= -1;
            value = new RatioValue(val, DataType.RATIO);

        } else if (ctx.BOOLEAN() != null) {
            boolean val = Boolean.parseBoolean(ctx.BOOLEAN().getText());
            value = new BoolValue(val, DataType.BOOLEAN);

        } else if (ctx.exp_op() != null) {
            Expression exp1 = new ExpressionVisitor().visit(ctx.expression());
            if (ctx.exp_op().exp_mult_div() != null) {
                Expression exp2 = new ExpressionVisitor().visit(ctx.exp_op().exp_mult_div().expression());
                OperatorType op;
                if (ctx.exp_op().exp_mult_div().MULT() != null)
                    op = OperatorType.MULT;
                else
                    op = OperatorType.DIVISION;
                advExp = new ExpMultDiv(exp1, op, exp2);

            } else if (ctx.exp_op().exp_plus_minus() != null) {
                Expression exp2 = new ExpressionVisitor().visit(ctx.exp_op().exp_plus_minus().expression());
                OperatorType op;
                if (ctx.exp_op().exp_plus_minus().PLUS() != null)
                    op = OperatorType.PLUS;
                else
                    op = OperatorType.MINUS;
                advExp = new ExpPlusMinus(exp1, op, exp2);

            } else if (ctx.exp_op().exp_not() != null) {
                Expression exp2 = new ExpressionVisitor().visit(ctx.exp_op().exp_not().expression());
                advExp = new ExpNot(exp1, OperatorType.NOT, exp2);

            } else if (ctx.exp_op().exp_eqv() != null) {
                Expression exp2 = new ExpressionVisitor().visit(ctx.exp_op().exp_eqv().expression());
                OperatorType op = null;
                if (ctx.exp_op().exp_eqv().EQV_EQV() != null)
                    op = OperatorType.EQV_EQV;
                else if (ctx.exp_op().exp_eqv().NOT_EQV() != null)
                    op = OperatorType.NOT_EQV;
                else if (ctx.exp_op().exp_eqv().LESS_THAN() != null)
                    op = OperatorType.LESS_THAN;
                else if (ctx.exp_op().exp_eqv().GREATER_THAN() != null)
                    op = OperatorType.GREATER_THAN;
                else if (ctx.exp_op().exp_eqv().LESS_THAN_OR_EQV() != null)
                    op = OperatorType.LESS_THAN_OR_EQV;
                else if (ctx.exp_op().exp_eqv().GREATER_THAN_OR_EQV() != null)
                    op = OperatorType.GREATER_THAN_OR_EQV;

                advExp = new ExpEqv(exp1, op, exp2);

            } else if (ctx.exp_op().exp_and_or() != null) {
                Expression exp2 = new ExpressionVisitor().visit(ctx.exp_op().exp_and_or().expression());
                OperatorType op;
                if (ctx.exp_op().exp_and_or().AND() != null)
                    op = OperatorType.AND;
                else
                    op = OperatorType.OR;
                advExp = new ExpAndOr(exp1, op, exp2);

            }

        } else if (ctx.exp_parenthesis() != null) {
            Expression exp = new ExpressionVisitor().visit(ctx.exp_parenthesis().expression());
            advExp = new ExpParanthesis(exp);
        }

        return new Expression(ident, value, advExp);
    }

    public static Assignment getValue(GrammarParser.ValueContext valueContext) {
        if (valueContext.INT() != null) {
            int value = Integer.parseInt(valueContext.INT().getText());
            if (valueContext.MINUS() != null)
                value *= -1;
            return new Assignment(new Expression(null, new IntValue(value, DataType.INT), null));
        } else if (valueContext.real() != null) {
            int [] val = getReal(valueContext.real());
            if (valueContext.MINUS() != null)
                val[0] *= -1;
            return new Assignment(new Expression(null, new RealValue(val, DataType.REAL), null));
        } else if (valueContext.ratio() != null) {
            int [] val = getRatio(valueContext.ratio());
            if (valueContext.MINUS() != null)
                val[0] *= -1;
            return new Assignment(new Expression(null, new RatioValue(val, DataType.RATIO), null));
        } else if (valueContext.BOOLEAN() != null) {
            boolean value = Boolean.parseBoolean(valueContext.BOOLEAN().getText());
            return new Assignment(new Expression(null, new BoolValue(value, DataType.BOOLEAN), null));
        } else if (valueContext.STRING() != null) {
            String value = valueContext.STRING().getText();
            return new Assignment(new Expression(null, new StringValue(value, DataType.STRING), null));
        }

        throw new RuntimeException("Unexpected data type " + valueContext.getText());
    }

    private static int[] getRatio(GrammarParser.RatioContext real) {
        int val1 = Integer.parseInt(real.INT().get(0).getText());
        int val2 = Integer.parseInt(real.INT().get(1).getText());
        return new int[]{val1, val2};
    }
    private static int[] getReal(GrammarParser.RealContext real) {
        int val1 = Integer.parseInt(real.INT().get(0).getText());
        int val2 = Integer.parseInt(real.INT().get(1).getText());
        return new int[]{val1, val2};
    }
}
