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
	 * Enter a parse tree produced by {@link GrammarParser#statement_options}.
	 * @param ctx the parse tree
	 */
	void enterStatement_options(GrammarParser.Statement_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#statement_options}.
	 * @param ctx the parse tree
	 */
	void exitStatement_options(GrammarParser.Statement_optionsContext ctx);
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
	 * Enter a parse tree produced by {@link GrammarParser#exp_op}.
	 * @param ctx the parse tree
	 */
	void enterExp_op(GrammarParser.Exp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#exp_op}.
	 * @param ctx the parse tree
	 */
	void exitExp_op(GrammarParser.Exp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#exp_parenthesis}.
	 * @param ctx the parse tree
	 */
	void enterExp_parenthesis(GrammarParser.Exp_parenthesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#exp_parenthesis}.
	 * @param ctx the parse tree
	 */
	void exitExp_parenthesis(GrammarParser.Exp_parenthesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#exp_mult_div}.
	 * @param ctx the parse tree
	 */
	void enterExp_mult_div(GrammarParser.Exp_mult_divContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#exp_mult_div}.
	 * @param ctx the parse tree
	 */
	void exitExp_mult_div(GrammarParser.Exp_mult_divContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#exp_plus_minus}.
	 * @param ctx the parse tree
	 */
	void enterExp_plus_minus(GrammarParser.Exp_plus_minusContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#exp_plus_minus}.
	 * @param ctx the parse tree
	 */
	void exitExp_plus_minus(GrammarParser.Exp_plus_minusContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#exp_not}.
	 * @param ctx the parse tree
	 */
	void enterExp_not(GrammarParser.Exp_notContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#exp_not}.
	 * @param ctx the parse tree
	 */
	void exitExp_not(GrammarParser.Exp_notContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#exp_eqv}.
	 * @param ctx the parse tree
	 */
	void enterExp_eqv(GrammarParser.Exp_eqvContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#exp_eqv}.
	 * @param ctx the parse tree
	 */
	void exitExp_eqv(GrammarParser.Exp_eqvContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#exp_and_or}.
	 * @param ctx the parse tree
	 */
	void enterExp_and_or(GrammarParser.Exp_and_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#exp_and_or}.
	 * @param ctx the parse tree
	 */
	void exitExp_and_or(GrammarParser.Exp_and_orContext ctx);
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
	 * Enter a parse tree produced by {@link GrammarParser#type_no_array}.
	 * @param ctx the parse tree
	 */
	void enterType_no_array(GrammarParser.Type_no_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#type_no_array}.
	 * @param ctx the parse tree
	 */
	void exitType_no_array(GrammarParser.Type_no_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#real}.
	 * @param ctx the parse tree
	 */
	void enterReal(GrammarParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#real}.
	 * @param ctx the parse tree
	 */
	void exitReal(GrammarParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ratio}.
	 * @param ctx the parse tree
	 */
	void enterRatio(GrammarParser.RatioContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ratio}.
	 * @param ctx the parse tree
	 */
	void exitRatio(GrammarParser.RatioContext ctx);
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