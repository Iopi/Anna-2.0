package visitor;

import antlr.GrammarBaseVisitor;
import antlr.GrammarParser;
import tree.*;
import tree.cycle.*;
import tree.expression.*;
import type.DataType;

import java.util.ArrayList;
import java.util.List;

/**
 * Root visitor for Program
 */
public class GrammarVisitor extends GrammarBaseVisitor<Program> {

    /**
     * Visit method for Program
     * @param ctx context for Program
     * @return Program object
     */
    @Override
    public Program visitProgram(GrammarParser.ProgramContext ctx) {
        List<Body> mainBody = getMainBody(ctx.main());

        List<Declaration> declarations = new ArrayList<>();
        List<Function> functions = new ArrayList<>();
        dataTypeControl(mainBody, declarations, functions);

        return new Program(mainBody);
    }

    private List<Body> getMainBody(List<GrammarParser.MainContext> mainCtx) {
        List<Body> mainBody = new ArrayList<>();
        for (GrammarParser.MainContext ctx : mainCtx) {
            if (ctx.function() != null) {
                mainBody.add(new FunctionVisitor().visit(ctx.function()));
            } else if (ctx.declaration() != null) {
                mainBody.addAll(new DeclarationVisitor().visit(ctx.declaration()));
            } else if (ctx.initialization() != null) {
                mainBody.add(new InitializationVisitor().visit(ctx.initialization()));
            } else if (ctx.statement_body() != null) {
                mainBody.add(new Statement_bodyVisitor().visit(ctx.statement_body()));
            }
        }
        return mainBody;
    }

