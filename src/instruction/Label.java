package instruction;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Label {

    private final String label;
    private Long address = null;

    public Label(String label) {
        this.label = label;
    }
}
