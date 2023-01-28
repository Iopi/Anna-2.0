package instruction.generator;

import instruction.InstructionGenerator;
import instruction.instruction.AbstractInstruction;
import lombok.Data;
import pl0.type.InstructionType;
import tree.Declaration;
import type.DataType;

import java.util.HashMap;
import java.util.Map;

public class DeclarationGenerator {

    private final InstructionGenerator gen;
    private final Map<String, CurrentCtx> ctx;

    @Data
    public class CurrentCtx {
        private final Integer address;
        private final int level;
        private final DataType dp;
    }

    public DeclarationGenerator(InstructionGenerator gen, Map<String, InstructionGenerator.DeclarationPayload> localDeclCtx) {
        this.gen = gen;

        ctx = new HashMap<>();
        gen.declarations.forEach((key, value) -> ctx.putIfAbsent(key, new CurrentCtx(value.getAddress(), 1, value.getType())));
        localDeclCtx.forEach((key, value) -> ctx.putIfAbsent(key, new CurrentCtx(value.getAddress(), 1, value.getType())));
    }

    public void generateDeclarationInstructions(Declaration d, int address, int level) {
        if (d.getInitialization() == null)
            return;

        var expGen = new ExpressionGenerator(gen, ctx);
        switch (d.getDataType()) {
            case INT:
                expGen.generateIntExpressionInstructions(d.getInitialization().getAssignment().getExpression());
                break;
            case REAL:
                expGen.generateRealExpressionInstructions(d.getInitialization().getAssignment().getExpression());
                break;
            case BOOLEAN:
                break;
        }

        if (d.getDataType().equals(DataType.REAL)) {
            var stoInstruction = AbstractInstruction.builder().instructionType(InstructionType.STO).level(level).par(address + 1).build();
            gen.instructions.add(stoInstruction);
        }

        var stoInstruction = AbstractInstruction.builder().instructionType(InstructionType.STO).level(level).par(address).build();
        gen.instructions.add(stoInstruction);
    }
}
