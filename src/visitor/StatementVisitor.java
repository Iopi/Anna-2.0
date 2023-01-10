package visitor;

import antlr.GrammarBaseVisitor;
import antlr.GrammarParser;
import org.antlr.v4.runtime.tree.TerminalNode;
import tree.Function;
import tree.Statement;
import tree.Variable;

import java.util.ArrayList;
import java.util.List;

public class StatementVisitor extends GrammarBaseVisitor<Statement> {

    @Override
    public Statement visitStatement(GrammarParser.StatementContext ctx) {
        StatementBody sb = StatementBodyVisitor().visit(ctx.statement_body());
        return getStatementBodies(ctx.statement_body());
    }

    private Statement getStatementBodies(List<GrammarParser.Statement_bodyContext> statementBodiesCtx) {
        Statement statement = new Statement();

        for (GrammarParser.Statement_bodyContext statementBodyCtx: statementBodiesCtx) {
            if (statementBodyCtx.declaration() != null) {
                List<Variable> variables = new DeclarationVisitor().visit(statementBodyCtx.declaration());
                for (Variable new_var : variables) {
                    for (Variable var : statement.getVariables())
                        if (new_var.getName().equals(var.getName()))
                            throw new RuntimeException("Variable " + new_var.getName() + " already exist.");

                    statement.getVariables().add(new_var);
                }
            }
            else if (statementBodyCtx.cycle() != null) {
                Cycle cycle = new CycleVisitor().visit(statementBodyCtx.cycle());
            } else if (statementBodyCtx.conditional() != null) {
                Conditional cond = new ConditionalVisitor().visit(statementBodyCtx.conditional());
            } else if (statementBodyCtx.function_call() != null) {
                for (TerminalNode ident : statementBodyCtx.function_call().IDENTIFIER()) {
                    for ( : ) {

                    }
                    if (ident.getText().equals())
                }
                String funcName = statementBodyCtx.function_call().IDENTIFIER();
                String funcName = statementBodyCtx.function_call();
                var funcCall = new FunctionCallVisitor().visit(statementBodyCtx.function_call());
            }
        }
        return statement;
    }

}
