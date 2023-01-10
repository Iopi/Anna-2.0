package tree;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Symbol {

    private String name;

    private int size;

    private int address;
}