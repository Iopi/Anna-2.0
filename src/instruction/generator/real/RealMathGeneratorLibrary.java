package instruction.generator.real;

import instruction.InstructionGenerator;
import instruction.instruction.AbstractLabel;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import pl0.type.InstructionType;
import pl0.type.OperationType;

import java.util.HashMap;
import java.util.Map;

import static instruction.instruction.AbstractInstructionFactory.createInstruction;

/**
 * Real operations as a fractions operations.
 */
@AllArgsConstructor
public class RealMathGeneratorLibrary {

    private final InstructionGenerator gen;
    private final Map<RealOperations, AbstractLabel> registeredOperations = new HashMap<>();
    private final Map<RealOperations, Boolean> usedOperations = new HashMap<>();

    /**
     * Returns respective label of operation.
     * If genLabels was not called or fraction doesn't support selected operation returns null.
     *
     * @param opType operation type
     * @return label (call with level 1)
     */
    public AbstractLabel getOperationLabel(@NonNull OperationType opType) {
        switch (opType) {
            case PLUS:
                return setUsedAndReturnLabel(RealOperations.PLUS);
            case MINUS:
                return setUsedAndReturnLabel(RealOperations.MINUS);
            case MULTIPLICATION:
                return setUsedAndReturnLabel(RealOperations.MULTIPLICATION);
            case DIVISION:
                return setUsedAndReturnLabel(RealOperations.DIVISION);
            case EQUAL:
                return setUsedAndReturnLabel(RealOperations.EQUAL);
            case NOT_EQUAL:
                return setUsedAndReturnLabel(RealOperations.NOT_EQUAL);
            case LESSER:
                return setUsedAndReturnLabel(RealOperations.LESSER);
            case GREATER_OR_EQUAL:
                return setUsedAndReturnLabel(RealOperations.GREATER_OR_EQUAL);
            case GREATER:
                return setUsedAndReturnLabel(RealOperations.GREATER);
            case LESSER_OR_EQUAL:
                return setUsedAndReturnLabel(RealOperations.LESSER_OR_EQUAL);
        }
        return null;
    }

    private AbstractLabel setUsedAndReturnLabel(@NonNull RealOperations of) {
        usedOperations.putIfAbsent(of, true);
        return registeredOperations.get(of);
    }

    /**
     * Generate labels for each real operation.
     */
    public void genLabels() {
        var r = registeredOperations;
        r.putIfAbsent(RealOperations.GCD, new AbstractLabel());
        r.putIfAbsent(RealOperations.LCM, new AbstractLabel());
        r.putIfAbsent(RealOperations.CMN_DEM, new AbstractLabel());
        r.putIfAbsent(RealOperations.REDUCTION, new AbstractLabel());

        r.putIfAbsent(RealOperations.PLUS, new AbstractLabel());
        r.putIfAbsent(RealOperations.MINUS, new AbstractLabel());
        r.putIfAbsent(RealOperations.MULTIPLICATION, new AbstractLabel());
        r.putIfAbsent(RealOperations.DIVISION, new AbstractLabel());

        r.putIfAbsent(RealOperations.EQUAL, new AbstractLabel());
        r.putIfAbsent(RealOperations.NOT_EQUAL, new AbstractLabel());
        r.putIfAbsent(RealOperations.LESSER, new AbstractLabel());
        r.putIfAbsent(RealOperations.LESSER_OR_EQUAL, new AbstractLabel());
        r.putIfAbsent(RealOperations.GREATER, new AbstractLabel());
        r.putIfAbsent(RealOperations.GREATER_OR_EQUAL, new AbstractLabel());
    }

