// Generated from java-escape by ANTLR 4.11.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(GrammarParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(GrammarParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#multiple_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple_assignment(GrammarParser.Multiple_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#parallel_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParallel_assignment(GrammarParser.Parallel_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialization(GrammarParser.InitializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(GrammarParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(GrammarParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#statement_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_body(GrammarParser.Statement_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(GrammarParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(GrammarParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(GrammarParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#if_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_part(GrammarParser.If_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#else_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_part(GrammarParser.Else_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#cycle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCycle(GrammarParser.CycleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(GrammarParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#do_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while(GrammarParser.Do_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#switch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch(GrammarParser.SwitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(GrammarParser.RepeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(GrammarParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#for_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_declaration(GrammarParser.For_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(GrammarParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(GrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#array_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_type(GrammarParser.Array_typeContext ctx);
}