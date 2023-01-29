package instruction;

import instruction.generator.DeclarationGenerator;
import instruction.generator.FunctionGenerator;
import instruction.generator.real.RealMathGeneratorLibrary;
import instruction.instruction.AbstractInstruction;
import instruction.instruction.AbstractLabel;
import instruction.instruction.IAbstractInstruction;
import lombok.AllArgsConstructor;
import lombok.Data;
import pl0.type.InstructionType;
import tree.Declaration;
import tree.Function;
import tree.Program;
import tree.Symbol;
import type.DataType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InstructionGenerator {

    Program program;

    public List<IAbstractInstruction> instructions = new ArrayList<>();

    public Map<String, AbstractLabel> labels = new HashMap<>();
    public Map<String, DeclarationPayload> declarations = new HashMap<>();

    public RealMathGeneratorLibrary realMath = new RealMathGeneratorLibrary(this);

    @Data
    @AllArgsConstructor
    public static class DeclarationPayload {
        Integer address;
        DataType type;
        boolean isConstant;
        boolean isParameter;

        int level;
    }

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
        int initSize = 3 + getDeclarationAddressCount(program.getSymbolTable());
        var intInstruction = AbstractInstruction.builder().instructionType(InstructionType.INT).par(initSize).level(0).build();
        instructions.add(intInstruction);

        realMath.genLabels();

        /* process all declarations */
        for (Object o : program.getMainBody()) {
            if (o instanceof Declaration) {
                var decl = (Declaration) o;
                var pl = new DeclarationPayload(declBase + (offset++), decl.getDataType(), decl.isConstant(), decl.isParameter(), 0);
                declarations.putIfAbsent(((Declaration) o).getIdent(), pl);
                if (((Declaration) o).getDataType().equals(DataType.REAL))
                    offset++;
                var decGen = new DeclarationGenerator(this, declarations);
                decGen.generateDeclarationInstructions((Declaration) o, declarations.get(((Declaration) o).getIdent()).getAddress(), 0);
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
                var funGen = new FunctionGenerator(this);
                funGen.generateFunctionInstructions((Function) o);
            }
        }

        realMath.genFunctions();

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

    public static int getDeclarationAddressCount(HashMap<String, Symbol> symbolTable) {
        int c = 0;
        for (Map.Entry<String, Symbol> entry : symbolTable.entrySet()) {
            if (entry.getValue() instanceof Declaration && !((Declaration) entry.getValue()).isParameter()) {
                c++;
                if (((Declaration) entry.getValue()).getDataType().equals(DataType.REAL))
                    c++;
            }
        }
        return c;
    }
}
