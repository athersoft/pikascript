// Generated from ParserT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserTLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, BEGIN=15, END=16, PRINT=17, 
		VAR=18, INT=19, STR=20, FLT=21, OR=22, AND=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "BEGIN", "END", "PRINT", "VAR", 
		"INT", "STR", "FLT", "OR", "AND", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'PIKA'", "'pikapika'", "'pikapi'", "'PIKAPI'", "'PIKAPIKA'", "'('", 
		"')'", "'piii'", "'kaaa'", "'CHUUU'", "'>'", "'<'", "'=='", "'!='", "'Pikascript{'", 
		"'}'", "'pika!'", null, null, null, null, "'pi|'", "'pi&'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "BEGIN", "END", "PRINT", "VAR", "INT", "STR", "FLT", 
		"OR", "AND", "WS"
	};
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


	public ParserTLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ParserT.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00b6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\6\23\u008c\n\23\r\23\16\23\u008d"+
		"\3\24\6\24\u0091\n\24\r\24\16\24\u0092\3\25\3\25\6\25\u0097\n\25\r\25"+
		"\16\25\u0098\3\25\3\25\3\26\6\26\u009e\n\26\r\26\16\26\u009f\3\26\3\26"+
		"\6\26\u00a4\n\26\r\26\16\26\u00a5\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\31\6\31\u00b1\n\31\r\31\16\31\u00b2\3\31\3\31\2\2\32\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\3\2\5\3\2c|\3\2\62;\5\2\13\f\17\17\"\""+
		"\2\u00bb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\58\3\2\2\2\7A\3\2\2\2\tH\3\2\2\2"+
		"\13O\3\2\2\2\rX\3\2\2\2\17Z\3\2\2\2\21\\\3\2\2\2\23a\3\2\2\2\25f\3\2\2"+
		"\2\27l\3\2\2\2\31n\3\2\2\2\33p\3\2\2\2\35s\3\2\2\2\37v\3\2\2\2!\u0082"+
		"\3\2\2\2#\u0084\3\2\2\2%\u008b\3\2\2\2\'\u0090\3\2\2\2)\u0094\3\2\2\2"+
		"+\u009d\3\2\2\2-\u00a7\3\2\2\2/\u00ab\3\2\2\2\61\u00b0\3\2\2\2\63\64\7"+
		"R\2\2\64\65\7K\2\2\65\66\7M\2\2\66\67\7C\2\2\67\4\3\2\2\289\7r\2\29:\7"+
		"k\2\2:;\7m\2\2;<\7c\2\2<=\7r\2\2=>\7k\2\2>?\7m\2\2?@\7c\2\2@\6\3\2\2\2"+
		"AB\7r\2\2BC\7k\2\2CD\7m\2\2DE\7c\2\2EF\7r\2\2FG\7k\2\2G\b\3\2\2\2HI\7"+
		"R\2\2IJ\7K\2\2JK\7M\2\2KL\7C\2\2LM\7R\2\2MN\7K\2\2N\n\3\2\2\2OP\7R\2\2"+
		"PQ\7K\2\2QR\7M\2\2RS\7C\2\2ST\7R\2\2TU\7K\2\2UV\7M\2\2VW\7C\2\2W\f\3\2"+
		"\2\2XY\7*\2\2Y\16\3\2\2\2Z[\7+\2\2[\20\3\2\2\2\\]\7r\2\2]^\7k\2\2^_\7"+
		"k\2\2_`\7k\2\2`\22\3\2\2\2ab\7m\2\2bc\7c\2\2cd\7c\2\2de\7c\2\2e\24\3\2"+
		"\2\2fg\7E\2\2gh\7J\2\2hi\7W\2\2ij\7W\2\2jk\7W\2\2k\26\3\2\2\2lm\7@\2\2"+
		"m\30\3\2\2\2no\7>\2\2o\32\3\2\2\2pq\7?\2\2qr\7?\2\2r\34\3\2\2\2st\7#\2"+
		"\2tu\7?\2\2u\36\3\2\2\2vw\7R\2\2wx\7k\2\2xy\7m\2\2yz\7c\2\2z{\7u\2\2{"+
		"|\7e\2\2|}\7t\2\2}~\7k\2\2~\177\7r\2\2\177\u0080\7v\2\2\u0080\u0081\7"+
		"}\2\2\u0081 \3\2\2\2\u0082\u0083\7\177\2\2\u0083\"\3\2\2\2\u0084\u0085"+
		"\7r\2\2\u0085\u0086\7k\2\2\u0086\u0087\7m\2\2\u0087\u0088\7c\2\2\u0088"+
		"\u0089\7#\2\2\u0089$\3\2\2\2\u008a\u008c\t\2\2\2\u008b\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e&\3\2\2\2"+
		"\u008f\u0091\t\3\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093(\3\2\2\2\u0094\u0096\7$\2\2\u0095\u0097"+
		"\t\2\2\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7$\2\2\u009b*\3\2\2\2\u009c"+
		"\u009e\t\3\2\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2"+
		"\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\7.\2\2\u00a2"+
		"\u00a4\t\3\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6,\3\2\2\2\u00a7\u00a8\7r\2\2\u00a8\u00a9"+
		"\7k\2\2\u00a9\u00aa\7~\2\2\u00aa.\3\2\2\2\u00ab\u00ac\7r\2\2\u00ac\u00ad"+
		"\7k\2\2\u00ad\u00ae\7(\2\2\u00ae\60\3\2\2\2\u00af\u00b1\t\4\2\2\u00b0"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\b\31\2\2\u00b5\62\3\2\2\2\t\2\u008d"+
		"\u0092\u0098\u009f\u00a5\u00b2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}