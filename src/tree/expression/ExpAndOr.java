package tree.expression;

import type.OperatorType;

public class ExpAndOr extends AdvExpression {
    public ExpAndOr(Expression exp1, OperatorType op, Expression exp2) {
        setExpression1(exp1);
        setOp(op);
        setExpression2(exp2);
    }
}
