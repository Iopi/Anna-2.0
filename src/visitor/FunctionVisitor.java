package visitor;

import antlr.GrammarBaseVisitor;
import antlr.GrammarParser;
import tree.*;
import type.DataType;

import java.util.ArrayList;
import java.util.List;


public class FunctionVisitor extends GrammarBaseVisitor<Function> {

    @Override
    public Function visitFunction(GrammarParser.FunctionContext ctx) {
//        DataType type = DataType.getType(ctx.type().getText());
        String ident = ctx.IDENTIFIER().getText();
        List<Declaration> parameters = getParameters(ctx.parameter());
        Statement statement = new StatementVisitor().visit(ctx.statement());
//        identControl(parameters, statement);
        dataTypeControl(parameters, statement);

        return new Function(ident, parameters, statement);

    }

    private void dataTypeControl(List<Declaration> parameters, Statement statement) {
        for (Initialization ini: statement.getInitializations()) {
            boolean correctIdent = false;
            boolean correctType = false;
            for (Declaration new_dec : statement.getDeclarations()) {

                if (new_dec.getInitialization() != null)
                    if (new_dec.getDataType() != new_dec.getInitialization().getAssignment().getValue().getDataType())
                        throw new RuntimeException("Variable " + new_dec.getIdent() + " has wrong data type of value");

                if (new_dec.getIdent().equals(ini.getName())) {
                    correctIdent = true;
                    if (ini.getAssignment().getValue() != null) {
                        if (new_dec.getDataType() != ini.getAssignment().getValue().getDataType())
                            throw new RuntimeException("Initialization " + ini.getName()+ " has wrong data type of value");
                    } else {
                        String ident = ini.getAssignment().getExpression().getIdent();
                        for (Declaration dec1 : statement.getDeclarations()) {
                            if (ident.equals(dec1.getIdent())) {
                                correctType = true;
                                if (new_dec.getDataType() != dec1.getDataType())
                                    throw new RuntimeException("Initialization " + ini.getName()+ " has wrong data type of value");
                            }
                        }
                        if (!correctType) {
                            for (Declaration dec1 : parameters) {
                                if (ident.equals(dec1.getIdent())) {
                                    if (new_dec.getDataType() != dec1.getDataType())
                                        throw new RuntimeException("Initialization " + ini.getName()+ " has wrong data type of value");
                                }
                            }
                        }
                    }
                }
            }
            if (!correctIdent) {
                for (Declaration dec : parameters) {
                    if (dec.getInitialization() != null)
                        if (dec.getDataType() != dec.getInitialization().getAssignment().getValue().getDataType())
                            throw new RuntimeException("Variable " + dec.getIdent() + " has wrong data type of value");

                    if (dec.getIdent().equals(ini.getName())) {
                        correctIdent = true;
                        if (ini.getAssignment().getValue() != null) {
                            if (dec.getDataType() != ini.getAssignment().getValue().getDataType())
                                throw new RuntimeException("Initialization " + ini.getName() + " has wrong data type of value");
                        } else {
                            String ident = ini.getAssignment().getExpression().getIdent();
                            for (Declaration dec1 : statement.getDeclarations()) {
                                if (ident.equals(dec1.getIdent())) {
                                    correctType = true;
                                    if (dec.getDataType() != dec1.getDataType())
                                        throw new RuntimeException("Initialization " + ini.getName() + " has wrong data type of value");
                                }
                            }
                            if (!correctType) {
                                for (Declaration dec1 : parameters) {
                                    if (ident.equals(dec1.getIdent())) {
                                        if (dec.getDataType() != dec1.getDataType())
                                            throw new RuntimeException("Initialization " + ini.getName() + " has wrong data type of value");
                                    }
                                }
                            }
                        }
                    }
                }

            } else {
                for (Declaration dec : parameters)
                    if (dec.getInitialization() != null)
                        if (dec.getDataType() != dec.getInitialization().getAssignment().getValue().getDataType())
                            throw new RuntimeException("Variable " + dec.getIdent() + " has wrong data type of value");

            }
            if (!correctIdent)
                throw new RuntimeException("Variable " + ini.getName() + " not exists.");

        }
    }

