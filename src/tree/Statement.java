package tree;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.swing.plaf.nimbus.State;
import java.util.ArrayList;
import java.util.List;

@Getter
public class Statement {
    List<Declaration> declarations;
    List<String> iniVariables;
    List<String> iniFunctions;

    public Statement() {
        declarations = new ArrayList<>();
        iniVariables = new ArrayList<>();
        iniFunctions = new ArrayList<>();
    }



}
