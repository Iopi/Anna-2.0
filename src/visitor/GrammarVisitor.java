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

        return new Program(vars.getDeclarations(), functions, vars.getInitializations());
    }

    private AllVariables getVariables(List<GrammarParser.MainContext> mainsCtx) {
        AllVariables vars = new AllVariables();
        List<Declaration> separated_declarations;
        Initialization initialization;

        for (GrammarParser.MainContext mainCtx : mainsCtx) {
            if (mainCtx.declaration() != null) {
                separated_declarations = new DeclarationVisitor().visit(mainCtx.declaration());

                for (Declaration separated_declaration : separated_declarations) {
                    if (separated_declaration.getInitialization().getAssignment() != null) {
                        boolean correct_ident = false;
                        String ident = separated_declaration.getInitialization().getAssignment().getIdent();
                        checkAssignmentIdent(vars, correct_ident, ident);
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

                String ident = initialization.getAssignment().getIdent();
                checkAssignmentIdent(vars, correct_ident, ident);

                vars.getInitializations().add(initialization);
            }
        }

        return vars;
    }

    private void checkAssignmentIdent(AllVariables vars, boolean correct_ident, String ident) {
        if (!ident.equals("")) {
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
            new_function = new FunctionVisitor().visit(mainCtx.function());

            for (Function function : functions)
                if (new_function.getIdent().equals(function.getIdent()))
                    throw new RuntimeException("Function name " + new_function.getIdent() + " already exists.");

            functions.add(new_function);
        }

        return functions;
    }


}
