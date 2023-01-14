package tree;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class ForCycle extends Cycle {

    private List<Declaration> declarations;
    private Expression exp;
    private Assignment assignment;
    private Statement statement;

}
