package tree.condition;

import lombok.AllArgsConstructor;
import lombok.Getter;
import tree.Expression;
import tree.Statement;

@Getter
@AllArgsConstructor
public class IfCond {

    private Expression exp;
    private Statement statement;
}
