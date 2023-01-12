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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, FUNC=7, IDENTIFIER=8, 
		IF=9, ELSE=10, WHILE=11, DO=12, SWITCH=13, CASE=14, REPEAT=15, UNTIL=16, 
		FOR=17, INT=18, REAL=19, RATIO=20, BOOLEAN=21, STRING=22, ARRAY=23, MINUS=24, 
		PLUS=25, MULT=26, DIVISION=27, CONST=28, LEFT_ROUND_PARENTHESIS=29, RIGHT_ROUND_PARENTHESIS=30, 
		LEFT_COMPOUND_PARENTHESIS=31, RIGHT_COMPOUND_PARENTHESIS=32, LEFT_SQUARE_PARENTHESIS=33, 
		RIGHT_SQUARE_PARENTHESIS=34, EQUAL=35, LESS_THAN=36, LESS_THAN_OR_EQV=37, 
		GREATER_THAN=38, GREATER_THAN_OR_EQV=39, EQV_EQV=40, NOT_EQV=41, AND=42, 
		OR=43, NOT=44, DOT=45, DOUBLE_DOT=46, COMMA=47, SEMICOLON=48, BREAK=49, 
		SPACE=50;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_declaration = 2, RULE_inicialization = 3, 
		RULE_right_side = 4, RULE_function = 5, RULE_parameter = 6, RULE_statement = 7, 
		RULE_statement_body = 8, RULE_assignment = 9, RULE_expression = 10, RULE_value = 11, 
		RULE_conditional = 12, RULE_if_part = 13, RULE_else_part = 14, RULE_cycle = 15, 
		RULE_while = 16, RULE_do_while = 17, RULE_switch = 18, RULE_repeat = 19, 
		RULE_for = 20, RULE_for_declaration = 21, RULE_function_call = 22, RULE_type = 23, 
		RULE_array_type = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "declaration", "inicialization", "right_side", "function", 
			"parameter", "statement", "statement_body", "assignment", "expression", 
			"value", "conditional", "if_part", "else_part", "cycle", "while", "do_while", 
			"switch", "repeat", "for", "for_declaration", "function_call", "type", 
			"array_type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'void'", "'int'", "'real'", "'ratio'", "'boolean'", "'string'", 
			"'function'", null, "'if'", "'else'", "'while'", "'do'", "'switch'", 
			"'case'", "'repeat'", "'until'", "'for'", null, null, null, null, null, 
			"'array'", "'-'", "'+'", "'*'", "'/'", "'const'", "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "'='", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", 
			"'&&'", "'||'", "'!'", "'.'", "':'", "','", "';'", "'break'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "FUNC", "IDENTIFIER", "IF", 
			"ELSE", "WHILE", "DO", "SWITCH", "CASE", "REPEAT", "UNTIL", "FOR", "INT", 
			"REAL", "RATIO", "BOOLEAN", "STRING", "ARRAY", "MINUS", "PLUS", "MULT", 
			"DIVISION", "CONST", "LEFT_ROUND_PARENTHESIS", "RIGHT_ROUND_PARENTHESIS", 
			"LEFT_COMPOUND_PARENTHESIS", "RIGHT_COMPOUND_PARENTHESIS", "LEFT_SQUARE_PARENTHESIS", 
			"RIGHT_SQUARE_PARENTHESIS", "EQUAL", "LESS_THAN", "LESS_THAN_OR_EQV", 
			"GREATER_THAN", "GREATER_THAN_OR_EQV", "EQV_EQV", "NOT_EQV", "AND", "OR", 
			"NOT", "DOT", "DOUBLE_DOT", "COMMA", "SEMICOLON", "BREAK", "SPACE"
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
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 276824574L) != 0) {
				{
				{
				setState(50);
				main();
				}
				}
				setState(55);
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
		public InicializationContext inicialization() {
			return getRuleContext(InicializationContext.class,0);
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
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case ARRAY:
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				declaration();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				inicialization();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				function();
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
	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GrammarParser.IDENTIFIER, i);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public TerminalNode CONST() { return getToken(GrammarParser.CONST, 0); }
		public List<TerminalNode> EQUAL() { return getTokens(GrammarParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(GrammarParser.EQUAL, i);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public List<TerminalNode> LEFT_COMPOUND_PARENTHESIS() { return getTokens(GrammarParser.LEFT_COMPOUND_PARENTHESIS); }
		public TerminalNode LEFT_COMPOUND_PARENTHESIS(int i) {
			return getToken(GrammarParser.LEFT_COMPOUND_PARENTHESIS, i);
		}
		public List<TerminalNode> RIGHT_COMPOUND_PARENTHESIS() { return getTokens(GrammarParser.RIGHT_COMPOUND_PARENTHESIS); }
		public TerminalNode RIGHT_COMPOUND_PARENTHESIS(int i) {
			return getToken(GrammarParser.RIGHT_COMPOUND_PARENTHESIS, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
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
		int _la;
		try {
			int _alt;
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONST) {
					{
					setState(61);
					match(CONST);
					}
				}

				setState(64);
				type();
				setState(65);
				match(IDENTIFIER);
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(66);
						match(EQUAL);
						setState(67);
						match(IDENTIFIER);
						}
						} 
					}
					setState(72);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(73);
					assignment();
					}
				}

				setState(76);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONST) {
					{
					setState(78);
					match(CONST);
					}
				}

				setState(81);
				type();
				setState(82);
				match(LEFT_COMPOUND_PARENTHESIS);
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(83);
					match(IDENTIFIER);
					}
					}
					setState(86); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
				setState(88);
				match(RIGHT_COMPOUND_PARENTHESIS);
				setState(89);
				match(EQUAL);
				setState(90);
				match(LEFT_COMPOUND_PARENTHESIS);
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(91);
					value();
					}
					}
					setState(94); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 32243968L) != 0 );
				setState(96);
				match(RIGHT_COMPOUND_PARENTHESIS);
				setState(97);
				match(SEMICOLON);
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
	public static class InicializationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GrammarParser.IDENTIFIER, 0); }
		public Right_sideContext right_side() {
			return getRuleContext(Right_sideContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public InicializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterInicialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitInicialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitInicialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicializationContext inicialization() throws RecognitionException {
		InicializationContext _localctx = new InicializationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_inicialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(IDENTIFIER);
			setState(102);
			right_side();
			setState(103);
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
	public static class Right_sideContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GrammarParser.IDENTIFIER, 0); }
		public Right_sideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_side; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRight_side(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRight_side(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRight_side(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Right_sideContext right_side() throws RecognitionException {
		Right_sideContext _localctx = new Right_sideContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_right_side);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				assignment();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(IDENTIFIER);
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
		enterRule(_localctx, 10, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(FUNC);
			setState(110);
			match(IDENTIFIER);
			setState(111);
			match(LEFT_ROUND_PARENTHESIS);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 8388734L) != 0) {
				{
				{
				setState(112);
				parameter();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			match(RIGHT_ROUND_PARENTHESIS);
			setState(119);
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
		enterRule(_localctx, 12, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			type();
			setState(122);
			match(IDENTIFIER);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(123);
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
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(LEFT_COMPOUND_PARENTHESIS);
			setState(128); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(127);
				statement_body();
				}
				}
				setState(130); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 277003134L) != 0 );
			setState(132);
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
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public InicializationContext inicialization() {
			return getRuleContext(InicializationContext.class,0);
		}
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
		enterRule(_localctx, 16, RULE_statement_body);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				inicialization();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				cycle();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				conditional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(138);
				function_call();
				setState(139);
				match(SEMICOLON);
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
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(GrammarParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(EQUAL);
			setState(144);
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
	public static class ExpressionContext extends ParserRuleContext {
		public Token op;
		public TerminalNode INT() { return getToken(GrammarParser.INT, 0); }
		public TerminalNode MINUS() { return getToken(GrammarParser.MINUS, 0); }
		public TerminalNode REAL() { return getToken(GrammarParser.REAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(GrammarParser.BOOLEAN, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode LEFT_ROUND_PARENTHESIS() { return getToken(GrammarParser.LEFT_ROUND_PARENTHESIS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RIGHT_ROUND_PARENTHESIS() { return getToken(GrammarParser.RIGHT_ROUND_PARENTHESIS, 0); }
		public TerminalNode MULT() { return getToken(GrammarParser.MULT, 0); }
		public TerminalNode DIVISION() { return getToken(GrammarParser.DIVISION, 0); }
		public TerminalNode PLUS() { return getToken(GrammarParser.PLUS, 0); }
		public TerminalNode NOT() { return getToken(GrammarParser.NOT, 0); }
		public TerminalNode EQV_EQV() { return getToken(GrammarParser.EQV_EQV, 0); }
		public TerminalNode NOT_EQV() { return getToken(GrammarParser.NOT_EQV, 0); }
		public TerminalNode LESS_THAN() { return getToken(GrammarParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(GrammarParser.GREATER_THAN, 0); }
		public TerminalNode LESS_THAN_OR_EQV() { return getToken(GrammarParser.LESS_THAN_OR_EQV, 0); }
		public TerminalNode GREATER_THAN_OR_EQV() { return getToken(GrammarParser.GREATER_THAN_OR_EQV, 0); }
		public TerminalNode AND() { return getToken(GrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(GrammarParser.OR, 0); }
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(147);
					match(MINUS);
					}
				}

				setState(150);
				match(INT);
				}
				break;
			case 2:
				{
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(151);
					match(MINUS);
					}
				}

				setState(154);
				match(REAL);
				}
				break;
			case 3:
				{
				setState(155);
				match(BOOLEAN);
				}
				break;
			case 4:
				{
				setState(156);
				function_call();
				}
				break;
			case 5:
				{
				}
				break;
			case 6:
				{
				setState(158);
				match(LEFT_ROUND_PARENTHESIS);
				setState(159);
				expression(0);
				setState(160);
				match(RIGHT_ROUND_PARENTHESIS);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(179);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(164);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(165);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIVISION) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(166);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(167);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(168);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MINUS || _la==PLUS) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(169);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(170);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(171);
						((ExpressionContext)_localctx).op = match(NOT);
						setState(172);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(173);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(174);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 4329327034368L) != 0) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(175);
						expression(3);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(176);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(177);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(178);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(183);
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
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GrammarParser.INT, 0); }
		public TerminalNode MINUS() { return getToken(GrammarParser.MINUS, 0); }
		public TerminalNode REAL() { return getToken(GrammarParser.REAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(GrammarParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public TerminalNode ARRAY() { return getToken(GrammarParser.ARRAY, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
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
		enterRule(_localctx, 22, RULE_value);
		int _la;
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(184);
					match(MINUS);
					}
				}

				setState(187);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(188);
					match(MINUS);
					}
				}

				setState(191);
				match(REAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				match(BOOLEAN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(194);
				match(ARRAY);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(195);
				function_call();
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
		enterRule(_localctx, 24, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			if_part();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(199);
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
		enterRule(_localctx, 26, RULE_if_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(IF);
			setState(203);
			match(LEFT_ROUND_PARENTHESIS);
			setState(204);
			expression(0);
			setState(205);
			match(RIGHT_ROUND_PARENTHESIS);
			setState(206);
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
		enterRule(_localctx, 28, RULE_else_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(ELSE);
			setState(209);
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
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public Do_whileContext do_while() {
			return getRuleContext(Do_whileContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public RepeatContext repeat() {
			return getRuleContext(RepeatContext.class,0);
		}
		public SwitchContext switch_() {
			return getRuleContext(SwitchContext.class,0);
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
		enterRule(_localctx, 30, RULE_cycle);
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				while_();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				do_while();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				for_();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(214);
				repeat();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(215);
				switch_();
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
	public static class WhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(GrammarParser.WHILE, 0); }
		public TerminalNode LEFT_ROUND_PARENTHESIS() { return getToken(GrammarParser.LEFT_ROUND_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_ROUND_PARENTHESIS() { return getToken(GrammarParser.RIGHT_ROUND_PARENTHESIS, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(WHILE);
			setState(219);
			match(LEFT_ROUND_PARENTHESIS);
			setState(220);
			expression(0);
			setState(221);
			match(RIGHT_ROUND_PARENTHESIS);
			setState(222);
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
		enterRule(_localctx, 34, RULE_do_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(DO);
			setState(225);
			statement();
			setState(226);
			match(WHILE);
			setState(227);
			match(LEFT_ROUND_PARENTHESIS);
			setState(228);
			expression(0);
			setState(229);
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
	public static class SwitchContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(GrammarParser.SWITCH, 0); }
		public TerminalNode LEFT_ROUND_PARENTHESIS() { return getToken(GrammarParser.LEFT_ROUND_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_ROUND_PARENTHESIS() { return getToken(GrammarParser.RIGHT_ROUND_PARENTHESIS, 0); }
		public TerminalNode LEFT_COMPOUND_PARENTHESIS() { return getToken(GrammarParser.LEFT_COMPOUND_PARENTHESIS, 0); }
		public TerminalNode RIGHT_COMPOUND_PARENTHESIS() { return getToken(GrammarParser.RIGHT_COMPOUND_PARENTHESIS, 0); }
		public TerminalNode CASE() { return getToken(GrammarParser.CASE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GrammarParser.IDENTIFIER, 0); }
		public TerminalNode DOUBLE_DOT() { return getToken(GrammarParser.DOUBLE_DOT, 0); }
		public TerminalNode BREAK() { return getToken(GrammarParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public List<Statement_bodyContext> statement_body() {
			return getRuleContexts(Statement_bodyContext.class);
		}
		public Statement_bodyContext statement_body(int i) {
			return getRuleContext(Statement_bodyContext.class,i);
		}
		public SwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSwitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchContext switch_() throws RecognitionException {
		SwitchContext _localctx = new SwitchContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_switch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(SWITCH);
			setState(232);
			match(LEFT_ROUND_PARENTHESIS);
			setState(233);
			expression(0);
			setState(234);
			match(RIGHT_ROUND_PARENTHESIS);
			setState(235);
			match(LEFT_COMPOUND_PARENTHESIS);
			{
			setState(236);
			match(CASE);
			setState(237);
			match(IDENTIFIER);
			setState(238);
			match(DOUBLE_DOT);
			setState(240); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(239);
				statement_body();
				}
				}
				setState(242); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 277003134L) != 0 );
			setState(244);
			match(BREAK);
			setState(245);
			match(SEMICOLON);
			}
			setState(247);
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
	public static class RepeatContext extends ParserRuleContext {
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
		public RepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRepeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatContext repeat() throws RecognitionException {
		RepeatContext _localctx = new RepeatContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_repeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(REPEAT);
			setState(250);
			statement();
			setState(251);
			match(UNTIL);
			setState(252);
			match(LEFT_ROUND_PARENTHESIS);
			setState(253);
			expression(0);
			setState(254);
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
	public static class ForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(GrammarParser.FOR, 0); }
		public TerminalNode LEFT_ROUND_PARENTHESIS() { return getToken(GrammarParser.LEFT_ROUND_PARENTHESIS, 0); }
		public For_declarationContext for_declaration() {
			return getRuleContext(For_declarationContext.class,0);
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
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(FOR);
			setState(257);
			match(LEFT_ROUND_PARENTHESIS);
			setState(258);
			for_declaration();
			setState(259);
			match(SEMICOLON);
			setState(260);
			expression(0);
			setState(261);
			match(SEMICOLON);
			setState(262);
			match(IDENTIFIER);
			setState(263);
			assignment();
			setState(264);
			match(RIGHT_ROUND_PARENTHESIS);
			setState(265);
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
	public static class For_declarationContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public For_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFor_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFor_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFor_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_declarationContext for_declaration() throws RecognitionException {
		For_declarationContext _localctx = new For_declarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_for_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			declaration();
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
		enterRule(_localctx, 44, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(IDENTIFIER);
			setState(270);
			match(LEFT_ROUND_PARENTHESIS);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(271);
				match(IDENTIFIER);
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(272);
					match(COMMA);
					}
				}

				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
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
		enterRule(_localctx, 46, RULE_type);
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(T__0);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match(T__1);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				match(T__2);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				match(T__3);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 5);
				{
				setState(286);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 6);
				{
				setState(287);
				match(T__5);
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 7);
				{
				setState(288);
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
	public static class Array_typeContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(GrammarParser.ARRAY, 0); }
		public TerminalNode LESS_THAN() { return getToken(GrammarParser.LESS_THAN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		enterRule(_localctx, 48, RULE_array_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(ARRAY);
			setState(292);
			match(LESS_THAN);
			setState(293);
			type();
			setState(294);
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
		case 10:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00012\u0129\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0005\u00004\b\u0000\n\u0000\f\u00007\t\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001<\b\u0001\u0001\u0002\u0003\u0002"+
		"?\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"E\b\u0002\n\u0002\f\u0002H\t\u0002\u0001\u0002\u0003\u0002K\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002P\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0004\u0002U\b\u0002\u000b\u0002\f\u0002V\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002]\b\u0002\u000b\u0002"+
		"\f\u0002^\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002d\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0003"+
		"\u0004l\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005r\b\u0005\n\u0005\f\u0005u\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006}\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0004\u0007\u0081\b\u0007\u000b\u0007\f\u0007\u0082"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u008e\b\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0003"+
		"\n\u0095\b\n\u0001\n\u0001\n\u0003\n\u0099\b\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00a3\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00b4\b\n\n\n\f\n\u00b7\t\n"+
		"\u0001\u000b\u0003\u000b\u00ba\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00be\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00c5\b\u000b\u0001\f\u0001\f\u0003\f\u00c9\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u00d9\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0004\u0012"+
		"\u00f1\b\u0012\u000b\u0012\f\u0012\u00f2\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0112\b\u0016\u0005\u0016\u0114"+
		"\b\u0016\n\u0016\f\u0016\u0117\t\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u0122\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0000\u0001\u0014\u0019\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"0\u0000\u0004\u0001\u0000\u001a\u001b\u0001\u0000\u0018\u0019\u0001\u0000"+
		"$)\u0001\u0000*+\u0142\u00005\u0001\u0000\u0000\u0000\u0002;\u0001\u0000"+
		"\u0000\u0000\u0004c\u0001\u0000\u0000\u0000\u0006e\u0001\u0000\u0000\u0000"+
		"\bk\u0001\u0000\u0000\u0000\nm\u0001\u0000\u0000\u0000\fy\u0001\u0000"+
		"\u0000\u0000\u000e~\u0001\u0000\u0000\u0000\u0010\u008d\u0001\u0000\u0000"+
		"\u0000\u0012\u008f\u0001\u0000\u0000\u0000\u0014\u00a2\u0001\u0000\u0000"+
		"\u0000\u0016\u00c4\u0001\u0000\u0000\u0000\u0018\u00c6\u0001\u0000\u0000"+
		"\u0000\u001a\u00ca\u0001\u0000\u0000\u0000\u001c\u00d0\u0001\u0000\u0000"+
		"\u0000\u001e\u00d8\u0001\u0000\u0000\u0000 \u00da\u0001\u0000\u0000\u0000"+
		"\"\u00e0\u0001\u0000\u0000\u0000$\u00e7\u0001\u0000\u0000\u0000&\u00f9"+
		"\u0001\u0000\u0000\u0000(\u0100\u0001\u0000\u0000\u0000*\u010b\u0001\u0000"+
		"\u0000\u0000,\u010d\u0001\u0000\u0000\u0000.\u0121\u0001\u0000\u0000\u0000"+
		"0\u0123\u0001\u0000\u0000\u000024\u0003\u0002\u0001\u000032\u0001\u0000"+
		"\u0000\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001"+
		"\u0000\u0000\u00006\u0001\u0001\u0000\u0000\u000075\u0001\u0000\u0000"+
		"\u00008<\u0003\u0004\u0002\u00009<\u0003\u0006\u0003\u0000:<\u0003\n\u0005"+
		"\u0000;8\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;:\u0001\u0000"+
		"\u0000\u0000<\u0003\u0001\u0000\u0000\u0000=?\u0005\u001c\u0000\u0000"+
		">=\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000"+
		"\u0000@A\u0003.\u0017\u0000AF\u0005\b\u0000\u0000BC\u0005#\u0000\u0000"+
		"CE\u0005\b\u0000\u0000DB\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000"+
		"FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000"+
		"\u0000HF\u0001\u0000\u0000\u0000IK\u0003\u0012\t\u0000JI\u0001\u0000\u0000"+
		"\u0000JK\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u00050\u0000"+
		"\u0000Md\u0001\u0000\u0000\u0000NP\u0005\u001c\u0000\u0000ON\u0001\u0000"+
		"\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0003"+
		".\u0017\u0000RT\u0005\u001f\u0000\u0000SU\u0005\b\u0000\u0000TS\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000"+
		"VW\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0005 \u0000\u0000"+
		"YZ\u0005#\u0000\u0000Z\\\u0005\u001f\u0000\u0000[]\u0003\u0016\u000b\u0000"+
		"\\[\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000"+
		"\u0000^_\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0005 \u0000"+
		"\u0000ab\u00050\u0000\u0000bd\u0001\u0000\u0000\u0000c>\u0001\u0000\u0000"+
		"\u0000cO\u0001\u0000\u0000\u0000d\u0005\u0001\u0000\u0000\u0000ef\u0005"+
		"\b\u0000\u0000fg\u0003\b\u0004\u0000gh\u00050\u0000\u0000h\u0007\u0001"+
		"\u0000\u0000\u0000il\u0003\u0012\t\u0000jl\u0005\b\u0000\u0000ki\u0001"+
		"\u0000\u0000\u0000kj\u0001\u0000\u0000\u0000l\t\u0001\u0000\u0000\u0000"+
		"mn\u0005\u0007\u0000\u0000no\u0005\b\u0000\u0000os\u0005\u001d\u0000\u0000"+
		"pr\u0003\f\u0006\u0000qp\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000"+
		"sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tv\u0001\u0000\u0000"+
		"\u0000us\u0001\u0000\u0000\u0000vw\u0005\u001e\u0000\u0000wx\u0003\u000e"+
		"\u0007\u0000x\u000b\u0001\u0000\u0000\u0000yz\u0003.\u0017\u0000z|\u0005"+
		"\b\u0000\u0000{}\u0005/\u0000\u0000|{\u0001\u0000\u0000\u0000|}\u0001"+
		"\u0000\u0000\u0000}\r\u0001\u0000\u0000\u0000~\u0080\u0005\u001f\u0000"+
		"\u0000\u007f\u0081\u0003\u0010\b\u0000\u0080\u007f\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0005 \u0000\u0000\u0085\u000f\u0001\u0000\u0000\u0000\u0086"+
		"\u008e\u0003\u0004\u0002\u0000\u0087\u008e\u0003\u0006\u0003\u0000\u0088"+
		"\u008e\u0003\u001e\u000f\u0000\u0089\u008e\u0003\u0018\f\u0000\u008a\u008b"+
		"\u0003,\u0016\u0000\u008b\u008c\u00050\u0000\u0000\u008c\u008e\u0001\u0000"+
		"\u0000\u0000\u008d\u0086\u0001\u0000\u0000\u0000\u008d\u0087\u0001\u0000"+
		"\u0000\u0000\u008d\u0088\u0001\u0000\u0000\u0000\u008d\u0089\u0001\u0000"+
		"\u0000\u0000\u008d\u008a\u0001\u0000\u0000\u0000\u008e\u0011\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0005#\u0000\u0000\u0090\u0091\u0003\u0014\n"+
		"\u0000\u0091\u0013\u0001\u0000\u0000\u0000\u0092\u0094\u0006\n\uffff\uffff"+
		"\u0000\u0093\u0095\u0005\u0018\u0000\u0000\u0094\u0093\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000"+
		"\u0000\u0096\u00a3\u0005\u0012\u0000\u0000\u0097\u0099\u0005\u0018\u0000"+
		"\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u00a3\u0005\u0013\u0000"+
		"\u0000\u009b\u00a3\u0005\u0015\u0000\u0000\u009c\u00a3\u0003,\u0016\u0000"+
		"\u009d\u00a3\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u001d\u0000\u0000"+
		"\u009f\u00a0\u0003\u0014\n\u0000\u00a0\u00a1\u0005\u001e\u0000\u0000\u00a1"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a2\u0092\u0001\u0000\u0000\u0000\u00a2"+
		"\u0098\u0001\u0000\u0000\u0000\u00a2\u009b\u0001\u0000\u0000\u0000\u00a2"+
		"\u009c\u0001\u0000\u0000\u0000\u00a2\u009d\u0001\u0000\u0000\u0000\u00a2"+
		"\u009e\u0001\u0000\u0000\u0000\u00a3\u00b5\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\n\u0005\u0000\u0000\u00a5\u00a6\u0007\u0000\u0000\u0000\u00a6\u00b4"+
		"\u0003\u0014\n\u0006\u00a7\u00a8\n\u0004\u0000\u0000\u00a8\u00a9\u0007"+
		"\u0001\u0000\u0000\u00a9\u00b4\u0003\u0014\n\u0005\u00aa\u00ab\n\u0003"+
		"\u0000\u0000\u00ab\u00ac\u0005,\u0000\u0000\u00ac\u00b4\u0003\u0014\n"+
		"\u0004\u00ad\u00ae\n\u0002\u0000\u0000\u00ae\u00af\u0007\u0002\u0000\u0000"+
		"\u00af\u00b4\u0003\u0014\n\u0003\u00b0\u00b1\n\u0001\u0000\u0000\u00b1"+
		"\u00b2\u0007\u0003\u0000\u0000\u00b2\u00b4\u0003\u0014\n\u0002\u00b3\u00a4"+
		"\u0001\u0000\u0000\u0000\u00b3\u00a7\u0001\u0000\u0000\u0000\u00b3\u00aa"+
		"\u0001\u0000\u0000\u0000\u00b3\u00ad\u0001\u0000\u0000\u0000\u00b3\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u0015"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00ba"+
		"\u0005\u0018\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00c5"+
		"\u0005\u0012\u0000\u0000\u00bc\u00be\u0005\u0018\u0000\u0000\u00bd\u00bc"+
		"\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bf"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c5\u0005\u0013\u0000\u0000\u00c0\u00c5"+
		"\u0005\u0015\u0000\u0000\u00c1\u00c5\u0005\u0016\u0000\u0000\u00c2\u00c5"+
		"\u0005\u0017\u0000\u0000\u00c3\u00c5\u0003,\u0016\u0000\u00c4\u00b9\u0001"+
		"\u0000\u0000\u0000\u00c4\u00bd\u0001\u0000\u0000\u0000\u00c4\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c5\u0017\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c8\u0003\u001a\r\u0000\u00c7\u00c9\u0003\u001c"+
		"\u000e\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c9\u0019\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\t\u0000"+
		"\u0000\u00cb\u00cc\u0005\u001d\u0000\u0000\u00cc\u00cd\u0003\u0014\n\u0000"+
		"\u00cd\u00ce\u0005\u001e\u0000\u0000\u00ce\u00cf\u0003\u000e\u0007\u0000"+
		"\u00cf\u001b\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005\n\u0000\u0000\u00d1"+
		"\u00d2\u0003\u000e\u0007\u0000\u00d2\u001d\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d9\u0003 \u0010\u0000\u00d4\u00d9\u0003\"\u0011\u0000\u00d5\u00d9"+
		"\u0003(\u0014\u0000\u00d6\u00d9\u0003&\u0013\u0000\u00d7\u00d9\u0003$"+
		"\u0012\u0000\u00d8\u00d3\u0001\u0000\u0000\u0000\u00d8\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d5\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d9\u001f\u0001\u0000"+
		"\u0000\u0000\u00da\u00db\u0005\u000b\u0000\u0000\u00db\u00dc\u0005\u001d"+
		"\u0000\u0000\u00dc\u00dd\u0003\u0014\n\u0000\u00dd\u00de\u0005\u001e\u0000"+
		"\u0000\u00de\u00df\u0003\u000e\u0007\u0000\u00df!\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e1\u0005\f\u0000\u0000\u00e1\u00e2\u0003\u000e\u0007\u0000\u00e2"+
		"\u00e3\u0005\u000b\u0000\u0000\u00e3\u00e4\u0005\u001d\u0000\u0000\u00e4"+
		"\u00e5\u0003\u0014\n\u0000\u00e5\u00e6\u0005\u001e\u0000\u0000\u00e6#"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005\r\u0000\u0000\u00e8\u00e9\u0005"+
		"\u001d\u0000\u0000\u00e9\u00ea\u0003\u0014\n\u0000\u00ea\u00eb\u0005\u001e"+
		"\u0000\u0000\u00eb\u00ec\u0005\u001f\u0000\u0000\u00ec\u00ed\u0005\u000e"+
		"\u0000\u0000\u00ed\u00ee\u0005\b\u0000\u0000\u00ee\u00f0\u0005.\u0000"+
		"\u0000\u00ef\u00f1\u0003\u0010\b\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u00051\u0000\u0000\u00f5\u00f6\u00050\u0000\u0000\u00f6\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005 \u0000\u0000\u00f8%\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fa\u0005\u000f\u0000\u0000\u00fa\u00fb\u0003\u000e"+
		"\u0007\u0000\u00fb\u00fc\u0005\u0010\u0000\u0000\u00fc\u00fd\u0005\u001d"+
		"\u0000\u0000\u00fd\u00fe\u0003\u0014\n\u0000\u00fe\u00ff\u0005\u001e\u0000"+
		"\u0000\u00ff\'\u0001\u0000\u0000\u0000\u0100\u0101\u0005\u0011\u0000\u0000"+
		"\u0101\u0102\u0005\u001d\u0000\u0000\u0102\u0103\u0003*\u0015\u0000\u0103"+
		"\u0104\u00050\u0000\u0000\u0104\u0105\u0003\u0014\n\u0000\u0105\u0106"+
		"\u00050\u0000\u0000\u0106\u0107\u0005\b\u0000\u0000\u0107\u0108\u0003"+
		"\u0012\t\u0000\u0108\u0109\u0005\u001e\u0000\u0000\u0109\u010a\u0003\u000e"+
		"\u0007\u0000\u010a)\u0001\u0000\u0000\u0000\u010b\u010c\u0003\u0004\u0002"+
		"\u0000\u010c+\u0001\u0000\u0000\u0000\u010d\u010e\u0005\b\u0000\u0000"+
		"\u010e\u0115\u0005\u001d\u0000\u0000\u010f\u0111\u0005\b\u0000\u0000\u0110"+
		"\u0112\u0005/\u0000\u0000\u0111\u0110\u0001\u0000\u0000\u0000\u0111\u0112"+
		"\u0001\u0000\u0000\u0000\u0112\u0114\u0001\u0000\u0000\u0000\u0113\u010f"+
		"\u0001\u0000\u0000\u0000\u0114\u0117\u0001\u0000\u0000\u0000\u0115\u0113"+
		"\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0118"+
		"\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0118\u0119"+
		"\u0005\u001e\u0000\u0000\u0119-\u0001\u0000\u0000\u0000\u011a\u0122\u0005"+
		"\u0001\u0000\u0000\u011b\u0122\u0005\u0002\u0000\u0000\u011c\u0122\u0005"+
		"\u0003\u0000\u0000\u011d\u0122\u0005\u0004\u0000\u0000\u011e\u0122\u0005"+
		"\u0005\u0000\u0000\u011f\u0122\u0005\u0006\u0000\u0000\u0120\u0122\u0003"+
		"0\u0018\u0000\u0121\u011a\u0001\u0000\u0000\u0000\u0121\u011b\u0001\u0000"+
		"\u0000\u0000\u0121\u011c\u0001\u0000\u0000\u0000\u0121\u011d\u0001\u0000"+
		"\u0000\u0000\u0121\u011e\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000"+
		"\u0000\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u0122/\u0001\u0000\u0000"+
		"\u0000\u0123\u0124\u0005\u0017\u0000\u0000\u0124\u0125\u0005$\u0000\u0000"+
		"\u0125\u0126\u0003.\u0017\u0000\u0126\u0127\u0005&\u0000\u0000\u01271"+
		"\u0001\u0000\u0000\u0000\u001c5;>FJOV^cks|\u0082\u008d\u0094\u0098\u00a2"+
		"\u00b3\u00b5\u00b9\u00bd\u00c4\u00c8\u00d8\u00f2\u0111\u0115\u0121";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}