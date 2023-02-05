package visitor;

import antlr.GrammarBaseVisitor;
import antlr.GrammarParser;
import org.antlr.v4.runtime.tree.TerminalNode;
import tree.*;
import tree.cycle.*;
import tree.expression.Expression;
import type.CycleType;
import type.DataType;

import java.util.ArrayList;
import java.util.List;

/**
 * Visitor for Cycle
 */
public class CycleVisitor extends GrammarBaseVisitor<Cycle> {

    /**
     * Visit method for Cycle
     * @param ctx context for Cycle
     * @return Cycle object
     */
    @Override
    public Cycle visitCycle(GrammarParser.CycleContext ctx) {
        if (ctx.while_cycle() != null) {
            Statement statement = new StatementVisitor().visit(ctx.while_cycle().statement());
            Expression exp = new ExpressionVisitor().visit(ctx.while_cycle().expression());

            WhileCycle wc = new WhileCycle(exp, statement);
            wc.setCycleType(CycleType.WHILE);
            return wc;

        } else if (ctx.do_while() != null) {
            Statement statement = new StatementVisitor().visit(ctx.do_while().statement());
            Expression exp = new ExpressionVisitor().visit(ctx.do_while().expression());

            DoWhileCycle dwc = new DoWhileCycle(exp, statement);
            dwc.setCycleType(CycleType.DO_WHILE);
            return dwc;

        } else if (ctx.for_cycle() != null) {
            Statement statement = new StatementVisitor().visit(ctx.for_cycle().statement());
            List<Declaration> declarations = getDeclaration(ctx.for_cycle().multiple_assignment());
            Expression exp = new ExpressionVisitor().visit(ctx.for_cycle().expression());
            Initialization initialization = new InitializationVisitor().visit(ctx.for_cycle().initialization());

            ForCycle fc = new ForCycle(declarations, exp, initialization, statement);
            fc.setCycleType(CycleType.FOR);
            return fc;

        } else if (ctx.repeat_cycle() != null) {
            Statement statement = new StatementVisitor().visit(ctx.repeat_cycle().statement());
            Expression exp = new ExpressionVisitor().visit(ctx.repeat_cycle().expression());

            RepeatCycle rc = new RepeatCycle(exp, statement);
            rc.setCycleType(CycleType.REPEAT);
            return rc;

        } else if (ctx.switch_cycle() != null) {
            Expression exp = new ExpressionVisitor().visit(ctx.switch_cycle().expression());
            List<Case> cases = new ArrayList<>();
            for (GrammarParser.Case_bodyContext caseCtx : ctx.switch_cycle().case_body()) {
                Assignment assignment = null;
                if (caseCtx.IDENTIFIER() != null) {
                    assignment = new Assignment(new Expression(caseCtx.IDENTIFIER().getText(), null, null));
                } else if(caseCtx.value() != null) {
                    assignment = ExpressionVisitor.getValue(caseCtx.value());
                }

                List<Body> statementBody = new ArrayList<>();

                for (GrammarParser.Statement_optionsContext soCtx : caseCtx.statement_options()) {
                    if (soCtx.declaration() != null)
                        statementBody.addAll(new DeclarationVisitor().visit(soCtx.declaration()));
                    if (soCtx.initialization() != null)
                        statementBody.add(new InitializationVisitor().visit(soCtx.initialization()));
                    if (soCtx.statement_body() != null)
                        statementBody.add(new Statement_bodyVisitor().visit(soCtx.statement_body()));
                }

                cases.add(new Case(assignment, statementBody));
            }

            SwitchCycle sc = new SwitchCycle(exp, cases);
            sc.setCycleType(CycleType.SWITCH);
            return sc;

        }
        throw new RuntimeException("Unknown cycle.");
    }
    

    private List<Declaration> getDeclaration(GrammarParser.Multiple_assignmentContext maCtx) {
        List<Declaration> declarations = new ArrayList<>();

        DataType dataType = DataType.getType(maCtx.type().getText());
        Assignment assignment = new AssignmentVisitor().visit(maCtx.assignment());

        for (TerminalNode ident : maCtx.IDENTIFIER()) {
            declarations.add(new Declaration(ident.getText(), dataType, false, new Initialization(ident.getText(), assignment)));
        }

        return declarations;
    }
}
