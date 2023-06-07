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
		T__12=1, T__11=2, T__10=3, T__9=4, T__8=5, T__7=6, T__6=7, T__5=8, T__4=9, 
		T__3=10, T__2=11, T__1=12, T__0=13, BEGIN=14, END=15, PRINT=16, VAR=17, 
		INT=18, STR=19, FLT=20, DECLARAR=21, IGUAL=22, OR=23, AND=24, WS=25;
	public static final String[] tokenNames = {
		"<INVALID>", "'pikapi'", "'pikapika'", "'CHUUU'", "'!='", "'kaaa'", "'=='", 
		"'<'", "'PIKAPIKA'", "'>'", "'piii'", "'PIKAPI'", "'('", "')'", "'Pikascript{'", 
		"'}'", "'pika!'", "VAR", "INT", "STR", "FLT", "'PIKA'", "'CHU'", "'pi|'", 
		"'pi&'", "WS"
	};
	public static final int
		RULE_program = 0, RULE_variable = 1, RULE_declaracion = 2, RULE_entero = 3, 
		RULE_string = 4, RULE_decimal = 5, RULE_asignacion = 6, RULE_operacion = 7, 
		RULE_suma = 8, RULE_resta = 9, RULE_division = 10, RULE_multiplicacion = 11, 
		RULE_statement = 12, RULE_print = 13, RULE_mientras = 14, RULE_logica = 15, 
		RULE_comparacion = 16, RULE_mayor = 17, RULE_menor = 18, RULE_igualigual = 19, 
		RULE_distinto = 20;
	public static final String[] ruleNames = {
		"program", "variable", "declaracion", "entero", "string", "decimal", "asignacion", 
		"operacion", "suma", "resta", "division", "multiplicacion", "statement", 
		"print", "mientras", "logica", "comparacion", "mayor", "menor", "igualigual", 
		"distinto"
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
			setState(42); match(BEGIN);
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43); statement();
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << VAR) | (1L << DECLARAR))) != 0) );
			setState(48); match(END);
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

	public static class VariableContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public EnteroContext entero() {
			return getRuleContext(EnteroContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variable);
		try {
			setState(53);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50); entero();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51); string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52); decimal();
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

	public static class DeclaracionContext extends ParserRuleContext {
		public TerminalNode DECLARAR() { return getToken(ParserTParser.DECLARAR, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
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
		enterRule(_localctx, 4, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); match(DECLARAR);
			setState(56); variable();
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
		public TerminalNode IGUAL() { return getToken(ParserTParser.IGUAL, 0); }
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
		enterRule(_localctx, 6, RULE_entero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); match(VAR);
			setState(59); match(IGUAL);
			setState(60); match(INT);
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
		public TerminalNode VAR() { return getToken(ParserTParser.VAR, 0); }
		public TerminalNode STR() { return getToken(ParserTParser.STR, 0); }
		public TerminalNode IGUAL() { return getToken(ParserTParser.IGUAL, 0); }
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
		enterRule(_localctx, 8, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); match(VAR);
			setState(63); match(IGUAL);
			setState(64); match(STR);
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
		public TerminalNode IGUAL() { return getToken(ParserTParser.IGUAL, 0); }
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
		enterRule(_localctx, 10, RULE_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); match(VAR);
			setState(67); match(IGUAL);
			setState(68); match(FLT);
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

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(ParserTParser.VAR, 0); }
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(ParserTParser.IGUAL, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitAsignacion(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); match(VAR);
			setState(71); match(IGUAL);
			{
			setState(72); operacion();
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

	public static class OperacionContext extends ParserRuleContext {
		public DivisionContext division() {
			return getRuleContext(DivisionContext.class,0);
		}
		public SumaContext suma() {
			return getRuleContext(SumaContext.class,0);
		}
		public RestaContext resta() {
			return getRuleContext(RestaContext.class,0);
		}
		public MultiplicacionContext multiplicacion() {
			return getRuleContext(MultiplicacionContext.class,0);
		}
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitOperacion(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_operacion);
		try {
			setState(78);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74); suma();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75); resta();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76); division();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(77); multiplicacion();
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
		enterRule(_localctx, 16, RULE_suma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); match(VAR);
			setState(81); match(T__11);
			setState(82); match(VAR);
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
		enterRule(_localctx, 18, RULE_resta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); match(VAR);
			setState(85); match(T__12);
			setState(86); match(VAR);
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
		enterRule(_localctx, 20, RULE_division);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); match(VAR);
			setState(89); match(T__2);
			setState(90); match(VAR);
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
		enterRule(_localctx, 22, RULE_multiplicacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); match(VAR);
			setState(93); match(T__5);
			setState(94); match(VAR);
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
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
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
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(100);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96); print();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97); declaracion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98); operacion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(99); asignacion();
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
		enterRule(_localctx, 26, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); match(PRINT);
			setState(103); match(T__1);
			setState(104); match(VAR);
			setState(105); match(T__0);
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
		enterRule(_localctx, 28, RULE_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); match(T__3);
			setState(108); logica();
			setState(109); match(T__8);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << VAR) | (1L << DECLARAR))) != 0)) {
				{
				{
				setState(110); statement();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116); match(T__10);
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
		enterRule(_localctx, 30, RULE_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); comparacion();
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==AND) {
				{
				{
				setState(119);
				_la = _input.LA(1);
				if ( !(_la==OR || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(120); comparacion();
				}
				}
				setState(125);
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
		public IgualigualContext igualigual() {
			return getRuleContext(IgualigualContext.class,0);
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
		enterRule(_localctx, 32, RULE_comparacion);
		try {
			setState(130);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126); mayor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127); menor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(128); igualigual();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(129); distinto();
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
		enterRule(_localctx, 34, RULE_mayor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); match(VAR);
			setState(133); match(T__4);
			setState(134); match(VAR);
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
		enterRule(_localctx, 36, RULE_menor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); match(VAR);
			setState(137); match(T__6);
			setState(138); match(VAR);
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

	public static class IgualigualContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(ParserTParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(ParserTParser.VAR, i);
		}
		public IgualigualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_igualigual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterIgualigual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitIgualigual(this);
		}
	}

	public final IgualigualContext igualigual() throws RecognitionException {
		IgualigualContext _localctx = new IgualigualContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_igualigual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140); match(VAR);
			setState(141); match(T__7);
			setState(142); match(VAR);
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
		enterRule(_localctx, 40, RULE_distinto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); match(VAR);
			setState(145); match(T__9);
			setState(146); match(VAR);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\33\u0097\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\6\2/\n\2\r\2\16\2\60"+
		"\3\2\3\2\3\3\3\3\3\3\5\38\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\tQ\n\t\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\5\16g\n\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20"+
		"r\n\20\f\20\16\20u\13\20\3\20\3\20\3\21\3\21\3\21\7\21|\n\21\f\21\16\21"+
		"\177\13\21\3\22\3\22\3\22\3\22\5\22\u0085\n\22\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\2\2\27\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\3\3\2\31\32\u008f\2,\3"+
		"\2\2\2\4\67\3\2\2\2\69\3\2\2\2\b<\3\2\2\2\n@\3\2\2\2\fD\3\2\2\2\16H\3"+
		"\2\2\2\20P\3\2\2\2\22R\3\2\2\2\24V\3\2\2\2\26Z\3\2\2\2\30^\3\2\2\2\32"+
		"f\3\2\2\2\34h\3\2\2\2\36m\3\2\2\2 x\3\2\2\2\"\u0084\3\2\2\2$\u0086\3\2"+
		"\2\2&\u008a\3\2\2\2(\u008e\3\2\2\2*\u0092\3\2\2\2,.\7\20\2\2-/\5\32\16"+
		"\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\63"+
		"\7\21\2\2\63\3\3\2\2\2\648\5\b\5\2\658\5\n\6\2\668\5\f\7\2\67\64\3\2\2"+
		"\2\67\65\3\2\2\2\67\66\3\2\2\28\5\3\2\2\29:\7\27\2\2:;\5\4\3\2;\7\3\2"+
		"\2\2<=\7\23\2\2=>\7\30\2\2>?\7\24\2\2?\t\3\2\2\2@A\7\23\2\2AB\7\30\2\2"+
		"BC\7\25\2\2C\13\3\2\2\2DE\7\23\2\2EF\7\30\2\2FG\7\26\2\2G\r\3\2\2\2HI"+
		"\7\23\2\2IJ\7\30\2\2JK\5\20\t\2K\17\3\2\2\2LQ\5\22\n\2MQ\5\24\13\2NQ\5"+
		"\26\f\2OQ\5\30\r\2PL\3\2\2\2PM\3\2\2\2PN\3\2\2\2PO\3\2\2\2Q\21\3\2\2\2"+
		"RS\7\23\2\2ST\7\4\2\2TU\7\23\2\2U\23\3\2\2\2VW\7\23\2\2WX\7\3\2\2XY\7"+
		"\23\2\2Y\25\3\2\2\2Z[\7\23\2\2[\\\7\r\2\2\\]\7\23\2\2]\27\3\2\2\2^_\7"+
		"\23\2\2_`\7\n\2\2`a\7\23\2\2a\31\3\2\2\2bg\5\34\17\2cg\5\6\4\2dg\5\20"+
		"\t\2eg\5\16\b\2fb\3\2\2\2fc\3\2\2\2fd\3\2\2\2fe\3\2\2\2g\33\3\2\2\2hi"+
		"\7\22\2\2ij\7\16\2\2jk\7\23\2\2kl\7\17\2\2l\35\3\2\2\2mn\7\f\2\2no\5 "+
		"\21\2os\7\7\2\2pr\5\32\16\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv"+
		"\3\2\2\2us\3\2\2\2vw\7\5\2\2w\37\3\2\2\2x}\5\"\22\2yz\t\2\2\2z|\5\"\22"+
		"\2{y\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~!\3\2\2\2\177}\3\2\2\2\u0080"+
		"\u0085\5$\23\2\u0081\u0085\5&\24\2\u0082\u0085\5(\25\2\u0083\u0085\5*"+
		"\26\2\u0084\u0080\3\2\2\2\u0084\u0081\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0083\3\2\2\2\u0085#\3\2\2\2\u0086\u0087\7\23\2\2\u0087\u0088\7\13\2"+
		"\2\u0088\u0089\7\23\2\2\u0089%\3\2\2\2\u008a\u008b\7\23\2\2\u008b\u008c"+
		"\7\t\2\2\u008c\u008d\7\23\2\2\u008d\'\3\2\2\2\u008e\u008f\7\23\2\2\u008f"+
		"\u0090\7\b\2\2\u0090\u0091\7\23\2\2\u0091)\3\2\2\2\u0092\u0093\7\23\2"+
		"\2\u0093\u0094\7\6\2\2\u0094\u0095\7\23\2\2\u0095+\3\2\2\2\t\60\67Pfs"+
		"}\u0084";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}