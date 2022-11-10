// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, IDENTIFIER=6, IF=7, ELSE=8, WHILE=9, 
		INT=10, REAL=11, RATIO=12, BOOLEAN=13, STRING=14, ARRAY=15, MINUS=16, 
		PLUS=17, MULT=18, DIVISION=19, CONST=20, LEFT_ROUND_PARENTHESIS=21, RIGHT_ROUND_PARENTHESIS=22, 
		LEFT_COMPOUND_PARENTHESIS=23, RIGHT_COMPOUND_PARENTHESIS=24, LEFT_SQUARE_PARENTHESIS=25, 
		RIGHT_SQUARE_PARENTHESIS=26, LEFT_SHARP_PARENTHESIS=27, RIGHT_SHARP_PARENTHESIS=28, 
		EQUAL=29, DOT=30, COMMA=31, SEMICOLON=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "IDENTIFIER", "IF", "ELSE", "WHILE", 
			"INT", "REAL", "RATIO", "BOOLEAN", "STRING", "ARRAY", "MINUS", "PLUS", 
			"MULT", "DIVISION", "CONST", "LEFT_ROUND_PARENTHESIS", "RIGHT_ROUND_PARENTHESIS", 
			"LEFT_COMPOUND_PARENTHESIS", "RIGHT_COMPOUND_PARENTHESIS", "LEFT_SQUARE_PARENTHESIS", 
			"RIGHT_SQUARE_PARENTHESIS", "LEFT_SHARP_PARENTHESIS", "RIGHT_SHARP_PARENTHESIS", 
			"EQUAL", "DOT", "COMMA", "SEMICOLON"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'real'", "'ratio'", "'boolean'", "'string'", null, "'if'", 
			"'else'", "'while'", null, null, null, null, null, "'array'", "'-'", 
			"'+'", "'*'", "'/'", "'const'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"'<'", "'>'", "'='", "'.'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "IDENTIFIER", "IF", "ELSE", "WHILE", 
			"INT", "REAL", "RATIO", "BOOLEAN", "STRING", "ARRAY", "MINUS", "PLUS", 
			"MULT", "DIVISION", "CONST", "LEFT_ROUND_PARENTHESIS", "RIGHT_ROUND_PARENTHESIS", 
			"LEFT_COMPOUND_PARENTHESIS", "RIGHT_COMPOUND_PARENTHESIS", "LEFT_SQUARE_PARENTHESIS", 
			"RIGHT_SQUARE_PARENTHESIS", "LEFT_SHARP_PARENTHESIS", "RIGHT_SHARP_PARENTHESIS", 
			"EQUAL", "DOT", "COMMA", "SEMICOLON"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000 \u00bf\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0005"+
		"\u0005b\b\u0005\n\u0005\f\u0005e\t\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0004\tv\b\t\u000b"+
		"\t\f\tw\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u008b\b\f\u0001\r\u0001\r\u0005\r\u008f\b\r"+
		"\n\r\f\r\u0092\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0000\u0000 \u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a"+
		"5\u001b7\u001c9\u001d;\u001e=\u001f? \u0001\u0000\u0005\u0003\u0000AZ"+
		"__az\u0004\u000009AZ__az\u0001\u000009\u0002\u0000AZaz\u0003\u000009A"+
		"Zaz\u00c2\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000"+
		"\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0001"+
		"A\u0001\u0000\u0000\u0000\u0003E\u0001\u0000\u0000\u0000\u0005J\u0001"+
		"\u0000\u0000\u0000\u0007P\u0001\u0000\u0000\u0000\tX\u0001\u0000\u0000"+
		"\u0000\u000b_\u0001\u0000\u0000\u0000\rf\u0001\u0000\u0000\u0000\u000f"+
		"i\u0001\u0000\u0000\u0000\u0011n\u0001\u0000\u0000\u0000\u0013u\u0001"+
		"\u0000\u0000\u0000\u0015y\u0001\u0000\u0000\u0000\u0017}\u0001\u0000\u0000"+
		"\u0000\u0019\u008a\u0001\u0000\u0000\u0000\u001b\u008c\u0001\u0000\u0000"+
		"\u0000\u001d\u0093\u0001\u0000\u0000\u0000\u001f\u0099\u0001\u0000\u0000"+
		"\u0000!\u009b\u0001\u0000\u0000\u0000#\u009d\u0001\u0000\u0000\u0000%"+
		"\u009f\u0001\u0000\u0000\u0000\'\u00a1\u0001\u0000\u0000\u0000)\u00a7"+
		"\u0001\u0000\u0000\u0000+\u00a9\u0001\u0000\u0000\u0000-\u00ab\u0001\u0000"+
		"\u0000\u0000/\u00ad\u0001\u0000\u0000\u00001\u00af\u0001\u0000\u0000\u0000"+
		"3\u00b1\u0001\u0000\u0000\u00005\u00b3\u0001\u0000\u0000\u00007\u00b5"+
		"\u0001\u0000\u0000\u00009\u00b7\u0001\u0000\u0000\u0000;\u00b9\u0001\u0000"+
		"\u0000\u0000=\u00bb\u0001\u0000\u0000\u0000?\u00bd\u0001\u0000\u0000\u0000"+
		"AB\u0005i\u0000\u0000BC\u0005n\u0000\u0000CD\u0005t\u0000\u0000D\u0002"+
		"\u0001\u0000\u0000\u0000EF\u0005r\u0000\u0000FG\u0005e\u0000\u0000GH\u0005"+
		"a\u0000\u0000HI\u0005l\u0000\u0000I\u0004\u0001\u0000\u0000\u0000JK\u0005"+
		"r\u0000\u0000KL\u0005a\u0000\u0000LM\u0005t\u0000\u0000MN\u0005i\u0000"+
		"\u0000NO\u0005o\u0000\u0000O\u0006\u0001\u0000\u0000\u0000PQ\u0005b\u0000"+
		"\u0000QR\u0005o\u0000\u0000RS\u0005o\u0000\u0000ST\u0005l\u0000\u0000"+
		"TU\u0005e\u0000\u0000UV\u0005a\u0000\u0000VW\u0005n\u0000\u0000W\b\u0001"+
		"\u0000\u0000\u0000XY\u0005s\u0000\u0000YZ\u0005t\u0000\u0000Z[\u0005r"+
		"\u0000\u0000[\\\u0005i\u0000\u0000\\]\u0005n\u0000\u0000]^\u0005g\u0000"+
		"\u0000^\n\u0001\u0000\u0000\u0000_c\u0007\u0000\u0000\u0000`b\u0007\u0001"+
		"\u0000\u0000a`\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001"+
		"\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000d\f\u0001\u0000\u0000\u0000"+
		"ec\u0001\u0000\u0000\u0000fg\u0005i\u0000\u0000gh\u0005f\u0000\u0000h"+
		"\u000e\u0001\u0000\u0000\u0000ij\u0005e\u0000\u0000jk\u0005l\u0000\u0000"+
		"kl\u0005s\u0000\u0000lm\u0005e\u0000\u0000m\u0010\u0001\u0000\u0000\u0000"+
		"no\u0005w\u0000\u0000op\u0005h\u0000\u0000pq\u0005i\u0000\u0000qr\u0005"+
		"l\u0000\u0000rs\u0005e\u0000\u0000s\u0012\u0001\u0000\u0000\u0000tv\u0007"+
		"\u0002\u0000\u0000ut\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000"+
		"wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x\u0014\u0001\u0000"+
		"\u0000\u0000yz\u0003\u0013\t\u0000z{\u0003;\u001d\u0000{|\u0003\u0013"+
		"\t\u0000|\u0016\u0001\u0000\u0000\u0000}~\u0003\u0013\t\u0000~\u007f\u0003"+
		"%\u0012\u0000\u007f\u0080\u0003\u0013\t\u0000\u0080\u0018\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0005t\u0000\u0000\u0082\u0083\u0005r\u0000\u0000"+
		"\u0083\u0084\u0005u\u0000\u0000\u0084\u008b\u0005e\u0000\u0000\u0085\u0086"+
		"\u0005f\u0000\u0000\u0086\u0087\u0005a\u0000\u0000\u0087\u0088\u0005l"+
		"\u0000\u0000\u0088\u0089\u0005s\u0000\u0000\u0089\u008b\u0005e\u0000\u0000"+
		"\u008a\u0081\u0001\u0000\u0000\u0000\u008a\u0085\u0001\u0000\u0000\u0000"+
		"\u008b\u001a\u0001\u0000\u0000\u0000\u008c\u0090\u0007\u0003\u0000\u0000"+
		"\u008d\u008f\u0007\u0004\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000"+
		"\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000"+
		"\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u001c\u0001\u0000\u0000\u0000"+
		"\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0094\u0005a\u0000\u0000\u0094"+
		"\u0095\u0005r\u0000\u0000\u0095\u0096\u0005r\u0000\u0000\u0096\u0097\u0005"+
		"a\u0000\u0000\u0097\u0098\u0005y\u0000\u0000\u0098\u001e\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0005-\u0000\u0000\u009a \u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0005+\u0000\u0000\u009c\"\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0005*\u0000\u0000\u009e$\u0001\u0000\u0000\u0000\u009f\u00a0\u0005/"+
		"\u0000\u0000\u00a0&\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005c\u0000\u0000"+
		"\u00a2\u00a3\u0005o\u0000\u0000\u00a3\u00a4\u0005n\u0000\u0000\u00a4\u00a5"+
		"\u0005s\u0000\u0000\u00a5\u00a6\u0005t\u0000\u0000\u00a6(\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0005(\u0000\u0000\u00a8*\u0001\u0000\u0000\u0000"+
		"\u00a9\u00aa\u0005)\u0000\u0000\u00aa,\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u0005{\u0000\u0000\u00ac.\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005}"+
		"\u0000\u0000\u00ae0\u0001\u0000\u0000\u0000\u00af\u00b0\u0005[\u0000\u0000"+
		"\u00b02\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005]\u0000\u0000\u00b24"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005<\u0000\u0000\u00b46\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0005>\u0000\u0000\u00b68\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b8\u0005=\u0000\u0000\u00b8:\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0005.\u0000\u0000\u00ba<\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005,"+
		"\u0000\u0000\u00bc>\u0001\u0000\u0000\u0000\u00bd\u00be\u0005;\u0000\u0000"+
		"\u00be@\u0001\u0000\u0000\u0000\u0005\u0000cw\u008a\u0090\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}