package tree;

import lombok.AllArgsConstructor;
import lombok.Getter;
import tree.value.Value;

@Getter
@AllArgsConstructor
public class Assignment {

    private final String ident;
    private final Value value;

}
