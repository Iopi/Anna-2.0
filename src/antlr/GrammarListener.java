// Generated from java-escape by ANTLR 4.11.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(GrammarParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(GrammarParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(GrammarParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(GrammarParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#single_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSingle_declaration(GrammarParser.Single_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#single_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSingle_declaration(GrammarParser.Single_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#multiple_assignment}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_assignment(GrammarParser.Multiple_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#multiple_assignment}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_assignment(GrammarParser.Multiple_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#parallel_assignment}.
	 * @param ctx the parse tree
	 */
	void enterParallel_assignment(GrammarParser.Parallel_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#parallel_assignment}.
	 * @param ctx the parse tree
	 */
	void exitParallel_assignment(GrammarParser.Parallel_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#initialization}.
	 * @param ctx the parse tree
	 */
	void enterInitialization(GrammarParser.InitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#initialization}.
	 * @param ctx the parse tree
	 */
	void exitInitialization(GrammarParser.InitializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(GrammarParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(GrammarParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(GrammarParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(GrammarParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#statement_body}.
	 * @param ctx the parse tree
	 */
	void enterStatement_body(GrammarParser.Statement_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#statement_body}.
	 * @param ctx the parse tree
	 */
	void exitStatement_body(GrammarParser.Statement_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(GrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(GrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(GrammarParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(GrammarParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(GrammarParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(GrammarParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#if_part}.
	 * @param ctx the parse tree
	 */
	void enterIf_part(GrammarParser.If_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#if_part}.
	 * @param ctx the parse tree
	 */
	void exitIf_part(GrammarParser.If_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#else_part}.
	 * @param ctx the parse tree
	 */
	void enterElse_part(GrammarParser.Else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#else_part}.
	 * @param ctx the parse tree
	 */
	void exitElse_part(GrammarParser.Else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cycle}.
	 * @param ctx the parse tree
	 */
	void enterCycle(GrammarParser.CycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cycle}.
	 * @param ctx the parse tree
	 */
	void exitCycle(GrammarParser.CycleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#while_cycle}.
	 * @param ctx the parse tree
	 */
	void enterWhile_cycle(GrammarParser.While_cycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#while_cycle}.
	 * @param ctx the parse tree
	 */
	void exitWhile_cycle(GrammarParser.While_cycleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#do_while}.
	 * @param ctx the parse tree
	 */
	void enterDo_while(GrammarParser.Do_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#do_while}.
	 * @param ctx the parse tree
	 */
	void exitDo_while(GrammarParser.Do_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#switch_cycle}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_cycle(GrammarParser.Switch_cycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#switch_cycle}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_cycle(GrammarParser.Switch_cycleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#case_body}.
	 * @param ctx the parse tree
	 */
	void enterCase_body(GrammarParser.Case_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#case_body}.
	 * @param ctx the parse tree
	 */
	void exitCase_body(GrammarParser.Case_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#repeat_cycle}.
	 * @param ctx the parse tree
	 */
	void enterRepeat_cycle(GrammarParser.Repeat_cycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#repeat_cycle}.
	 * @param ctx the parse tree
	 */
	void exitRepeat_cycle(GrammarParser.Repeat_cycleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#for_cycle}.
	 * @param ctx the parse tree
	 */
	void enterFor_cycle(GrammarParser.For_cycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#for_cycle}.
	 * @param ctx the parse tree
	 */
	void exitFor_cycle(GrammarParser.For_cycleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(GrammarParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(GrammarParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#array_type}.
	 * @param ctx the parse tree
	 */
	void enterArray_type(GrammarParser.Array_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#array_type}.
	 * @param ctx the parse tree
	 */
	void exitArray_type(GrammarParser.Array_typeContext ctx);
}