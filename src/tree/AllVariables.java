package tree;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class AllVariables {
    List<Declaration> declarations;
    List<Initialization> initializations;

    public AllVariables() {
        declarations = new ArrayList<>();
        initializations = new ArrayList<>();
    }

}
