// Generated from LexerT.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexerT extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN=1, END=2, PRINT=3, VAR=4, INT=5, STR=6, FLT=7, DECLARAR=8, IGUAL=9, 
		OR=10, AND=11, WS=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'"
	};
	public static final String[] ruleNames = {
		"BEGIN", "END", "PRINT", "VAR", "INT", "STR", "FLT", "DECLARAR", "IGUAL", 
		"OR", "AND", "WS"
	};


	public LexerT(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LexerT.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16d\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\6\5\61\n\5\r\5\16\5\62\3\6\6\6\66\n"+
		"\6\r\6\16\6\67\3\7\3\7\6\7<\n\7\r\7\16\7=\3\7\3\7\3\b\6\bC\n\b\r\b\16"+
		"\bD\3\b\3\b\6\bI\n\b\r\b\16\bJ\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\6\r_\n\r\r\r\16\r`\3\r\3\r\2\2\16"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\3\2\5\3\2c|"+
		"\3\2\62;\5\2\13\f\17\17\"\"i\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5\'\3\2\2\2\7)\3"+
		"\2\2\2\t\60\3\2\2\2\13\65\3\2\2\2\r9\3\2\2\2\17B\3\2\2\2\21L\3\2\2\2\23"+
		"Q\3\2\2\2\25U\3\2\2\2\27Y\3\2\2\2\31^\3\2\2\2\33\34\7R\2\2\34\35\7k\2"+
		"\2\35\36\7m\2\2\36\37\7c\2\2\37 \7u\2\2 !\7e\2\2!\"\7t\2\2\"#\7k\2\2#"+
		"$\7r\2\2$%\7v\2\2%&\7}\2\2&\4\3\2\2\2\'(\7\177\2\2(\6\3\2\2\2)*\7r\2\2"+
		"*+\7k\2\2+,\7m\2\2,-\7c\2\2-.\7#\2\2.\b\3\2\2\2/\61\t\2\2\2\60/\3\2\2"+
		"\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\n\3\2\2\2\64\66\t\3\2"+
		"\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\f\3\2\2\29;"+
		"\7$\2\2:<\t\2\2\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@"+
		"\7$\2\2@\16\3\2\2\2AC\t\3\2\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2"+
		"EF\3\2\2\2FH\7.\2\2GI\t\3\2\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2"+
		"K\20\3\2\2\2LM\7R\2\2MN\7K\2\2NO\7M\2\2OP\7C\2\2P\22\3\2\2\2QR\7E\2\2"+
		"RS\7J\2\2ST\7W\2\2T\24\3\2\2\2UV\7r\2\2VW\7k\2\2WX\7~\2\2X\26\3\2\2\2"+
		"YZ\7r\2\2Z[\7k\2\2[\\\7(\2\2\\\30\3\2\2\2]_\t\4\2\2^]\3\2\2\2_`\3\2\2"+
		"\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\b\r\2\2c\32\3\2\2\2\t\2\62\67=DJ`\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}