package tree.cycle;

import lombok.AllArgsConstructor;
import lombok.Getter;
import tree.Assignment;
import tree.Declaration;
import tree.Expression;
import tree.Statement;
import tree.cycle.Cycle;

import java.util.List;

@Getter
@AllArgsConstructor
public class ForCycle extends Cycle {

    private List<Declaration> declarations;
    private Expression exp;
    private Assignment assignment;
    private Statement statement;

}
