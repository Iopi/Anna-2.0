package tree;

import lombok.AllArgsConstructor;
import lombok.Getter;
import tree.expression.Expression;

@Getter
@AllArgsConstructor
public class Assignment {
    private final Expression expression;

}
