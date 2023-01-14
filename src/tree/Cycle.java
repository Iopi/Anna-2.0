package tree;

import lombok.Getter;
import lombok.Setter;
import type.CycleType;

public abstract class Cycle {
    @Getter
    @Setter
    private CycleType cycleType;
}
