package tree.cycle;

import lombok.AllArgsConstructor;
import lombok.Getter;
import tree.*;

import java.util.List;

@Getter
@AllArgsConstructor
public class Case {
    private Assignment assignment;
    private List<Body> statementBody;

//    private Statement statement;

}
