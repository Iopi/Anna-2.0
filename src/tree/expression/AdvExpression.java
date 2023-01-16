package tree.expression;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import type.OperatorType;

@Getter
@Setter
public abstract class AdvExpression {
    private Expression expression1;
    private OperatorType op;
    private Expression expression2;
}
