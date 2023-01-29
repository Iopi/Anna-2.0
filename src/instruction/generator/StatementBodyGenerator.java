package instruction.generator;

import instruction.InstructionGenerator;
import instruction.instruction.AbstractInstruction;
import instruction.instruction.AbstractInstructionFactory;
import instruction.instruction.AbstractLabel;
import pl0.type.InstructionType;
import tree.Function;
import tree.StatementBody;
import type.DataType;

import javax.xml.stream.FactoryConfigurationError;
import java.util.Map;

public class StatementBodyGenerator {

    private final InstructionGenerator gen;

    private final Map<String, InstructionGenerator.DeclarationPayload> ctx;

    public StatementBodyGenerator(InstructionGenerator gen, Map<String, InstructionGenerator.DeclarationPayload> ctx) {
        this.gen = gen;
        this.ctx = ctx;
    }

    public void generateStatementBodyInstructions(StatementBody sBody, Function function) {
        var i = gen.instructions;
        if (sBody.getCalledFunction() != null) {
            if (sBody.getCalledFunction().equals("main"))
                throw new RuntimeException("Cannot call main function!");

            /* prepare parameters */
            int usedAddresses = 0;
            for (String parameter : sBody.getIniVariables()) {
                usedAddresses++;

                var address = ctx.get(parameter).getAddress();
                var lodIns = AbstractInstruction.builder().instructionType(InstructionType.LOD).level(gen.currentLevel + 1)
                        .par(address).build();
                gen.instructions.add(lodIns);
                var type = ctx.get(parameter).getType();

                if (type.equals(DataType.REAL)) {
                    usedAddresses++;
                    lodIns = AbstractInstruction.builder().instructionType(InstructionType.LOD).level(gen.currentLevel + 1)
                            .par(address + 1).build();
                    gen.instructions.add(lodIns);
                }
            }

            var cIns = AbstractInstruction.builder().
                    instructionType(InstructionType.CAL).label(gen.labels.get(sBody.getCalledFunction())).level(gen.currentLevel + 1)
                    .build();
            gen.instructions.add(cIns);

            /* cleanup parameters */
            var intInst = AbstractInstruction.builder().instructionType(InstructionType.INT).level(gen.currentLevel)
                    .par(-1 * usedAddresses).build();
            gen.instructions.add(intInst);
        } else if (sBody.getConditionals() != null) {
            var conditional = sBody.getConditionals();
            /* if */
            var ifCond = conditional.getIc();
            var decGen = new DeclarationGenerator(gen, ctx);
            /* generate condition */
            decGen.generateExpressionInstructions(ifCond.getExp(), DataType.BOOLEAN);
            var jmpLabel = new AbstractLabel();
            i.add(AbstractInstructionFactory.createInstruction(InstructionType.JMC, jmpLabel));
            /* process if body */
            var stGen = new StatementGenerator(gen, ctx);
            stGen.generateStatementInstructions(ifCond.getStatement(), function);
            i.add(jmpLabel);
            /* process else body */
            if (conditional.getEc() != null) {
                stGen.generateStatementInstructions(conditional.getEc().getStatement(), function);
            }
        }
    }

//    public static void generateStatementBodyInstructions(StatementBody body, InstructionGenerator generator) {
//        if (body.getCalledFunction() != null) {
//            if (body.getCalledFunction().equals("main"))
//                throw new RuntimeException("Cannot call main function!");
//            var callInstruction = AbstractInstruction.builder().
//                    instructionType(InstructionType.CAL).
//                    label(generator.labels.get(body.getCalledFunction())).level(generator.currentLevel + 1)
//                    .build();
//            generator.instructions.add(callInstruction);
//        } else if (body.getConditionals() != null) {
//            var conditional = body.getConditionals();
////            ExpressionGenerator.generateBooleanExpressionInstructions(conditional.getIc().getExp(), generator);
//            /* cmp */
//            var elseJump = new AbstractLabel();
//            var jmpInst = AbstractInstruction.builder().instructionType(InstructionType.JMC)
//                    .label(elseJump).level(0).build();
//            generator.instructions.add(jmpInst);
//            /* process if */
//            /* process else*/
//            generator.instructions.add(elseJump);
//        }
//    }
}
