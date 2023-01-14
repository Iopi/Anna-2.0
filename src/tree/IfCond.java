package tree;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class IfCond {

    private Expression exp;
    private Statement statement;
}
