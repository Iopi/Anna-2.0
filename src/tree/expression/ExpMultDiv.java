package tree.expression;

import type.OperatorType;

public class ExpMultDiv extends AdvExpression {
    public ExpMultDiv(Expression exp1, OperatorType op, Expression exp2) {
        setExpression1(exp1);
        setOp(op);
        setExpression2(exp2);
    }
}
