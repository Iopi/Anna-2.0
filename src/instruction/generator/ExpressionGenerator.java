package instruction.generator;

import instruction.InstructionGenerator;
import instruction.instruction.AbstractInstruction;
import lombok.AllArgsConstructor;
import pl0.type.InstructionType;
import pl0.type.OperationType;
import tree.expression.Expression;
import tree.value.Value;
import type.DataType;
import type.OperatorType;

import java.util.Map;

@AllArgsConstructor
public class ExpressionGenerator {

    private final InstructionGenerator gen;
    private final Map<String, DeclarationGenerator.CurrentCtx> ctx;

    /**
     * Generates integer expression instructions if possible.
     * If not possible throws runtime exception with appropriate error message.
     *
     * @param ex expression
     */
    public void generateIntExpressionInstructions(Expression ex) {
        var lOver = createInstruction(processIntExpression(ex));
        if (lOver != null) {
            gen.instructions.add(lOver);
        }
    }

    public void generateRealExpressionInstructions(Expression ex) {
        var rem = processRealExpression(ex);
        if (rem != null) {
            gen.instructions.add(createInstruction(rem[0]));
            gen.instructions.add(createInstruction(rem[1]));
        }
    }

    private ValuePayload processIntExpression(Expression ex) {
        /* check if expression exists */
        if (ex == null) {
            return null;
        }
        /* check if expression has correct value */
        var val = ex.getValue();
        /* number value */
        if (val != null) {
            if (!val.getDataType().equals(DataType.INT))
                throw new RuntimeException("Expression type mismatch! Expected integer!");
            return new ValuePayload(null, (Integer) val.getValue(), 0);
        }
        /* identifier value */
        if (ex.getIdent() != null) {
            return new ValuePayload(ex.getIdent(), null, 0);
        }

        /* left child */
        var left = createInstruction(processIntExpression(ex.getAdvExpression().getExpression1()));
        /* right child */
        var right = createInstruction(processIntExpression(ex.getAdvExpression().getExpression2()));
        /* check if at least one have value */
        if (left == null && right == null) {
            return null;
        }

        /* get operation and check if it exists and is defined */
        var op = this.getIntOp(ex.getAdvExpression().getOp());
        if (op == null) {
            throw new RuntimeException("Undefined integer operation!");
        }

        if (left != null) {
            gen.instructions.add(left);
        }
        if (right != null) {
            gen.instructions.add(right);
        }
        var oprOp = AbstractInstruction.builder().instructionType(InstructionType.OPR).level(0).par(op.ordinal()).build();
        gen.instructions.add(oprOp);

        return null;
    }

    private ValuePayload[] processRealExpression(Expression ex) {
        /* check if expression exists */
        if (ex == null) {
            return null;
        }
        /* check if expression has correct value */
        var val = ex.getValue();
        /* number value */
        if (val != null) {
            if (!val.getDataType().equals(DataType.REAL))
                throw new RuntimeException("Expression type mismatch! Expected real!");
            var real = (int[]) val.getValue();
            return new ValuePayload[]{
                    new ValuePayload(null, real[0], 0),
                    new ValuePayload(null, real[1], 1)
            };
        }
        /* identifier value */
        if (ex.getIdent() != null) {
            return new ValuePayload[]{
                    new ValuePayload(ex.getIdent(), null, 0),
                    new ValuePayload(ex.getIdent(), null, 1)
            };
        }

        return null;
    }

    private AbstractInstruction createInstruction(ValuePayload payload) {
        if (payload == null)
            return null;
        AbstractInstruction inst = null;
        if (payload.value != null) {
            inst = AbstractInstruction.builder().instructionType(InstructionType.LIT).level(0).par(payload.value).build();
        }
        if (payload.variable != null) {
            var info = ctx.get(payload.variable);
            Integer address = info.getAddress();
            if (address == null)
                throw new RuntimeException("Unknown variable!");
            inst = AbstractInstruction.builder().instructionType(InstructionType.LOD).level(info.getLevel()).par(address + payload.offset).build();
        }

        return inst;
    }

    private OperationType getIntOp(OperatorType opType) {
        if (opType == null)
            return null;
        switch (opType) {
            case MULT:
                return OperationType.MULTIPLICATION;
            case DIVISION:
                return OperationType.DIVISION;
            case PLUS:
                return OperationType.PLUS;
            case MINUS:
                return OperationType.MINUS;
            case EQV_EQV:
            case NOT_EQV:
            case LESS_THAN:
            case GREATER_THAN:
            case LESS_THAN_OR_EQV:
            case GREATER_THAN_OR_EQV:
            case AND:
            case OR:
            case NOT:
                throw new RuntimeException("Usage of not specified operation on type: integer!");
        }
        return null;
    }

    @AllArgsConstructor
    private class ValuePayload {
        String variable;
        Integer value;
        int offset;
    }
}
