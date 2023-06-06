// Generated from LexerT.g4 by ANTLR 4.7.1
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN=1, END=2, PRINT=3, VAR=4, INT=5, STR=6, FLT=7, OR=8, AND=9, WS=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BEGIN", "END", "PRINT", "VAR", "INT", "STR", "FLT", "OR", "AND", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Pikascript{'", "'}'", "'pika!'", null, null, null, null, "'pi|'", 
		"'pi&'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BEGIN", "END", "PRINT", "VAR", "INT", "STR", "FLT", "OR", "AND", 
		"WS"
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


	public LexerT(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LexerT.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\fW\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\6\5-\n\5\r\5\16\5.\3\6\6\6\62\n\6\r\6\16\6\63\3\7\3"+
		"\7\6\78\n\7\r\7\16\79\3\7\3\7\3\b\6\b?\n\b\r\b\16\b@\3\b\3\b\6\bE\n\b"+
		"\r\b\16\bF\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\6\13R\n\13\r\13\16\13"+
		"S\3\13\3\13\2\2\f\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\3\2\5"+
		"\3\2c|\3\2\62;\5\2\13\f\17\17\"\"\2\\\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\3\27\3\2\2\2\5#\3\2\2\2\7%\3\2\2\2\t,\3\2\2\2"+
		"\13\61\3\2\2\2\r\65\3\2\2\2\17>\3\2\2\2\21H\3\2\2\2\23L\3\2\2\2\25Q\3"+
		"\2\2\2\27\30\7R\2\2\30\31\7k\2\2\31\32\7m\2\2\32\33\7c\2\2\33\34\7u\2"+
		"\2\34\35\7e\2\2\35\36\7t\2\2\36\37\7k\2\2\37 \7r\2\2 !\7v\2\2!\"\7}\2"+
		"\2\"\4\3\2\2\2#$\7\177\2\2$\6\3\2\2\2%&\7r\2\2&\'\7k\2\2\'(\7m\2\2()\7"+
		"c\2\2)*\7#\2\2*\b\3\2\2\2+-\t\2\2\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3"+
		"\2\2\2/\n\3\2\2\2\60\62\t\3\2\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2"+
		"\2\2\63\64\3\2\2\2\64\f\3\2\2\2\65\67\7$\2\2\668\t\2\2\2\67\66\3\2\2\2"+
		"89\3\2\2\29\67\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\7$\2\2<\16\3\2\2\2=?\t\3"+
		"\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AB\3\2\2\2BD\7.\2\2CE\t\3"+
		"\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\20\3\2\2\2HI\7r\2\2IJ\7"+
		"k\2\2JK\7~\2\2K\22\3\2\2\2LM\7r\2\2MN\7k\2\2NO\7(\2\2O\24\3\2\2\2PR\t"+
		"\4\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\b\13\2\2V\26"+
		"\3\2\2\2\t\2.\639@FS\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}