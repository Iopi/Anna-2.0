package visitor;

import antlr.GrammarBaseVisitor;
import antlr.GrammarParser;
import tree.*;

import java.util.ArrayList;
import java.util.List;

public class GrammarVisitor extends GrammarBaseVisitor<Program> {

    @Override
    public Program visitProgram(GrammarParser.ProgramContext ctx) {
        List<Variable> declarations = getVariables(ctx.declaration());
        List<Function> functions = getFunction(ctx.function());

        return new Program(declarations, functions);
    }

    private List<Variable> getVariables(List<GrammarParser.DeclarationContext> declarationsCtx) {
        List<Variable> variables = new ArrayList<>();
        List<Variable> separated_declarations;

        for (GrammarParser.DeclarationContext declarationCtx : declarationsCtx) {
            separated_declarations = new DeclarationVisitor().visit(declarationCtx);

            for (Variable separated_declaration : separated_declarations) {
                for (Variable declaration : variables)
                    if (separated_declaration.getName().equals(declaration.getName()))
                        throw new RuntimeException("Variable " + separated_declaration.getName() + " already exists.");

                variables.add(separated_declaration);
            }

        }

        return variables;
    }

    private List<Function> getFunction(List<GrammarParser.FunctionContext> functionsCtx) {
        List<Function> functions = new ArrayList<>();
        Function new_function;

        for (GrammarParser.FunctionContext functionCtx : functionsCtx) {
            new_function = new FunctionVisitor().visit(functionCtx);

            for (Function function : functions)
                if (new_function.getName().equals(function.getName()))
                    throw new RuntimeException("Function name " + new_function.getName() + " already exists.");

            functions.add(new_function);
        }

        return functions;
    }


}
