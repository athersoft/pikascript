// Generated from ParserT.g4 by ANTLR 4.4
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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__13=1, T__12=2, T__11=3, T__10=4, T__9=5, T__8=6, T__7=7, T__6=8, T__5=9, 
		T__4=10, T__3=11, T__2=12, T__1=13, T__0=14, BEGIN=15, END=16, PRINT=17, 
		VAR=18, INT=19, STR=20, FLT=21, OR=22, AND=23, WS=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'"
	};
	public static final String[] ruleNames = {
		"T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", 
		"T__4", "T__3", "T__2", "T__1", "T__0", "BEGIN", "END", "PRINT", "VAR", 
		"INT", "STR", "FLT", "OR", "AND", "WS"
	};


	public ParserTLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ParserT.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u00b3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\6\23\u0089\n\23\r\23\16\23\u008a\3\24\6\24\u008e"+
		"\n\24\r\24\16\24\u008f\3\25\3\25\6\25\u0094\n\25\r\25\16\25\u0095\3\25"+
		"\3\25\3\26\6\26\u009b\n\26\r\26\16\26\u009c\3\26\3\26\6\26\u00a1\n\26"+
		"\r\26\16\26\u00a2\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\6\31\u00ae"+
		"\n\31\r\31\16\31\u00af\3\31\3\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\3\2\5\3\2c|\3\2\62;\5\2\13\f\17\17\"\"\u00b8\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\3\63\3\2\2\2\5:\3\2\2\2\7C\3\2\2\2\tI\3\2\2\2\13L\3\2\2\2\rQ\3\2"+
		"\2\2\17T\3\2\2\2\21V\3\2\2\2\23_\3\2\2\2\25a\3\2\2\2\27f\3\2\2\2\31m\3"+
		"\2\2\2\33r\3\2\2\2\35t\3\2\2\2\37v\3\2\2\2!\177\3\2\2\2#\u0081\3\2\2\2"+
		"%\u0088\3\2\2\2\'\u008d\3\2\2\2)\u0091\3\2\2\2+\u009a\3\2\2\2-\u00a4\3"+
		"\2\2\2/\u00a8\3\2\2\2\61\u00ad\3\2\2\2\63\64\7r\2\2\64\65\7k\2\2\65\66"+
		"\7m\2\2\66\67\7c\2\2\678\7r\2\289\7k\2\29\4\3\2\2\2:;\7r\2\2;<\7k\2\2"+
		"<=\7m\2\2=>\7c\2\2>?\7r\2\2?@\7k\2\2@A\7m\2\2AB\7c\2\2B\6\3\2\2\2CD\7"+
		"E\2\2DE\7J\2\2EF\7W\2\2FG\7W\2\2GH\7W\2\2H\b\3\2\2\2IJ\7#\2\2JK\7?\2\2"+
		"K\n\3\2\2\2LM\7m\2\2MN\7c\2\2NO\7c\2\2OP\7c\2\2P\f\3\2\2\2QR\7?\2\2RS"+
		"\7?\2\2S\16\3\2\2\2TU\7>\2\2U\20\3\2\2\2VW\7R\2\2WX\7K\2\2XY\7M\2\2YZ"+
		"\7C\2\2Z[\7R\2\2[\\\7K\2\2\\]\7M\2\2]^\7C\2\2^\22\3\2\2\2_`\7@\2\2`\24"+
		"\3\2\2\2ab\7r\2\2bc\7k\2\2cd\7k\2\2de\7k\2\2e\26\3\2\2\2fg\7R\2\2gh\7"+
		"K\2\2hi\7M\2\2ij\7C\2\2jk\7R\2\2kl\7K\2\2l\30\3\2\2\2mn\7R\2\2no\7K\2"+
		"\2op\7M\2\2pq\7C\2\2q\32\3\2\2\2rs\7*\2\2s\34\3\2\2\2tu\7+\2\2u\36\3\2"+
		"\2\2vw\7R\2\2wx\7k\2\2xy\7m\2\2yz\7c\2\2z{\7e\2\2{|\7j\2\2|}\7w\2\2}~"+
		"\7}\2\2~ \3\2\2\2\177\u0080\7\177\2\2\u0080\"\3\2\2\2\u0081\u0082\7r\2"+
		"\2\u0082\u0083\7k\2\2\u0083\u0084\7m\2\2\u0084\u0085\7c\2\2\u0085\u0086"+
		"\7#\2\2\u0086$\3\2\2\2\u0087\u0089\t\2\2\2\u0088\u0087\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b&\3\2\2\2\u008c"+
		"\u008e\t\3\2\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2"+
		"\2\2\u008f\u0090\3\2\2\2\u0090(\3\2\2\2\u0091\u0093\7$\2\2\u0092\u0094"+
		"\t\2\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7$\2\2\u0098*\3\2\2\2\u0099"+
		"\u009b\t\3\2\2\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\7.\2\2\u009f"+
		"\u00a1\t\3\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3,\3\2\2\2\u00a4\u00a5\7r\2\2\u00a5\u00a6"+
		"\7k\2\2\u00a6\u00a7\7~\2\2\u00a7.\3\2\2\2\u00a8\u00a9\7r\2\2\u00a9\u00aa"+
		"\7k\2\2\u00aa\u00ab\7(\2\2\u00ab\60\3\2\2\2\u00ac\u00ae\t\4\2\2\u00ad"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\b\31\2\2\u00b2\62\3\2\2\2\t\2\u008a"+
		"\u008f\u0095\u009c\u00a2\u00af\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}