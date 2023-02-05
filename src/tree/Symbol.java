package tree;

import lombok.Getter;
import lombok.Setter;

/**
 * Symbol of table of symbols
 */
@Getter
@Setter
public abstract class Symbol extends Body {

    private String ident;

}