    private void identControl(List<Declaration> variables, Statement statement) {
        for (Declaration new_dec : statement.getDeclarations()) {
            for (Declaration dec : variables)
                if (dec.getIdent().equals(new_dec.getIdent()))
                    throw new RuntimeException("Variable " + new_dec + " already exist in function.");
//            variables.add(new_dec);
        }
        for (Initialization new_ini : statement.getInitializations()) {
            boolean correctIdent = false;
            for (Declaration dec : variables) {
                if (dec.getIdent().equals(new_ini.getName())) {
                    correctIdent = true;
                    break;
                }
            }
            if (!correctIdent) {
                for (Declaration dec : statement.getDeclarations()) {
                    if (dec.getIdent().equals(new_ini.getName())) {
                        correctIdent = true;
                        break;
                    }
                }
            }
            if (!correctIdent)
                throw new RuntimeException("Variable " + new_ini.getName() + " is not defined in function.");
        }

    }

    private List<Declaration> getParameters(List<GrammarParser.ParameterContext> parametersCtx) {
        List<Declaration> parameters = new ArrayList<>();

        for (GrammarParser.ParameterContext parameterCtx : parametersCtx) {
            String ident = parameterCtx.IDENTIFIER().getText();

            for (Declaration dec: parameters)
                if (dec.getIdent().equals(ident))
                    throw new RuntimeException("Variable " + ident + " already exist in function.");

            DataType type = DataType.getType(parameterCtx.type().getText());
            Declaration param = new Declaration(ident, type, false, null);
            parameters.add(param);
        }

        return parameters;
    }
    private AllVariables getVariables(List<GrammarParser.MainContext> mainsCtx) {
        AllVariables vars = new AllVariables();
        List<Declaration> separated_declarations;
        Initialization initialization;

        for (GrammarParser.MainContext mainCtx : mainsCtx) {
            if (mainCtx.declaration() != null) {
                separated_declarations = new DeclarationVisitor().visit(mainCtx.declaration());

                for (Declaration separated_declaration : separated_declarations) {
                    if (separated_declaration.getInitialization() != null) {
                        if (separated_declaration.getInitialization().getAssignment() != null) {
                            boolean correct_ident = false;
                            String ident = separated_declaration.getInitialization().getAssignment().getExpression().getIdent();
                            checkAssignmentIdent(vars, correct_ident, ident);
                        }
                    }

                    for (Declaration declaration : vars.getDeclarations())
                        if (separated_declaration.getIdent().equals(declaration.getIdent()))
                            throw new RuntimeException("Variable " + separated_declaration.getIdent() + " already exists.");

                    vars.getDeclarations().add(separated_declaration);
                }
            }
            else if (mainCtx.initialization() != null) {
                initialization = new InitializationVisitor().visit(mainCtx.initialization());

                boolean correct_var = false;
                boolean correct_ident = false;
                for (Declaration declaration : vars.getDeclarations()) {

                    if (initialization.getName().equals(declaration.getIdent())) {
                        if (declaration.isConstant())
                            throw new RuntimeException("Variable " + initialization.getName() + " is constant - can not be changed.");
                        correct_var = true;
                        break;
                    }
                }
                if (!correct_var)
                    throw new RuntimeException("Variable " + initialization.getName() + " not exists.");

                String ident = initialization.getAssignment().getExpression().getIdent();
                checkAssignmentIdent(vars, correct_ident, ident);

                vars.getInitializations().add(initialization);
            }
        }

        return vars;
    }

    private void checkAssignmentIdent(AllVariables vars, boolean correct_ident, String ident) {
        if (ident != null) {
            for (Declaration declaration : vars.getDeclarations()) {
                if (ident.equals(declaration.getIdent())) {
                    correct_ident = true;
                    break;
                }
            }
            if (!correct_ident)
                throw new RuntimeException("Variable " + ident + " not exists.");

        }
    }
}