    /**
     * Generate used real operations as a functions.
     */
    public void genFunctions() {
        if (usedOperations.size() != 0) {
            generateGCD();
            generateLCM();
            generateCDem();
            generateRed();
        }
        usedOperations.forEach((realOperations, aBoolean) -> {
            switch (realOperations) {
                case PLUS:
                    genPlus();
                    break;
                case MINUS:
                    genMinus();
                    break;
                case MULTIPLICATION:
                    genMultiplication();
                    break;
                case DIVISION:
                    genDivision();
                    break;
                case EQUAL:
                    genLogicalOp(RealOperations.EQUAL, OperationType.EQUAL);
                    break;
                case GREATER:
                    genLogicalOp(RealOperations.GREATER, OperationType.GREATER);
                    break;
                case GREATER_OR_EQUAL:
                    genLogicalOp(RealOperations.GREATER_OR_EQUAL, OperationType.GREATER_OR_EQUAL);
                    break;
                case LESSER:
                    genLogicalOp(RealOperations.LESSER, OperationType.LESSER);
                    break;
                case LESSER_OR_EQUAL:
                    genLogicalOp(RealOperations.LESSER_OR_EQUAL, OperationType.LESSER_OR_EQUAL);
                    break;
                case NOT_EQUAL:
                    genLogicalOp(RealOperations.NOT_EQUAL, OperationType.NOT_EQUAL);
                    break;
            }
        });
    }

    //region Common

    /* greatest common factor */
    private void generateGCD() {
        var i = gen.instructions;
        var gcdLabel = registeredOperations.get(RealOperations.GCD);
        i.add(gcdLabel);
        i.add(createInstruction(InstructionType.INT, 3));
        i.add(createInstruction(InstructionType.LOD, -2));
        i.add(createInstruction(InstructionType.LOD, -1));
        i.add(createInstruction(InstructionType.LOD, 3));
        i.add(createInstruction(InstructionType.LOD, 4));
        i.add(createInstruction(InstructionType.OPR, 6));
        i.add(createInstruction(InstructionType.STO, 3));
        i.add(createInstruction(InstructionType.LOD, 3));
        i.add(createInstruction(InstructionType.LIT, 0));
        i.add(createInstruction(InstructionType.OPR, 8));
        var l1 = new AbstractLabel();
        i.add(createInstruction(InstructionType.JMC, l1));
        i.add(createInstruction(InstructionType.LOD, 4));
        i.add(createInstruction(InstructionType.STO, -2));
        i.add(createInstruction(InstructionType.RET, 0));
        i.add(createInstruction(InstructionType.JMP, l1));
        i.add(l1);
        i.add(createInstruction(InstructionType.LOD, 4));
        i.add(createInstruction(InstructionType.LOD, 3));
        i.add(createInstruction(InstructionType.CAL, gcdLabel, 1));
        i.add(createInstruction(InstructionType.INT, -1));
        i.add(createInstruction(InstructionType.STO, -2));
        i.add(createInstruction(InstructionType.RET, 0));
    }

    /* least common multiple */
    private void generateLCM() {
        var i = gen.instructions;
        var lcmLabel = registeredOperations.get(RealOperations.LCM);
        i.add(lcmLabel);
        i.add(createInstruction(InstructionType.INT, 3));
        i.add(createInstruction(InstructionType.LOD, -2));
        i.add(createInstruction(InstructionType.LOD, -1));
        i.add(createInstruction(InstructionType.LOD, 3));
        i.add(createInstruction(InstructionType.LOD, 4));
        var gcdLabel = registeredOperations.get(RealOperations.GCD);
        i.add(createInstruction(InstructionType.CAL, gcdLabel, 1));
        i.add(createInstruction(InstructionType.INT, -1));
        i.add(createInstruction(InstructionType.OPR, 5));
        i.add(createInstruction(InstructionType.OPR, 4));
        i.add(createInstruction(InstructionType.STO, -2));
        i.add(createInstruction(InstructionType.RET, 0));
    }

