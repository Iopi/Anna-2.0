package tree;

import lombok.AllArgsConstructor;
import lombok.Getter;
import tree.expression.Expression;
import tree.value.StringValue;

@Getter
@AllArgsConstructor
public class Assignment {

//    private final String ident;
    private final StringValue value;
    private final Expression expression;

}
