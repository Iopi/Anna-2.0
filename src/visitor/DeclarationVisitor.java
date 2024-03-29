package visitor;

import antlr.GrammarBaseVisitor;
import antlr.GrammarParser;
import org.antlr.v4.runtime.tree.TerminalNode;
import tree.*;
import type.DataType;

import java.util.ArrayList;
import java.util.List;

import static visitor.ExpressionVisitor.getValue;

/**
 * Visitor for Declaration
 */
public class DeclarationVisitor extends GrammarBaseVisitor<List<Declaration>> {

    /**
     * Visit method for Declaration
     * @param ctx context for Declaration
     * @return Declaration list
     */
    @Override
    public List<Declaration> visitDeclaration(GrammarParser.DeclarationContext ctx) {
        List<Declaration> declarations = new ArrayList<>();
        if (ctx.single_declaration() != null) {
            DataType dataType = DataType.getType(ctx.single_declaration().type().getText());
            String ident = ctx.single_declaration().IDENTIFIER().getText();
            declarations.add(new Declaration(ident, dataType, false, null));

        } else if (ctx.multiple_assignment() != null) {
            boolean isConst = ctx.multiple_assignment().CONST() != null;
            DataType dataType = DataType.getType(ctx.multiple_assignment().type().getText());
            Assignment assignment = new AssignmentVisitor().visit(ctx.multiple_assignment().assignment());

            for (TerminalNode ident : ctx.multiple_assignment().IDENTIFIER()) {
                declarations.add(new Declaration(ident.getText(), dataType, isConst, new Initialization(ident.getText(), assignment)));
            }
        } else if (ctx.parallel_assignment() != null) {
            boolean isConst = ctx.parallel_assignment().CONST() != null;
            DataType dataType = DataType.getType(ctx.parallel_assignment().type().getText());

            List<TerminalNode> identifiers = ctx.parallel_assignment().IDENTIFIER();
            List<GrammarParser.ValueContext> valuesCtx = ctx.parallel_assignment().value();

            if (identifiers.size() != valuesCtx.size()) {
                StringBuilder identsStr = new StringBuilder();
                identsStr.append(identifiers.get(0).getText());
                for (int i = 1; i < identifiers.size(); i++) {
                    identsStr.append(", ").append(identifiers.get(i).getText());
                }
                throw new RuntimeException("Identifiers " + identsStr + " do not have the same number of values.");
            }
            for (int i = 0; i < identifiers.size(); i++) {
                String ident = identifiers.get(i).getText();
                Assignment assignment = getValue(valuesCtx.get(i));
                declarations.add(new Declaration(ident, dataType, isConst, new Initialization(ident, assignment)));
            }
        }
        return declarations;
    }


}
