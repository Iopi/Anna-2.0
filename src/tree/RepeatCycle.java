package tree;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RepeatCycle extends Cycle {
    private Expression exp;
    private Statement statement;

}
