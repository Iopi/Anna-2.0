package tree;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class AllVariables {
    List<Variable> variables;
    List<InicialVariable> iniVariables;

    public AllVariables() {
        variables = new ArrayList<>();
        iniVariables = new ArrayList<>();
    }

}
