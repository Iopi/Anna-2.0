package tree;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DoWhileCycle extends Cycle {
    private Expression exp;
    private Statement statement;

}
