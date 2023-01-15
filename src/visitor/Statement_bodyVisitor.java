package visitor;

import antlr.GrammarBaseVisitor;
import antlr.GrammarParser;
import tree.*;
import tree.condition.Conditional;
import tree.cycle.Cycle;

import java.util.ArrayList;
import java.util.List;

public class Statement_bodyVisitor extends GrammarBaseVisitor<StatementBody> {

    @Override
    public StatementBody visitStatement_body(GrammarParser.Statement_bodyContext statementBodyCtx) {

        Cycle cycle = null;
        Conditional cond = null;
        List<String> iniVariables = new ArrayList<>();
        String funcName = null;

        if (statementBodyCtx.cycle() != null) {
            cycle = new CycleVisitor().visit(statementBodyCtx.cycle());
        } else if (statementBodyCtx.conditional() != null) {
            cond = new ConditionalVisitor().visit(statementBodyCtx.conditional());
        } else if (statementBodyCtx.function_call() != null) {
            funcName = statementBodyCtx.function_call().IDENTIFIER().get(0).getText();

            for (int i = 1; i < statementBodyCtx.function_call().IDENTIFIER().size(); i++)
                iniVariables.add(statementBodyCtx.function_call().IDENTIFIER().get(i).getText());

        }
        return new StatementBody(cycle,cond,iniVariables,funcName);
    }


}
