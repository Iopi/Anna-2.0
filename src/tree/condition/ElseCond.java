package tree.condition;

import lombok.AllArgsConstructor;
import lombok.Getter;
import tree.Statement;

@Getter
@AllArgsConstructor
public class ElseCond {
    private Statement statement;
}
