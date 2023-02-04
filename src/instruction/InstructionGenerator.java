package instruction;

import instruction.generator.DeclarationGenerator;
import instruction.generator.FunctionGenerator;
import instruction.generator.real.RealMathGeneratorLibrary;
import instruction.instruction.AbstractInstruction;
import instruction.instruction.AbstractInstructionFactory;
import instruction.instruction.AbstractLabel;
import instruction.instruction.IAbstractInstruction;
import lombok.NonNull;
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

import static instruction.instruction.AbstractInstructionFactory.createInstruction;

/**
 * Generates PL/0 instructions from {@link Program} class, if possible.
 */
public class InstructionGenerator {
    private final Program program;

    /* set of abstract PL/0 instructions */
    public final List<IAbstractInstruction> instructions = new ArrayList<>();
    private final List<IAbstractInstruction> i = instructions; /* just for saving space when adding instruction */

    /* all registered labels */
    public final Map<String, AbstractLabel> labels = new HashMap<>();
    /* all declarations */
    public final Map<String, DeclarationPayload> declarations = new HashMap<>();
    /* fraction math = real math */
    public final RealMathGeneratorLibrary realMath = new RealMathGeneratorLibrary(this);

    public int currentLevel = 0;
    public final int declBase = 3;
    private int offset = 0;

    public InstructionGenerator(@NonNull Program program) {
        this.program = program;
    }

    public List<AbstractInstruction> generateInstructions() {
        var abstractList = generateAbstractInstructions();
        return generateConcreteInstructions(abstractList);
    }

    private List<IAbstractInstruction> generateAbstractInstructions() {

        /* check main existence */
        var mainFunction = program.getSymbolTable().get("main");
        if (mainFunction == null)
            throw new RuntimeException("No main function was found!");
        labels.putIfAbsent("main", new AbstractLabel());

        /* init stack size */
        int initSize = declBase + getNeededDeclarationAddressCount(program.getSymbolTable());
        i.add(createInstruction(InstructionType.INT, initSize));

        /* generate function labels for real math */
        realMath.genLabels();

        /* process all declarations */
        for (Object o : program.getMainBody()) {
            if (o instanceof Declaration) {
                var decl = (Declaration) o;
                var pl = new DeclarationPayload(declBase + (offset++), decl.getDataType(), decl.isConstant(), decl.isParameter(), currentLevel);
                declarations.putIfAbsent(((Declaration) o).getIdent(), pl);
                if (((Declaration) o).getDataType().equals(DataType.REAL))
                    offset++;
                var decGen = new DeclarationGenerator(this, declarations);
                decGen.generateDeclarationInstructions((Declaration) o, declarations.get(((Declaration) o).getIdent()).getAddress(), currentLevel);
            }
        }

        /* call main */
        i.add(createInstruction(InstructionType.CAL, labels.get("main")));

        /* return */
        i.add(createInstruction(InstructionType.RET, 0));

        /* process all functions */
        for (Object o : program.getMainBody()) {
            if (o instanceof Function) {
                labels.putIfAbsent(((Function) o).getIdent(), new AbstractLabel());
                var funGen = new FunctionGenerator(this);
                funGen.generateFunctionInstructions((Function) o);
            }
        }

        /* generate used functions of real math */
        realMath.genFunctions();

        return instructions;
    }

    private List<AbstractInstruction> generateConcreteInstructions(@NonNull List<IAbstractInstruction> instructions) {
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

    public static int getNeededDeclarationAddressCount(@NonNull HashMap<String, Symbol> symbolTable) {
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
