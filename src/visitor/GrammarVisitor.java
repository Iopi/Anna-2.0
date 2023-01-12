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

        return new Program(vars.getVariables(), functions, vars.getIniVariables());
    }

    private AllVariables getVariables(List<GrammarParser.MainContext> mainsCtx) {
        AllVariables vars = new AllVariables();
        List<Variable> separated_declarations;
        List<InicialVariable> inicializationStrings;

        for (GrammarParser.MainContext mainCtx : mainsCtx) {
            if (mainCtx.declaration() != null) {
                separated_declarations = new DeclarationVisitor().visit(mainCtx.declaration());

                for (Variable separated_declaration : separated_declarations) {
                    for (Variable declaration : vars.getVariables())
                        if (separated_declaration.getName().equals(declaration.getName()))
                            throw new RuntimeException("Variable " + separated_declaration.getName() + " already exists.");

                    vars.getVariables().add(separated_declaration);
                }
            }
            else if (mainCtx.inicialization() != null) {
                inicializationStrings = new InicializationVisitor().visit(mainCtx.inicialization());

                for (InicialVariable new_var : inicializationStrings) {
                    for (Variable declaration : vars.getVariables())
                        if (!new_var.getName().equals(declaration.getName()))
                            throw new RuntimeException("Variable " + new_var.getName() + " not exists.");

                    vars.getIniVariables().add(new_var);
                }
            }
        }

        return vars;
    }

    private List<Function> getFunction(List<GrammarParser.MainContext> mainsCtx) {
        List<Function> functions = new ArrayList<>();
        Function new_function;

        for (GrammarParser.MainContext mainCtx : mainsCtx) {
            new_function = new FunctionVisitor().visit(mainCtx.function());

            for (Function function : functions)
                if (new_function.getName().equals(function.getName()))
                    throw new RuntimeException("Function name " + new_function.getName() + " already exists.");

            functions.add(new_function);
        }

        return functions;
    }


}
