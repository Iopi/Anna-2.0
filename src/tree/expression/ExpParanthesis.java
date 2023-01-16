package tree.expression;

import type.OperatorType;

public class ExpParanthesis extends AdvExpression {

    public ExpParanthesis(Expression expression1) {
        setExpression1(expression1);
        setOp(null);
        setExpression2(null);
    }
}
