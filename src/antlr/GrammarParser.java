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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, IDENTIFIER=7, IF=8, ELSE=9, 
		WHILE=10, DO=11, SWITCH=12, CASE=13, REPEAT=14, UNTIL=15, FOR=16, INT=17, 
		REAL=18, RATIO=19, BOOLEAN=20, STRING=21, ARRAY=22, MINUS=23, PLUS=24, 
		MULT=25, DIVISION=26, CONST=27, LEFT_ROUND_PARENTHESIS=28, RIGHT_ROUND_PARENTHESIS=29, 
		LEFT_COMPOUND_PARENTHESIS=30, RIGHT_COMPOUND_PARENTHESIS=31, LEFT_SQUARE_PARENTHESIS=32, 
		RIGHT_SQUARE_PARENTHESIS=33, EQUAL=34, LESS_THAN=35, LESS_THAN_OR_EQV=36, 
		GREATER_THAN=37, GREATER_THAN_OR_EQV=38, EQV_EQV=39, NOT_EQV=40, AND=41, 
		OR=42, NOT=43, DOT=44, DOUBLE_DOT=45, COMMA=46, SEMICOLON=47, BREAK=48, 
		SPACE=49;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_function = 2, RULE_parameter = 3, 
		RULE_statement = 4, RULE_statement_body = 5, RULE_assignment = 6, RULE_expression = 7, 
		RULE_value = 8, RULE_conditional = 9, RULE_if_part = 10, RULE_else_part = 11, 
		RULE_cycle = 12, RULE_while = 13, RULE_do_while = 14, RULE_switch = 15, 
		RULE_repeat = 16, RULE_for = 17, RULE_for_declaration = 18, RULE_function_call = 19, 
		RULE_type = 20, RULE_array_type = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "function", "parameter", "statement", "statement_body", 
			"assignment", "expression", "value", "conditional", "if_part", "else_part", 
			"cycle", "while", "do_while", "switch", "repeat", "for", "for_declaration", 
			"function_call", "type", "array_type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'void'", "'int'", "'real'", "'ratio'", "'boolean'", "'string'", 
			null, "'if'", "'else'", "'while'", "'do'", "'switch'", "'case'", "'repeat'", 
			"'until'", "'for'", null, null, null, null, null, "'array'", "'-'", "'+'", 
			"'*'", "'/'", "'const'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'='", 
			"'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'&&'", "'||'", "'!'", 
			"'.'", "':'", "','", "';'", "'break'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "IDENTIFIER", "IF", "ELSE", 
			"WHILE", "DO", "SWITCH", "CASE", "REPEAT", "UNTIL", "FOR", "INT", "REAL", 
			"RATIO", "BOOLEAN", "STRING", "ARRAY", "MINUS", "PLUS", "MULT", "DIVISION", 
			"CONST", "LEFT_ROUND_PARENTHESIS", "RIGHT_ROUND_PARENTHESIS", "LEFT_COMPOUND_PARENTHESIS", 
			"RIGHT_COMPOUND_PARENTHESIS", "LEFT_SQUARE_PARENTHESIS", "RIGHT_SQUARE_PARENTHESIS", 
			"EQUAL", "LESS_THAN", "LESS_THAN_OR_EQV", "GREATER_THAN", "GREATER_THAN_OR_EQV", 
			"EQV_EQV", "NOT_EQV", "AND", "OR", "NOT", "DOT", "DOUBLE_DOT", "COMMA", 
			"SEMICOLON", "BREAK", "SPACE"
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
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
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
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 1212154110L) != 0) {
				{
				setState(46);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(44);
					declaration();
					}
					break;
				case 2:
					{
					setState(45);
					function();
					}
					break;
				}
				}
				setState(50);
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
	public static class DeclarationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GrammarParser.IDENTIFIER, i);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public TerminalNode CONST() { return getToken(GrammarParser.CONST, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
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
		enterRule(_localctx, 2, RULE_declaration);
		int _la;
		try {
			int _alt;
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONST) {
					{
					setState(51);
					match(CONST);
					}
				}

				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 4194430L) != 0) {
					{
					setState(54);
					type();
					}
				}

				setState(57);
				match(IDENTIFIER);
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(58);
						match(EQUAL);
						setState(59);
						match(IDENTIFIER);
						}
						} 
					}
					setState(64);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(65);
					assignment();
					}
				}

				setState(68);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONST) {
					{
					setState(69);
					match(CONST);
					}
				}

				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 4194430L) != 0) {
					{
					setState(72);
					type();
					}
				}

				setState(75);
				match(LEFT_COMPOUND_PARENTHESIS);
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(76);
					match(IDENTIFIER);
					}
					}
					setState(79); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
				setState(81);
				match(RIGHT_COMPOUND_PARENTHESIS);
				setState(82);
				match(EQUAL);
				setState(83);
				match(LEFT_COMPOUND_PARENTHESIS);
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(84);
					value();
					}
					}
					setState(87); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 16121984L) != 0 );
				setState(89);
				match(RIGHT_COMPOUND_PARENTHESIS);
				setState(90);
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
	public static class FunctionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
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
		enterRule(_localctx, 4, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			type();
			setState(95);
			match(IDENTIFIER);
			setState(96);
			match(LEFT_ROUND_PARENTHESIS);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 4194430L) != 0) {
				{
				{
				setState(97);
				parameter();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			match(RIGHT_ROUND_PARENTHESIS);
			setState(104);
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
		enterRule(_localctx, 6, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			type();
			setState(107);
			match(IDENTIFIER);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(108);
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
		enterRule(_localctx, 8, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(LEFT_COMPOUND_PARENTHESIS);
			setState(113); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(112);
				statement_body();
				}
				}
				setState(115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 1212243454L) != 0 );
			setState(117);
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
		enterRule(_localctx, 10, RULE_statement_body);
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				cycle();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				conditional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				function_call();
				setState(123);
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
		enterRule(_localctx, 12, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(EQUAL);
			setState(128);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(131);
					match(MINUS);
					}
				}

				setState(134);
				match(INT);
				}
				break;
			case 2:
				{
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(135);
					match(MINUS);
					}
				}

				setState(138);
				match(REAL);
				}
				break;
			case 3:
				{
				setState(139);
				match(BOOLEAN);
				}
				break;
			case 4:
				{
				setState(140);
				function_call();
				}
				break;
			case 5:
				{
				}
				break;
			case 6:
				{
				setState(142);
				match(LEFT_ROUND_PARENTHESIS);
				setState(143);
				expression(0);
				setState(144);
				match(RIGHT_ROUND_PARENTHESIS);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(163);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(148);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(149);
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
						setState(150);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(151);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(152);
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
						setState(153);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(154);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(155);
						((ExpressionContext)_localctx).op = match(NOT);
						setState(156);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(157);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(158);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 2164663517184L) != 0) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(159);
						expression(3);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(160);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(161);
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
						setState(162);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		enterRule(_localctx, 16, RULE_value);
		int _la;
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(168);
					match(MINUS);
					}
				}

				setState(171);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(172);
					match(MINUS);
					}
				}

				setState(175);
				match(REAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				match(BOOLEAN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(178);
				match(ARRAY);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(179);
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
		enterRule(_localctx, 18, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			if_part();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(183);
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
		enterRule(_localctx, 20, RULE_if_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(IF);
			setState(187);
			match(LEFT_ROUND_PARENTHESIS);
			setState(188);
			expression(0);
			setState(189);
			match(RIGHT_ROUND_PARENTHESIS);
			setState(190);
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
		enterRule(_localctx, 22, RULE_else_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(ELSE);
			setState(193);
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
		enterRule(_localctx, 24, RULE_cycle);
		try {
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				while_();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				do_while();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				for_();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(198);
				repeat();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(199);
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
		enterRule(_localctx, 26, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(WHILE);
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
		enterRule(_localctx, 28, RULE_do_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(DO);
			setState(209);
			statement();
			setState(210);
			match(WHILE);
			setState(211);
			match(LEFT_ROUND_PARENTHESIS);
			setState(212);
			expression(0);
			setState(213);
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
		enterRule(_localctx, 30, RULE_switch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(SWITCH);
			setState(216);
			match(LEFT_ROUND_PARENTHESIS);
			setState(217);
			expression(0);
			setState(218);
			match(RIGHT_ROUND_PARENTHESIS);
			setState(219);
			match(LEFT_COMPOUND_PARENTHESIS);
			{
			setState(220);
			match(CASE);
			setState(221);
			match(IDENTIFIER);
			setState(222);
			match(DOUBLE_DOT);
			setState(224); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(223);
				statement_body();
				}
				}
				setState(226); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 1212243454L) != 0 );
			setState(228);
			match(BREAK);
			setState(229);
			match(SEMICOLON);
			}
			setState(231);
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
		enterRule(_localctx, 32, RULE_repeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(REPEAT);
			setState(234);
			statement();
			setState(235);
			match(UNTIL);
			setState(236);
			match(LEFT_ROUND_PARENTHESIS);
			setState(237);
			expression(0);
			setState(238);
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
		enterRule(_localctx, 34, RULE_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(FOR);
			setState(241);
			match(LEFT_ROUND_PARENTHESIS);
			setState(242);
			for_declaration();
			setState(243);
			match(SEMICOLON);
			setState(244);
			expression(0);
			setState(245);
			match(SEMICOLON);
			setState(246);
			match(IDENTIFIER);
			setState(247);
			assignment();
			setState(248);
			match(RIGHT_ROUND_PARENTHESIS);
			setState(249);
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
		enterRule(_localctx, 36, RULE_for_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
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
		enterRule(_localctx, 38, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(IDENTIFIER);
			setState(254);
			match(LEFT_ROUND_PARENTHESIS);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(255);
				match(IDENTIFIER);
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(256);
					match(COMMA);
					}
				}

				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(264);
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
		enterRule(_localctx, 40, RULE_type);
		try {
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(T__0);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(T__1);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				match(T__2);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(269);
				match(T__3);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 5);
				{
				setState(270);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 6);
				{
				setState(271);
				match(T__5);
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 7);
				{
				setState(272);
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
		enterRule(_localctx, 42, RULE_array_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(ARRAY);
			setState(276);
			match(LESS_THAN);
			setState(277);
			type();
			setState(278);
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
		case 7:
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
		"\u0004\u00011\u0119\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0001\u0000\u0005\u0000/\b\u0000\n\u0000\f\u00002\t\u0000"+
		"\u0001\u0001\u0003\u00015\b\u0001\u0001\u0001\u0003\u00018\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001=\b\u0001\n\u0001\f\u0001@\t"+
		"\u0001\u0001\u0001\u0003\u0001C\b\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001G\b\u0001\u0001\u0001\u0003\u0001J\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0004\u0001N\b\u0001\u000b\u0001\f\u0001O\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0004\u0001V\b\u0001\u000b\u0001\f\u0001W\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001]\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002c\b\u0002\n\u0002\f\u0002f\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003n\b\u0003\u0001\u0004\u0001\u0004\u0004\u0004r\b\u0004\u000b"+
		"\u0004\f\u0004s\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005~\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u0085"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0089\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0093\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u00a4\b\u0007\n\u0007\f\u0007\u00a7\t\u0007\u0001\b\u0003"+
		"\b\u00aa\b\b\u0001\b\u0001\b\u0003\b\u00ae\b\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0003\b\u00b5\b\b\u0001\t\u0001\t\u0003\t\u00b9\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00c9\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0004\u000f\u00e1\b\u000f\u000b\u000f\f\u000f\u00e2"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u0102\b\u0013\u0005\u0013\u0104\b\u0013\n\u0013\f\u0013\u0107\t\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0112\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0000\u0001"+
		"\u000e\u0016\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*\u0000\u0004\u0001\u0000\u0019\u001a\u0001"+
		"\u0000\u0017\u0018\u0001\u0000#(\u0001\u0000)*\u0134\u00000\u0001\u0000"+
		"\u0000\u0000\u0002\\\u0001\u0000\u0000\u0000\u0004^\u0001\u0000\u0000"+
		"\u0000\u0006j\u0001\u0000\u0000\u0000\bo\u0001\u0000\u0000\u0000\n}\u0001"+
		"\u0000\u0000\u0000\f\u007f\u0001\u0000\u0000\u0000\u000e\u0092\u0001\u0000"+
		"\u0000\u0000\u0010\u00b4\u0001\u0000\u0000\u0000\u0012\u00b6\u0001\u0000"+
		"\u0000\u0000\u0014\u00ba\u0001\u0000\u0000\u0000\u0016\u00c0\u0001\u0000"+
		"\u0000\u0000\u0018\u00c8\u0001\u0000\u0000\u0000\u001a\u00ca\u0001\u0000"+
		"\u0000\u0000\u001c\u00d0\u0001\u0000\u0000\u0000\u001e\u00d7\u0001\u0000"+
		"\u0000\u0000 \u00e9\u0001\u0000\u0000\u0000\"\u00f0\u0001\u0000\u0000"+
		"\u0000$\u00fb\u0001\u0000\u0000\u0000&\u00fd\u0001\u0000\u0000\u0000("+
		"\u0111\u0001\u0000\u0000\u0000*\u0113\u0001\u0000\u0000\u0000,/\u0003"+
		"\u0002\u0001\u0000-/\u0003\u0004\u0002\u0000.,\u0001\u0000\u0000\u0000"+
		".-\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000"+
		"\u000001\u0001\u0000\u0000\u00001\u0001\u0001\u0000\u0000\u000020\u0001"+
		"\u0000\u0000\u000035\u0005\u001b\u0000\u000043\u0001\u0000\u0000\u0000"+
		"45\u0001\u0000\u0000\u000057\u0001\u0000\u0000\u000068\u0003(\u0014\u0000"+
		"76\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000089\u0001\u0000\u0000"+
		"\u00009>\u0005\u0007\u0000\u0000:;\u0005\"\u0000\u0000;=\u0005\u0007\u0000"+
		"\u0000<:\u0001\u0000\u0000\u0000=@\u0001\u0000\u0000\u0000><\u0001\u0000"+
		"\u0000\u0000>?\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001"+
		"\u0000\u0000\u0000AC\u0003\f\u0006\u0000BA\u0001\u0000\u0000\u0000BC\u0001"+
		"\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000D]\u0005/\u0000\u0000EG\u0005"+
		"\u001b\u0000\u0000FE\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000"+
		"GI\u0001\u0000\u0000\u0000HJ\u0003(\u0014\u0000IH\u0001\u0000\u0000\u0000"+
		"IJ\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KM\u0005\u001e\u0000"+
		"\u0000LN\u0005\u0007\u0000\u0000ML\u0001\u0000\u0000\u0000NO\u0001\u0000"+
		"\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0001"+
		"\u0000\u0000\u0000QR\u0005\u001f\u0000\u0000RS\u0005\"\u0000\u0000SU\u0005"+
		"\u001e\u0000\u0000TV\u0003\u0010\b\u0000UT\u0001\u0000\u0000\u0000VW\u0001"+
		"\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000"+
		"XY\u0001\u0000\u0000\u0000YZ\u0005\u001f\u0000\u0000Z[\u0005/\u0000\u0000"+
		"[]\u0001\u0000\u0000\u0000\\4\u0001\u0000\u0000\u0000\\F\u0001\u0000\u0000"+
		"\u0000]\u0003\u0001\u0000\u0000\u0000^_\u0003(\u0014\u0000_`\u0005\u0007"+
		"\u0000\u0000`d\u0005\u001c\u0000\u0000ac\u0003\u0006\u0003\u0000ba\u0001"+
		"\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000"+
		"de\u0001\u0000\u0000\u0000eg\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000"+
		"\u0000gh\u0005\u001d\u0000\u0000hi\u0003\b\u0004\u0000i\u0005\u0001\u0000"+
		"\u0000\u0000jk\u0003(\u0014\u0000km\u0005\u0007\u0000\u0000ln\u0005.\u0000"+
		"\u0000ml\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000n\u0007\u0001"+
		"\u0000\u0000\u0000oq\u0005\u001e\u0000\u0000pr\u0003\n\u0005\u0000qp\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000"+
		"st\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0005\u001f\u0000"+
		"\u0000v\t\u0001\u0000\u0000\u0000w~\u0003\u0002\u0001\u0000x~\u0003\u0018"+
		"\f\u0000y~\u0003\u0012\t\u0000z{\u0003&\u0013\u0000{|\u0005/\u0000\u0000"+
		"|~\u0001\u0000\u0000\u0000}w\u0001\u0000\u0000\u0000}x\u0001\u0000\u0000"+
		"\u0000}y\u0001\u0000\u0000\u0000}z\u0001\u0000\u0000\u0000~\u000b\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0005\"\u0000\u0000\u0080\u0081\u0003\u000e"+
		"\u0007\u0000\u0081\r\u0001\u0000\u0000\u0000\u0082\u0084\u0006\u0007\uffff"+
		"\uffff\u0000\u0083\u0085\u0005\u0017\u0000\u0000\u0084\u0083\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000"+
		"\u0000\u0000\u0086\u0093\u0005\u0011\u0000\u0000\u0087\u0089\u0005\u0017"+
		"\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u0093\u0005\u0012"+
		"\u0000\u0000\u008b\u0093\u0005\u0014\u0000\u0000\u008c\u0093\u0003&\u0013"+
		"\u0000\u008d\u0093\u0001\u0000\u0000\u0000\u008e\u008f\u0005\u001c\u0000"+
		"\u0000\u008f\u0090\u0003\u000e\u0007\u0000\u0090\u0091\u0005\u001d\u0000"+
		"\u0000\u0091\u0093\u0001\u0000\u0000\u0000\u0092\u0082\u0001\u0000\u0000"+
		"\u0000\u0092\u0088\u0001\u0000\u0000\u0000\u0092\u008b\u0001\u0000\u0000"+
		"\u0000\u0092\u008c\u0001\u0000\u0000\u0000\u0092\u008d\u0001\u0000\u0000"+
		"\u0000\u0092\u008e\u0001\u0000\u0000\u0000\u0093\u00a5\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\n\u0005\u0000\u0000\u0095\u0096\u0007\u0000\u0000\u0000"+
		"\u0096\u00a4\u0003\u000e\u0007\u0006\u0097\u0098\n\u0004\u0000\u0000\u0098"+
		"\u0099\u0007\u0001\u0000\u0000\u0099\u00a4\u0003\u000e\u0007\u0005\u009a"+
		"\u009b\n\u0003\u0000\u0000\u009b\u009c\u0005+\u0000\u0000\u009c\u00a4"+
		"\u0003\u000e\u0007\u0004\u009d\u009e\n\u0002\u0000\u0000\u009e\u009f\u0007"+
		"\u0002\u0000\u0000\u009f\u00a4\u0003\u000e\u0007\u0003\u00a0\u00a1\n\u0001"+
		"\u0000\u0000\u00a1\u00a2\u0007\u0003\u0000\u0000\u00a2\u00a4\u0003\u000e"+
		"\u0007\u0002\u00a3\u0094\u0001\u0000\u0000\u0000\u00a3\u0097\u0001\u0000"+
		"\u0000\u0000\u00a3\u009a\u0001\u0000\u0000\u0000\u00a3\u009d\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a0\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a6\u000f\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a8\u00aa\u0005\u0017\u0000\u0000\u00a9\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ab\u00b5\u0005\u0011\u0000\u0000\u00ac\u00ae\u0005\u0017"+
		"\u0000\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b5\u0005\u0012"+
		"\u0000\u0000\u00b0\u00b5\u0005\u0014\u0000\u0000\u00b1\u00b5\u0005\u0015"+
		"\u0000\u0000\u00b2\u00b5\u0005\u0016\u0000\u0000\u00b3\u00b5\u0003&\u0013"+
		"\u0000\u00b4\u00a9\u0001\u0000\u0000\u0000\u00b4\u00ad\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b0\u0001\u0000\u0000\u0000\u00b4\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b5\u0011\u0001\u0000\u0000\u0000\u00b6\u00b8\u0003\u0014\n\u0000"+
		"\u00b7\u00b9\u0003\u0016\u000b\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u0013\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bb\u0005\b\u0000\u0000\u00bb\u00bc\u0005\u001c\u0000\u0000\u00bc"+
		"\u00bd\u0003\u000e\u0007\u0000\u00bd\u00be\u0005\u001d\u0000\u0000\u00be"+
		"\u00bf\u0003\b\u0004\u0000\u00bf\u0015\u0001\u0000\u0000\u0000\u00c0\u00c1"+
		"\u0005\t\u0000\u0000\u00c1\u00c2\u0003\b\u0004\u0000\u00c2\u0017\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c9\u0003\u001a\r\u0000\u00c4\u00c9\u0003\u001c"+
		"\u000e\u0000\u00c5\u00c9\u0003\"\u0011\u0000\u00c6\u00c9\u0003 \u0010"+
		"\u0000\u00c7\u00c9\u0003\u001e\u000f\u0000\u00c8\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c4\u0001\u0000\u0000\u0000\u00c8\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c9\u0019\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\n\u0000\u0000"+
		"\u00cb\u00cc\u0005\u001c\u0000\u0000\u00cc\u00cd\u0003\u000e\u0007\u0000"+
		"\u00cd\u00ce\u0005\u001d\u0000\u0000\u00ce\u00cf\u0003\b\u0004\u0000\u00cf"+
		"\u001b\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005\u000b\u0000\u0000\u00d1"+
		"\u00d2\u0003\b\u0004\u0000\u00d2\u00d3\u0005\n\u0000\u0000\u00d3\u00d4"+
		"\u0005\u001c\u0000\u0000\u00d4\u00d5\u0003\u000e\u0007\u0000\u00d5\u00d6"+
		"\u0005\u001d\u0000\u0000\u00d6\u001d\u0001\u0000\u0000\u0000\u00d7\u00d8"+
		"\u0005\f\u0000\u0000\u00d8\u00d9\u0005\u001c\u0000\u0000\u00d9\u00da\u0003"+
		"\u000e\u0007\u0000\u00da\u00db\u0005\u001d\u0000\u0000\u00db\u00dc\u0005"+
		"\u001e\u0000\u0000\u00dc\u00dd\u0005\r\u0000\u0000\u00dd\u00de\u0005\u0007"+
		"\u0000\u0000\u00de\u00e0\u0005-\u0000\u0000\u00df\u00e1\u0003\n\u0005"+
		"\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e5\u00050\u0000\u0000"+
		"\u00e5\u00e6\u0005/\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e8\u0005\u001f\u0000\u0000\u00e8\u001f\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ea\u0005\u000e\u0000\u0000\u00ea\u00eb\u0003\b\u0004\u0000\u00eb\u00ec"+
		"\u0005\u000f\u0000\u0000\u00ec\u00ed\u0005\u001c\u0000\u0000\u00ed\u00ee"+
		"\u0003\u000e\u0007\u0000\u00ee\u00ef\u0005\u001d\u0000\u0000\u00ef!\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f1\u0005\u0010\u0000\u0000\u00f1\u00f2\u0005"+
		"\u001c\u0000\u0000\u00f2\u00f3\u0003$\u0012\u0000\u00f3\u00f4\u0005/\u0000"+
		"\u0000\u00f4\u00f5\u0003\u000e\u0007\u0000\u00f5\u00f6\u0005/\u0000\u0000"+
		"\u00f6\u00f7\u0005\u0007\u0000\u0000\u00f7\u00f8\u0003\f\u0006\u0000\u00f8"+
		"\u00f9\u0005\u001d\u0000\u0000\u00f9\u00fa\u0003\b\u0004\u0000\u00fa#"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fc\u0003\u0002\u0001\u0000\u00fc%\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fe\u0005\u0007\u0000\u0000\u00fe\u0105\u0005"+
		"\u001c\u0000\u0000\u00ff\u0101\u0005\u0007\u0000\u0000\u0100\u0102\u0005"+
		".\u0000\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000"+
		"\u0000\u0000\u0102\u0104\u0001\u0000\u0000\u0000\u0103\u00ff\u0001\u0000"+
		"\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000"+
		"\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0108\u0001\u0000"+
		"\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u0109\u0005\u001d"+
		"\u0000\u0000\u0109\'\u0001\u0000\u0000\u0000\u010a\u0112\u0005\u0001\u0000"+
		"\u0000\u010b\u0112\u0005\u0002\u0000\u0000\u010c\u0112\u0005\u0003\u0000"+
		"\u0000\u010d\u0112\u0005\u0004\u0000\u0000\u010e\u0112\u0005\u0005\u0000"+
		"\u0000\u010f\u0112\u0005\u0006\u0000\u0000\u0110\u0112\u0003*\u0015\u0000"+
		"\u0111\u010a\u0001\u0000\u0000\u0000\u0111\u010b\u0001\u0000\u0000\u0000"+
		"\u0111\u010c\u0001\u0000\u0000\u0000\u0111\u010d\u0001\u0000\u0000\u0000"+
		"\u0111\u010e\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000"+
		"\u0111\u0110\u0001\u0000\u0000\u0000\u0112)\u0001\u0000\u0000\u0000\u0113"+
		"\u0114\u0005\u0016\u0000\u0000\u0114\u0115\u0005#\u0000\u0000\u0115\u0116"+
		"\u0003(\u0014\u0000\u0116\u0117\u0005%\u0000\u0000\u0117+\u0001\u0000"+
		"\u0000\u0000\u001d.047>BFIOW\\dms}\u0084\u0088\u0092\u00a3\u00a5\u00a9"+
		"\u00ad\u00b4\u00b8\u00c8\u00e2\u0101\u0105\u0111";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}