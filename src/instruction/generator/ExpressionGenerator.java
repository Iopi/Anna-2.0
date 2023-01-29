package instruction.generator;

import instruction.InstructionGenerator;
import instruction.Label;
import instruction.generator.real.RealUtils;
import instruction.instruction.AbstractInstruction;
import instruction.instruction.AbstractInstructionFactory;
import instruction.instruction.AbstractLabel;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import pl0.type.InstructionType;
import pl0.type.OperationType;
import tree.expression.Expression;
import type.DataType;
import type.OperatorType;

import java.util.Map;

import static instruction.instruction.AbstractInstructionFactory.createInstruction;

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
    public void generateIntExpressionInstructions(@NonNull Expression ex) {
        var lOver = createInstructionFromPayload(processIntExpression(ex));
        if (lOver != null) {
            gen.instructions.add(lOver);
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
        var left = createInstructionFromPayload(processIntExpression(ex.getAdvExpression().getExpression1()));
        /* right child */
        var right = createInstructionFromPayload(processIntExpression(ex.getAdvExpression().getExpression2()));
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

    /**
     * Generates real expression instructions if possible.
     * If not possible throws runtime exception with appropriate error message.
     *
     * @param ex expression
     */
    public void generateRealExpressionInstructions(@NonNull Expression ex) {
        var rem = processRealExpression(ex);
        if (rem != null) {
            gen.instructions.add(createInstructionFromPayload(rem[0]));
            gen.instructions.add(createInstructionFromPayload(rem[1]));
        }
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

        /* left child */
        var leftTree = processRealExpression(ex.getAdvExpression().getExpression1());
        var l1 = createInstructionFromPayload(leftTree[0]);
        var l2 = createInstructionFromPayload(leftTree[1]);
        /* right child */
        var rightTree = processRealExpression(ex.getAdvExpression().getExpression2());
        var r1 = createInstructionFromPayload(rightTree[0]);
        var r2 = createInstructionFromPayload(rightTree[1]);
        /* check if at least one have value */
        if (l1 == null && r1 == null) {
            return null;
        }

        /* get operation and check if it exists and is defined */
        var opLabel = this.getRealOp(ex.getAdvExpression().getOp());
        if (opLabel == null) {
            throw new RuntimeException("Undefined real operation!");
        }

        if (l1 != null) {
            var truePar = RealUtils.convertToFraction(l1.getPar(), l2.getPar());
            l1.setPar(truePar[0]);
            l2.setPar(truePar[1]);
            gen.instructions.add(l1);
            gen.instructions.add(l2);
        }
        if (r1 != null) {
            var truePar = RealUtils.convertToFraction(r1.getPar(), r2.getPar());
            r1.setPar(truePar[0]);
            r2.setPar(truePar[1]);
            gen.instructions.add(r1);
            gen.instructions.add(r2);
        }

        gen.instructions.add(createInstruction(InstructionType.CAL, opLabel, 1));
        gen.instructions.add(createInstruction(InstructionType.INT, -2));
        return null;
    }

    /**
     * Generates boolean expression instructions if possible.
     * If not possible throws runtime exception with appropriate error message.
     *
     * @param ex expression
     */
    public void generateBoolExpressionInstructions(Expression ex) {
        var res = processBoolExpression(ex, 0);
        if (res != null && res.valuePayload1 != null) {
            if (!res.type.equals(DataType.BOOLEAN))
                throw new RuntimeException("Only boolean accepted!");
            var lOp = createInstructionFromPayload(res.valuePayload1);
            gen.instructions.add(lOp);
            return;
        }
        if (res != null && res.type != null) {
            /* perform boolean op */
            var i = gen.instructions;
            if (ex.getAdvExpression().getOp() != null) {
                switch (res.type) {
                    case INT:
                        var op = getIntBoolOp(ex.getAdvExpression().getOp());
                        gen.instructions.add(createInstruction(InstructionType.OPR, op.ordinal()));
                        break;
                    case REAL:
                        var opLabel = getRealBoolOp(ex.getAdvExpression().getOp());
                        gen.instructions.add(createInstruction(InstructionType.CAL, opLabel, 1));
                        break;
                    case BOOLEAN:
                        op = getBoolOp(ex.getAdvExpression().getOp());
                        if (op.equals(OperationType.SPECIAL_OR)) {
                            i.add(createInstruction(InstructionType.OPR, OperationType.PLUS.ordinal()));
                            i.add(createInstruction(InstructionType.LIT, 1));
                            i.add(createInstruction(InstructionType.OPR, OperationType.GREATER_OR_EQUAL.ordinal()));
                        } else if (op.equals(OperationType.SPECIAL_NOT)) {
                            i.add(createInstruction(InstructionType.OPR, OperationType.MINUS.ordinal()));
                            i.add(createInstruction(InstructionType.LIT, -1));
                            i.add(createInstruction(InstructionType.OPR, OperationType.MULTIPLICATION.ordinal()));
                        } else {
                            i.add(createInstruction(InstructionType.OPR, op.ordinal()));
                        }
                        break;
                }
            }
        }
    }

    private BoolValuePayload processBoolExpression(Expression ex, int level) {
        /* check if expression exists */
        if (ex == null) {
            return null;
        }
        /* check if expression has correct value */
        var val = ex.getValue();
        /* process value */
        if (val != null) {
            var type = val.getDataType();
            switch (type) {
                case INT:
                    return new BoolValuePayload(type, new ValuePayload(null, (Integer) val.getValue(), 0), null);
                case REAL:
                    var real = (int[]) val.getValue();
                    return new BoolValuePayload(type,
                            new ValuePayload(null, real[0], 0),
                            new ValuePayload(null, real[1], 1));
                case BOOLEAN:
                    return new BoolValuePayload(type, new ValuePayload(null, (Boolean) val.getValue() ? 1 : 0, 0), null);
            }
        }
        /* identifier value */
        if (ex.getIdent() != null) {
            var type = ctx.get(ex.getIdent()).getDp();
            switch (type) {
                case INT:
                    return new BoolValuePayload(type, new ValuePayload(ex.getIdent(), null, 0), null);
                case REAL:
                    return new BoolValuePayload(type,
                            new ValuePayload(ex.getIdent(), null, 0),
                            new ValuePayload(ex.getIdent(), null, 1));
                case BOOLEAN:
                    return new BoolValuePayload(type, new ValuePayload(ex.getIdent(), null, 0), null);
            }
        }

        var left = processBoolExpression(ex.getAdvExpression().getExpression1(), level + 1);
        var right = processBoolExpression(ex.getAdvExpression().getExpression2(), level + 1);

        var i = gen.instructions;

        if (left != null && left.valuePayload1 == null && right != null && right.valuePayload1 == null) {
            if (!left.type.equals(right.type))
                throw new RuntimeException("Cannot perform operation against two different data types!");
            /* perform boolean op */
            if (ex.getAdvExpression().getOp() != null) {
                switch (left.type) {
                    case INT:
                        var op = getIntBoolOp(ex.getAdvExpression().getOp());
                        i.add(createInstruction(InstructionType.OPR, op.ordinal()));
                        return null;
                    case REAL:
                        var opLabel = getRealBoolOp(ex.getAdvExpression().getOp());
                        i.add(createInstruction(InstructionType.CAL, opLabel, 1));
                        break;
                    case BOOLEAN:
                        op = getBoolOp(ex.getAdvExpression().getOp());
                        if (op.equals(OperationType.SPECIAL_OR)) {
                            i.add(createInstruction(InstructionType.OPR, OperationType.PLUS.ordinal()));
                            i.add(createInstruction(InstructionType.LIT, 1));
                            i.add(createInstruction(InstructionType.OPR, OperationType.GREATER_OR_EQUAL.ordinal()));
                        } else if (op.equals(OperationType.SPECIAL_NOT)) {
                            i.add(createInstruction(InstructionType.OPR, OperationType.MINUS.ordinal()));
                            i.add(createInstruction(InstructionType.LIT, -1));
                            i.add(createInstruction(InstructionType.OPR, OperationType.MULTIPLICATION.ordinal()));
                        } else {
                            i.add(createInstruction(InstructionType.OPR, op.ordinal()));
                        }
                        break;
                }
            }
        }
        if (left == null || right == null) {
            return left == null ? right : left;
        }
        if (left.valuePayload1 == null && right.valuePayload1 != null) {
            switch (right.type) {
                case INT:
                case BOOLEAN:
                    var op = createInstructionFromPayload(right.valuePayload1);
                    i.add(op);
                    break;
                case REAL:
                    var r1 = createInstructionFromPayload(right.valuePayload1);
                    var r2 = createInstructionFromPayload(right.valuePayload2);
                    if (right.valuePayload1.variable == null) {
                        var truePar = RealUtils.convertToFraction(r1.getPar(), r2.getPar());
                        r1.setPar(truePar[0]);
                        r2.setPar(truePar[1]);
                    }
                    i.add(r1);
                    i.add(r2);
                    break;
            }
            return new BoolValuePayload(right.type, null, null);
        }
        if (left.valuePayload1 != null && right.valuePayload1 == null) {
            switch (left.type) {
                case INT:
                case BOOLEAN:
                    var op = createInstructionFromPayload(left.valuePayload1);
                    i.add(op);
                    break;
                case REAL:
                    var r1 = createInstructionFromPayload(left.valuePayload1);
                    var r2 = createInstructionFromPayload(left.valuePayload2);
                    if (right.valuePayload1.variable == null) {
                        var truePar = RealUtils.convertToFraction(r1.getPar(), r2.getPar());
                        r1.setPar(truePar[0]);
                        r2.setPar(truePar[1]);
                    }
                    i.add(r1);
                    i.add(r2);
                    break;
            }
            return new BoolValuePayload(left.type, null, null);
        }
        if (left.valuePayload1 != null && left.type.equals(DataType.INT) && right.type.equals(DataType.INT)) {
            var lOp = createInstructionFromPayload(left.valuePayload1);
            var rOp = createInstructionFromPayload(right.valuePayload1);

            /* get operation and check if it exists and is defined */
            OperationType op = null;
            if (level == 0) {
                op = getIntBoolOp(ex.getAdvExpression().getOp());
            } else {
                try {
                    op = getIntBoolOp(ex.getAdvExpression().getOp());
                } catch (Exception e) {
                    op = getIntOp(ex.getAdvExpression().getOp());
                }
            }
            if (op == null) {
                throw new RuntimeException("Undefined integer operation!");
            }

            i.add(lOp);
            i.add(rOp);
            i.add(createInstruction(InstructionType.OPR, op.ordinal()));
            return new BoolValuePayload(DataType.INT, null, null);
        }
        if (left.valuePayload1 != null && left.type.equals(DataType.BOOLEAN) && right.type.equals(DataType.BOOLEAN)) {
            var lOp = createInstructionFromPayload(left.valuePayload1);
            var rOp = createInstructionFromPayload(right.valuePayload1);

            var op = getBoolOp(ex.getAdvExpression().getOp());
            if (op == null) {
                throw new RuntimeException("Undefined boolean operation!");
            }

            i.add(lOp);
            i.add(rOp);
            if (op.equals(OperationType.SPECIAL_OR)) {
                i.add(createInstruction(InstructionType.OPR, OperationType.PLUS.ordinal()));
                i.add(createInstruction(InstructionType.LIT, 1));
                i.add(createInstruction(InstructionType.OPR, OperationType.GREATER_OR_EQUAL.ordinal()));
            } else if (op.equals(OperationType.SPECIAL_NOT)) {
                i.add(createInstruction(InstructionType.OPR, OperationType.MINUS.ordinal()));
                i.add(createInstruction(InstructionType.LIT, -1));
                i.add(createInstruction(InstructionType.OPR, OperationType.MULTIPLICATION.ordinal()));
            } else {
                i.add(createInstruction(InstructionType.OPR, op.ordinal()));
            }
            return new BoolValuePayload(DataType.BOOLEAN, null, null);
        }
        if (left.valuePayload1 != null && left.type.equals(DataType.REAL) && right.type.equals(DataType.REAL)) {
            var l1 = createInstructionFromPayload(left.valuePayload1);
            var l2 = createInstructionFromPayload(left.valuePayload2);
            if (left.valuePayload1.variable == null) {
                var truePar = RealUtils.convertToFraction(l1.getPar(), l2.getPar());
                l1.setPar(truePar[0]);
                l2.setPar(truePar[1]);
            }

            var r1 = createInstructionFromPayload(right.valuePayload1);
            var r2 = createInstructionFromPayload(right.valuePayload2);
            if (right.valuePayload1.variable == null) {
                var truePar = RealUtils.convertToFraction(r1.getPar(), r2.getPar());
                r1.setPar(truePar[0]);
                r2.setPar(truePar[1]);
            }

            /* get operation and check if it exists and is defined */
            AbstractLabel op = null;
            int minus = 0;
            if (level == 0) {
                op = getRealBoolOp(ex.getAdvExpression().getOp());
                minus = 3;
            } else {
                try {
                    op = getRealBoolOp(ex.getAdvExpression().getOp());
                    minus = 3;
                } catch (Exception e) {
                    op = getRealOp(ex.getAdvExpression().getOp());
                    minus = 2;
                }
            }
            if (op == null) {
                throw new RuntimeException("Undefined real operation!");
            }

            i.add(l1);
            i.add(l2);
            i.add(r1);
            i.add(r2);
            i.add(createInstruction(InstructionType.CAL, op, 1));
            i.add(createInstruction(InstructionType.INT, -1 * minus));
            return new BoolValuePayload(DataType.REAL, null, null);
        }

        return null;
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

    private AbstractLabel getRealOp(OperatorType opType) {
        if (opType == null)
            return null;
        switch (opType) {
            case MULT:
                return gen.realMath.getOperationLabel(OperationType.MULTIPLICATION);
            case DIVISION:
                return gen.realMath.getOperationLabel(OperationType.DIVISION);
            case PLUS:
                return gen.realMath.getOperationLabel(OperationType.PLUS);
            case MINUS:
                return gen.realMath.getOperationLabel(OperationType.MINUS);
            case EQV_EQV:
            case NOT_EQV:
            case LESS_THAN:
            case GREATER_THAN:
            case LESS_THAN_OR_EQV:
            case GREATER_THAN_OR_EQV:
            case AND:
            case OR:
            case NOT:
                throw new RuntimeException("Usage of not specified operation on type: real!");
        }
        return null;
    }

    private OperationType getIntBoolOp(OperatorType opType) {
        if (opType == null)
            return null;
        switch (opType) {
            case EQV_EQV:
                return OperationType.EQUAL;
            case NOT_EQV:
                return OperationType.NOT_EQUAL;
            case LESS_THAN:
                return OperationType.LESSER;
            case GREATER_THAN:
                return OperationType.GREATER;
            case LESS_THAN_OR_EQV:
                return OperationType.LESSER_OR_EQUAL;
            case GREATER_THAN_OR_EQV:
                return OperationType.GREATER_OR_EQUAL;
            case AND:
            case OR:
            case NOT:
            case MULT:
            case DIVISION:
            case PLUS:
            case MINUS:
                throw new RuntimeException("Usage of not specified operation on type: boolean!");
        }
        return null;
    }

    private OperationType getBoolOp(OperatorType opType) {
        if (opType == null)
            return null;
        switch (opType) {
            case MULT:
            case DIVISION:
            case PLUS:
            case MINUS:
            case LESS_THAN:
            case GREATER_THAN:
            case LESS_THAN_OR_EQV:
            case GREATER_THAN_OR_EQV:
                throw new RuntimeException("Usage of not specified operation on type: boolean!");
            case EQV_EQV:
                return OperationType.EQUAL;
            case NOT_EQV:
                return OperationType.NOT_EQUAL;
            case AND:
                return OperationType.MULTIPLICATION;
            case OR:
                return OperationType.SPECIAL_OR;
            case NOT:
                return OperationType.SPECIAL_NOT;
        }
        return null;
    }

    private AbstractLabel getRealBoolOp(OperatorType opType) {
        if (opType == null)
            return null;
        switch (opType) {
            case EQV_EQV:
                return gen.realMath.getOperationLabel(OperationType.EQUAL);
            case NOT_EQV:
                return gen.realMath.getOperationLabel(OperationType.NOT_EQUAL);
            case LESS_THAN:
                return gen.realMath.getOperationLabel(OperationType.LESSER);
            case GREATER_THAN:
                return gen.realMath.getOperationLabel(OperationType.GREATER);
            case LESS_THAN_OR_EQV:
                return gen.realMath.getOperationLabel(OperationType.LESSER_OR_EQUAL);
            case GREATER_THAN_OR_EQV:
                return gen.realMath.getOperationLabel(OperationType.GREATER_OR_EQUAL);
            case AND:
            case OR:
            case NOT:
            case MULT:
            case DIVISION:
            case PLUS:
            case MINUS:
                throw new RuntimeException("Usage of not specified operation on type: boolean!");
        }
        return null;
    }

    private AbstractInstruction createInstructionFromPayload(ValuePayload payload) {
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

    @AllArgsConstructor
    private static class ValuePayload {
        String variable;
        Integer value;
        int offset;
    }

    @AllArgsConstructor
    private static class BoolValuePayload {
        DataType type;
        ValuePayload valuePayload1;
        ValuePayload valuePayload2;
    }
}
