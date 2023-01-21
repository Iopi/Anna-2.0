package visitor;

import antlr.GrammarBaseVisitor;
import antlr.GrammarParser;
import tree.*;

import java.util.ArrayList;
import java.util.List;

public class StatementVisitor extends GrammarBaseVisitor<Statement> {

    @Override
    public Statement visitStatement(GrammarParser.StatementContext ctx) {
        List<Body> statementBody = new ArrayList<>();

        for (GrammarParser.Statement_optionsContext soCtx :ctx.statement_options()) {
            if (soCtx.declaration() != null)
                statementBody.addAll(new DeclarationVisitor().visit(soCtx.declaration()));
            if (soCtx.initialization() != null)
                statementBody.add(new InitializationVisitor().visit(soCtx.initialization()));
            if (soCtx.statement_body() != null)
                statementBody.add(new Statement_bodyVisitor().visit(soCtx.statement_body()));
        }

        return new Statement(statementBody);
    }

}
