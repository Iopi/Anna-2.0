package tree;

public class Order {

    private static int instructionOrder = 0;

    public static int getMyOrder() {
        instructionOrder = instructionOrder + 1;
        return instructionOrder;
    }
}
