package instruction.generator;

import instruction.InstructionGenerator;
import tree.*;

import java.util.HashMap;
import java.util.Map;

public class StatementGenerator {

    private final InstructionGenerator gen;
    private final Map<String, InstructionGenerator.DeclarationPayload> localCtx;

    public StatementGenerator(InstructionGenerator gen, Map<String, InstructionGenerator.DeclarationPayload> ctx) {
        this.gen = gen;
        this.localCtx = new HashMap<>();
        ctx.forEach((k, v) -> localCtx.putIfAbsent(k, new InstructionGenerator.DeclarationPayload(
                v.getAddress(), v.getType(), v.isConstant(), v.isParameter(), v.getLevel()
        )));
    }

    public void generateStatementInstructions(Statement statement, Function function) {
        var arr = statement.getStatementBody();
        if (arr == null)
            return;
        /* process statements */
        for (Object o : arr) {
            if (o instanceof StatementBody) {
                var sbGen = new StatementBodyGenerator(gen, localCtx);
                sbGen.generateStatementBodyInstructions((StatementBody) o, function);
            }
            if (o instanceof Declaration) {
                var d = (Declaration) o;
                localCtx.putIfAbsent(d.getIdent(), new InstructionGenerator.DeclarationPayload(
                        gen.declBase + (function.offset++), d.getDataType(), d.isConstant(), d.isParameter(), 0
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
    }
}
