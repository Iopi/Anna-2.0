package visitor;

import antlr.GrammarBaseVisitor;
import antlr.GrammarParser;
import tree.*;

import java.util.ArrayList;
import java.util.List;

public class GrammarVisitor extends GrammarBaseVisitor<Program> {

    @Override
    public Program visitProgram(GrammarParser.ProgramContext ctx) {
        List<Function> functions = getFunction(ctx.main());
        AllVariables vars = getVariables(ctx.main());
        List<StatementBody> statementBodies = new ArrayList<>();

        for (GrammarParser.MainContext mainCtx : ctx.main()) {
            statementBodies.add(new Statement_bodyVisitor().visit(mainCtx.statement_body()));
        }

        dataTypeControl(vars.getDeclarations(), functions, vars.getInitializations(), statementBodies);

        return new Program(vars.getDeclarations(), functions, vars.getInitializations(), statementBodies);
    }

    private void dataTypeControl(List<Declaration> declarations, List<Function> functions, List<Initialization> initializations, List<StatementBody> statementBodies) {
        for (StatementBody sb : statementBodies) {
            if (sb.getCalledFunction() != null) {
                boolean correctFunc = false;
                for (Function func : functions)
                    if (func.getIdent().equals(sb.getCalledFunction())) {
                        correctFunc = true;
                        break;
                    }
                if (!correctFunc)
                    throw new RuntimeException("Function " + sb.getCalledFunction() + " not exists.");
            }
        }

        for (Initialization ini : initializations) {
            boolean correctIdent = false;
            for (Declaration dec : declarations) {
                if (dec.getInitialization() != null)
                    if (dec.getDataType() != dec.getInitialization().getAssignment().getValue().getDataType())
                        throw new RuntimeException("Variable " + dec.getIdent() + " has wrong data type of value");

                if (dec.getIdent().equals(ini.getName())) {
                    correctIdent = true;
                    if (ini.getAssignment().getValue() != null) {
                        if (dec.getDataType() != ini.getAssignment().getValue().getDataType())
                            throw new RuntimeException("Initialization " + ini.getName() + " has wrong data type of value");
                    } else {
                        String ident = ini.getAssignment().getIdent();
                        for (Declaration dec1 : declarations) {
                            if (ident.equals(dec1.getIdent())) {
                                if (dec.getDataType() != dec1.getDataType())
                                    throw new RuntimeException("Initialization " + ini.getName() + " has wrong data type of value");
                            }
                        }
                    }
                }
                if (!correctIdent)
                    throw new RuntimeException("Variable " + dec.getIdent() + " not exists.");
            }
        }
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
                            String ident = separated_declaration.getInitialization().getAssignment().getIdent();
                            checkAssignmentIdent(vars, correct_ident, ident);
                        }
                    }

                    for (Declaration declaration : vars.getDeclarations())
                        if (separated_declaration.getIdent().equals(declaration.getIdent()))
                            throw new RuntimeException("Variable " + separated_declaration.getIdent() + " already exists.");

                    vars.getDeclarations().add(separated_declaration);
                }
            } else if (mainCtx.initialization() != null) {
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

                String ident = initialization.getAssignment().getIdent();
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

    private List<Function> getFunction(List<GrammarParser.MainContext> mainsCtx) {
        List<Function> functions = new ArrayList<>();
        Function new_function;

        for (GrammarParser.MainContext mainCtx : mainsCtx) {
            if (mainCtx.function() != null) {
                new_function = new FunctionVisitor().visit(mainCtx.function());

                for (Function function : functions)
                    if (new_function.getIdent().equals(function.getIdent()))
                        throw new RuntimeException("Function name " + new_function.getIdent() + " already exists.");

                functions.add(new_function);
            }
        }

        return functions;
    }


}
