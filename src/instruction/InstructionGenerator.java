package instruction;

import instruction.generator.DeclarationGenerator;
import instruction.generator.FunctionGenerator;
import instruction.instruction.AbstractInstruction;
import instruction.instruction.AbstractLabel;
import instruction.instruction.IAbstractInstruction;
import pl0.type.InstructionType;
import tree.Declaration;
import tree.Function;
import tree.Program;
import tree.Symbol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InstructionGenerator {

    Program program;

    public List<IAbstractInstruction> instructions = new ArrayList<>();

    public Map<String, AbstractLabel> labels = new HashMap<>();
    public Map<String, Integer> declarations = new HashMap<>();
    public final int declBase = 3;
    private int offset = 0;

    public int currentLevel = 0;

    public InstructionGenerator(Program program) {
        this.program = program;
    }

    public List<IAbstractInstruction> generateAbstractInstructions() {

        /* check main existence */
        var mainFunction = program.getSymbolTable().get("main");
        if (mainFunction == null)
            throw new RuntimeException("No main function was found!");
        labels.putIfAbsent("main", new AbstractLabel());

        /* init stack size */
        int initSize = 3 + getDeclarationCount(program.getSymbolTable());
        var intInstruction = AbstractInstruction.builder().instructionType(InstructionType.INT).par(initSize).level(0).build();
        instructions.add(intInstruction);

        /* process all declarations */
        for (Object o : program.getMainBody()) {
            if (o instanceof Declaration) {
                declarations.putIfAbsent(((Declaration) o).getIdent(), declBase + (offset++));
                DeclarationGenerator.generateDeclarationInstructions((Declaration) o, this, declarations.get(((Declaration) o).getIdent()));
            }
        }

        /* call main */
        var callInstruction = AbstractInstruction.builder().instructionType(InstructionType.CAL).label(labels.get("main")).level(0).build();
        instructions.add(callInstruction);

        /* return */
        var returnInstruction = AbstractInstruction.builder().instructionType(InstructionType.RET).par(0).level(0).build();
        instructions.add(returnInstruction);

        /* process all functions */
        for (Object o : program.getMainBody()) {
            if (o instanceof Function) {
                labels.putIfAbsent(((Function) o).getIdent(), new AbstractLabel());
                FunctionGenerator.generateFunctionInstructions((Function) o, this);
            }
        }

        return instructions;
    }

    public List<AbstractInstruction> generateConcreteInstructions(List<IAbstractInstruction> instructions) {
        List<AbstractLabel> labels = new ArrayList<>();
        for (int i = 0; i < instructions.size(); i++) {
            var inst = instructions.get(i);
            if (inst instanceof AbstractLabel) {
                labels.add((AbstractLabel) inst);
                var next = (AbstractInstruction) instructions.get(i + 1);
                next.setLabelAddress((AbstractLabel) inst);
            }
        }
        labels.forEach(instructions::remove);

        int counter = 0;
        List<AbstractInstruction> concreteInstructions = new ArrayList<>();
        for (IAbstractInstruction i : instructions) {
            var inst = (AbstractInstruction) i;
            inst.calculateAddress(counter++);
            concreteInstructions.add((AbstractInstruction) i);
        }

        return concreteInstructions;
    }

    public static int getDeclarationCount(HashMap<String, Symbol> symbolTable) {
        int c = 0;
        for (Map.Entry<String, Symbol> entry : symbolTable.entrySet()) {
            if (entry.getValue() instanceof Declaration)
                c++;
        }
        return c;
    }
}
