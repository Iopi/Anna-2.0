package tree;

import lombok.AllArgsConstructor;
import lombok.Getter;
import tree.condition.Conditional;
import tree.cycle.Cycle;

import java.util.List;

@Getter
@AllArgsConstructor
public class StatementBody extends Body{
    Cycle cycles;
    Conditional conditionals;
    List<String> iniVariables;
    String calledFunction;

}
