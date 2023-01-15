package tree.cycle;

import lombok.AllArgsConstructor;
import lombok.Getter;
import tree.Expression;

import java.util.List;

@Getter
@AllArgsConstructor
public class SwitchCycle extends Cycle {
    private Expression exp;
    private List<Case> cases;

}
