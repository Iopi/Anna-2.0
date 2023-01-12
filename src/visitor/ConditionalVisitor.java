package visitor;

import antlr.GrammarBaseVisitor;
import antlr.GrammarParser;
import tree.Conditional;

public class ConditionalVisitor extends GrammarBaseVisitor<Conditional> {

    @Override
    public Conditional visitConditional(GrammarParser.ConditionalContext ctx) {

        return new Conditional();
    }
}
