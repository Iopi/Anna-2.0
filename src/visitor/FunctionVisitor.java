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
        List<Declaration> variables = identControl(parameters, statement);

        return new Function(ident, variables);

    }

    private List<Declaration> identControl(List<Declaration> variables, Statement statement) {
        for (Declaration new_dec : statement.getDeclarations()) {
            for (Declaration dec : variables)
                if (dec.getIdent().equals(new_dec.getIdent()))
                    throw new RuntimeException("Variable " + new_dec + " already exist in function.");
            variables.add(new_dec);
        }

        return variables;
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
}
