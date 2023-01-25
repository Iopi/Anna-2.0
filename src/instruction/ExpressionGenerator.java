package instruction;

import lombok.Getter;
import lombok.Setter;
import pl0.type.InstructionType;
import pl0.type.OperationType;
import tree.expression.Expression;
import type.DataType;
import type.OperatorType;

public class ExpressionGenerator {

//    public static void processIntExpression(Expression expression, InstructionGenerator generator) {
//        if (expression == null) {
//            return;
//        }
//        if (expression.getExpression() == null) {
//            generator.instructions.add(PL0Instruction.builder().instructionType(InstructionType.LIT).value((Integer) expression.getValue().getValue()).build());
//            return;
//        }
//
//        //left
//        processIntExpression(expression.getExpression().getExpression2(), generator);
//        // right
//        processIntExpression(expression.getExpression().getExpression1(), generator);
//        // process
//        var opType = retrieveIntegerOperationType(expression.getExpression().getOp());
//        if (opType != null) {
//            generator.instructions.add(PL0Instruction.builder().instructionType(InstructionType.OPR).operationType(opType).build());
//        }
//
//        return;
//    }

//    public static int[] processRealExpression(Expression expression, InstructionGenerator generator) {
//        if (expression == null) {
//            return null;
//        }
//        if (expression.getExpression() == null) {
//            var real = (int[]) expression.getValue().getValue();
//            return real;
//        }
//
//        // right
//        var right = processRealExpression(expression.getExpression().getExpression2(), generator);
//        // left
//        var left = processRealExpression(expression.getExpression().getExpression1(), generator);
//        // process
//        //var opType = retrieveOperationType(expression.getExpression().getOp());
//        //if (opType != null) {
//        //    generator.instructions.add(PL0Instruction.builder().instructionType(InstructionType.OPR).operationType(opType).build());
//        //}
//
//        return null;
//    }
//
//    public static BooleanExpressionValue processBooleanExpression(Expression expression, InstructionGenerator generator) {
//        if (expression == null) {
//            return null;
//        }
//        if (expression.getExpression() == null) {
//            if (expression.getValue().getDataType().equals(DataType.INT)) {
//                var retType = new BooleanExpressionValue();
//                retType.setAnInt((Integer) expression.getValue().getValue());
//                return retType;
//            }
//            if (expression.getValue().getDataType().equals(DataType.BOOLEAN)) {
//                var retType = new BooleanExpressionValue();
//                retType.setABoolean((Boolean) expression.getValue().getValue());
//                return retType;
//            }
//
//            throw new RuntimeException(String.format("Unexpected data type! (%s)", expression.getValue().getDataType()));
//        }
//
//        // right
//        var right = processBooleanExpression(expression.getExpression().getExpression2(), generator);
//        // left
//        var left = processBooleanExpression(expression.getExpression().getExpression1(), generator);
//        // process
//        //var opType = retrieveOperationType(expression.getExpression().getOp());
//        //if (opType != null) {
//        //    generator.instructions.add(PL0Instruction.builder().instructionType(InstructionType.OPR).operationType(opType).build());
//        //}
//
//        if (right == null || left == null) {
//            if (expression.getExpression().getOp() == null) {
//                return null;
//            }
//
//            /* only boolean should be left */
//            if (right != null) {
//                if (!right.isBoolean())
//                    throw new RuntimeException("Type: boolean expected!");
//                generator.instructions.add(PL0Instruction.builder().instructionType(InstructionType.LIT).value((right.aBoolean) ? 1 : 0).build());
//            } else if (left != null) {
//                if (!left.isBoolean())
//                    throw new RuntimeException("Type: boolean expected!");
//                generator.instructions.add(PL0Instruction.builder().instructionType(InstructionType.LIT).value((left.aBoolean) ? 1 : 0).build());
//            }
//
//            var opType = retrieveBooleanOperationType(expression.getExpression().getOp());
//            if (opType != null) {
//                if (opType.equals(OperationType.SPECIAL_OR)) {
//                    generator.instructions.add(PL0Instruction.builder().instructionType(InstructionType.OPR).operationType(OperationType.PLUS).build());
//                    generator.instructions.add(PL0Instruction.builder().instructionType(InstructionType.LIT).value(1).build());
//                    generator.instructions.add(PL0Instruction.builder().instructionType(InstructionType.OPR).operationType(OperationType.GREATER_OR_EQUAL).build());
//                } else if (opType.equals(OperationType.SPECIAL_NOT)) {
//                    generator.instructions.add(PL0Instruction.builder().instructionType(InstructionType.OPR).operationType(OperationType.MINUS).build());
//                    generator.instructions.add(PL0Instruction.builder().instructionType(InstructionType.LIT).value(-1).build());
//                    generator.instructions.add(PL0Instruction.builder().instructionType(InstructionType.OPR).operationType(OperationType.MULTIPLICATION).build());
//                } else {
//                    generator.instructions.add(PL0Instruction.builder().instructionType(InstructionType.OPR).operationType(opType).build());
//                }
//            }
//
//            return null;
//        }
//
//        if (right.isInteger() && left.isInteger()) {
//            generator.instructions.add(PL0Instruction.builder().instructionType(InstructionType.LIT).value(left.anInt).build());
//            generator.instructions.add(PL0Instruction.builder().instructionType(InstructionType.LIT).value(right.anInt).build());
//
//            var opType = retrieveIntegerOperationTypeThatLeadsToBoolean(expression.getExpression().getOp());
//            if (opType != null) {
//                generator.instructions.add(PL0Instruction.builder().instructionType(InstructionType.OPR).operationType(opType).build());
//            }
//        }
//        if (right.isBoolean() && left.isBoolean()) {
//            generator.instructions.add(PL0Instruction.builder().instructionType(InstructionType.LIT).value((left.aBoolean) ? 1 : 0).build());
//            generator.instructions.add(PL0Instruction.builder().instructionType(InstructionType.LIT).value((right.aBoolean) ? 1 : 0).build());
//
//            var opType = retrieveBooleanOperationType(expression.getExpression().getOp());
//            if (opType != null) {
//                if (opType.equals(OperationType.SPECIAL_OR)) {
//                    generator.instructions.add(PL0Instruction.builder().instructionType(InstructionType.OPR).operationType(OperationType.PLUS).build());
//                    generator.instructions.add(PL0Instruction.builder().instructionType(InstructionType.LIT).value(1).build());
//                    generator.instructions.add(PL0Instruction.builder().instructionType(InstructionType.OPR).operationType(OperationType.GREATER_OR_EQUAL).build());
//                } else if (opType.equals(OperationType.SPECIAL_NOT)) {
//                    generator.instructions.add(PL0Instruction.builder().instructionType(InstructionType.OPR).operationType(OperationType.MINUS).build());
//                    generator.instructions.add(PL0Instruction.builder().instructionType(InstructionType.LIT).value(-1).build());
//                    generator.instructions.add(PL0Instruction.builder().instructionType(InstructionType.OPR).operationType(OperationType.MULTIPLICATION).build());
//                } else {
//                    generator.instructions.add(PL0Instruction.builder().instructionType(InstructionType.OPR).operationType(opType).build());
//                }
//            }
//        }
//
//        return null;
//    }

    @Setter
    @Getter
    static class BooleanExpressionValue {
        private Boolean aBoolean;
        private Integer anInt;

        public boolean isBoolean() {
            return aBoolean != null;
        }

        public boolean isInteger() {
            return anInt != null;
        }
    }

    public static OperationType retrieveIntegerOperationType(OperatorType operatorType) {
        if (operatorType == null)
            return null;
        switch (operatorType) {
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

    public static OperationType retrieveIntegerOperationTypeThatLeadsToBoolean(OperatorType operatorType) {
        if (operatorType == null)
            return null;
        switch (operatorType) {
            case MULT:
                return OperationType.MULTIPLICATION;
            case DIVISION:
                return OperationType.DIVISION;
            case PLUS:
                return OperationType.PLUS;
            case MINUS:
                return OperationType.MINUS;
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
                throw new RuntimeException("Usage of not specified operation on type: integer!");
        }
        return null;
    }

    public static OperationType retrieveBooleanOperationType(OperatorType operatorType) {
        if (operatorType == null)
            return null;
        switch (operatorType) {
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
}
