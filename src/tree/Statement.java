package tree;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.swing.plaf.nimbus.State;
import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public class Statement {
    List<Declaration> declarations;
    List<Initialization> initializations;
    List<StatementBody> statementBodies;


}
