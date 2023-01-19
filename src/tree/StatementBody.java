package tree;

import lombok.AllArgsConstructor;
import lombok.Getter;
import tree.condition.Conditional;
import tree.cycle.Cycle;

import java.util.List;

@Getter
@AllArgsConstructor
public class StatementBody {
    Cycle cycles;
    Conditional conditionals;
    List<String> iniVariables;
    String calledFunction;

    private final int order = Order.getMyOrder();
}