    private List<Declaration> dataTypeControl(List<Body> mainBody, List<Declaration> declarations, List<Function> functions) {
        for (Body body : mainBody) {
            // control of functions
            if (body.getClass().equals(Function.class)) {
                Function new_func = (Function) body;
                // control of declaration of existing function
                for (Function func : functions) {
                    if (new_func.getIdent().equals(func.getIdent())) {
                        throw new RuntimeException("Function " + new_func.getIdent() + " already exists.");
                    }
                }
                dataTypeControl(new_func.getFuncBody(), new ArrayList<>(declarations), new ArrayList<>(functions));
                functions.add(new_func);
            }

            // control of declaration
            else if (body.getClass().equals(Declaration.class)) {
                Declaration newDec = (Declaration) body;
                if (newDec.isParameter()) {
                    declarations.add(newDec);
                    continue;
                }

                // control of existing declaration
                for (Declaration dec : declarations) {
                    if (newDec.getIdent().equals(dec.getIdent())) {
                        throw new RuntimeException("Variable " + newDec.getIdent() + " already exists.");
                    }
                }
                // control of data type and expression
                if (newDec.getInitialization() != null) {
                    DataType dt = expressionControl(newDec.getInitialization().getAssignment().getExpression(),
                            null, declarations, newDec.getIdent());
                    if (newDec.getDataType() != dt)
                        throw new RuntimeException("Variable " + newDec.getIdent() + " has wrong data type of value.");

                }
                declarations.add(newDec);
            }
            // control of initialization
            else if (body.getClass().equals(Initialization.class)) {
                Initialization new_ini = (Initialization) body;
                initializationControl(declarations, new_ini);
            }
            // control of statement body
            else if (body.getClass().equals(StatementBody.class)) {
                StatementBody new_sb = (StatementBody) body;
                // control of existing called function
                calledFuncControl(functions, new_sb);
                // control of existing variables in called function
                for (String iniVar : new_sb.getIniVariables()) {
                    boolean correctIdent = false;
                    for (Declaration dec : declarations) {
                        // control of existence of variable
                        if (dec.getIdent().equals(iniVar)) {
                            correctIdent = true;
                            break;
                        }
                    }
                    if (!correctIdent)
                        throw new RuntimeException("Variable " + iniVar + " not exists.");
                }

                // control of condition
                if (new_sb.getConditionals() != null) {
                    // control of branch if
                    // control of variable in head
                    rawExpressionControl(new_sb.getConditionals().getIc().getExp(), declarations, null);

                    dataTypeControl(new_sb.getConditionals().getIc().getStatement().getStatementBody(), new ArrayList<>(declarations), new ArrayList<>(functions));

                    // control of branch else
                    if (new_sb.getConditionals().getEc().getStatement() != null) {
                        dataTypeControl(new_sb.getConditionals().getEc().getStatement().getStatementBody(), new ArrayList<>(declarations), new ArrayList<>(functions));
                    }
                }

                // control of cycle
                if (new_sb.getCycles() != null) {
                    switch (new_sb.getCycles().getCycleType()) {
                        case FOR:
                            ForCycle fc = (ForCycle) new_sb.getCycles();
                            // control of declaration in head
                            for (Declaration newDec : fc.getDeclarations()) {
                                for (Declaration dec : declarations) {
                                    if (newDec.getIdent().equals(dec.getIdent())) {
                                        throw new RuntimeException("Variable " + newDec.getIdent() + " already exists.");
                                    }
                                }
                            }
                            declarations.addAll(fc.getDeclarations());

                            // control of variable in head
                            rawExpressionControl(fc.getExp(), declarations, null);

                            // control of initialization in head
                            Initialization new_ini = fc.getInitialization();
                            initializationControl(declarations, new_ini);

                            // control of statement
                            dataTypeControl(fc.getStatement().getStatementBody(), new ArrayList<>(declarations), new ArrayList<>(functions));

                            // delete declaration of head of cycle
                            for (int i = 0; i < fc.getDeclarations().size(); i++) {
                                declarations.remove(declarations.size() - 1);
                            }
                            break;

                        case WHILE:
                            // control of while
                            WhileCycle wc = (WhileCycle) new_sb.getCycles();
                            // control of expression
                            rawExpressionControl(wc.getExp(), declarations, null);
                            // control of statement
                            dataTypeControl(wc.getStatement().getStatementBody(), new ArrayList<>(declarations), new ArrayList<>(functions));
                            break;

                        case DO_WHILE:
                            // control of do while
                            DoWhileCycle dwc = (DoWhileCycle) new_sb.getCycles();
                            // control of statement
                            List<Declaration> decs = dataTypeControl(dwc.getStatement().getStatementBody(), new ArrayList<>(declarations), new ArrayList<>(functions));
                            declarations.addAll(decs);
                            // control of expression
                            rawExpressionControl(dwc.getExp(), declarations, null);
                            // delete declaration from statement
                            for (int i = 0; i < decs.size(); i++) {
                                declarations.remove(declarations.size() - 1);
                            }
                            break;

                        case REPEAT:
                            // control of repeat
                            RepeatCycle rc = (RepeatCycle) new_sb.getCycles();
                            // control of statement
                            List<Declaration> decs2 = dataTypeControl(rc.getStatement().getStatementBody(), new ArrayList<>(declarations), new ArrayList<>(functions));
                            declarations.addAll(decs2);
                            // control of expression
                            rawExpressionControl(rc.getExp(), declarations, null);
                            // delete declaration from statement
                            for (int i = 0; i < decs2.size(); i++) {
                                declarations.remove(declarations.size() - 1);
                            }
                            break;

                        case SWITCH:
                            // control of switch
                            SwitchCycle sc = (SwitchCycle) new_sb.getCycles();
                            // control of expression
                            rawExpressionControl(sc.getExp(), declarations, null);

                            for (Case case_body : sc.getCases()) {
                                // control of case head
                                if (case_body.getAssignment().getExpression().getIdent() != null) {
                                    rawExpressionControl(case_body.getAssignment().getExpression(), declarations, null);
                                }
                                // control of statement in case body
                                dataTypeControl(case_body.getStatementBody(), new ArrayList<>(declarations), new ArrayList<>(functions));

                            }
                            break;

                    }
                }
            }

        }
        return declarations;
    }

