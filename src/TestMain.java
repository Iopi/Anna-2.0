import pl0.ConcreteInstruction;
import pl0.type.InstructionType;

public class TestMain {

    public static void main(String[] args) {
        ConcreteInstruction ci = new ConcreteInstruction(1, InstructionType.JMC, 0, 5);
        System.out.println(ci.toString());
    }
}
