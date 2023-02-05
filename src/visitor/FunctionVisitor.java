package visitor;

import antlr.GrammarBaseVisitor;
import antlr.GrammarParser;
import tree.Body;
import tree.Declaration;
import tree.Function;
import type.DataType;

import java.util.ArrayList;
import java.util.List;

/**
 * Visitor for Function
 */
public class FunctionVisitor extends GrammarBaseVisitor<Function> {

    /**
     * Visit method for Function
     *
     * @param ctx context for Function
     * @return Function object
     */
    @Override
    public Function visitFunction(GrammarParser.FunctionContext ctx) {
        String ident = ctx.IDENTIFIER().getText();
        List<Declaration> parameters = getParameters(ctx.parameter());
        List<Body> funcBody = new ArrayList<>(parameters);
        getFuncBody(ctx.statement().statement_options(), funcBody);

        return new Function(ident, funcBody);

    }

    private void getFuncBody(List<GrammarParser.Statement_optionsContext> statementOptionsCtx, List<Body> funcBody) {
        for (GrammarParser.Statement_optionsContext ctx : statementOptionsCtx) {
            if (ctx.declaration() != null) {
                funcBody.addAll(new DeclarationVisitor().visit(ctx.declaration()));
            } else if (ctx.initialization() != null) {
                funcBody.add(new InitializationVisitor().visit(ctx.initialization()));
            } else if (ctx.statement_body() != null) {
                funcBody.add(new Statement_bodyVisitor().visit(ctx.statement_body()));
            }
        }
    }

    private List<Declaration> getParameters(List<GrammarParser.ParameterContext> parametersCtx) {
        List<Declaration> parameters = new ArrayList<>();
        for (GrammarParser.ParameterContext ctx : parametersCtx) {
            String ident = ctx.IDENTIFIER().getText();
            DataType type = DataType.getType(ctx.type().getText());
            Declaration param = new Declaration(ident, type, false, null, true);
            parameters.add(param);
        }

        return parameters;
    }
}
