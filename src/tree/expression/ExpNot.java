package tree.expression;

import type.OperatorType;

public class ExpNot extends AdvExpression {
    public ExpNot(Expression exp1, OperatorType op, Expression exp2) {
        setExpression1(exp1);
        setOp(op);
        setExpression2(exp2);
    }
}
