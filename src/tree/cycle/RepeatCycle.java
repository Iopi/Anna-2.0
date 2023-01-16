package tree.cycle;

import lombok.AllArgsConstructor;
import lombok.Getter;
import tree.expression.Expression;
import tree.Statement;

@Getter
@AllArgsConstructor
public class RepeatCycle extends Cycle {
    private Expression exp;
    private Statement statement;

}
