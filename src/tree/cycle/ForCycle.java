package tree.cycle;

import lombok.AllArgsConstructor;
import lombok.Getter;
import tree.Assignment;
import tree.Declaration;
import tree.expression.Expression;
import tree.Statement;

import java.util.List;

@Getter
@AllArgsConstructor
public class ForCycle extends Cycle {

    private List<Declaration> declarations;
    private Expression exp;
    private Assignment assignment;
    private Statement statement;

}
