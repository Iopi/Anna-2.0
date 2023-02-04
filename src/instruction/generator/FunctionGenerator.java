package instruction.generator;

import instruction.DeclarationPayload;
import instruction.InstructionGenerator;
import instruction.instruction.AbstractInstruction;
import instruction.instruction.AbstractInstructionFactory;
import instruction.instruction.IAbstractInstruction;
import pl0.type.InstructionType;
import tree.*;
import type.DataType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static instruction.instruction.AbstractInstructionFactory.createInstruction;

public class FunctionGenerator {

    private final InstructionGenerator gen;
    private final Map<String, DeclarationPayload> localCtx;
    public int offset = 0;

    private final List<IAbstractInstruction> i;

    public FunctionGenerator(InstructionGenerator gen) {
        this.gen = gen;
        this.localCtx = new HashMap<>();
        // deep cpy
        gen.declarations.forEach((k, v) -> localCtx.putIfAbsent(k, new DeclarationPayload(
                v.getAddress(), v.getType(), v.isConstant(), v.isParameter(), v.getLevel() + 1 // fixed
        )));
        this.i = gen.instructions;
    }

    public void generateFunctionInstructions(Function f) {
        /* add label */
        i.add(gen.labels.get(f.getIdent()));

        /* init stack size */
        int initSize = gen.declBase + InstructionGenerator.getNeededDeclarationAddressCount(f.getSymbolTable());
        i.add(createInstruction(InstructionType.INT, initSize));

        /* process parameters */
        int pCount = getParameterCount(f);
        for (Object o : f.getFuncBody()) {
            if (o instanceof Declaration && ((Declaration) o).isParameter()) {
                var d = (Declaration) o;
                localCtx.putIfAbsent(((Declaration) o).getIdent(), new DeclarationPayload(
                        initSize + offset++, d.getDataType(), d.isConstant(), d.isParameter(), 0
                ));

                var lodInst = AbstractInstruction.builder().instructionType(InstructionType.LOD).level(gen.currentLevel)
                        .par(-1 * (pCount--)).build();
                i.add(lodInst);

                if (d.getDataType().equals(DataType.REAL)) {
                    lodInst = AbstractInstruction.builder().instructionType(InstructionType.LOD).level(gen.currentLevel)
                            .par(-1 * (pCount--)).build();
                    i.add(lodInst);
                }
            }
        }
        offset = 0;

        /* process statements */
        var stGen = new StatementGenerator(gen, localCtx);
        stGen.generateStatementInstructions(new Statement(f.getFuncBody()), f);

        /* return */
        i.add(createInstruction(InstructionType.RET, 0));
    }

    private int getParameterCount(Function fun) {
        int count = 0;

        for (Object o : fun.getFuncBody()) {
            if (o instanceof Declaration && ((Declaration) o).isParameter()) {
                count++;
                if (((Declaration) o).getDataType().equals(DataType.REAL))
                    count++;
            }
        }

        return count;
    }
}
