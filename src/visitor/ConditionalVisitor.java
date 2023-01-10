package visitor;

import antlr.GrammarBaseVisitor;
import antlr.GrammarParser;

public class ConditionalVisitor extends GrammarBaseVisitor<Conditional> {

    @Override
    public Conditional visitCycle(GrammarParser.ConditionalContext ctx) {
        return new Conditional();
    }
}
