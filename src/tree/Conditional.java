package tree;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Conditional {
    private IfCond ic;
    private ElseCond ec;
}
