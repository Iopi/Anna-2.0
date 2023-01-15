package visitor;

import antlr.GrammarBaseVisitor;
import antlr.GrammarParser;
import org.antlr.v4.runtime.tree.TerminalNode;
import tree.*;
import tree.value.BoolValue;
import tree.value.IntValue;
import tree.value.RealValue;
import tree.value.StringValue;
import type.DataType;

import java.util.ArrayList;
import java.util.List;

public class DeclarationVisitor extends GrammarBaseVisitor<List<Declaration>> {

    @Override
    public List<Declaration> visitDeclaration(GrammarParser.DeclarationContext ctx) {
        List<Declaration> declarations = new ArrayList<>();
        if (ctx.single_declaration() != null) {
            boolean isConst = ctx.single_declaration().CONST() != null;
            DataType dataType = DataType.getType(ctx.single_declaration().type().getText());
            String ident = ctx.single_declaration().IDENTIFIER().getText();
            declarations.add(new Declaration(ident, dataType, isConst, null));

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
                String value = valuesCtx.get(i).getText();
                Assignment assignment = getValue(valuesCtx.get(i));
                declarations.add(new Declaration(ident, dataType, isConst, new Initialization(ident, assignment)));
            }
        }
        return declarations;
    }

    public static Assignment getValue(GrammarParser.ValueContext valueContext) {
        if (valueContext.INT() != null) {
            int value = Integer.parseInt(valueContext.INT().getText());
            if (valueContext.MINUS() != null)
                value *= -1;
            return new Assignment(null, new IntValue(value, DataType.INT));
        } else if (valueContext.REAL() != null) {
            double value = Double.parseDouble(valueContext.REAL().getText());
            if (valueContext.MINUS() != null)
                value *= -1;
            return new Assignment(null, new RealValue(value, DataType.REAL));
        } else if (valueContext.BOOLEAN() != null) {
            boolean value = Boolean.parseBoolean(valueContext.BOOLEAN().getText());
            return new Assignment(null, new BoolValue(value, DataType.BOOLEAN));
        } else if (valueContext.STRING() != null) {
            String value = valueContext.STRING().getText();
            return new Assignment(null, new StringValue(value, DataType.STRING));
        } else if (valueContext.ARRAY() != null) {
            // TODO
        }
        throw new RuntimeException("Unexpected data type " + valueContext.getText());
    }
}