    /* common denominator */
    private void generateCDem() {
        var i = gen.instructions;
        var cdemLabel = registeredOperations.get(RealOperations.CMN_DEM);
        i.add(cdemLabel);
        i.add(createInstruction(InstructionType.INT, 4));
        i.add(createInstruction(InstructionType.LOD, -4));
        i.add(createInstruction(InstructionType.LOD, -3));
        i.add(createInstruction(InstructionType.LOD, -2));
        i.add(createInstruction(InstructionType.LOD, -1));
        i.add(createInstruction(InstructionType.LOD, 5));
        i.add(createInstruction(InstructionType.LOD, 7));
        var lcmLabel = registeredOperations.get(RealOperations.LCM);
        i.add(createInstruction(InstructionType.CAL, lcmLabel, 1));
        i.add(createInstruction(InstructionType.INT, -1));
        i.add(createInstruction(InstructionType.STO, 3));
        i.add(createInstruction(InstructionType.LOD, 3));
        i.add(createInstruction(InstructionType.LOD, 5));
        i.add(createInstruction(InstructionType.OPR, 5));
        i.add(createInstruction(InstructionType.LOD, 4));
        i.add(createInstruction(InstructionType.OPR, 4));
        i.add(createInstruction(InstructionType.STO, -4));
        i.add(createInstruction(InstructionType.LOD, 3));
        i.add(createInstruction(InstructionType.LOD, 7));
        i.add(createInstruction(InstructionType.OPR, 5));
        i.add(createInstruction(InstructionType.LOD, 6));
        i.add(createInstruction(InstructionType.OPR, 4));
        i.add(createInstruction(InstructionType.STO, -2));
        i.add(createInstruction(InstructionType.LOD, 3));
        i.add(createInstruction(InstructionType.STO, -3));
        i.add(createInstruction(InstructionType.LOD, 3));
        i.add(createInstruction(InstructionType.STO, -1));
        i.add(createInstruction(InstructionType.RET, 0));
    }

    /* reduction */
    private void generateRed() {
        var i = gen.instructions;
        var redLabel = registeredOperations.get(RealOperations.REDUCTION);
        i.add(redLabel);
        i.add(createInstruction(InstructionType.INT, 3));
        i.add(createInstruction(InstructionType.LOD, -2));
        i.add(createInstruction(InstructionType.LOD, -1));
        i.add(createInstruction(InstructionType.LOD, 3));
        i.add(createInstruction(InstructionType.LOD, 4));
        var gcdLabel = registeredOperations.get(RealOperations.GCD);
        i.add(createInstruction(InstructionType.CAL, gcdLabel, 1));
        i.add(createInstruction(InstructionType.INT, -1));
        i.add(createInstruction(InstructionType.LOD, 3));
        i.add(createInstruction(InstructionType.LOD, 5));
        i.add(createInstruction(InstructionType.OPR, 5));
        i.add(createInstruction(InstructionType.STO, -2));
        i.add(createInstruction(InstructionType.LOD, 4));
        i.add(createInstruction(InstructionType.LOD, 5));
        i.add(createInstruction(InstructionType.OPR, 5));
        i.add(createInstruction(InstructionType.STO, -1));
        i.add(createInstruction(InstructionType.RET, 0));
    }

    //endregion

    //region Basic fraction math

    /* plus */
    private void genPlus() {
        var i = gen.instructions;
        var plusLabel = registeredOperations.get(RealOperations.PLUS);
        i.add(plusLabel);
        i.add(createInstruction(InstructionType.INT, 3));
        i.add(createInstruction(InstructionType.LOD, -4));
        i.add(createInstruction(InstructionType.LOD, -3));
        i.add(createInstruction(InstructionType.LOD, -2));
        i.add(createInstruction(InstructionType.LOD, -1));
        var cdemLabel = registeredOperations.get(RealOperations.CMN_DEM);
        i.add(createInstruction(InstructionType.CAL, cdemLabel, 1));
        i.add(createInstruction(InstructionType.LOD, 3));
        i.add(createInstruction(InstructionType.LOD, 5));
        i.add(createInstruction(InstructionType.OPR, 2));
        i.add(createInstruction(InstructionType.STO, 3));
        i.add(createInstruction(InstructionType.LOD, 3));
        i.add(createInstruction(InstructionType.LOD, 4));
        var redLabel = registeredOperations.get(RealOperations.REDUCTION);
        i.add(createInstruction(InstructionType.CAL, redLabel, 1));
        i.add(createInstruction(InstructionType.STO, -3));
        i.add(createInstruction(InstructionType.STO, -4));
        i.add(createInstruction(InstructionType.RET, 0));
    }

