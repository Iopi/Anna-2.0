package tree;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.swing.plaf.nimbus.State;
import java.util.ArrayList;
import java.util.List;

@Getter
public class Statement {
    List<Declaration> declarations;
    List<Cycle> cycles;
    List<Conditional> conditionals;
    List<String> iniVariables;
    List<String> iniFunctions;

    public Statement() {
        declarations = new ArrayList<>();
        cycles = new ArrayList<>();
        conditionals = new ArrayList<>();
        iniVariables = new ArrayList<>();
        iniFunctions = new ArrayList<>();
    }



}
