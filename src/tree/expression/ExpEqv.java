package tree.expression;

import type.OperatorType;

public class ExpEqv extends AdvExpression {
    public ExpEqv(Expression exp1, OperatorType op, Expression exp2) {
        setExpression1(exp1);
        setOp(op);
        setExpression2(exp2);
    }
}
