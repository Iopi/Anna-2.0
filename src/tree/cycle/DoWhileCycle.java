package tree.cycle;

import lombok.AllArgsConstructor;
import lombok.Getter;
import tree.Expression;
import tree.Statement;

@Getter
@AllArgsConstructor
public class DoWhileCycle extends Cycle {
    private Expression exp;
    private Statement statement;

}
