package visitor;

import antlr.GrammarBaseVisitor;
import antlr.GrammarParser;
import tree.Function;
import tree.Parameter;
import tree.Statement;
import tree.Variable;
import type.DataType;

import java.util.ArrayList;
import java.util.List;


public class FunctionVisitor extends GrammarBaseVisitor<Function> {

    @Override
    public Function visitFunction(GrammarParser.FunctionContext ctx) {
        //function: type IDENTIFIER  LEFT_ROUND_PARENTHESIS (parameter)* RIGHT_ROUND_PARENTHESIS statement ;
        DataType type = DataType.getType(ctx.type().getText());
        String ident = ctx.IDENTIFIER().getText();
//        String paraLR = ctx.LEFT_ROUND_PARENTHESIS().getText();
        List<Variable> parameters = getParameters(ctx.parameter());
//        String paraRR = ctx.RIGHT_ROUND_PARENTHESIS().getText();
        List<StatementBody> statementBodies = new StatementVisitor().visit(ctx.statement());

        return new Function(type, ident, parameters, statement);

    }

    private List<Variable> getParameters(List<GrammarParser.ParameterContext> parametersCtx) {
        List<Variable> parameters = new ArrayList<>();

        for (GrammarParser.ParameterContext parameterCtx : parametersCtx) {
            String ident = parameterCtx.IDENTIFIER().getText();

            for (Variable var: parameters)
                if (var.getName().equals(ident))
                    throw new RuntimeException("Variable " + ident + " already exist in function.");

            DataType type = DataType.getType(parameterCtx.type().getText());
            Variable param = new Variable(ident, type);
            parameters.add(param);
        }

        return parameters;
    }
}
