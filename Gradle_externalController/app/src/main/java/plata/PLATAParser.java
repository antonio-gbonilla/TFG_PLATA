// Generated from PLATA.g4 by ANTLR 4.13.2
package plata;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PLATAParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, AVANZAR=7, AJUSTAR_VELOCIDAD=8, 
		RETROCEDER=9, FRENAR=10, IR_A=11, IR_ORIGEN=12, GIRAR=13, GIRAR_DERECHA=14, 
		GIRAR_IZQUIERDA=15, GIRAR_SENTIDO_CONTRARIO=16, INICIAR_TAREA=17, FINALIZAR_TAREA=18, 
		MOSTRAR=19, ADVANCE=20, SET_SPEED=21, REVERSE=22, BRAKE=23, GO_TO=24, 
		GO_TO_ORIGIN=25, TURN=26, TURN_RIGHT=27, TURN_LEFT=28, TURN_OPPOSITE_DIRECTION=29, 
		STAR_TASK=30, FINISH_TASK=31, SHOW=32, MIENTRAS=33, SI_NO_SI=34, SI_NO=35, 
		SI=36, VERDAD=37, FALSO=38, NULO=39, WHILE=40, ELSE_IF=41, ELSE=42, IF=43, 
		TRUE=44, FALSE=45, NULL=46, MENOS=47, MULTIPLICACION=48, DIVISION=49, 
		MODULO=50, SUMA=51, MAYOR_IGUAL=52, MENOR_IGUAL=53, MAYOR=54, MENOR=55, 
		DISTINTO=56, IGUAL_QUE=57, NOT=58, AND=59, OR=60, INT=61, FLOAT=62, STRING=63, 
		ID=64, LINE_COMMENT=65, COMMENT=66, WS=67;
	public static final int
		RULE_programa = 0, RULE_sentencia = 1, RULE_avanzar = 2, RULE_ajustar_velocidad = 3, 
		RULE_retroceder = 4, RULE_frenar = 5, RULE_irA = 6, RULE_irOrigen = 7, 
		RULE_girar = 8, RULE_girar_derecha = 9, RULE_girar_izquierda = 10, RULE_girar_sentido_contrario = 11, 
		RULE_iniciarTarea = 12, RULE_finalizarTarea = 13, RULE_mostrar = 14, RULE_asignacion = 15, 
		RULE_if_sentencia = 16, RULE_bucle_while = 17, RULE_bloque = 18, RULE_expr = 19, 
		RULE_expr_aritmeticas = 20, RULE_expr_relacionales = 21, RULE_expr_logica = 22, 
		RULE_atomico = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "sentencia", "avanzar", "ajustar_velocidad", "retroceder", 
			"frenar", "irA", "irOrigen", "girar", "girar_derecha", "girar_izquierda", 
			"girar_sentido_contrario", "iniciarTarea", "finalizarTarea", "mostrar", 
			"asignacion", "if_sentencia", "bucle_while", "bloque", "expr", "expr_aritmeticas", 
			"expr_relacionales", "expr_logica", "atomico"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'='", "'{'", "'}'", null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'-'", "'*'", "'/'", "'%'", "'+'", "'>='", "'<='", "'>'", "'<'", "'!='", 
			"'=='", "'!'", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "AVANZAR", "AJUSTAR_VELOCIDAD", 
			"RETROCEDER", "FRENAR", "IR_A", "IR_ORIGEN", "GIRAR", "GIRAR_DERECHA", 
			"GIRAR_IZQUIERDA", "GIRAR_SENTIDO_CONTRARIO", "INICIAR_TAREA", "FINALIZAR_TAREA", 
			"MOSTRAR", "ADVANCE", "SET_SPEED", "REVERSE", "BRAKE", "GO_TO", "GO_TO_ORIGIN", 
			"TURN", "TURN_RIGHT", "TURN_LEFT", "TURN_OPPOSITE_DIRECTION", "STAR_TASK", 
			"FINISH_TASK", "SHOW", "MIENTRAS", "SI_NO_SI", "SI_NO", "SI", "VERDAD", 
			"FALSO", "NULO", "WHILE", "ELSE_IF", "ELSE", "IF", "TRUE", "FALSE", "NULL", 
			"MENOS", "MULTIPLICACION", "DIVISION", "MODULO", "SUMA", "MAYOR_IGUAL", 
			"MENOR_IGUAL", "MAYOR", "MENOR", "DISTINTO", "IGUAL_QUE", "NOT", "AND", 
			"OR", "INT", "FLOAT", "STRING", "ID", "LINE_COMMENT", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "PLATA.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PLATAParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PLATAParser.EOF, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				sentencia();
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & -1152819550673174591L) != 0) );
			setState(53);
			match(EOF);
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
	public static class SentenciaContext extends ParserRuleContext {
		public AvanzarContext avanzar() {
			return getRuleContext(AvanzarContext.class,0);
		}
		public GirarContext girar() {
			return getRuleContext(GirarContext.class,0);
		}
		public Girar_izquierdaContext girar_izquierda() {
			return getRuleContext(Girar_izquierdaContext.class,0);
		}
		public Girar_derechaContext girar_derecha() {
			return getRuleContext(Girar_derechaContext.class,0);
		}
		public FrenarContext frenar() {
			return getRuleContext(FrenarContext.class,0);
		}
		public RetrocederContext retroceder() {
			return getRuleContext(RetrocederContext.class,0);
		}
		public MostrarContext mostrar() {
			return getRuleContext(MostrarContext.class,0);
		}
		public IrAContext irA() {
			return getRuleContext(IrAContext.class,0);
		}
		public Ajustar_velocidadContext ajustar_velocidad() {
			return getRuleContext(Ajustar_velocidadContext.class,0);
		}
		public IniciarTareaContext iniciarTarea() {
			return getRuleContext(IniciarTareaContext.class,0);
		}
		public FinalizarTareaContext finalizarTarea() {
			return getRuleContext(FinalizarTareaContext.class,0);
		}
		public Girar_sentido_contrarioContext girar_sentido_contrario() {
			return getRuleContext(Girar_sentido_contrarioContext.class,0);
		}
		public IrOrigenContext irOrigen() {
			return getRuleContext(IrOrigenContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public If_sentenciaContext if_sentencia() {
			return getRuleContext(If_sentenciaContext.class,0);
		}
		public Bucle_whileContext bucle_while() {
			return getRuleContext(Bucle_whileContext.class,0);
		}
		public Expr_aritmeticasContext expr_aritmeticas() {
			return getRuleContext(Expr_aritmeticasContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencia);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				avanzar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				girar();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				girar_izquierda();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				girar_derecha();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
				frenar();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(60);
				retroceder();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(61);
				mostrar();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(62);
				irA();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(63);
				ajustar_velocidad();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(64);
				iniciarTarea();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(65);
				finalizarTarea();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(66);
				girar_sentido_contrario();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(67);
				irOrigen();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(68);
				asignacion();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(69);
				if_sentencia();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(70);
				bucle_while();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(71);
				expr_aritmeticas(0);
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
	public static class AvanzarContext extends ParserRuleContext {
		public List<Expr_aritmeticasContext> expr_aritmeticas() {
			return getRuleContexts(Expr_aritmeticasContext.class);
		}
		public Expr_aritmeticasContext expr_aritmeticas(int i) {
			return getRuleContext(Expr_aritmeticasContext.class,i);
		}
		public TerminalNode AVANZAR() { return getToken(PLATAParser.AVANZAR, 0); }
		public TerminalNode ADVANCE() { return getToken(PLATAParser.ADVANCE, 0); }
		public AvanzarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avanzar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitAvanzar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AvanzarContext avanzar() throws RecognitionException {
		AvanzarContext _localctx = new AvanzarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_avanzar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_la = _input.LA(1);
			if ( !(_la==AVANZAR || _la==ADVANCE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(75);
			match(T__0);
			setState(76);
			expr_aritmeticas(0);
			setState(77);
			match(T__1);
			setState(78);
			expr_aritmeticas(0);
			setState(79);
			match(T__2);
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
	public static class Ajustar_velocidadContext extends ParserRuleContext {
		public Expr_aritmeticasContext expr_aritmeticas() {
			return getRuleContext(Expr_aritmeticasContext.class,0);
		}
		public TerminalNode AJUSTAR_VELOCIDAD() { return getToken(PLATAParser.AJUSTAR_VELOCIDAD, 0); }
		public TerminalNode SET_SPEED() { return getToken(PLATAParser.SET_SPEED, 0); }
		public Ajustar_velocidadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ajustar_velocidad; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitAjustar_velocidad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ajustar_velocidadContext ajustar_velocidad() throws RecognitionException {
		Ajustar_velocidadContext _localctx = new Ajustar_velocidadContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ajustar_velocidad);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_la = _input.LA(1);
			if ( !(_la==AJUSTAR_VELOCIDAD || _la==SET_SPEED) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(82);
			match(T__0);
			setState(83);
			expr_aritmeticas(0);
			setState(84);
			match(T__2);
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
	public static class RetrocederContext extends ParserRuleContext {
		public List<Expr_aritmeticasContext> expr_aritmeticas() {
			return getRuleContexts(Expr_aritmeticasContext.class);
		}
		public Expr_aritmeticasContext expr_aritmeticas(int i) {
			return getRuleContext(Expr_aritmeticasContext.class,i);
		}
		public TerminalNode RETROCEDER() { return getToken(PLATAParser.RETROCEDER, 0); }
		public TerminalNode REVERSE() { return getToken(PLATAParser.REVERSE, 0); }
		public RetrocederContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retroceder; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitRetroceder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetrocederContext retroceder() throws RecognitionException {
		RetrocederContext _localctx = new RetrocederContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_retroceder);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !(_la==RETROCEDER || _la==REVERSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(87);
			match(T__0);
			setState(88);
			expr_aritmeticas(0);
			setState(89);
			match(T__1);
			setState(90);
			expr_aritmeticas(0);
			setState(91);
			match(T__2);
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
	public static class FrenarContext extends ParserRuleContext {
		public TerminalNode FRENAR() { return getToken(PLATAParser.FRENAR, 0); }
		public TerminalNode BRAKE() { return getToken(PLATAParser.BRAKE, 0); }
		public FrenarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frenar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitFrenar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrenarContext frenar() throws RecognitionException {
		FrenarContext _localctx = new FrenarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_frenar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !(_la==FRENAR || _la==BRAKE) ) {
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
	public static class IrAContext extends ParserRuleContext {
		public List<Expr_aritmeticasContext> expr_aritmeticas() {
			return getRuleContexts(Expr_aritmeticasContext.class);
		}
		public Expr_aritmeticasContext expr_aritmeticas(int i) {
			return getRuleContext(Expr_aritmeticasContext.class,i);
		}
		public TerminalNode IR_A() { return getToken(PLATAParser.IR_A, 0); }
		public TerminalNode GO_TO() { return getToken(PLATAParser.GO_TO, 0); }
		public IrAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_irA; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitIrA(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IrAContext irA() throws RecognitionException {
		IrAContext _localctx = new IrAContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_irA);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_la = _input.LA(1);
			if ( !(_la==IR_A || _la==GO_TO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(96);
			match(T__0);
			setState(97);
			expr_aritmeticas(0);
			setState(98);
			match(T__1);
			setState(99);
			expr_aritmeticas(0);
			setState(100);
			match(T__1);
			setState(101);
			expr_aritmeticas(0);
			setState(102);
			match(T__2);
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
	public static class IrOrigenContext extends ParserRuleContext {
		public TerminalNode IR_ORIGEN() { return getToken(PLATAParser.IR_ORIGEN, 0); }
		public TerminalNode GO_TO_ORIGIN() { return getToken(PLATAParser.GO_TO_ORIGIN, 0); }
		public IrOrigenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_irOrigen; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitIrOrigen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IrOrigenContext irOrigen() throws RecognitionException {
		IrOrigenContext _localctx = new IrOrigenContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_irOrigen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_la = _input.LA(1);
			if ( !(_la==IR_ORIGEN || _la==GO_TO_ORIGIN) ) {
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
	public static class GirarContext extends ParserRuleContext {
		public Expr_aritmeticasContext expr_aritmeticas() {
			return getRuleContext(Expr_aritmeticasContext.class,0);
		}
		public TerminalNode GIRAR() { return getToken(PLATAParser.GIRAR, 0); }
		public TerminalNode TURN() { return getToken(PLATAParser.TURN, 0); }
		public GirarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_girar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitGirar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GirarContext girar() throws RecognitionException {
		GirarContext _localctx = new GirarContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_girar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_la = _input.LA(1);
			if ( !(_la==GIRAR || _la==TURN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(107);
			match(T__0);
			setState(108);
			expr_aritmeticas(0);
			setState(109);
			match(T__2);
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
	public static class Girar_derechaContext extends ParserRuleContext {
		public TerminalNode GIRAR_DERECHA() { return getToken(PLATAParser.GIRAR_DERECHA, 0); }
		public TerminalNode TURN_RIGHT() { return getToken(PLATAParser.TURN_RIGHT, 0); }
		public Girar_derechaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_girar_derecha; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitGirar_derecha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Girar_derechaContext girar_derecha() throws RecognitionException {
		Girar_derechaContext _localctx = new Girar_derechaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_girar_derecha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_la = _input.LA(1);
			if ( !(_la==GIRAR_DERECHA || _la==TURN_RIGHT) ) {
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
	public static class Girar_izquierdaContext extends ParserRuleContext {
		public TerminalNode GIRAR_IZQUIERDA() { return getToken(PLATAParser.GIRAR_IZQUIERDA, 0); }
		public TerminalNode TURN_LEFT() { return getToken(PLATAParser.TURN_LEFT, 0); }
		public Girar_izquierdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_girar_izquierda; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitGirar_izquierda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Girar_izquierdaContext girar_izquierda() throws RecognitionException {
		Girar_izquierdaContext _localctx = new Girar_izquierdaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_girar_izquierda);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_la = _input.LA(1);
			if ( !(_la==GIRAR_IZQUIERDA || _la==TURN_LEFT) ) {
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
	public static class Girar_sentido_contrarioContext extends ParserRuleContext {
		public TerminalNode GIRAR_SENTIDO_CONTRARIO() { return getToken(PLATAParser.GIRAR_SENTIDO_CONTRARIO, 0); }
		public TerminalNode TURN_OPPOSITE_DIRECTION() { return getToken(PLATAParser.TURN_OPPOSITE_DIRECTION, 0); }
		public Girar_sentido_contrarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_girar_sentido_contrario; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitGirar_sentido_contrario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Girar_sentido_contrarioContext girar_sentido_contrario() throws RecognitionException {
		Girar_sentido_contrarioContext _localctx = new Girar_sentido_contrarioContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_girar_sentido_contrario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_la = _input.LA(1);
			if ( !(_la==GIRAR_SENTIDO_CONTRARIO || _la==TURN_OPPOSITE_DIRECTION) ) {
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
	public static class IniciarTareaContext extends ParserRuleContext {
		public Expr_aritmeticasContext expr_aritmeticas() {
			return getRuleContext(Expr_aritmeticasContext.class,0);
		}
		public TerminalNode INICIAR_TAREA() { return getToken(PLATAParser.INICIAR_TAREA, 0); }
		public TerminalNode STAR_TASK() { return getToken(PLATAParser.STAR_TASK, 0); }
		public IniciarTareaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iniciarTarea; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitIniciarTarea(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IniciarTareaContext iniciarTarea() throws RecognitionException {
		IniciarTareaContext _localctx = new IniciarTareaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_iniciarTarea);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if ( !(_la==INICIAR_TAREA || _la==STAR_TASK) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(118);
			match(T__0);
			setState(119);
			expr_aritmeticas(0);
			setState(120);
			match(T__2);
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
	public static class FinalizarTareaContext extends ParserRuleContext {
		public Expr_aritmeticasContext expr_aritmeticas() {
			return getRuleContext(Expr_aritmeticasContext.class,0);
		}
		public TerminalNode FINALIZAR_TAREA() { return getToken(PLATAParser.FINALIZAR_TAREA, 0); }
		public TerminalNode FINISH_TASK() { return getToken(PLATAParser.FINISH_TASK, 0); }
		public FinalizarTareaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalizarTarea; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitFinalizarTarea(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinalizarTareaContext finalizarTarea() throws RecognitionException {
		FinalizarTareaContext _localctx = new FinalizarTareaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_finalizarTarea);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if ( !(_la==FINALIZAR_TAREA || _la==FINISH_TASK) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(123);
			match(T__0);
			setState(124);
			expr_aritmeticas(0);
			setState(125);
			match(T__2);
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
	public static class MostrarContext extends ParserRuleContext {
		public AtomicoContext atomico() {
			return getRuleContext(AtomicoContext.class,0);
		}
		public TerminalNode MOSTRAR() { return getToken(PLATAParser.MOSTRAR, 0); }
		public TerminalNode SHOW() { return getToken(PLATAParser.SHOW, 0); }
		public MostrarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mostrar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitMostrar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MostrarContext mostrar() throws RecognitionException {
		MostrarContext _localctx = new MostrarContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mostrar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if ( !(_la==MOSTRAR || _la==SHOW) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(128);
			match(T__0);
			setState(129);
			atomico();
			setState(130);
			match(T__2);
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
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PLATAParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(ID);
			setState(133);
			match(T__3);
			setState(134);
			expr();
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
	public static class If_sentenciaContext extends ParserRuleContext {
		public List<Expr_logicaContext> expr_logica() {
			return getRuleContexts(Expr_logicaContext.class);
		}
		public Expr_logicaContext expr_logica(int i) {
			return getRuleContext(Expr_logicaContext.class,i);
		}
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public TerminalNode SI() { return getToken(PLATAParser.SI, 0); }
		public TerminalNode IF() { return getToken(PLATAParser.IF, 0); }
		public List<TerminalNode> SI_NO_SI() { return getTokens(PLATAParser.SI_NO_SI); }
		public TerminalNode SI_NO_SI(int i) {
			return getToken(PLATAParser.SI_NO_SI, i);
		}
		public List<TerminalNode> ELSE_IF() { return getTokens(PLATAParser.ELSE_IF); }
		public TerminalNode ELSE_IF(int i) {
			return getToken(PLATAParser.ELSE_IF, i);
		}
		public TerminalNode SI_NO() { return getToken(PLATAParser.SI_NO, 0); }
		public TerminalNode ELSE() { return getToken(PLATAParser.ELSE, 0); }
		public If_sentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_sentencia; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitIf_sentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_sentenciaContext if_sentencia() throws RecognitionException {
		If_sentenciaContext _localctx = new If_sentenciaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_if_sentencia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_la = _input.LA(1);
			if ( !(_la==SI || _la==IF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(137);
			match(T__0);
			setState(138);
			expr_logica(0);
			setState(139);
			match(T__2);
			setState(140);
			bloque();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SI_NO_SI || _la==ELSE_IF) {
				{
				{
				setState(141);
				_la = _input.LA(1);
				if ( !(_la==SI_NO_SI || _la==ELSE_IF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(142);
				match(T__0);
				setState(143);
				expr_logica(0);
				setState(144);
				match(T__2);
				setState(145);
				bloque();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SI_NO || _la==ELSE) {
				{
				setState(152);
				_la = _input.LA(1);
				if ( !(_la==SI_NO || _la==ELSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(153);
				bloque();
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
	public static class Bucle_whileContext extends ParserRuleContext {
		public Expr_logicaContext expr_logica() {
			return getRuleContext(Expr_logicaContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode MIENTRAS() { return getToken(PLATAParser.MIENTRAS, 0); }
		public TerminalNode WHILE() { return getToken(PLATAParser.WHILE, 0); }
		public Bucle_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucle_while; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitBucle_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bucle_whileContext bucle_while() throws RecognitionException {
		Bucle_whileContext _localctx = new Bucle_whileContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bucle_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_la = _input.LA(1);
			if ( !(_la==MIENTRAS || _la==WHILE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(157);
			match(T__0);
			setState(158);
			expr_logica(0);
			setState(159);
			match(T__2);
			setState(160);
			bloque();
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
	public static class BloqueContext extends ParserRuleContext {
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__4);
			setState(164); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(163);
				sentencia();
				}
				}
				setState(166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & -1152819550673174591L) != 0) );
			setState(168);
			match(T__5);
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
	public static class ExprContext extends ParserRuleContext {
		public Expr_aritmeticasContext expr_aritmeticas() {
			return getRuleContext(Expr_aritmeticasContext.class,0);
		}
		public Expr_relacionalesContext expr_relacionales() {
			return getRuleContext(Expr_relacionalesContext.class,0);
		}
		public Expr_logicaContext expr_logica() {
			return getRuleContext(Expr_logicaContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr);
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				expr_aritmeticas(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				expr_relacionales();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				expr_logica(0);
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
	public static class Expr_aritmeticasContext extends ParserRuleContext {
		public Expr_aritmeticasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_aritmeticas; }
	 
		public Expr_aritmeticasContext() { }
		public void copyFrom(Expr_aritmeticasContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicacionExprAritmeticaContext extends Expr_aritmeticasContext {
		public Token op;
		public List<Expr_aritmeticasContext> expr_aritmeticas() {
			return getRuleContexts(Expr_aritmeticasContext.class);
		}
		public Expr_aritmeticasContext expr_aritmeticas(int i) {
			return getRuleContext(Expr_aritmeticasContext.class,i);
		}
		public TerminalNode MULTIPLICACION() { return getToken(PLATAParser.MULTIPLICACION, 0); }
		public TerminalNode DIVISION() { return getToken(PLATAParser.DIVISION, 0); }
		public TerminalNode MODULO() { return getToken(PLATAParser.MODULO, 0); }
		public MultiplicacionExprAritmeticaContext(Expr_aritmeticasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitMultiplicacionExprAritmetica(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SumaExprAritmeticaContext extends Expr_aritmeticasContext {
		public Token op;
		public List<Expr_aritmeticasContext> expr_aritmeticas() {
			return getRuleContexts(Expr_aritmeticasContext.class);
		}
		public Expr_aritmeticasContext expr_aritmeticas(int i) {
			return getRuleContext(Expr_aritmeticasContext.class,i);
		}
		public TerminalNode SUMA() { return getToken(PLATAParser.SUMA, 0); }
		public TerminalNode MENOS() { return getToken(PLATAParser.MENOS, 0); }
		public SumaExprAritmeticaContext(Expr_aritmeticasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitSumaExprAritmetica(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MenosExprAritmeticaContext extends Expr_aritmeticasContext {
		public TerminalNode MENOS() { return getToken(PLATAParser.MENOS, 0); }
		public Expr_aritmeticasContext expr_aritmeticas() {
			return getRuleContext(Expr_aritmeticasContext.class,0);
		}
		public MenosExprAritmeticaContext(Expr_aritmeticasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitMenosExprAritmetica(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomicoExprAritmeticaContext extends Expr_aritmeticasContext {
		public AtomicoContext atomico() {
			return getRuleContext(AtomicoContext.class,0);
		}
		public AtomicoExprAritmeticaContext(Expr_aritmeticasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitAtomicoExprAritmetica(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParentesisExprAritmeticaContext extends Expr_aritmeticasContext {
		public Expr_aritmeticasContext expr_aritmeticas() {
			return getRuleContext(Expr_aritmeticasContext.class,0);
		}
		public ParentesisExprAritmeticaContext(Expr_aritmeticasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitParentesisExprAritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_aritmeticasContext expr_aritmeticas() throws RecognitionException {
		return expr_aritmeticas(0);
	}

	private Expr_aritmeticasContext expr_aritmeticas(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_aritmeticasContext _localctx = new Expr_aritmeticasContext(_ctx, _parentState);
		Expr_aritmeticasContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expr_aritmeticas, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MENOS:
				{
				_localctx = new MenosExprAritmeticaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(176);
				match(MENOS);
				setState(177);
				expr_aritmeticas(5);
				}
				break;
			case VERDAD:
			case FALSO:
			case TRUE:
			case FALSE:
			case INT:
			case FLOAT:
			case STRING:
			case ID:
				{
				_localctx = new AtomicoExprAritmeticaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				atomico();
				}
				break;
			case T__0:
				{
				_localctx = new ParentesisExprAritmeticaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179);
				match(T__0);
				setState(180);
				expr_aritmeticas(0);
				setState(181);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(191);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicacionExprAritmeticaContext(new Expr_aritmeticasContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_aritmeticas);
						setState(185);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(186);
						((MultiplicacionExprAritmeticaContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970324836974592L) != 0)) ) {
							((MultiplicacionExprAritmeticaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(187);
						expr_aritmeticas(5);
						}
						break;
					case 2:
						{
						_localctx = new SumaExprAritmeticaContext(new Expr_aritmeticasContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_aritmeticas);
						setState(188);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(189);
						((SumaExprAritmeticaContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MENOS || _la==SUMA) ) {
							((SumaExprAritmeticaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(190);
						expr_aritmeticas(4);
						}
						break;
					}
					} 
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
	public static class Expr_relacionalesContext extends ParserRuleContext {
		public Expr_relacionalesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_relacionales; }
	 
		public Expr_relacionalesContext() { }
		public void copyFrom(Expr_relacionalesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelacionesExprRelacionalesContext extends Expr_relacionalesContext {
		public Token op;
		public List<Expr_aritmeticasContext> expr_aritmeticas() {
			return getRuleContexts(Expr_aritmeticasContext.class);
		}
		public Expr_aritmeticasContext expr_aritmeticas(int i) {
			return getRuleContext(Expr_aritmeticasContext.class,i);
		}
		public TerminalNode MAYOR_IGUAL() { return getToken(PLATAParser.MAYOR_IGUAL, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(PLATAParser.MENOR_IGUAL, 0); }
		public TerminalNode MENOR() { return getToken(PLATAParser.MENOR, 0); }
		public TerminalNode MAYOR() { return getToken(PLATAParser.MAYOR, 0); }
		public RelacionesExprRelacionalesContext(Expr_relacionalesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitRelacionesExprRelacionales(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParentesisExprRelacionalesContext extends Expr_relacionalesContext {
		public Expr_relacionalesContext expr_relacionales() {
			return getRuleContext(Expr_relacionalesContext.class,0);
		}
		public ParentesisExprRelacionalesContext(Expr_relacionalesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitParentesisExprRelacionales(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IgualdadesExprRelacionalesContext extends Expr_relacionalesContext {
		public Token op;
		public List<Expr_aritmeticasContext> expr_aritmeticas() {
			return getRuleContexts(Expr_aritmeticasContext.class);
		}
		public Expr_aritmeticasContext expr_aritmeticas(int i) {
			return getRuleContext(Expr_aritmeticasContext.class,i);
		}
		public TerminalNode IGUAL_QUE() { return getToken(PLATAParser.IGUAL_QUE, 0); }
		public TerminalNode DISTINTO() { return getToken(PLATAParser.DISTINTO, 0); }
		public IgualdadesExprRelacionalesContext(Expr_relacionalesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitIgualdadesExprRelacionales(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_relacionalesContext expr_relacionales() throws RecognitionException {
		Expr_relacionalesContext _localctx = new Expr_relacionalesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expr_relacionales);
		int _la;
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new RelacionesExprRelacionalesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				expr_aritmeticas(0);
				setState(197);
				((RelacionesExprRelacionalesContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 67553994410557440L) != 0)) ) {
					((RelacionesExprRelacionalesContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(198);
				expr_aritmeticas(0);
				}
				break;
			case 2:
				_localctx = new IgualdadesExprRelacionalesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				expr_aritmeticas(0);
				setState(201);
				((IgualdadesExprRelacionalesContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DISTINTO || _la==IGUAL_QUE) ) {
					((IgualdadesExprRelacionalesContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(202);
				expr_aritmeticas(0);
				}
				break;
			case 3:
				_localctx = new ParentesisExprRelacionalesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				match(T__0);
				setState(205);
				expr_relacionales();
				setState(206);
				match(T__2);
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
	public static class Expr_logicaContext extends ParserRuleContext {
		public Expr_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_logica; }
	 
		public Expr_logicaContext() { }
		public void copyFrom(Expr_logicaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicaExprRelacionalesContext extends Expr_logicaContext {
		public Expr_relacionalesContext expr_relacionales() {
			return getRuleContext(Expr_relacionalesContext.class,0);
		}
		public LogicaExprRelacionalesContext(Expr_logicaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitLogicaExprRelacionales(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ORExprLogicaContext extends Expr_logicaContext {
		public List<Expr_logicaContext> expr_logica() {
			return getRuleContexts(Expr_logicaContext.class);
		}
		public Expr_logicaContext expr_logica(int i) {
			return getRuleContext(Expr_logicaContext.class,i);
		}
		public TerminalNode OR() { return getToken(PLATAParser.OR, 0); }
		public ORExprLogicaContext(Expr_logicaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitORExprLogica(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolExprLogicaContext extends Expr_logicaContext {
		public TerminalNode VERDAD() { return getToken(PLATAParser.VERDAD, 0); }
		public TerminalNode TRUE() { return getToken(PLATAParser.TRUE, 0); }
		public TerminalNode FALSO() { return getToken(PLATAParser.FALSO, 0); }
		public TerminalNode FALSE() { return getToken(PLATAParser.FALSE, 0); }
		public BoolExprLogicaContext(Expr_logicaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitBoolExprLogica(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdExprLogicaContext extends Expr_logicaContext {
		public TerminalNode ID() { return getToken(PLATAParser.ID, 0); }
		public IdExprLogicaContext(Expr_logicaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitIdExprLogica(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParentesisExprLogicaContext extends Expr_logicaContext {
		public Expr_logicaContext expr_logica() {
			return getRuleContext(Expr_logicaContext.class,0);
		}
		public ParentesisExprLogicaContext(Expr_logicaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitParentesisExprLogica(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExprLogicaContext extends Expr_logicaContext {
		public List<Expr_logicaContext> expr_logica() {
			return getRuleContexts(Expr_logicaContext.class);
		}
		public Expr_logicaContext expr_logica(int i) {
			return getRuleContext(Expr_logicaContext.class,i);
		}
		public TerminalNode AND() { return getToken(PLATAParser.AND, 0); }
		public AndExprLogicaContext(Expr_logicaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitAndExprLogica(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExprContext extends Expr_logicaContext {
		public TerminalNode NOT() { return getToken(PLATAParser.NOT, 0); }
		public Expr_logicaContext expr_logica() {
			return getRuleContext(Expr_logicaContext.class,0);
		}
		public NotExprContext(Expr_logicaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_logicaContext expr_logica() throws RecognitionException {
		return expr_logica(0);
	}

	private Expr_logicaContext expr_logica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_logicaContext _localctx = new Expr_logicaContext(_ctx, _parentState);
		Expr_logicaContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expr_logica, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(211);
				match(NOT);
				setState(212);
				expr_logica(7);
				}
				break;
			case 2:
				{
				_localctx = new LogicaExprRelacionalesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(213);
				expr_relacionales();
				}
				break;
			case 3:
				{
				_localctx = new BoolExprLogicaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(216);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VERDAD:
				case TRUE:
					{
					setState(214);
					_la = _input.LA(1);
					if ( !(_la==VERDAD || _la==TRUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case FALSO:
				case FALSE:
					{
					setState(215);
					_la = _input.LA(1);
					if ( !(_la==FALSO || _la==FALSE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				{
				_localctx = new IdExprLogicaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new ParentesisExprLogicaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				match(T__0);
				setState(220);
				expr_logica(0);
				setState(221);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(231);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new AndExprLogicaContext(new Expr_logicaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_logica);
						setState(225);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(226);
						match(AND);
						setState(227);
						expr_logica(7);
						}
						break;
					case 2:
						{
						_localctx = new ORExprLogicaContext(new Expr_logicaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_logica);
						setState(228);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(229);
						match(OR);
						setState(230);
						expr_logica(6);
						}
						break;
					}
					} 
				}
				setState(235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
	public static class AtomicoContext extends ParserRuleContext {
		public AtomicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomico; }
	 
		public AtomicoContext() { }
		public void copyFrom(AtomicoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumeroAtomicoContext extends AtomicoContext {
		public TerminalNode INT() { return getToken(PLATAParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(PLATAParser.FLOAT, 0); }
		public NumeroAtomicoContext(AtomicoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitNumeroAtomico(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanAtomicoContext extends AtomicoContext {
		public TerminalNode VERDAD() { return getToken(PLATAParser.VERDAD, 0); }
		public TerminalNode TRUE() { return getToken(PLATAParser.TRUE, 0); }
		public TerminalNode FALSO() { return getToken(PLATAParser.FALSO, 0); }
		public TerminalNode FALSE() { return getToken(PLATAParser.FALSE, 0); }
		public BooleanAtomicoContext(AtomicoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitBooleanAtomico(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdAtomicoContext extends AtomicoContext {
		public TerminalNode ID() { return getToken(PLATAParser.ID, 0); }
		public IdAtomicoContext(AtomicoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitIdAtomico(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringAtomicoContext extends AtomicoContext {
		public TerminalNode STRING() { return getToken(PLATAParser.STRING, 0); }
		public StringAtomicoContext(AtomicoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitStringAtomico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomicoContext atomico() throws RecognitionException {
		AtomicoContext _localctx = new AtomicoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_atomico);
		int _la;
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
				_localctx = new NumeroAtomicoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case VERDAD:
			case FALSO:
			case TRUE:
			case FALSE:
				_localctx = new BooleanAtomicoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VERDAD:
				case TRUE:
					{
					setState(237);
					_la = _input.LA(1);
					if ( !(_la==VERDAD || _la==TRUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case FALSO:
				case FALSE:
					{
					setState(238);
					_la = _input.LA(1);
					if ( !(_la==FALSO || _la==FALSE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case ID:
				_localctx = new IdAtomicoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				match(ID);
				}
				break;
			case STRING:
				_localctx = new StringAtomicoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				match(STRING);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return expr_aritmeticas_sempred((Expr_aritmeticasContext)_localctx, predIndex);
		case 22:
			return expr_logica_sempred((Expr_logicaContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_aritmeticas_sempred(Expr_aritmeticasContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expr_logica_sempred(Expr_logicaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001C\u00f6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0004\u0000"+
		"2\b\u0000\u000b\u0000\f\u00003\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001I\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u0094\b\u0010\n\u0010\f\u0010\u0097\t\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u009b\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0004\u0012\u00a5"+
		"\b\u0012\u000b\u0012\f\u0012\u00a6\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u00ae\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u00b8\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0005\u0014\u00c0\b\u0014\n\u0014\f\u0014\u00c3"+
		"\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u00d1\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00d9\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00e0\b\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u00e8\b\u0016\n\u0016\f\u0016\u00eb\t\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u00f0\b\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u00f4\b\u0017\u0001\u0017\u0000\u0002(,\u0018\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"\u0000\u0018\u0002\u0000\u0007\u0007\u0014\u0014\u0002\u0000\b\b\u0015"+
		"\u0015\u0002\u0000\t\t\u0016\u0016\u0002\u0000\n\n\u0017\u0017\u0002\u0000"+
		"\u000b\u000b\u0018\u0018\u0002\u0000\f\f\u0019\u0019\u0002\u0000\r\r\u001a"+
		"\u001a\u0002\u0000\u000e\u000e\u001b\u001b\u0002\u0000\u000f\u000f\u001c"+
		"\u001c\u0002\u0000\u0010\u0010\u001d\u001d\u0002\u0000\u0011\u0011\u001e"+
		"\u001e\u0002\u0000\u0012\u0012\u001f\u001f\u0002\u0000\u0013\u0013  \u0002"+
		"\u0000$$++\u0002\u0000\"\"))\u0002\u0000##**\u0002\u0000!!((\u0001\u0000"+
		"02\u0002\u0000//33\u0001\u000047\u0001\u000089\u0002\u0000%%,,\u0002\u0000"+
		"&&--\u0001\u0000=>\u0104\u00001\u0001\u0000\u0000\u0000\u0002H\u0001\u0000"+
		"\u0000\u0000\u0004J\u0001\u0000\u0000\u0000\u0006Q\u0001\u0000\u0000\u0000"+
		"\bV\u0001\u0000\u0000\u0000\n]\u0001\u0000\u0000\u0000\f_\u0001\u0000"+
		"\u0000\u0000\u000eh\u0001\u0000\u0000\u0000\u0010j\u0001\u0000\u0000\u0000"+
		"\u0012o\u0001\u0000\u0000\u0000\u0014q\u0001\u0000\u0000\u0000\u0016s"+
		"\u0001\u0000\u0000\u0000\u0018u\u0001\u0000\u0000\u0000\u001az\u0001\u0000"+
		"\u0000\u0000\u001c\u007f\u0001\u0000\u0000\u0000\u001e\u0084\u0001\u0000"+
		"\u0000\u0000 \u0088\u0001\u0000\u0000\u0000\"\u009c\u0001\u0000\u0000"+
		"\u0000$\u00a2\u0001\u0000\u0000\u0000&\u00ad\u0001\u0000\u0000\u0000("+
		"\u00b7\u0001\u0000\u0000\u0000*\u00d0\u0001\u0000\u0000\u0000,\u00df\u0001"+
		"\u0000\u0000\u0000.\u00f3\u0001\u0000\u0000\u000002\u0003\u0002\u0001"+
		"\u000010\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000031\u0001\u0000"+
		"\u0000\u000034\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000056\u0005"+
		"\u0000\u0000\u00016\u0001\u0001\u0000\u0000\u00007I\u0003\u0004\u0002"+
		"\u00008I\u0003\u0010\b\u00009I\u0003\u0014\n\u0000:I\u0003\u0012\t\u0000"+
		";I\u0003\n\u0005\u0000<I\u0003\b\u0004\u0000=I\u0003\u001c\u000e\u0000"+
		">I\u0003\f\u0006\u0000?I\u0003\u0006\u0003\u0000@I\u0003\u0018\f\u0000"+
		"AI\u0003\u001a\r\u0000BI\u0003\u0016\u000b\u0000CI\u0003\u000e\u0007\u0000"+
		"DI\u0003\u001e\u000f\u0000EI\u0003 \u0010\u0000FI\u0003\"\u0011\u0000"+
		"GI\u0003(\u0014\u0000H7\u0001\u0000\u0000\u0000H8\u0001\u0000\u0000\u0000"+
		"H9\u0001\u0000\u0000\u0000H:\u0001\u0000\u0000\u0000H;\u0001\u0000\u0000"+
		"\u0000H<\u0001\u0000\u0000\u0000H=\u0001\u0000\u0000\u0000H>\u0001\u0000"+
		"\u0000\u0000H?\u0001\u0000\u0000\u0000H@\u0001\u0000\u0000\u0000HA\u0001"+
		"\u0000\u0000\u0000HB\u0001\u0000\u0000\u0000HC\u0001\u0000\u0000\u0000"+
		"HD\u0001\u0000\u0000\u0000HE\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000"+
		"\u0000HG\u0001\u0000\u0000\u0000I\u0003\u0001\u0000\u0000\u0000JK\u0007"+
		"\u0000\u0000\u0000KL\u0005\u0001\u0000\u0000LM\u0003(\u0014\u0000MN\u0005"+
		"\u0002\u0000\u0000NO\u0003(\u0014\u0000OP\u0005\u0003\u0000\u0000P\u0005"+
		"\u0001\u0000\u0000\u0000QR\u0007\u0001\u0000\u0000RS\u0005\u0001\u0000"+
		"\u0000ST\u0003(\u0014\u0000TU\u0005\u0003\u0000\u0000U\u0007\u0001\u0000"+
		"\u0000\u0000VW\u0007\u0002\u0000\u0000WX\u0005\u0001\u0000\u0000XY\u0003"+
		"(\u0014\u0000YZ\u0005\u0002\u0000\u0000Z[\u0003(\u0014\u0000[\\\u0005"+
		"\u0003\u0000\u0000\\\t\u0001\u0000\u0000\u0000]^\u0007\u0003\u0000\u0000"+
		"^\u000b\u0001\u0000\u0000\u0000_`\u0007\u0004\u0000\u0000`a\u0005\u0001"+
		"\u0000\u0000ab\u0003(\u0014\u0000bc\u0005\u0002\u0000\u0000cd\u0003(\u0014"+
		"\u0000de\u0005\u0002\u0000\u0000ef\u0003(\u0014\u0000fg\u0005\u0003\u0000"+
		"\u0000g\r\u0001\u0000\u0000\u0000hi\u0007\u0005\u0000\u0000i\u000f\u0001"+
		"\u0000\u0000\u0000jk\u0007\u0006\u0000\u0000kl\u0005\u0001\u0000\u0000"+
		"lm\u0003(\u0014\u0000mn\u0005\u0003\u0000\u0000n\u0011\u0001\u0000\u0000"+
		"\u0000op\u0007\u0007\u0000\u0000p\u0013\u0001\u0000\u0000\u0000qr\u0007"+
		"\b\u0000\u0000r\u0015\u0001\u0000\u0000\u0000st\u0007\t\u0000\u0000t\u0017"+
		"\u0001\u0000\u0000\u0000uv\u0007\n\u0000\u0000vw\u0005\u0001\u0000\u0000"+
		"wx\u0003(\u0014\u0000xy\u0005\u0003\u0000\u0000y\u0019\u0001\u0000\u0000"+
		"\u0000z{\u0007\u000b\u0000\u0000{|\u0005\u0001\u0000\u0000|}\u0003(\u0014"+
		"\u0000}~\u0005\u0003\u0000\u0000~\u001b\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0007\f\u0000\u0000\u0080\u0081\u0005\u0001\u0000\u0000\u0081\u0082"+
		"\u0003.\u0017\u0000\u0082\u0083\u0005\u0003\u0000\u0000\u0083\u001d\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0005@\u0000\u0000\u0085\u0086\u0005\u0004"+
		"\u0000\u0000\u0086\u0087\u0003&\u0013\u0000\u0087\u001f\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0007\r\u0000\u0000\u0089\u008a\u0005\u0001\u0000\u0000"+
		"\u008a\u008b\u0003,\u0016\u0000\u008b\u008c\u0005\u0003\u0000\u0000\u008c"+
		"\u0095\u0003$\u0012\u0000\u008d\u008e\u0007\u000e\u0000\u0000\u008e\u008f"+
		"\u0005\u0001\u0000\u0000\u008f\u0090\u0003,\u0016\u0000\u0090\u0091\u0005"+
		"\u0003\u0000\u0000\u0091\u0092\u0003$\u0012\u0000\u0092\u0094\u0001\u0000"+
		"\u0000\u0000\u0093\u008d\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000"+
		"\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000"+
		"\u0000\u0000\u0096\u009a\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0007\u000f\u0000\u0000\u0099\u009b\u0003$\u0012"+
		"\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000"+
		"\u0000\u009b!\u0001\u0000\u0000\u0000\u009c\u009d\u0007\u0010\u0000\u0000"+
		"\u009d\u009e\u0005\u0001\u0000\u0000\u009e\u009f\u0003,\u0016\u0000\u009f"+
		"\u00a0\u0005\u0003\u0000\u0000\u00a0\u00a1\u0003$\u0012\u0000\u00a1#\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a4\u0005\u0005\u0000\u0000\u00a3\u00a5\u0003"+
		"\u0002\u0001\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005"+
		"\u0006\u0000\u0000\u00a9%\u0001\u0000\u0000\u0000\u00aa\u00ae\u0003(\u0014"+
		"\u0000\u00ab\u00ae\u0003*\u0015\u0000\u00ac\u00ae\u0003,\u0016\u0000\u00ad"+
		"\u00aa\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ae\'\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0006\u0014\uffff\uffff\u0000\u00b0\u00b1\u0005/\u0000\u0000\u00b1\u00b8"+
		"\u0003(\u0014\u0005\u00b2\u00b8\u0003.\u0017\u0000\u00b3\u00b4\u0005\u0001"+
		"\u0000\u0000\u00b4\u00b5\u0003(\u0014\u0000\u00b5\u00b6\u0005\u0003\u0000"+
		"\u0000\u00b6\u00b8\u0001\u0000\u0000\u0000\u00b7\u00af\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b2\u0001\u0000\u0000\u0000\u00b7\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b8\u00c1\u0001\u0000\u0000\u0000\u00b9\u00ba\n\u0004\u0000\u0000"+
		"\u00ba\u00bb\u0007\u0011\u0000\u0000\u00bb\u00c0\u0003(\u0014\u0005\u00bc"+
		"\u00bd\n\u0003\u0000\u0000\u00bd\u00be\u0007\u0012\u0000\u0000\u00be\u00c0"+
		"\u0003(\u0014\u0004\u00bf\u00b9\u0001\u0000\u0000\u0000\u00bf\u00bc\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2)\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c5\u0003(\u0014"+
		"\u0000\u00c5\u00c6\u0007\u0013\u0000\u0000\u00c6\u00c7\u0003(\u0014\u0000"+
		"\u00c7\u00d1\u0001\u0000\u0000\u0000\u00c8\u00c9\u0003(\u0014\u0000\u00c9"+
		"\u00ca\u0007\u0014\u0000\u0000\u00ca\u00cb\u0003(\u0014\u0000\u00cb\u00d1"+
		"\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\u0001\u0000\u0000\u00cd\u00ce"+
		"\u0003*\u0015\u0000\u00ce\u00cf\u0005\u0003\u0000\u0000\u00cf\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d0\u00c4\u0001\u0000\u0000\u0000\u00d0\u00c8\u0001"+
		"\u0000\u0000\u0000\u00d0\u00cc\u0001\u0000\u0000\u0000\u00d1+\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d3\u0006\u0016\uffff\uffff\u0000\u00d3\u00d4\u0005"+
		":\u0000\u0000\u00d4\u00e0\u0003,\u0016\u0007\u00d5\u00e0\u0003*\u0015"+
		"\u0000\u00d6\u00d9\u0007\u0015\u0000\u0000\u00d7\u00d9\u0007\u0016\u0000"+
		"\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d7\u0001\u0000\u0000"+
		"\u0000\u00d9\u00e0\u0001\u0000\u0000\u0000\u00da\u00e0\u0005@\u0000\u0000"+
		"\u00db\u00dc\u0005\u0001\u0000\u0000\u00dc\u00dd\u0003,\u0016\u0000\u00dd"+
		"\u00de\u0005\u0003\u0000\u0000\u00de\u00e0\u0001\u0000\u0000\u0000\u00df"+
		"\u00d2\u0001\u0000\u0000\u0000\u00df\u00d5\u0001\u0000\u0000\u0000\u00df"+
		"\u00d8\u0001\u0000\u0000\u0000\u00df\u00da\u0001\u0000\u0000\u0000\u00df"+
		"\u00db\u0001\u0000\u0000\u0000\u00e0\u00e9\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e2\n\u0006\u0000\u0000\u00e2\u00e3\u0005;\u0000\u0000\u00e3\u00e8"+
		"\u0003,\u0016\u0007\u00e4\u00e5\n\u0005\u0000\u0000\u00e5\u00e6\u0005"+
		"<\u0000\u0000\u00e6\u00e8\u0003,\u0016\u0006\u00e7\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e4\u0001\u0000\u0000\u0000\u00e8\u00eb\u0001\u0000\u0000"+
		"\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ea-\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000"+
		"\u00ec\u00f4\u0007\u0017\u0000\u0000\u00ed\u00f0\u0007\u0015\u0000\u0000"+
		"\u00ee\u00f0\u0007\u0016\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ef\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f4\u0005@\u0000\u0000\u00f2\u00f4\u0005?\u0000\u0000\u00f3\u00ec"+
		"\u0001\u0000\u0000\u0000\u00f3\u00ef\u0001\u0000\u0000\u0000\u00f3\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f4/\u0001"+
		"\u0000\u0000\u0000\u00103H\u0095\u009a\u00a6\u00ad\u00b7\u00bf\u00c1\u00d0"+
		"\u00d8\u00df\u00e7\u00e9\u00ef\u00f3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}