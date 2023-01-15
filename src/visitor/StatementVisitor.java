package visitor;

import antlr.GrammarBaseVisitor;
import antlr.GrammarParser;
import tree.*;

import java.util.ArrayList;
import java.util.List;

public class StatementVisitor extends GrammarBaseVisitor<Statement> {

    @Override
    public Statement visitStatement(GrammarParser.StatementContext ctx) {
        List<Declaration> declarations = new ArrayList<>();
        for (GrammarParser.DeclarationContext decCtx : ctx.declaration()) {
            declarations.addAll(new DeclarationVisitor().visit(decCtx));
        }
        List<Initialization> initializations = new ArrayList<>();
        for (GrammarParser.InitializationContext iniCtx : ctx.initialization()) {
            initializations.add(new InitializationVisitor().visit(iniCtx));
        }
        List<StatementBody> statementBodies = new ArrayList<>();
        for (GrammarParser.Statement_bodyContext sbCtx : ctx.statement_body()) {
            statementBodies.add(new Statement_bodyVisitor().visit(sbCtx));
        }
        return new Statement(declarations, initializations, statementBodies);
    }

}
