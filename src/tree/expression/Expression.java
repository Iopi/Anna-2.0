package tree.expression;

import lombok.AllArgsConstructor;
import lombok.Getter;
import tree.value.Value;

@Getter
@AllArgsConstructor
public class Expression {
    private final String ident;
    private final Value value;
    private final AdvExpression advExpression;
}
