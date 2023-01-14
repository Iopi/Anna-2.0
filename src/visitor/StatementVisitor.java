package visitor;

import antlr.GrammarBaseVisitor;
import antlr.GrammarParser;
import org.antlr.v4.runtime.tree.TerminalNode;
import tree.*;

import java.util.ArrayList;
import java.util.List;

public class StatementVisitor extends GrammarBaseVisitor<Statement> {

    @Override
    public Statement visitStatement(GrammarParser.StatementContext ctx) {
        return getStatementBodies(ctx.statement_body());
    }

    public static Statement getStatementBodies(List<GrammarParser.Statement_bodyContext> statementBodiesCtx) {
        Statement statement = new Statement();
        List<Cycle> cycles = new ArrayList<>();
        List<Conditional> conditionals = new ArrayList<>();

        for (GrammarParser.Statement_bodyContext statementBodyCtx: statementBodiesCtx) {
            if (statementBodyCtx.declaration() != null) {
                List<Declaration> declarations = new DeclarationVisitor().visit(statementBodyCtx.declaration());
                for (Declaration new_dec : declarations) {
                    for (Declaration dec : statement.getDeclarations())
                        if (new_dec.getIdent().equals(dec.getIdent()))
                            throw new RuntimeException("Variable " + new_dec.getIdent() + " already exist.");

                    statement.getDeclarations().add(new_dec);
                }
            }
            else if (statementBodyCtx.cycle() != null) {
                Cycle cycle = new CycleVisitor().visit(statementBodyCtx.cycle());
//                switch (cycle.getCycleType()) {
//                    case FOR:
//                        ForCycle fc = (ForCycle) cycle;
//                        for (Declaration new_dec:fc.getDeclarations()) {
//                            for (Declaration dec : statement.getDeclarations())
//                                if (new_dec.getIdent().equals(dec.getIdent()))
//                                    throw new RuntimeException("Variable " + new_dec.getIdent() + " already exist.");
//                        }
//                        for (Declaration new_dec : fc.getStatement().getDeclarations()) {
//                            for (Declaration dec : statement.getDeclarations())
//                                if (new_dec.getIdent().equals(dec.getIdent()))
//                                    throw new RuntimeException("Variable " + new_dec.getIdent() + " already exist.");
//                        }
//                        break;
//                    case WHILE:
//                        ForCycle f = (ForCycle) cycle;
//                        for (Declaration new_dec:fc.getDeclarations()) {
//                            for (Declaration dec : statement.getDeclarations())
//                                if (new_dec.getIdent().equals(dec.getIdent()))
//                                    throw new RuntimeException("Variable " + new_dec.getIdent() + " already exist.");
//                        }
//                        for (Declaration new_dec : fc.getStatement().getDeclarations()) {
//                            for (Declaration dec : statement.getDeclarations())
//                                if (new_dec.getIdent().equals(dec.getIdent()))
//                                    throw new RuntimeException("Variable " + new_dec.getIdent() + " already exist.");
//                        }
//                        break;
//                    case DO_WHILE:
//                        break;
//                    case REPEAT:
//                        break;
//                    case SWITCH:
//                        break;
//
//                }
                statement.getCycles().add(cycle);

            } else if (statementBodyCtx.conditional() != null) {
                statement.getConditionals().add(new ConditionalVisitor().visit(statementBodyCtx.conditional()));
            }
            else if (statementBodyCtx.function_call() != null) {
                String funcName = statementBodyCtx.function_call().IDENTIFIER().get(0).getText();
                statement.getIniFunctions().add(funcName);

                for (int i = 1; i < statementBodyCtx.function_call().IDENTIFIER().size(); i++)
                    statement.getIniVariables().add(statementBodyCtx.function_call().IDENTIFIER().get(i).getText());

            }
        }
        return statement;
    }


}
