package tree.cycle;

import lombok.AllArgsConstructor;
import lombok.Getter;
import tree.Assignment;
import tree.Declaration;
import tree.Initialization;
import tree.StatementBody;

import java.util.List;

@Getter
@AllArgsConstructor
public class Case {
    private Assignment assignment;
    private List<Declaration> declarations;
    private List<Initialization> initializations;
    private List<StatementBody> statementBodies;
//    private Statement statement;

}
