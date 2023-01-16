// Generated from java-escape by ANTLR 4.11.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, FUNC=7, IF=8, ELSE=9, 
		WHILE=10, DO=11, SWITCH=12, CASE=13, REPEAT=14, UNTIL=15, FOR=16, INT=17, 
		BOOLEAN=18, STRING=19, ARRAY=20, MINUS=21, PLUS=22, MULT=23, DIVISION=24, 
		CONST=25, LEFT_ROUND_PARENTHESIS=26, RIGHT_ROUND_PARENTHESIS=27, LEFT_COMPOUND_PARENTHESIS=28, 
		RIGHT_COMPOUND_PARENTHESIS=29, LEFT_SQUARE_PARENTHESIS=30, RIGHT_SQUARE_PARENTHESIS=31, 
		EQUAL=32, LESS_THAN=33, LESS_THAN_OR_EQV=34, GREATER_THAN=35, GREATER_THAN_OR_EQV=36, 
		EQV_EQV=37, NOT_EQV=38, AND=39, OR=40, NOT=41, DOT=42, DOUBLE_DOT=43, 
		COMMA=44, SEMICOLON=45, BREAK=46, IDENTIFIER=47, SPACE=48;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_declaration = 2, RULE_single_declaration = 3, 
		RULE_multiple_assignment = 4, RULE_parallel_assignment = 5, RULE_initialization = 6, 
		RULE_function = 7, RULE_parameter = 8, RULE_statement = 9, RULE_statement_body = 10, 
		RULE_assignment = 11, RULE_expression = 12, RULE_exp_op = 13, RULE_exp_parenthesis = 14, 
		RULE_exp_mult_div = 15, RULE_exp_plus_minus = 16, RULE_exp_not = 17, RULE_exp_eqv = 18, 
		RULE_exp_and_or = 19, RULE_value = 20, RULE_conditional = 21, RULE_if_part = 22, 
		RULE_else_part = 23, RULE_cycle = 24, RULE_while_cycle = 25, RULE_do_while = 26, 
		RULE_switch_cycle = 27, RULE_case_body = 28, RULE_repeat_cycle = 29, RULE_for_cycle = 30, 
		RULE_function_call = 31, RULE_type = 32, RULE_type_no_array = 33, RULE_real = 34, 
		RULE_ratio = 35, RULE_array_type = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "declaration", "single_declaration", "multiple_assignment", 
			"parallel_assignment", "initialization", "function", "parameter", "statement", 
			"statement_body", "assignment", "expression", "exp_op", "exp_parenthesis", 
			"exp_mult_div", "exp_plus_minus", "exp_not", "exp_eqv", "exp_and_or", 
			"value", "conditional", "if_part", "else_part", "cycle", "while_cycle", 
			"do_while", "switch_cycle", "case_body", "repeat_cycle", "for_cycle", 
			"function_call", "type", "type_no_array", "real", "ratio", "array_type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'void'", "'int'", "'real'", "'ratio'", "'boolean'", "'string'", 
			"'function'", "'if'", "'else'", "'while'", "'do'", "'switch'", "'case'", 
			"'repeat'", "'until'", "'for'", null, null, null, "'array'", "'-'", "'+'", 
			"'*'", "'/'", "'const'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'='", 
			"'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'&&'", "'||'", "'!'", 
			"'.'", "':'", "','", "';'", "'break'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "FUNC", "IF", "ELSE", "WHILE", 
			"DO", "SWITCH", "CASE", "REPEAT", "UNTIL", "FOR", "INT", "BOOLEAN", "STRING", 
			"ARRAY", "MINUS", "PLUS", "MULT", "DIVISION", "CONST", "LEFT_ROUND_PARENTHESIS", 
			"RIGHT_ROUND_PARENTHESIS", "LEFT_COMPOUND_PARENTHESIS", "RIGHT_COMPOUND_PARENTHESIS", 
			"LEFT_SQUARE_PARENTHESIS", "RIGHT_SQUARE_PARENTHESIS", "EQUAL", "LESS_THAN", 
			"LESS_THAN_OR_EQV", "GREATER_THAN", "GREATER_THAN_OR_EQV", "EQV_EQV", 
			"NOT_EQV", "AND", "OR", "NOT", "DOT", "DOUBLE_DOT", "COMMA", "SEMICOLON", 
			"BREAK", "IDENTIFIER", "SPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<MainContext> main() {
			return getRuleContexts(MainContext.class);
		}
		public MainContext main(int i) {
			return getRuleContext(MainContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 140737523047934L) != 0) {
				{
				{
				setState(74);
				main();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public InitializationContext initialization() {
			return getRuleContext(InitializationContext.class,0);
		}
		public Statement_bodyContext statement_body() {
			return getRuleContext(Statement_bodyContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				initialization();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				statement_body();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				function();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public Single_declarationContext single_declaration() {
			return getRuleContext(Single_declarationContext.class,0);
		}
		public Multiple_assignmentContext multiple_assignment() {
			return getRuleContext(Multiple_assignmentContext.class,0);
		}
		public Parallel_assignmentContext parallel_assignment() {
			return getRuleContext(Parallel_assignmentContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				single_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				multiple_assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				parallel_assignment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Single_declarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GrammarParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public Single_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSingle_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSingle_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSingle_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_declarationContext single_declaration() throws RecognitionException {
		Single_declarationContext _localctx = new Single_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_single_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			type();
			setState(92);
			match(IDENTIFIER);
			setState(93);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Multiple_assignmentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GrammarParser.IDENTIFIER, i);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public TerminalNode CONST() { return getToken(GrammarParser.CONST, 0); }
		public List<TerminalNode> EQUAL() { return getTokens(GrammarParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(GrammarParser.EQUAL, i);
		}
		public Multiple_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMultiple_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMultiple_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitMultiple_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiple_assignmentContext multiple_assignment() throws RecognitionException {
		Multiple_assignmentContext _localctx = new Multiple_assignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_multiple_assignment);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(95);
				match(CONST);
				}
			}

			setState(98);
			type();
			setState(99);
			match(IDENTIFIER);
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(100);
					match(EQUAL);
					setState(101);
					match(IDENTIFIER);
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(107);
			assignment();
			setState(108);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parallel_assignmentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> LEFT_COMPOUND_PARENTHESIS() { return getTokens(GrammarParser.LEFT_COMPOUND_PARENTHESIS); }
		public TerminalNode LEFT_COMPOUND_PARENTHESIS(int i) {
			return getToken(GrammarParser.LEFT_COMPOUND_PARENTHESIS, i);
		}
		public List<TerminalNode> RIGHT_COMPOUND_PARENTHESIS() { return getTokens(GrammarParser.RIGHT_COMPOUND_PARENTHESIS); }
		public TerminalNode RIGHT_COMPOUND_PARENTHESIS(int i) {
			return getToken(GrammarParser.RIGHT_COMPOUND_PARENTHESIS, i);
		}
		public TerminalNode EQUAL() { return getToken(GrammarParser.EQUAL, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public TerminalNode CONST() { return getToken(GrammarParser.CONST, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GrammarParser.IDENTIFIER, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Parallel_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parallel_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterParallel_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitParallel_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitParallel_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parallel_assignmentContext parallel_assignment() throws RecognitionException {
		Parallel_assignmentContext _localctx = new Parallel_assignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parallel_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(110);
				match(CONST);
				}
			}

			setState(113);
			type();
			setState(114);
			match(LEFT_COMPOUND_PARENTHESIS);
			setState(116); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(115);
				match(IDENTIFIER);
				}
				}
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(120);
			match(RIGHT_COMPOUND_PARENTHESIS);
			setState(121);
			match(EQUAL);
			setState(122);
			match(LEFT_COMPOUND_PARENTHESIS);
			setState(124); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(123);
				value();
				}
				}
				setState(126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 4063232L) != 0 );
			setState(128);
			match(RIGHT_COMPOUND_PARENTHESIS);
			setState(129);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitializationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GrammarParser.IDENTIFIER, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public InitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitInitialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitInitialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializationContext initialization() throws RecognitionException {
		InitializationContext _localctx = new InitializationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_initialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(IDENTIFIER);
			setState(132);
			assignment();
			setState(133);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(GrammarParser.FUNC, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GrammarParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_ROUND_PARENTHESIS() { return getToken(GrammarParser.LEFT_ROUND_PARENTHESIS, 0); }
		public TerminalNode RIGHT_ROUND_PARENTHESIS() { return getToken(GrammarParser.RIGHT_ROUND_PARENTHESIS, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(FUNC);
			setState(136);
			match(IDENTIFIER);
			setState(137);
			match(LEFT_ROUND_PARENTHESIS);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 1048702L) != 0) {
				{
				{
				setState(138);
				parameter();
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			match(RIGHT_ROUND_PARENTHESIS);
			setState(145);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GrammarParser.IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(GrammarParser.COMMA, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			type();
			setState(148);
			match(IDENTIFIER);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(149);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public TerminalNode LEFT_COMPOUND_PARENTHESIS() { return getToken(GrammarParser.LEFT_COMPOUND_PARENTHESIS, 0); }
		public TerminalNode RIGHT_COMPOUND_PARENTHESIS() { return getToken(GrammarParser.RIGHT_COMPOUND_PARENTHESIS, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<InitializationContext> initialization() {
			return getRuleContexts(InitializationContext.class);
		}
		public InitializationContext initialization(int i) {
			return getRuleContext(InitializationContext.class,i);
		}
		public List<Statement_bodyContext> statement_body() {
			return getRuleContexts(Statement_bodyContext.class);
		}
		public Statement_bodyContext statement_body(int i) {
			return getRuleContext(Statement_bodyContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(LEFT_COMPOUND_PARENTHESIS);
			setState(156); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(156);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(153);
					declaration();
					}
					break;
				case 2:
					{
					setState(154);
					initialization();
					}
					break;
				case 3:
					{
					setState(155);
					statement_body();
					}
					break;
				}
				}
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 140737523047806L) != 0 );
			setState(160);
			match(RIGHT_COMPOUND_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Statement_bodyContext extends ParserRuleContext {
		public CycleContext cycle() {
			return getRuleContext(CycleContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public Statement_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStatement_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStatement_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStatement_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_bodyContext statement_body() throws RecognitionException {
		Statement_bodyContext _localctx = new Statement_bodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement_body);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
			case DO:
			case SWITCH:
			case REPEAT:
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				cycle();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				conditional();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				function_call();
				setState(165);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(GrammarParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public TerminalNode ARRAY() { return getToken(GrammarParser.ARRAY, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(EQUAL);
				setState(170);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(EQUAL);
				setState(172);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				match(EQUAL);
				setState(174);
				match(ARRAY);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GrammarParser.INT, 0); }
		public TerminalNode MINUS() { return getToken(GrammarParser.MINUS, 0); }
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public RatioContext ratio() {
			return getRuleContext(RatioContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(GrammarParser.BOOLEAN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GrammarParser.IDENTIFIER, 0); }
		public Exp_parenthesisContext exp_parenthesis() {
			return getRuleContext(Exp_parenthesisContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Exp_opContext exp_op() {
			return getRuleContext(Exp_opContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(178);
					match(MINUS);
					}
				}

				setState(181);
				match(INT);
				}
				break;
			case 2:
				{
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(182);
					match(MINUS);
					}
				}

				setState(185);
				real();
				}
				break;
			case 3:
				{
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(186);
					match(MINUS);
					}
				}

				setState(189);
				ratio();
				}
				break;
			case 4:
				{
				setState(190);
				match(BOOLEAN);
				}
				break;
			case 5:
				{
				setState(191);
				match(IDENTIFIER);
				}
				break;
			case 6:
				{
				setState(192);
				exp_parenthesis();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(195);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(196);
					exp_op();
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_opContext extends ParserRuleContext {
		public Exp_mult_divContext exp_mult_div() {
			return getRuleContext(Exp_mult_divContext.class,0);
		}
		public Exp_plus_minusContext exp_plus_minus() {
			return getRuleContext(Exp_plus_minusContext.class,0);
		}
		public Exp_notContext exp_not() {
			return getRuleContext(Exp_notContext.class,0);
		}
		public Exp_eqvContext exp_eqv() {
			return getRuleContext(Exp_eqvContext.class,0);
		}
		public Exp_and_orContext exp_and_or() {
			return getRuleContext(Exp_and_orContext.class,0);
		}
		public Exp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExp_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExp_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExp_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_opContext exp_op() throws RecognitionException {
		Exp_opContext _localctx = new Exp_opContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exp_op);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				exp_mult_div();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				exp_mult_div();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				exp_plus_minus();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				exp_not();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(206);
				exp_eqv();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(207);
				exp_and_or();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_parenthesisContext extends ParserRuleContext {
		public TerminalNode LEFT_ROUND_PARENTHESIS() { return getToken(GrammarParser.LEFT_ROUND_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_ROUND_PARENTHESIS() { return getToken(GrammarParser.RIGHT_ROUND_PARENTHESIS, 0); }
		public Exp_parenthesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_parenthesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExp_parenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExp_parenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExp_parenthesis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_parenthesisContext exp_parenthesis() throws RecognitionException {
		Exp_parenthesisContext _localctx = new Exp_parenthesisContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exp_parenthesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(LEFT_ROUND_PARENTHESIS);
			setState(211);
			expression(0);
			setState(212);
			match(RIGHT_ROUND_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_mult_divContext extends ParserRuleContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MULT() { return getToken(GrammarParser.MULT, 0); }
		public TerminalNode DIVISION() { return getToken(GrammarParser.DIVISION, 0); }
		public Exp_mult_divContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_mult_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExp_mult_div(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExp_mult_div(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExp_mult_div(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_mult_divContext exp_mult_div() throws RecognitionException {
		Exp_mult_divContext _localctx = new Exp_mult_divContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exp_mult_div);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			((Exp_mult_divContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==MULT || _la==DIVISION) ) {
				((Exp_mult_divContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(215);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_plus_minusContext extends ParserRuleContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(GrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GrammarParser.MINUS, 0); }
		public Exp_plus_minusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_plus_minus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExp_plus_minus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExp_plus_minus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExp_plus_minus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_plus_minusContext exp_plus_minus() throws RecognitionException {
		Exp_plus_minusContext _localctx = new Exp_plus_minusContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exp_plus_minus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			((Exp_plus_minusContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==MINUS || _la==PLUS) ) {
				((Exp_plus_minusContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(218);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_notContext extends ParserRuleContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(GrammarParser.NOT, 0); }
		public Exp_notContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExp_not(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExp_not(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExp_not(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_notContext exp_not() throws RecognitionException {
		Exp_notContext _localctx = new Exp_notContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exp_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			((Exp_notContext)_localctx).op = match(NOT);
			setState(221);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_eqvContext extends ParserRuleContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EQV_EQV() { return getToken(GrammarParser.EQV_EQV, 0); }
		public TerminalNode NOT_EQV() { return getToken(GrammarParser.NOT_EQV, 0); }
		public TerminalNode LESS_THAN() { return getToken(GrammarParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(GrammarParser.GREATER_THAN, 0); }
		public TerminalNode LESS_THAN_OR_EQV() { return getToken(GrammarParser.LESS_THAN_OR_EQV, 0); }
		public TerminalNode GREATER_THAN_OR_EQV() { return getToken(GrammarParser.GREATER_THAN_OR_EQV, 0); }
		public Exp_eqvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_eqv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExp_eqv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExp_eqv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExp_eqv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_eqvContext exp_eqv() throws RecognitionException {
		Exp_eqvContext _localctx = new Exp_eqvContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exp_eqv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			((Exp_eqvContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 541165879296L) != 0) ) {
				((Exp_eqvContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(224);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_and_orContext extends ParserRuleContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(GrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(GrammarParser.OR, 0); }
		public Exp_and_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_and_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExp_and_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExp_and_or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExp_and_or(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_and_orContext exp_and_or() throws RecognitionException {
		Exp_and_orContext _localctx = new Exp_and_orContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_exp_and_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			((Exp_and_orContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
				((Exp_and_orContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(227);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GrammarParser.INT, 0); }
		public TerminalNode MINUS() { return getToken(GrammarParser.MINUS, 0); }
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public RatioContext ratio() {
			return getRuleContext(RatioContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(GrammarParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public TerminalNode ARRAY() { return getToken(GrammarParser.ARRAY, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_value);
		int _la;
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(229);
					match(MINUS);
					}
				}

				setState(232);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(233);
					match(MINUS);
					}
				}

				setState(236);
				real();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(237);
					match(MINUS);
					}
				}

				setState(240);
				ratio();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(241);
				match(BOOLEAN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(242);
				match(STRING);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(243);
				match(ARRAY);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalContext extends ParserRuleContext {
		public If_partContext if_part() {
			return getRuleContext(If_partContext.class,0);
		}
		public Else_partContext else_part() {
			return getRuleContext(Else_partContext.class,0);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			if_part();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(247);
				else_part();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_partContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GrammarParser.IF, 0); }
		public TerminalNode LEFT_ROUND_PARENTHESIS() { return getToken(GrammarParser.LEFT_ROUND_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_ROUND_PARENTHESIS() { return getToken(GrammarParser.RIGHT_ROUND_PARENTHESIS, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public If_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIf_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIf_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitIf_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_partContext if_part() throws RecognitionException {
		If_partContext _localctx = new If_partContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_if_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(IF);
			setState(251);
			match(LEFT_ROUND_PARENTHESIS);
			setState(252);
			expression(0);
			setState(253);
			match(RIGHT_ROUND_PARENTHESIS);
			setState(254);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_partContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(GrammarParser.ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Else_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterElse_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitElse_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitElse_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_partContext else_part() throws RecognitionException {
		Else_partContext _localctx = new Else_partContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_else_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(ELSE);
			setState(257);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CycleContext extends ParserRuleContext {
		public While_cycleContext while_cycle() {
			return getRuleContext(While_cycleContext.class,0);
		}
		public Do_whileContext do_while() {
			return getRuleContext(Do_whileContext.class,0);
		}
		public For_cycleContext for_cycle() {
			return getRuleContext(For_cycleContext.class,0);
		}
		public Repeat_cycleContext repeat_cycle() {
			return getRuleContext(Repeat_cycleContext.class,0);
		}
		public Switch_cycleContext switch_cycle() {
			return getRuleContext(Switch_cycleContext.class,0);
		}
		public CycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCycle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCycle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CycleContext cycle() throws RecognitionException {
		CycleContext _localctx = new CycleContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cycle);
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				while_cycle();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				do_while();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				for_cycle();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
				repeat_cycle();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(263);
				switch_cycle();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_cycleContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(GrammarParser.WHILE, 0); }
		public TerminalNode LEFT_ROUND_PARENTHESIS() { return getToken(GrammarParser.LEFT_ROUND_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_ROUND_PARENTHESIS() { return getToken(GrammarParser.RIGHT_ROUND_PARENTHESIS, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_cycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_cycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterWhile_cycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitWhile_cycle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitWhile_cycle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_cycleContext while_cycle() throws RecognitionException {
		While_cycleContext _localctx = new While_cycleContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_while_cycle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(WHILE);
			setState(267);
			match(LEFT_ROUND_PARENTHESIS);
			setState(268);
			expression(0);
			setState(269);
			match(RIGHT_ROUND_PARENTHESIS);
			setState(270);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Do_whileContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(GrammarParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(GrammarParser.WHILE, 0); }
		public TerminalNode LEFT_ROUND_PARENTHESIS() { return getToken(GrammarParser.LEFT_ROUND_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_ROUND_PARENTHESIS() { return getToken(GrammarParser.RIGHT_ROUND_PARENTHESIS, 0); }
		public Do_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDo_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDo_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDo_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_whileContext do_while() throws RecognitionException {
		Do_whileContext _localctx = new Do_whileContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_do_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(DO);
			setState(273);
			statement();
			setState(274);
			match(WHILE);
			setState(275);
			match(LEFT_ROUND_PARENTHESIS);
			setState(276);
			expression(0);
			setState(277);
			match(RIGHT_ROUND_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Switch_cycleContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(GrammarParser.SWITCH, 0); }
		public TerminalNode LEFT_ROUND_PARENTHESIS() { return getToken(GrammarParser.LEFT_ROUND_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_ROUND_PARENTHESIS() { return getToken(GrammarParser.RIGHT_ROUND_PARENTHESIS, 0); }
		public TerminalNode LEFT_COMPOUND_PARENTHESIS() { return getToken(GrammarParser.LEFT_COMPOUND_PARENTHESIS, 0); }
		public TerminalNode RIGHT_COMPOUND_PARENTHESIS() { return getToken(GrammarParser.RIGHT_COMPOUND_PARENTHESIS, 0); }
		public List<Case_bodyContext> case_body() {
			return getRuleContexts(Case_bodyContext.class);
		}
		public Case_bodyContext case_body(int i) {
			return getRuleContext(Case_bodyContext.class,i);
		}
		public Switch_cycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_cycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSwitch_cycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSwitch_cycle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSwitch_cycle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_cycleContext switch_cycle() throws RecognitionException {
		Switch_cycleContext _localctx = new Switch_cycleContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_switch_cycle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(SWITCH);
			setState(280);
			match(LEFT_ROUND_PARENTHESIS);
			setState(281);
			expression(0);
			setState(282);
			match(RIGHT_ROUND_PARENTHESIS);
			setState(283);
			match(LEFT_COMPOUND_PARENTHESIS);
			setState(285); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(284);
				case_body();
				}
				}
				setState(287); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE );
			setState(289);
			match(RIGHT_COMPOUND_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Case_bodyContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(GrammarParser.CASE, 0); }
		public TerminalNode DOUBLE_DOT() { return getToken(GrammarParser.DOUBLE_DOT, 0); }
		public TerminalNode BREAK() { return getToken(GrammarParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GrammarParser.IDENTIFIER, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<InitializationContext> initialization() {
			return getRuleContexts(InitializationContext.class);
		}
		public InitializationContext initialization(int i) {
			return getRuleContext(InitializationContext.class,i);
		}
		public List<Statement_bodyContext> statement_body() {
			return getRuleContexts(Statement_bodyContext.class);
		}
		public Statement_bodyContext statement_body(int i) {
			return getRuleContext(Statement_bodyContext.class,i);
		}
		public Case_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCase_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCase_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCase_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_bodyContext case_body() throws RecognitionException {
		Case_bodyContext _localctx = new Case_bodyContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_case_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(CASE);
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOLEAN:
			case STRING:
			case ARRAY:
			case MINUS:
				{
				setState(292);
				value();
				}
				break;
			case IDENTIFIER:
				{
				setState(293);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(296);
			match(DOUBLE_DOT);
			setState(300); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(300);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(297);
					declaration();
					}
					break;
				case 2:
					{
					setState(298);
					initialization();
					}
					break;
				case 3:
					{
					setState(299);
					statement_body();
					}
					break;
				}
				}
				setState(302); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 140737523047806L) != 0 );
			setState(304);
			match(BREAK);
			setState(305);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Repeat_cycleContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(GrammarParser.REPEAT, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(GrammarParser.UNTIL, 0); }
		public TerminalNode LEFT_ROUND_PARENTHESIS() { return getToken(GrammarParser.LEFT_ROUND_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_ROUND_PARENTHESIS() { return getToken(GrammarParser.RIGHT_ROUND_PARENTHESIS, 0); }
		public Repeat_cycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_cycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRepeat_cycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRepeat_cycle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRepeat_cycle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Repeat_cycleContext repeat_cycle() throws RecognitionException {
		Repeat_cycleContext _localctx = new Repeat_cycleContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_repeat_cycle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(REPEAT);
			setState(308);
			statement();
			setState(309);
			match(UNTIL);
			setState(310);
			match(LEFT_ROUND_PARENTHESIS);
			setState(311);
			expression(0);
			setState(312);
			match(RIGHT_ROUND_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_cycleContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(GrammarParser.FOR, 0); }
		public TerminalNode LEFT_ROUND_PARENTHESIS() { return getToken(GrammarParser.LEFT_ROUND_PARENTHESIS, 0); }
		public Multiple_assignmentContext multiple_assignment() {
			return getRuleContext(Multiple_assignmentContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(GrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GrammarParser.SEMICOLON, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GrammarParser.IDENTIFIER, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode RIGHT_ROUND_PARENTHESIS() { return getToken(GrammarParser.RIGHT_ROUND_PARENTHESIS, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public For_cycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_cycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFor_cycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFor_cycle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFor_cycle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_cycleContext for_cycle() throws RecognitionException {
		For_cycleContext _localctx = new For_cycleContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_for_cycle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(FOR);
			setState(315);
			match(LEFT_ROUND_PARENTHESIS);
			setState(316);
			multiple_assignment();
			setState(317);
			match(SEMICOLON);
			setState(318);
			expression(0);
			setState(319);
			match(SEMICOLON);
			setState(320);
			match(IDENTIFIER);
			setState(321);
			assignment();
			setState(322);
			match(RIGHT_ROUND_PARENTHESIS);
			setState(323);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GrammarParser.IDENTIFIER, i);
		}
		public TerminalNode LEFT_ROUND_PARENTHESIS() { return getToken(GrammarParser.LEFT_ROUND_PARENTHESIS, 0); }
		public TerminalNode RIGHT_ROUND_PARENTHESIS() { return getToken(GrammarParser.RIGHT_ROUND_PARENTHESIS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(IDENTIFIER);
			setState(326);
			match(LEFT_ROUND_PARENTHESIS);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(327);
				match(IDENTIFIER);
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(328);
					match(COMMA);
					}
				}

				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(336);
			match(RIGHT_ROUND_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public Type_no_arrayContext type_no_array() {
			return getRuleContext(Type_no_arrayContext.class,0);
		}
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_type);
		try {
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				type_no_array();
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				array_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_no_arrayContext extends ParserRuleContext {
		public Type_no_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_no_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterType_no_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitType_no_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitType_no_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_no_arrayContext type_no_array() throws RecognitionException {
		Type_no_arrayContext _localctx = new Type_no_arrayContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_type_no_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 126L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RealContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GrammarParser.INT, i);
		}
		public TerminalNode DOT() { return getToken(GrammarParser.DOT, 0); }
		public RealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitReal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealContext real() throws RecognitionException {
		RealContext _localctx = new RealContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_real);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(INT);
			setState(345);
			match(DOT);
			setState(346);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RatioContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GrammarParser.INT, i);
		}
		public TerminalNode DIVISION() { return getToken(GrammarParser.DIVISION, 0); }
		public RatioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ratio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRatio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRatio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRatio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RatioContext ratio() throws RecognitionException {
		RatioContext _localctx = new RatioContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ratio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(INT);
			setState(349);
			match(DIVISION);
			setState(350);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_typeContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(GrammarParser.ARRAY, 0); }
		public TerminalNode LESS_THAN() { return getToken(GrammarParser.LESS_THAN, 0); }
		public Type_no_arrayContext type_no_array() {
			return getRuleContext(Type_no_arrayContext.class,0);
		}
		public TerminalNode GREATER_THAN() { return getToken(GrammarParser.GREATER_THAN, 0); }
		public Array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArray_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArray_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitArray_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_array_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(ARRAY);
			setState(353);
			match(LESS_THAN);
			setState(354);
			type_no_array();
			setState(355);
			match(GREATER_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00010\u0166\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0001\u0000\u0005\u0000L\b\u0000\n\u0000\f\u0000"+
		"O\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"U\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002Z\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0003\u0004a\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004g\b"+
		"\u0004\n\u0004\f\u0004j\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0003\u0005p\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004"+
		"\u0005u\b\u0005\u000b\u0005\f\u0005v\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0004\u0005}\b\u0005\u000b\u0005\f\u0005~\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u008c\b\u0007\n"+
		"\u0007\f\u0007\u008f\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u0097\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0004"+
		"\t\u009d\b\t\u000b\t\f\t\u009e\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0003\n\u00a8\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00b0\b\u000b\u0001\f"+
		"\u0001\f\u0003\f\u00b4\b\f\u0001\f\u0001\f\u0003\f\u00b8\b\f\u0001\f\u0001"+
		"\f\u0003\f\u00bc\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00c2\b\f"+
		"\u0001\f\u0001\f\u0005\f\u00c6\b\f\n\f\f\f\u00c9\t\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u00d1\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0003"+
		"\u0014\u00e7\b\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00eb\b\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u00ef\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u00f5\b\u0014\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u00f9\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0109\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0004\u001b\u011e\b\u001b\u000b\u001b\f\u001b\u011f\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0127"+
		"\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0004\u001c\u012d"+
		"\b\u001c\u000b\u001c\f\u001c\u012e\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u014a\b\u001f"+
		"\u0005\u001f\u014c\b\u001f\n\u001f\f\u001f\u014f\t\u001f\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0003 \u0155\b \u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0000\u0001\u0018%\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFH\u0000"+
		"\u0005\u0001\u0000\u0017\u0018\u0001\u0000\u0015\u0016\u0001\u0000!&\u0001"+
		"\u0000\'(\u0001\u0000\u0001\u0006\u0177\u0000M\u0001\u0000\u0000\u0000"+
		"\u0002T\u0001\u0000\u0000\u0000\u0004Y\u0001\u0000\u0000\u0000\u0006["+
		"\u0001\u0000\u0000\u0000\b`\u0001\u0000\u0000\u0000\no\u0001\u0000\u0000"+
		"\u0000\f\u0083\u0001\u0000\u0000\u0000\u000e\u0087\u0001\u0000\u0000\u0000"+
		"\u0010\u0093\u0001\u0000\u0000\u0000\u0012\u0098\u0001\u0000\u0000\u0000"+
		"\u0014\u00a7\u0001\u0000\u0000\u0000\u0016\u00af\u0001\u0000\u0000\u0000"+
		"\u0018\u00c1\u0001\u0000\u0000\u0000\u001a\u00d0\u0001\u0000\u0000\u0000"+
		"\u001c\u00d2\u0001\u0000\u0000\u0000\u001e\u00d6\u0001\u0000\u0000\u0000"+
		" \u00d9\u0001\u0000\u0000\u0000\"\u00dc\u0001\u0000\u0000\u0000$\u00df"+
		"\u0001\u0000\u0000\u0000&\u00e2\u0001\u0000\u0000\u0000(\u00f4\u0001\u0000"+
		"\u0000\u0000*\u00f6\u0001\u0000\u0000\u0000,\u00fa\u0001\u0000\u0000\u0000"+
		".\u0100\u0001\u0000\u0000\u00000\u0108\u0001\u0000\u0000\u00002\u010a"+
		"\u0001\u0000\u0000\u00004\u0110\u0001\u0000\u0000\u00006\u0117\u0001\u0000"+
		"\u0000\u00008\u0123\u0001\u0000\u0000\u0000:\u0133\u0001\u0000\u0000\u0000"+
		"<\u013a\u0001\u0000\u0000\u0000>\u0145\u0001\u0000\u0000\u0000@\u0154"+
		"\u0001\u0000\u0000\u0000B\u0156\u0001\u0000\u0000\u0000D\u0158\u0001\u0000"+
		"\u0000\u0000F\u015c\u0001\u0000\u0000\u0000H\u0160\u0001\u0000\u0000\u0000"+
		"JL\u0003\u0002\u0001\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000"+
		"\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000N\u0001\u0001"+
		"\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000PU\u0003\u0004\u0002\u0000"+
		"QU\u0003\f\u0006\u0000RU\u0003\u0014\n\u0000SU\u0003\u000e\u0007\u0000"+
		"TP\u0001\u0000\u0000\u0000TQ\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000"+
		"\u0000TS\u0001\u0000\u0000\u0000U\u0003\u0001\u0000\u0000\u0000VZ\u0003"+
		"\u0006\u0003\u0000WZ\u0003\b\u0004\u0000XZ\u0003\n\u0005\u0000YV\u0001"+
		"\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YX\u0001\u0000\u0000\u0000"+
		"Z\u0005\u0001\u0000\u0000\u0000[\\\u0003@ \u0000\\]\u0005/\u0000\u0000"+
		"]^\u0005-\u0000\u0000^\u0007\u0001\u0000\u0000\u0000_a\u0005\u0019\u0000"+
		"\u0000`_\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0001\u0000"+
		"\u0000\u0000bc\u0003@ \u0000ch\u0005/\u0000\u0000de\u0005 \u0000\u0000"+
		"eg\u0005/\u0000\u0000fd\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000"+
		"hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ik\u0001\u0000\u0000"+
		"\u0000jh\u0001\u0000\u0000\u0000kl\u0003\u0016\u000b\u0000lm\u0005-\u0000"+
		"\u0000m\t\u0001\u0000\u0000\u0000np\u0005\u0019\u0000\u0000on\u0001\u0000"+
		"\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0003"+
		"@ \u0000rt\u0005\u001c\u0000\u0000su\u0005/\u0000\u0000ts\u0001\u0000"+
		"\u0000\u0000uv\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001"+
		"\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0005\u001d\u0000\u0000"+
		"yz\u0005 \u0000\u0000z|\u0005\u001c\u0000\u0000{}\u0003(\u0014\u0000|"+
		"{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000"+
		"\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0005\u001d\u0000\u0000\u0081\u0082\u0005-\u0000\u0000\u0082"+
		"\u000b\u0001\u0000\u0000\u0000\u0083\u0084\u0005/\u0000\u0000\u0084\u0085"+
		"\u0003\u0016\u000b\u0000\u0085\u0086\u0005-\u0000\u0000\u0086\r\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0005\u0007\u0000\u0000\u0088\u0089\u0005"+
		"/\u0000\u0000\u0089\u008d\u0005\u001a\u0000\u0000\u008a\u008c\u0003\u0010"+
		"\b\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000\u0000"+
		"\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000"+
		"\u0000\u008e\u0090\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0005\u001b\u0000\u0000\u0091\u0092\u0003\u0012\t\u0000"+
		"\u0092\u000f\u0001\u0000\u0000\u0000\u0093\u0094\u0003@ \u0000\u0094\u0096"+
		"\u0005/\u0000\u0000\u0095\u0097\u0005,\u0000\u0000\u0096\u0095\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0011\u0001\u0000"+
		"\u0000\u0000\u0098\u009c\u0005\u001c\u0000\u0000\u0099\u009d\u0003\u0004"+
		"\u0002\u0000\u009a\u009d\u0003\f\u0006\u0000\u009b\u009d\u0003\u0014\n"+
		"\u0000\u009c\u0099\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000"+
		"\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000"+
		"\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u001d\u0000"+
		"\u0000\u00a1\u0013\u0001\u0000\u0000\u0000\u00a2\u00a8\u00030\u0018\u0000"+
		"\u00a3\u00a8\u0003*\u0015\u0000\u00a4\u00a5\u0003>\u001f\u0000\u00a5\u00a6"+
		"\u0005-\u0000\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a3\u0001\u0000\u0000\u0000\u00a7\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a8\u0015\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005"+
		" \u0000\u0000\u00aa\u00b0\u0003\u0018\f\u0000\u00ab\u00ac\u0005 \u0000"+
		"\u0000\u00ac\u00b0\u0005\u0013\u0000\u0000\u00ad\u00ae\u0005 \u0000\u0000"+
		"\u00ae\u00b0\u0005\u0014\u0000\u0000\u00af\u00a9\u0001\u0000\u0000\u0000"+
		"\u00af\u00ab\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000"+
		"\u00b0\u0017\u0001\u0000\u0000\u0000\u00b1\u00b3\u0006\f\uffff\uffff\u0000"+
		"\u00b2\u00b4\u0005\u0015\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b5\u00c2\u0005\u0011\u0000\u0000\u00b6\u00b8\u0005\u0015\u0000\u0000"+
		"\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00c2\u0003D\"\u0000\u00ba"+
		"\u00bc\u0005\u0015\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bc\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd"+
		"\u00c2\u0003F#\u0000\u00be\u00c2\u0005\u0012\u0000\u0000\u00bf\u00c2\u0005"+
		"/\u0000\u0000\u00c0\u00c2\u0003\u001c\u000e\u0000\u00c1\u00b1\u0001\u0000"+
		"\u0000\u0000\u00c1\u00b7\u0001\u0000\u0000\u0000\u00c1\u00bb\u0001\u0000"+
		"\u0000\u0000\u00c1\u00be\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\n\u0001\u0000\u0000\u00c4\u00c6\u0003\u001a\r"+
		"\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000"+
		"\u0000\u00c8\u0019\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000"+
		"\u0000\u00ca\u00d1\u0003\u001e\u000f\u0000\u00cb\u00d1\u0003\u001e\u000f"+
		"\u0000\u00cc\u00d1\u0003 \u0010\u0000\u00cd\u00d1\u0003\"\u0011\u0000"+
		"\u00ce\u00d1\u0003$\u0012\u0000\u00cf\u00d1\u0003&\u0013\u0000\u00d0\u00ca"+
		"\u0001\u0000\u0000\u0000\u00d0\u00cb\u0001\u0000\u0000\u0000\u00d0\u00cc"+
		"\u0001\u0000\u0000\u0000\u00d0\u00cd\u0001\u0000\u0000\u0000\u00d0\u00ce"+
		"\u0001\u0000\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1\u001b"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u001a\u0000\u0000\u00d3\u00d4"+
		"\u0003\u0018\f\u0000\u00d4\u00d5\u0005\u001b\u0000\u0000\u00d5\u001d\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0007\u0000\u0000\u0000\u00d7\u00d8\u0003"+
		"\u0018\f\u0000\u00d8\u001f\u0001\u0000\u0000\u0000\u00d9\u00da\u0007\u0001"+
		"\u0000\u0000\u00da\u00db\u0003\u0018\f\u0000\u00db!\u0001\u0000\u0000"+
		"\u0000\u00dc\u00dd\u0005)\u0000\u0000\u00dd\u00de\u0003\u0018\f\u0000"+
		"\u00de#\u0001\u0000\u0000\u0000\u00df\u00e0\u0007\u0002\u0000\u0000\u00e0"+
		"\u00e1\u0003\u0018\f\u0000\u00e1%\u0001\u0000\u0000\u0000\u00e2\u00e3"+
		"\u0007\u0003\u0000\u0000\u00e3\u00e4\u0003\u0018\f\u0000\u00e4\'\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e7\u0005\u0015\u0000\u0000\u00e6\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001"+
		"\u0000\u0000\u0000\u00e8\u00f5\u0005\u0011\u0000\u0000\u00e9\u00eb\u0005"+
		"\u0015\u0000\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00f5\u0003"+
		"D\"\u0000\u00ed\u00ef\u0005\u0015\u0000\u0000\u00ee\u00ed\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f5\u0003F#\u0000\u00f1\u00f5\u0005\u0012\u0000\u0000"+
		"\u00f2\u00f5\u0005\u0013\u0000\u0000\u00f3\u00f5\u0005\u0014\u0000\u0000"+
		"\u00f4\u00e6\u0001\u0000\u0000\u0000\u00f4\u00ea\u0001\u0000\u0000\u0000"+
		"\u00f4\u00ee\u0001\u0000\u0000\u0000\u00f4\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f5)\u0001\u0000\u0000\u0000\u00f6\u00f8\u0003,\u0016\u0000\u00f7\u00f9"+
		"\u0003.\u0017\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001"+
		"\u0000\u0000\u0000\u00f9+\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005\b"+
		"\u0000\u0000\u00fb\u00fc\u0005\u001a\u0000\u0000\u00fc\u00fd\u0003\u0018"+
		"\f\u0000\u00fd\u00fe\u0005\u001b\u0000\u0000\u00fe\u00ff\u0003\u0012\t"+
		"\u0000\u00ff-\u0001\u0000\u0000\u0000\u0100\u0101\u0005\t\u0000\u0000"+
		"\u0101\u0102\u0003\u0012\t\u0000\u0102/\u0001\u0000\u0000\u0000\u0103"+
		"\u0109\u00032\u0019\u0000\u0104\u0109\u00034\u001a\u0000\u0105\u0109\u0003"+
		"<\u001e\u0000\u0106\u0109\u0003:\u001d\u0000\u0107\u0109\u00036\u001b"+
		"\u0000\u0108\u0103\u0001\u0000\u0000\u0000\u0108\u0104\u0001\u0000\u0000"+
		"\u0000\u0108\u0105\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000"+
		"\u0000\u0108\u0107\u0001\u0000\u0000\u0000\u01091\u0001\u0000\u0000\u0000"+
		"\u010a\u010b\u0005\n\u0000\u0000\u010b\u010c\u0005\u001a\u0000\u0000\u010c"+
		"\u010d\u0003\u0018\f\u0000\u010d\u010e\u0005\u001b\u0000\u0000\u010e\u010f"+
		"\u0003\u0012\t\u0000\u010f3\u0001\u0000\u0000\u0000\u0110\u0111\u0005"+
		"\u000b\u0000\u0000\u0111\u0112\u0003\u0012\t\u0000\u0112\u0113\u0005\n"+
		"\u0000\u0000\u0113\u0114\u0005\u001a\u0000\u0000\u0114\u0115\u0003\u0018"+
		"\f\u0000\u0115\u0116\u0005\u001b\u0000\u0000\u01165\u0001\u0000\u0000"+
		"\u0000\u0117\u0118\u0005\f\u0000\u0000\u0118\u0119\u0005\u001a\u0000\u0000"+
		"\u0119\u011a\u0003\u0018\f\u0000\u011a\u011b\u0005\u001b\u0000\u0000\u011b"+
		"\u011d\u0005\u001c\u0000\u0000\u011c\u011e\u00038\u001c\u0000\u011d\u011c"+
		"\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u011d"+
		"\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0121"+
		"\u0001\u0000\u0000\u0000\u0121\u0122\u0005\u001d\u0000\u0000\u01227\u0001"+
		"\u0000\u0000\u0000\u0123\u0126\u0005\r\u0000\u0000\u0124\u0127\u0003("+
		"\u0014\u0000\u0125\u0127\u0005/\u0000\u0000\u0126\u0124\u0001\u0000\u0000"+
		"\u0000\u0126\u0125\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000"+
		"\u0000\u0128\u012c\u0005+\u0000\u0000\u0129\u012d\u0003\u0004\u0002\u0000"+
		"\u012a\u012d\u0003\f\u0006\u0000\u012b\u012d\u0003\u0014\n\u0000\u012c"+
		"\u0129\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012c"+
		"\u012b\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e"+
		"\u012c\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f"+
		"\u0130\u0001\u0000\u0000\u0000\u0130\u0131\u0005.\u0000\u0000\u0131\u0132"+
		"\u0005-\u0000\u0000\u01329\u0001\u0000\u0000\u0000\u0133\u0134\u0005\u000e"+
		"\u0000\u0000\u0134\u0135\u0003\u0012\t\u0000\u0135\u0136\u0005\u000f\u0000"+
		"\u0000\u0136\u0137\u0005\u001a\u0000\u0000\u0137\u0138\u0003\u0018\f\u0000"+
		"\u0138\u0139\u0005\u001b\u0000\u0000\u0139;\u0001\u0000\u0000\u0000\u013a"+
		"\u013b\u0005\u0010\u0000\u0000\u013b\u013c\u0005\u001a\u0000\u0000\u013c"+
		"\u013d\u0003\b\u0004\u0000\u013d\u013e\u0005-\u0000\u0000\u013e\u013f"+
		"\u0003\u0018\f\u0000\u013f\u0140\u0005-\u0000\u0000\u0140\u0141\u0005"+
		"/\u0000\u0000\u0141\u0142\u0003\u0016\u000b\u0000\u0142\u0143\u0005\u001b"+
		"\u0000\u0000\u0143\u0144\u0003\u0012\t\u0000\u0144=\u0001\u0000\u0000"+
		"\u0000\u0145\u0146\u0005/\u0000\u0000\u0146\u014d\u0005\u001a\u0000\u0000"+
		"\u0147\u0149\u0005/\u0000\u0000\u0148\u014a\u0005,\u0000\u0000\u0149\u0148"+
		"\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u014c"+
		"\u0001\u0000\u0000\u0000\u014b\u0147\u0001\u0000\u0000\u0000\u014c\u014f"+
		"\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014d\u014e"+
		"\u0001\u0000\u0000\u0000\u014e\u0150\u0001\u0000\u0000\u0000\u014f\u014d"+
		"\u0001\u0000\u0000\u0000\u0150\u0151\u0005\u001b\u0000\u0000\u0151?\u0001"+
		"\u0000\u0000\u0000\u0152\u0155\u0003B!\u0000\u0153\u0155\u0003H$\u0000"+
		"\u0154\u0152\u0001\u0000\u0000\u0000\u0154\u0153\u0001\u0000\u0000\u0000"+
		"\u0155A\u0001\u0000\u0000\u0000\u0156\u0157\u0007\u0004\u0000\u0000\u0157"+
		"C\u0001\u0000\u0000\u0000\u0158\u0159\u0005\u0011\u0000\u0000\u0159\u015a"+
		"\u0005*\u0000\u0000\u015a\u015b\u0005\u0011\u0000\u0000\u015bE\u0001\u0000"+
		"\u0000\u0000\u015c\u015d\u0005\u0011\u0000\u0000\u015d\u015e\u0005\u0018"+
		"\u0000\u0000\u015e\u015f\u0005\u0011\u0000\u0000\u015fG\u0001\u0000\u0000"+
		"\u0000\u0160\u0161\u0005\u0014\u0000\u0000\u0161\u0162\u0005!\u0000\u0000"+
		"\u0162\u0163\u0003B!\u0000\u0163\u0164\u0005#\u0000\u0000\u0164I\u0001"+
		"\u0000\u0000\u0000!MTY`hov~\u008d\u0096\u009c\u009e\u00a7\u00af\u00b3"+
		"\u00b7\u00bb\u00c1\u00c7\u00d0\u00e6\u00ea\u00ee\u00f4\u00f8\u0108\u011f"+
		"\u0126\u012c\u012e\u0149\u014d\u0154";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}