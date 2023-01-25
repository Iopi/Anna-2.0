package pl0.type;

/**
 * All PL/0+.
 */
public enum OperationType {

    EMPTY,

    /**
     * a = -a
     */
    NEGATION,

    /**
     * a = a + b
     */
    PLUS,

    /**
     * a = a - b
     */
    MINUS,

    /**
     * a = a * b
     */
    MULTIPLICATION,

    /**
     * a = a / b
     */
    DIVISION,

    /**
     * a = a % b
     */
    MODULO,

    /**
     * a = a % 2
     */
    ODD,

    /**
     * a = b
     */
    EQUAL,

    /**
     * a != b
     */
    NOT_EQUAL,

    /**
     * a < b
     */
    LESSER,

    /**
     * a >= b
     */
    GREATER_OR_EQUAL,

    /**
     * a > b
     */
    GREATER,

    /**
     * a <= b
     */
    LESSER_OR_EQUAL,

    SPECIAL_OR,

    SPECIAL_NOT
}