    /* minus */
    private void genMinus() {
        var i = gen.instructions;
        var minusLabel = registeredOperations.get(RealOperations.MINUS);
        i.add(minusLabel);
        i.add(createInstruction(InstructionType.INT, 3));
        i.add(createInstruction(InstructionType.LOD, -4));
        i.add(createInstruction(InstructionType.LOD, -3));
        i.add(createInstruction(InstructionType.LOD, -2));
        i.add(createInstruction(InstructionType.LOD, -1));
        var cdemLabel = registeredOperations.get(RealOperations.CMN_DEM);
        i.add(createInstruction(InstructionType.CAL, cdemLabel, 1));
        i.add(createInstruction(InstructionType.LOD, 3));
        i.add(createInstruction(InstructionType.LOD, 5));
        i.add(createInstruction(InstructionType.OPR, 3));
        i.add(createInstruction(InstructionType.STO, 3));
        i.add(createInstruction(InstructionType.LOD, 3));
        i.add(createInstruction(InstructionType.LOD, 4));
        var redLabel = registeredOperations.get(RealOperations.REDUCTION);
        i.add(createInstruction(InstructionType.CAL, redLabel, 1));
        i.add(createInstruction(InstructionType.STO, -3));
        i.add(createInstruction(InstructionType.STO, -4));
        i.add(createInstruction(InstructionType.RET, 0));
    }

    /* multiplication */
    private void genMultiplication() {
        var i = gen.instructions;
        var multpLabel = registeredOperations.get(RealOperations.MULTIPLICATION);
        i.add(multpLabel);
        i.add(createInstruction(InstructionType.INT, 3));
        i.add(createInstruction(InstructionType.LOD, -4));
        i.add(createInstruction(InstructionType.LOD, -3));
        i.add(createInstruction(InstructionType.LOD, -2));
        i.add(createInstruction(InstructionType.LOD, -1));
        i.add(createInstruction(InstructionType.LOD, 3));
        i.add(createInstruction(InstructionType.LOD, 5));
        i.add(createInstruction(InstructionType.OPR, 4));
        i.add(createInstruction(InstructionType.LOD, 4));
        i.add(createInstruction(InstructionType.LOD, 6));
        i.add(createInstruction(InstructionType.OPR, 4));
        var redLabel = registeredOperations.get(RealOperations.REDUCTION);
        i.add(createInstruction(InstructionType.CAL, redLabel, 1));
        i.add(createInstruction(InstructionType.STO, -3));
        i.add(createInstruction(InstructionType.STO, -4));
        i.add(createInstruction(InstructionType.RET, 0));
    }

    /* division */
    private void genDivision() {
        var i = gen.instructions;
        var divLabel = registeredOperations.get(RealOperations.DIVISION);
        i.add(divLabel);
        i.add(createInstruction(InstructionType.INT, 3));
        i.add(createInstruction(InstructionType.LOD, -4));
        i.add(createInstruction(InstructionType.LOD, -3));
        i.add(createInstruction(InstructionType.LOD, -2));
        i.add(createInstruction(InstructionType.LOD, -1));
        i.add(createInstruction(InstructionType.LOD, 3));
        i.add(createInstruction(InstructionType.LOD, 6));
        i.add(createInstruction(InstructionType.OPR, 4));
        i.add(createInstruction(InstructionType.LOD, 4));
        i.add(createInstruction(InstructionType.LOD, 5));
        i.add(createInstruction(InstructionType.OPR, 4));
        var redLabel = registeredOperations.get(RealOperations.REDUCTION);
        i.add(createInstruction(InstructionType.CAL, redLabel, 1));
        i.add(createInstruction(InstructionType.STO, -3));
        i.add(createInstruction(InstructionType.STO, -4));
        i.add(createInstruction(InstructionType.RET, 0));
    }

    //endregion

    //region Boolean fraction operations

    private void genLogicalOp(@NonNull RealOperations lOp, @NonNull OperationType opType) {
        var i = gen.instructions;
        var label = registeredOperations.get(lOp);
        i.add(label);
        i.add(createInstruction(InstructionType.INT, 3));
        i.add(createInstruction(InstructionType.LOD, -4));
        i.add(createInstruction(InstructionType.LOD, -3));
        i.add(createInstruction(InstructionType.LOD, -2));
        i.add(createInstruction(InstructionType.LOD, -1));
        var cdemLabel = registeredOperations.get(RealOperations.CMN_DEM);
        i.add(createInstruction(InstructionType.CAL, cdemLabel, 1));
        i.add(createInstruction(InstructionType.LOD, 3));
        i.add(createInstruction(InstructionType.LOD, 5));
        i.add(createInstruction(InstructionType.OPR, opType.ordinal()));
        i.add(createInstruction(InstructionType.STO, -4));
        i.add(createInstruction(InstructionType.RET, 0));
    }

    //endregion
}
