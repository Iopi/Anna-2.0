package visitor;

import antlr.GrammarBaseVisitor;
import antlr.GrammarParser;
import org.antlr.v4.runtime.tree.TerminalNode;
import tree.*;
import tree.cycle.*;
import type.CycleType;
import type.DataType;

import java.util.ArrayList;
import java.util.List;

public class CycleVisitor extends GrammarBaseVisitor<Cycle> {

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
            Assignment assignment = new AssignmentVisitor().visit(ctx.for_cycle().expression());

            ForCycle fc = new ForCycle(declarations, exp, assignment, statement);
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
                    assignment = new Assignment(caseCtx.IDENTIFIER().getText(), null);
                } else if(caseCtx.value() != null) {
                    assignment = DeclarationVisitor.getValue(caseCtx.value());
                }
                List<Declaration> declarations = new ArrayList<>();
                for (GrammarParser.DeclarationContext decCtx : caseCtx.declaration()) {
                    declarations.addAll(new DeclarationVisitor().visit(decCtx));
                }
                List<Initialization> initializations = new ArrayList<>();
                for (GrammarParser.InitializationContext iniCtx : caseCtx.initialization()) {
                    initializations.add(new InitializationVisitor().visit(iniCtx));
                }
                List<StatementBody> statementBodies = new ArrayList<>();
                for (GrammarParser.Statement_bodyContext sbCtx : caseCtx.statement_body()) {
                    statementBodies.add(new Statement_bodyVisitor().visit(sbCtx));
                }

                cases.add(new Case(assignment, declarations, initializations, statementBodies));
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
