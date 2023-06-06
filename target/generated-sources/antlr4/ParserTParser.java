// Generated from ParserT.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__13=1, T__12=2, T__11=3, T__10=4, T__9=5, T__8=6, T__7=7, T__6=8, T__5=9, 
		T__4=10, T__3=11, T__2=12, T__1=13, T__0=14, BEGIN=15, END=16, PRINT=17, 
		VAR=18, INT=19, STR=20, FLT=21, OR=22, AND=23, WS=24;
	public static final String[] tokenNames = {
		"<INVALID>", "'pikapi'", "'pikapika'", "'CHUUU'", "'!='", "'kaaa'", "'=='", 
		"'<'", "'PIKAPIKA'", "'>'", "'piii'", "'PIKAPI'", "'PIKA'", "'('", "')'", 
		"'Pikachu{'", "'}'", "'pika!'", "VAR", "INT", "STR", "FLT", "'pi|'", "'pi&'", 
		"WS"
	};
	public static final int
		RULE_program = 0, RULE_declaracion = 1, RULE_entero = 2, RULE_string = 3, 
		RULE_decimal = 4, RULE_suma = 5, RULE_resta = 6, RULE_division = 7, RULE_multiplicacion = 8, 
		RULE_statement = 9, RULE_print = 10, RULE_mientras = 11, RULE_logica = 12, 
		RULE_comparacion = 13, RULE_mayor = 14, RULE_menor = 15, RULE_igual = 16, 
		RULE_distinto = 17;
	public static final String[] ruleNames = {
		"program", "declaracion", "entero", "string", "decimal", "suma", "resta", 
		"division", "multiplicacion", "statement", "print", "mientras", "logica", 
		"comparacion", "mayor", "menor", "igual", "distinto"
	};

	@Override
	public String getGrammarFileName() { return "ParserT.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(ParserTParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(ParserTParser.END, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36); match(BEGIN);
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(37); statement();
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PRINT );
			setState(42); match(END);
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

	public static class DeclaracionContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public EnteroContext entero() {
			return getRuleContext(EnteroContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitDeclaracion(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracion);
		try {
			setState(47);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44); entero();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45); string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(46); decimal();
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

	public static class EnteroContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(ParserTParser.VAR, 0); }
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public EnteroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterEntero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitEntero(this);
		}
	}

	public final EnteroContext entero() throws RecognitionException {
		EnteroContext _localctx = new EnteroContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_entero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); match(T__2);
			setState(50); match(INT);
			setState(51); match(VAR);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(ParserTParser.STR, 0); }
		public TerminalNode VAR() { return getToken(ParserTParser.VAR, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); match(T__2);
			setState(54); match(STR);
			setState(55); match(VAR);
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

	public static class DecimalContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(ParserTParser.VAR, 0); }
		public TerminalNode FLT() { return getToken(ParserTParser.FLT, 0); }
		public DecimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitDecimal(this);
		}
	}

	public final DecimalContext decimal() throws RecognitionException {
		DecimalContext _localctx = new DecimalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); match(T__2);
			setState(58); match(FLT);
			setState(59); match(VAR);
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

	public static class SumaContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(ParserTParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(ParserTParser.VAR, i);
		}
		public SumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterSuma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitSuma(this);
		}
	}

	public final SumaContext suma() throws RecognitionException {
		SumaContext _localctx = new SumaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_suma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); match(VAR);
			setState(62); match(T__12);
			setState(63); match(VAR);
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

	public static class RestaContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(ParserTParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(ParserTParser.VAR, i);
		}
		public RestaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterResta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitResta(this);
		}
	}

	public final RestaContext resta() throws RecognitionException {
		RestaContext _localctx = new RestaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_resta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); match(VAR);
			setState(66); match(T__13);
			setState(67); match(VAR);
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

	public static class DivisionContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(ParserTParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(ParserTParser.VAR, i);
		}
		public DivisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_division; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitDivision(this);
		}
	}

	public final DivisionContext division() throws RecognitionException {
		DivisionContext _localctx = new DivisionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_division);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); match(VAR);
			setState(70); match(T__3);
			setState(71); match(VAR);
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

	public static class MultiplicacionContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(ParserTParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(ParserTParser.VAR, i);
		}
		public MultiplicacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterMultiplicacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitMultiplicacion(this);
		}
	}

	public final MultiplicacionContext multiplicacion() throws RecognitionException {
		MultiplicacionContext _localctx = new MultiplicacionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_multiplicacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); match(VAR);
			setState(74); match(T__6);
			setState(75); match(VAR);
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

	public static class StatementContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); print();
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(ParserTParser.PRINT, 0); }
		public TerminalNode VAR() { return getToken(ParserTParser.VAR, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); match(PRINT);
			setState(80); match(T__1);
			setState(81); match(VAR);
			setState(82); match(T__0);
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

	public static class MientrasContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public LogicaContext logica() {
			return getRuleContext(LogicaContext.class,0);
		}
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitMientras(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); match(T__4);
			setState(85); logica();
			setState(86); match(T__9);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRINT) {
				{
				{
				setState(87); statement();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93); match(T__11);
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

	public static class LogicaContext extends ParserRuleContext {
		public TerminalNode AND(int i) {
			return getToken(ParserTParser.AND, i);
		}
		public ComparacionContext comparacion(int i) {
			return getRuleContext(ComparacionContext.class,i);
		}
		public List<ComparacionContext> comparacion() {
			return getRuleContexts(ComparacionContext.class);
		}
		public List<TerminalNode> AND() { return getTokens(ParserTParser.AND); }
		public List<TerminalNode> OR() { return getTokens(ParserTParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ParserTParser.OR, i);
		}
		public LogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterLogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitLogica(this);
		}
	}

	public final LogicaContext logica() throws RecognitionException {
		LogicaContext _localctx = new LogicaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); comparacion();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==AND) {
				{
				{
				setState(96);
				_la = _input.LA(1);
				if ( !(_la==OR || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(97); comparacion();
				}
				}
				setState(102);
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

	public static class ComparacionContext extends ParserRuleContext {
		public IgualContext igual() {
			return getRuleContext(IgualContext.class,0);
		}
		public DistintoContext distinto() {
			return getRuleContext(DistintoContext.class,0);
		}
		public MenorContext menor() {
			return getRuleContext(MenorContext.class,0);
		}
		public MayorContext mayor() {
			return getRuleContext(MayorContext.class,0);
		}
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterComparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitComparacion(this);
		}
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comparacion);
		try {
			setState(107);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103); mayor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104); menor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(105); igual();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(106); distinto();
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

	public static class MayorContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(ParserTParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(ParserTParser.VAR, i);
		}
		public MayorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mayor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterMayor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitMayor(this);
		}
	}

	public final MayorContext mayor() throws RecognitionException {
		MayorContext _localctx = new MayorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mayor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); match(VAR);
			setState(110); match(T__5);
			setState(111); match(VAR);
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

	public static class MenorContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(ParserTParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(ParserTParser.VAR, i);
		}
		public MenorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterMenor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitMenor(this);
		}
	}

	public final MenorContext menor() throws RecognitionException {
		MenorContext _localctx = new MenorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_menor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); match(VAR);
			setState(114); match(T__7);
			setState(115); match(VAR);
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

	public static class IgualContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(ParserTParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(ParserTParser.VAR, i);
		}
		public IgualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_igual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitIgual(this);
		}
	}

	public final IgualContext igual() throws RecognitionException {
		IgualContext _localctx = new IgualContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_igual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); match(VAR);
			setState(118); match(T__8);
			setState(119); match(VAR);
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

	public static class DistintoContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(ParserTParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(ParserTParser.VAR, i);
		}
		public DistintoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterDistinto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitDistinto(this);
		}
	}

	public final DistintoContext distinto() throws RecognitionException {
		DistintoContext _localctx = new DistintoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_distinto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); match(VAR);
			setState(122); match(T__10);
			setState(123); match(VAR);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32\u0080\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\6\2)\n\2\r\2\16\2*\3\2\3\2\3\3\3\3\3\3\5\3\62\n\3\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\7\r[\n\r\f\r\16\r^\13\r\3\r\3\r\3\16\3\16\3\16\7\16e"+
		"\n\16\f\16\16\16h\13\16\3\17\3\17\3\17\3\17\5\17n\n\17\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\3\3\2\30\31u\2&\3"+
		"\2\2\2\4\61\3\2\2\2\6\63\3\2\2\2\b\67\3\2\2\2\n;\3\2\2\2\f?\3\2\2\2\16"+
		"C\3\2\2\2\20G\3\2\2\2\22K\3\2\2\2\24O\3\2\2\2\26Q\3\2\2\2\30V\3\2\2\2"+
		"\32a\3\2\2\2\34m\3\2\2\2\36o\3\2\2\2 s\3\2\2\2\"w\3\2\2\2${\3\2\2\2&("+
		"\7\21\2\2\')\5\24\13\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+,\3\2"+
		"\2\2,-\7\22\2\2-\3\3\2\2\2.\62\5\6\4\2/\62\5\b\5\2\60\62\5\n\6\2\61.\3"+
		"\2\2\2\61/\3\2\2\2\61\60\3\2\2\2\62\5\3\2\2\2\63\64\7\16\2\2\64\65\7\25"+
		"\2\2\65\66\7\24\2\2\66\7\3\2\2\2\678\7\16\2\289\7\26\2\29:\7\24\2\2:\t"+
		"\3\2\2\2;<\7\16\2\2<=\7\27\2\2=>\7\24\2\2>\13\3\2\2\2?@\7\24\2\2@A\7\4"+
		"\2\2AB\7\24\2\2B\r\3\2\2\2CD\7\24\2\2DE\7\3\2\2EF\7\24\2\2F\17\3\2\2\2"+
		"GH\7\24\2\2HI\7\r\2\2IJ\7\24\2\2J\21\3\2\2\2KL\7\24\2\2LM\7\n\2\2MN\7"+
		"\24\2\2N\23\3\2\2\2OP\5\26\f\2P\25\3\2\2\2QR\7\23\2\2RS\7\17\2\2ST\7\24"+
		"\2\2TU\7\20\2\2U\27\3\2\2\2VW\7\f\2\2WX\5\32\16\2X\\\7\7\2\2Y[\5\24\13"+
		"\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7"+
		"\5\2\2`\31\3\2\2\2af\5\34\17\2bc\t\2\2\2ce\5\34\17\2db\3\2\2\2eh\3\2\2"+
		"\2fd\3\2\2\2fg\3\2\2\2g\33\3\2\2\2hf\3\2\2\2in\5\36\20\2jn\5 \21\2kn\5"+
		"\"\22\2ln\5$\23\2mi\3\2\2\2mj\3\2\2\2mk\3\2\2\2ml\3\2\2\2n\35\3\2\2\2"+
		"op\7\24\2\2pq\7\13\2\2qr\7\24\2\2r\37\3\2\2\2st\7\24\2\2tu\7\t\2\2uv\7"+
		"\24\2\2v!\3\2\2\2wx\7\24\2\2xy\7\b\2\2yz\7\24\2\2z#\3\2\2\2{|\7\24\2\2"+
		"|}\7\6\2\2}~\7\24\2\2~%\3\2\2\2\7*\61\\fm";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}