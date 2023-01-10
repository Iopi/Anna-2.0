package visitor;

import antlr.GrammarBaseVisitor;
import antlr.GrammarParser;
import tree.*;

import java.util.ArrayList;
import java.util.List;

public class GrammarVisitor extends GrammarBaseVisitor<Program> {

    @Override
    public Program visitProgram(GrammarParser.ProgramContext ctx) {
        List<SingleDeclaration> declarations = getDeclarations(ctx.declaration());
        List<Function> functions = getFunction(ctx.function());

        return new Program(declarations, functions);
    }

    private List<SingleDeclaration> getDeclarations(List<GrammarParser.DeclarationContext> declarationsCtx) {
        List<SingleDeclaration> declarations = new ArrayList<>();
        List<SingleDeclaration> separated_declarations;

        for (GrammarParser.DeclarationContext declarationCtx : declarationsCtx) {
            separated_declarations = new DeclarationVisitor().visit(declarationCtx);

            for (SingleDeclaration separated_declaration : separated_declarations) {
                for (SingleDeclaration declaration : declarations) {
                    if (separated_declaration.getIdent().equals(declaration.getIdent())) {
                        throw new RuntimeException("Declaration already exists.");
                    } else {
                        declarations.add(separated_declaration);
                    }
                }
            }
        }

        return declarations;
    }

    private List<Function> getFunction(List<GrammarParser.FunctionContext> functionsCtx) {
        List<Function> functions = new ArrayList<>();
        Function new_function;

        for (GrammarParser.FunctionContext functionCtx : functionsCtx) {
            new_function = new FunctionVisitor().visit(functionCtx);

            for (Function function : functions) {
                if (new_function.getIdent().equals(function.getIdent())) {
                    throw new RuntimeException("Function name already exists.");
                } else {
                    functions.add(new_function);
                }
            }
        }

            return functions;
    }


}
