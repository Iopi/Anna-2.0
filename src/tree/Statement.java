package tree;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.swing.plaf.nimbus.State;
import java.util.ArrayList;
import java.util.List;

@Getter
public class Statement extends Symbol {
    List<Variable> variables;
    List<String> iniVariables;
    List<String> iniFunctions;

    public Statement() {

        variables = new ArrayList<>();
        iniVariables = new ArrayList<>();
        iniFunctions = new ArrayList<>();
    }



}
