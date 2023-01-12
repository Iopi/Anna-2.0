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
//        DataType type = DataType.getType(ctx.type().getText());
        String ident = ctx.IDENTIFIER().getText();
        List<Variable> parameters = getParameters(ctx.parameter());
        Statement statement = new StatementVisitor().visit(ctx.statement());
        List<Variable> variables = identControl(parameters, statement);

        return new Function(ident, variables);

    }

    private List<Variable> identControl(List<Variable> variables, Statement statement) {
        for (Variable new_var : statement.getVariables()) {
            for (Variable var : variables)
                if (var.getName().equals(new_var.getName()))
                    throw new RuntimeException("Variable " + new_var + " already exist in function.");
            variables.add(new_var);
        }
        return variables;
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
