package tree;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Initialization extends Body {
    private String name;
    private Assignment assignment;
}
