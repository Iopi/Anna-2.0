package instruction.generator;

import instruction.InstructionGenerator;
import instruction.instruction.AbstractInstruction;
import instruction.instruction.AbstractLabel;
import pl0.type.InstructionType;
import tree.Declaration;
import tree.Function;
import tree.StatementBody;

import java.util.HashMap;
import java.util.Map;

public class FunctionGenerator {

    public static void generateFunctionInstructions(Function function, InstructionGenerator generator) {
        /* add label */
        generator.instructions.add(generator.labels.get(function.getIdent()));

        /* init stack size */
        int initSize = 3 + InstructionGenerator.getDeclarationCount(function.getSymbolTable());
        var intInstruction = AbstractInstruction.builder().instructionType(InstructionType.INT).par(initSize).level(0).build();
        generator.instructions.add(intInstruction);

        Map<String, Integer> declarations = new HashMap<>();
        int offset = 0;
        /* process statements */
        for (Object o : function.getFuncBody()) {
            if (o instanceof StatementBody) {
                StatementBodyGenerator.generateStatementBodyInstructions((StatementBody) o, generator);
            }
            if (o instanceof Declaration) {
                declarations.putIfAbsent(((Declaration) o).getIdent(), generator.declBase + (offset++));
                DeclarationGenerator.generateDeclarationInstructions((Declaration) o, generator, declarations.get(((Declaration) o).getIdent()));
            }
        }

        /* return */
        var returnInstruction = AbstractInstruction.builder().instructionType(InstructionType.RET).par(0).level(0).build();
        generator.instructions.add(returnInstruction);
    }
}