    private DataType rawExpressionControl(Expression expression, List<Declaration> declarations, DataType dataType) {
        // control of existence of expression identifier
        if (expression.getIdent() != null) {
            boolean correctIdent = false;
            for (Declaration dec : declarations) {
                if (expression.getIdent().equals(dec.getIdent())) {
                    correctIdent = true;
                    if (dataType != null) { // control of data type
                        if (dataType != dec.getDataType()) {
                            throw new RuntimeException("Data types in expression are not same: " + dataType + " and " +
                                    dec.getDataType() + " as variable " + dec.getIdent() + ".");
                        }
                    }
                    dataType = dec.getDataType();
                    break;
                }
            }
            if (!correctIdent)
                throw new RuntimeException("Variable " + expression.getIdent() + " not exists.");
            // control of expression value
        } else if (expression.getValue() != null) {
            if (dataType != null) { // control of data type
                if (dataType != expression.getValue().getDataType()) {
                    throw new RuntimeException("Data types in expression are not same: " + dataType + " and " +
                            expression.getValue().getDataType() + ".");
                }
            }
            dataType = expression.getValue().getDataType();
        }
        // control of advanced expression
        else {
            AdvExpression exp = expression.getAdvExpression();
            if (exp.getClass().equals(ExpParanthesis.class)) {
                dataType = rawExpressionControl(exp.getExpression1(), declarations, dataType);

            } else {
                dataType = rawExpressionControl(exp.getExpression1(), declarations, dataType);
                dataType = rawExpressionControl(exp.getExpression2(), declarations, dataType);
            }
        }
        return dataType;
    }

    private DataType expressionControl(Expression expression, DataType dt, List<Declaration> declarations, String ident) {
        // control of data type of value with data type of variable
        if (expression.getValue() != null) {
            if (dt != null)
                if (dt != expression.getValue().getDataType())
                    throw new RuntimeException("Data type " + dt + " and " + expression.getValue().getDataType() +
                            " are not same. (Initialize variable " + ident + ")");

            return expression.getValue().getDataType();
        }
        // control of data type of assignment with data type of variable
        else if (expression.getIdent() != null) {
            for (Declaration dec2 : declarations) {
                if (dec2.getIdent().equals(expression.getIdent())) {
                    if (dt != null)
                        if (dt != dec2.getDataType())
                            throw new RuntimeException("Data type " + dt + " and data type of" + dec2.getIdent() +
                                    " (" + dec2.getDataType() + ") are not same. (Initialize variable " + ident + ")");
                    return dec2.getDataType();
                }
            }
            throw new RuntimeException("Variable " + expression.getIdent() + " not exists.");

        }
        // control of advanced expression
        else {
            AdvExpression exp = expression.getAdvExpression();
            if (exp.getClass().equals(ExpParanthesis.class)) {
                return expressionControl(exp.getExpression1(), null, declarations, ident);
            }
            // other advanced expression has alwaystwo expressions
            else {
                DataType dataType1 = expressionControl(exp.getExpression1(), null, declarations, ident);
                DataType dataType2 = expressionControl(exp.getExpression2(), dataType1, declarations, ident);
                if (dataType1 != dataType2)
                    throw new RuntimeException("Data type " + dataType1 + " and " + dataType2 +
                            " are not same. (Initialize variable " + ident + ")");
                if (exp.getClass().equals(ExpNot.class) || exp.getClass().equals(ExpEqv.class) ||
                        exp.getClass().equals(ExpAndOr.class)) {
                    return DataType.BOOLEAN;
                }
                return dataType1;
            }
        }
    }

    private void calledFuncControl(List<Function> functions, StatementBody new_sb) {
        if (new_sb.getCalledFunction() != null) {
            boolean correctFunc = false;
            for (Function func : functions) {
                if (func.getIdent().equals(new_sb.getCalledFunction())) {
                    correctFunc = true;
                    break;
                }
            }
            if (!correctFunc)
                throw new RuntimeException("Function " + new_sb.getCalledFunction() + " not exists.");
        }
    }

    private void initializationControl(List<Declaration> declarations, Initialization new_ini) {
        boolean correctIdent = false;
        for (Declaration dec : declarations) {
            // control of existence variable
            if (dec.getIdent().equals(new_ini.getName())) {
                correctIdent = true;
                DataType dt = expressionControl(new_ini.getAssignment().getExpression(), null, declarations,
                        new_ini.getName());
                if (dec.getDataType() != dt)
                    throw new RuntimeException("Variable " + dec.getIdent() + " has wrong data type of value.");

            }
        }
        if (!correctIdent)
            throw new RuntimeException("Variable " + new_ini.getName() + " not exists.");
    }

}
