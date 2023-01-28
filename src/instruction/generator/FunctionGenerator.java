package instruction.generator;

import instruction.InstructionGenerator;
import instruction.instruction.AbstractInstruction;
import pl0.type.InstructionType;
import tree.*;
import type.DataType;

import java.util.HashMap;
import java.util.Map;

public class FunctionGenerator {

    private final InstructionGenerator gen;
    private final Map<String, InstructionGenerator.DeclarationPayload> localCtx;

    public FunctionGenerator(InstructionGenerator gen) {
        this.gen = gen;
        this.localCtx = new HashMap<>();
        gen.declarations.forEach((k, v) -> localCtx.putIfAbsent(k, new InstructionGenerator.DeclarationPayload(
                v.getAddress(), v.getType(), v.isConstant(), v.isParameter(), 1
        )));
    }

    public void generateFunctionInstructions(Function fun) {
        /* add label */
        gen.instructions.add(gen.labels.get(fun.getIdent()));

        /* init stack size */
        int initSize = 3 + InstructionGenerator.getDeclarationAddressCount(fun.getSymbolTable());
        var intInstruction = AbstractInstruction.builder().instructionType(InstructionType.INT).par(initSize).level(0).build();
        gen.instructions.add(intInstruction);

        int offset = 0;
        /* process parameters */
        int pCount = getParameterCount(fun);
        for (Object o : fun.getFuncBody()) {
            if (o instanceof Declaration && ((Declaration) o).isParameter()) {
                var d = (Declaration) o;
                localCtx.putIfAbsent(((Declaration) o).getIdent(), new InstructionGenerator.DeclarationPayload(
                        offset++, d.getDataType(), d.isConstant(), d.isParameter(), 0
                ));

                var lodInst = AbstractInstruction.builder().instructionType(InstructionType.LOD).level(gen.currentLevel)
                        .par(-1 * (pCount--)).build();
                gen.instructions.add(lodInst);

                if (d.getDataType().equals(DataType.REAL)) {
                    lodInst = AbstractInstruction.builder().instructionType(InstructionType.LOD).level(gen.currentLevel)
                            .par(-1 * (pCount--)).build();
                    gen.instructions.add(lodInst);
                }
            }
        }

        /* process statements */
        for (Object o : fun.getFuncBody()) {
            if (o instanceof StatementBody) {
                var sbGen = new StatementBodyGenerator(gen, localCtx);
                sbGen.generateStatementBodyInstructions((StatementBody) o);
            }
            if (o instanceof Declaration) {
                var d = (Declaration) o;
                localCtx.putIfAbsent(d.getIdent(), new InstructionGenerator.DeclarationPayload(
                        gen.declBase + (offset++), d.getDataType(), d.isConstant(), d.isParameter(), 0
                ));
                var decGen = new DeclarationGenerator(gen, localCtx);
                decGen.generateDeclarationInstructions((Declaration) o, localCtx.get(d.getIdent()).getAddress(), 0);
            }
            if (o instanceof Initialization) {
                Initialization i = (Initialization) o;
                var pl = localCtx.get(i.getName());
                if (pl == null) {
                    throw new RuntimeException(String.format("Unknown variable: %s!", i.getName()));
                }
                Declaration d = new Declaration(i.getName(), pl.getType(), pl.isConstant(), i, pl.isParameter());
                if (d.isConstant() || d.isParameter()) {
                    throw new RuntimeException(String.format("Cannot modify: %s variable", i.getName()));
                }
                var decGen = new DeclarationGenerator(gen, localCtx);
                decGen.generateDeclarationInstructions(d, pl.getAddress(), pl.getLevel());
            }
        }



        /* return */
        var returnInstruction = AbstractInstruction.builder().instructionType(InstructionType.RET).par(0).level(0).build();
        gen.instructions.add(returnInstruction);
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
