package visitor;

import antlr.GrammarBaseVisitor;
import antlr.GrammarParser;
import tree.Statement;

public class CycleVisitor extends GrammarBaseVisitor<Cycle> {

    @Override
    public Cycle visitCycle(GrammarParser.CycleContext ctx) {
        return new Cycle();
    }
}
