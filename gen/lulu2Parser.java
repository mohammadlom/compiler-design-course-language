// Generated from /home/mohammad_lom/IdeaProjects/compiler-design-course-language/src/lulu2.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lulu2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		OCONTROLLS=25, OBLOCK=26, INT=27, BOOL=28, FLOAT=29, LONG=30, DOUBLE=31, 
		STRING=32, CHAR=33, ALLOCATE=34, DEFAULT=35, THIS=36, DESTRUCT=37, IF=38, 
		TRUE=39, BREAK=40, READ=41, CASE=42, ELSE=43, RETURN=44, WHILE=45, FALSE=46, 
		NEW=47, SIZEOF=48, WRITE=49, CONST=50, FUNCTION=51, FOR=52, SWITCH=53, 
		CONTINUE=54, OF=55, NIL=56, SUPER=57, Int_const=58, ID=59, LETTER=60, 
		OptionalExponent=61, REAL_CONST=62, REAL_FACT=63, CHAR_CONST=64, ASCII=65, 
		Bool_const=66, String_const=67, GOTO=68, ARITHMETIC=69, RELATIONAL=70, 
		WS=71;
	public static final int
		RULE_program = 0, RULE_ft_dcl = 1, RULE_func_dcl = 2, RULE_args = 3, RULE_args_var = 4, 
		RULE_block = 5, RULE_stmt = 6, RULE_type = 7, RULE_type_dcl = 8, RULE_var_def = 9, 
		RULE_var_val = 10, RULE_list = 11, RULE_ft_def = 12, RULE_type_def = 13, 
		RULE_component = 14, RULE_access_modifier = 15, RULE_fun_def = 16, RULE_assign = 17, 
		RULE_np2 = 18, RULE_var = 19, RULE_ref = 20, RULE_expr = 21, RULE_fact = 22, 
		RULE_func_call = 23, RULE_params = 24, RULE_np = 25, RULE_cond_stmt = 26, 
		RULE_loop_stmt = 27, RULE_label = 28, RULE_const_val = 29, RULE_bit_unary_op = 30, 
		RULE_bit_binary_op = 31, RULE_binary_op = 32;
	public static final String[] ruleNames = {
		"program", "ft_dcl", "func_dcl", "args", "args_var", "block", "stmt", 
		"type", "type_dcl", "var_def", "var_val", "list", "ft_def", "type_def", 
		"component", "access_modifier", "fun_def", "assign", "np2", "var", "ref", 
		"expr", "fact", "func_call", "params", "np", "cond_stmt", "loop_stmt", 
		"label", "const_val", "bit_unary_op", "bit_binary_op", "binary_op"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'declare'", "'{'", "'}'", "'('", "')'", "'='", "';'", "'['", "']'", 
		"','", "':'", "'private'", "'public'", "'protected'", "'.'", "') of'", 
		"'-'", "'!'", "'~'", "'&'", "'|'", "'^'", "'||'", "'&&'", null, null, 
		"'int'", "'bool'", "'float'", "'long'", "'double'", "'string'", "'char'", 
		"'allocate'", "'default'", "'this'", "'destruct'", "'if'", "'true'", "'break'", 
		"'read'", "'case'", "'else'", "'return'", "'while'", "'false'", "'new'", 
		"'sizeof'", "'write'", "'const'", "'function'", "'for'", "'switch'", "'continue'", 
		"'of'", "'nil'", "'super'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "OCONTROLLS", "OBLOCK", "INT", "BOOL", "FLOAT", "LONG", "DOUBLE", 
		"STRING", "CHAR", "ALLOCATE", "DEFAULT", "THIS", "DESTRUCT", "IF", "TRUE", 
		"BREAK", "READ", "CASE", "ELSE", "RETURN", "WHILE", "FALSE", "NEW", "SIZEOF", 
		"WRITE", "CONST", "FUNCTION", "FOR", "SWITCH", "CONTINUE", "OF", "NIL", 
		"SUPER", "Int_const", "ID", "LETTER", "OptionalExponent", "REAL_CONST", 
		"REAL_FACT", "CHAR_CONST", "ASCII", "Bool_const", "String_const", "GOTO", 
		"ARITHMETIC", "RELATIONAL", "WS"
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

	@Override
	public String getGrammarFileName() { return "lulu2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public lulu2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Ft_dclContext ft_dcl() {
			return getRuleContext(Ft_dclContext.class,0);
		}
		public List<Ft_defContext> ft_def() {
			return getRuleContexts(Ft_defContext.class);
		}
		public Ft_defContext ft_def(int i) {
			return getRuleContext(Ft_defContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitProgram(this);
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
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(66);
				ft_dcl();
				}
			}

			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << LONG) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << FUNCTION) | (1L << ID))) != 0)) {
				{
				{
				setState(69);
				ft_def();
				}
				}
				setState(74);
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

	public static class Ft_dclContext extends ParserRuleContext {
		public List<Func_dclContext> func_dcl() {
			return getRuleContexts(Func_dclContext.class);
		}
		public Func_dclContext func_dcl(int i) {
			return getRuleContext(Func_dclContext.class,i);
		}
		public List<Type_dclContext> type_dcl() {
			return getRuleContexts(Type_dclContext.class);
		}
		public Type_dclContext type_dcl(int i) {
			return getRuleContext(Type_dclContext.class,i);
		}
		public List<Var_defContext> var_def() {
			return getRuleContexts(Var_defContext.class);
		}
		public Var_defContext var_def(int i) {
			return getRuleContext(Var_defContext.class,i);
		}
		public Ft_dclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ft_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterFt_dcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitFt_dcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitFt_dcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ft_dclContext ft_dcl() throws RecognitionException {
		Ft_dclContext _localctx = new Ft_dclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ft_dcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__0);
			setState(76);
			match(T__1);
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(80);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(77);
					func_dcl();
					}
					break;
				case 2:
					{
					setState(78);
					type_dcl();
					}
					break;
				case 3:
					{
					setState(79);
					var_def();
					}
					break;
				}
				}
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << LONG) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << CONST) | (1L << ID))) != 0) );
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

	public static class Func_dclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(lulu2Parser.ID, 0); }
		public List<ArgsContext> args() {
			return getRuleContexts(ArgsContext.class);
		}
		public ArgsContext args(int i) {
			return getRuleContext(ArgsContext.class,i);
		}
		public Args_varContext args_var() {
			return getRuleContext(Args_varContext.class,0);
		}
		public Func_dclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterFunc_dcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitFunc_dcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitFunc_dcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_dclContext func_dcl() throws RecognitionException {
		Func_dclContext _localctx = new Func_dclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_func_dcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(86);
				match(T__3);
				setState(87);
				args(0);
				setState(88);
				match(T__4);
				setState(89);
				match(T__5);
				}
			}

			setState(93);
			match(ID);
			setState(94);
			match(T__3);
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(95);
				args(0);
				}
				break;
			case 2:
				{
				setState(96);
				args_var(0);
				}
				break;
			}
			setState(99);
			match(T__4);
			setState(100);
			match(T__6);
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

	public static class ArgsContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		return args(0);
	}

	private ArgsContext args(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgsContext _localctx = new ArgsContext(_ctx, _parentState);
		ArgsContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_args, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(103);
			type();
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(104);
					match(T__7);
					setState(105);
					match(T__8);
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_args);
					setState(111);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(112);
					match(T__9);
					setState(113);
					type();
					setState(118);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(114);
							match(T__7);
							setState(115);
							match(T__8);
							}
							} 
						}
						setState(120);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					}
					}
					} 
				}
				setState(125);
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

	public static class Args_varContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(lulu2Parser.ID, 0); }
		public Args_varContext args_var() {
			return getRuleContext(Args_varContext.class,0);
		}
		public Args_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterArgs_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitArgs_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitArgs_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Args_varContext args_var() throws RecognitionException {
		return args_var(0);
	}

	private Args_varContext args_var(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Args_varContext _localctx = new Args_varContext(_ctx, _parentState);
		Args_varContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_args_var, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(127);
			type();
			setState(128);
			match(ID);
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(129);
					match(T__7);
					setState(130);
					match(T__8);
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Args_varContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_args_var);
					setState(136);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(137);
					match(T__9);
					setState(138);
					type();
					setState(139);
					match(ID);
					setState(144);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(140);
							match(T__7);
							setState(141);
							match(T__8);
							}
							} 
						}
						setState(146);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					}
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<Var_defContext> var_def() {
			return getRuleContexts(Var_defContext.class);
		}
		public Var_defContext var_def(int i) {
			return getRuleContext(Var_defContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__1);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << LONG) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << THIS) | (1L << DESTRUCT) | (1L << IF) | (1L << BREAK) | (1L << READ) | (1L << RETURN) | (1L << WHILE) | (1L << SIZEOF) | (1L << WRITE) | (1L << CONST) | (1L << FOR) | (1L << SWITCH) | (1L << CONTINUE) | (1L << NIL) | (1L << SUPER) | (1L << Int_const) | (1L << ID) | (1L << REAL_CONST))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CHAR_CONST - 64)) | (1L << (Bool_const - 64)) | (1L << (String_const - 64)) | (1L << (GOTO - 64)))) != 0)) {
				{
				setState(155);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(153);
					stmt();
					}
					break;
				case 2:
					{
					setState(154);
					var_def();
					}
					break;
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
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

	public static class StmtContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public Cond_stmtContext cond_stmt() {
			return getRuleContext(Cond_stmtContext.class,0);
		}
		public Loop_stmtContext loop_stmt() {
			return getRuleContext(Loop_stmtContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(lulu2Parser.RETURN, 0); }
		public TerminalNode GOTO() { return getToken(lulu2Parser.GOTO, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(lulu2Parser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(lulu2Parser.CONTINUE, 0); }
		public TerminalNode DESTRUCT() { return getToken(lulu2Parser.DESTRUCT, 0); }
		public TerminalNode ID() { return getToken(lulu2Parser.ID, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmt);
		int _la;
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				assign();
				setState(163);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				func_call();
				setState(166);
				match(T__6);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				cond_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				loop_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(170);
				match(RETURN);
				setState(171);
				match(T__6);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(172);
				match(GOTO);
				setState(173);
				match(T__6);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(174);
				label();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(175);
				expr();
				setState(176);
				match(T__6);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(178);
				match(BREAK);
				setState(179);
				match(T__6);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(180);
				match(CONTINUE);
				setState(181);
				match(T__6);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(182);
				match(DESTRUCT);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(183);
					match(T__7);
					setState(184);
					match(T__8);
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(190);
				match(ID);
				setState(191);
				match(T__6);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(lulu2Parser.INT, 0); }
		public TerminalNode BOOL() { return getToken(lulu2Parser.BOOL, 0); }
		public TerminalNode FLOAT() { return getToken(lulu2Parser.FLOAT, 0); }
		public TerminalNode LONG() { return getToken(lulu2Parser.LONG, 0); }
		public TerminalNode CHAR() { return getToken(lulu2Parser.CHAR, 0); }
		public TerminalNode DOUBLE() { return getToken(lulu2Parser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(lulu2Parser.STRING, 0); }
		public TerminalNode ID() { return getToken(lulu2Parser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << LONG) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << ID))) != 0)) ) {
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

	public static class Type_dclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(lulu2Parser.ID, 0); }
		public Type_dclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterType_dcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitType_dcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitType_dcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_dclContext type_dcl() throws RecognitionException {
		Type_dclContext _localctx = new Type_dclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type_dcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(ID);
			setState(197);
			match(T__6);
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

	public static class Var_defContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<Var_valContext> var_val() {
			return getRuleContexts(Var_valContext.class);
		}
		public Var_valContext var_val(int i) {
			return getRuleContext(Var_valContext.class,i);
		}
		public TerminalNode CONST() { return getToken(lulu2Parser.CONST, 0); }
		public Var_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterVar_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitVar_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitVar_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_defContext var_def() throws RecognitionException {
		Var_defContext _localctx = new Var_defContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_var_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(199);
				match(CONST);
				}
			}

			setState(202);
			type();
			setState(203);
			var_val();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(204);
				match(T__9);
				setState(205);
				var_val();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
			match(T__6);
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

	public static class Var_valContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(lulu2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(lulu2Parser.ID, i);
		}
		public List<TerminalNode> Int_const() { return getTokens(lulu2Parser.Int_const); }
		public TerminalNode Int_const(int i) {
			return getToken(lulu2Parser.Int_const, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode ALLOCATE() { return getToken(lulu2Parser.ALLOCATE, 0); }
		public Var_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterVar_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitVar_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitVar_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_valContext var_val() throws RecognitionException {
		Var_valContext _localctx = new Var_valContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(ID);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(214);
				match(T__7);
				setState(215);
				match(Int_const);
				setState(216);
				match(T__8);
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(222);
				match(T__5);
				setState(227);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
				case T__16:
				case T__17:
				case T__18:
				case THIS:
				case READ:
				case SIZEOF:
				case WRITE:
				case NIL:
				case SUPER:
				case Int_const:
				case ID:
				case REAL_CONST:
				case CHAR_CONST:
				case Bool_const:
				case String_const:
					{
					setState(223);
					expr();
					}
					break;
				case T__7:
					{
					setState(224);
					list();
					}
					break;
				case ALLOCATE:
					{
					setState(225);
					match(ALLOCATE);
					setState(226);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class ListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(T__7);
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__16:
			case T__17:
			case T__18:
			case THIS:
			case READ:
			case SIZEOF:
			case WRITE:
			case NIL:
			case SUPER:
			case Int_const:
			case ID:
			case REAL_CONST:
			case CHAR_CONST:
			case Bool_const:
			case String_const:
				{
				setState(232);
				expr();
				}
				break;
			case T__7:
				{
				setState(233);
				list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(236);
				match(T__9);
				setState(239);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
				case T__16:
				case T__17:
				case T__18:
				case THIS:
				case READ:
				case SIZEOF:
				case WRITE:
				case NIL:
				case SUPER:
				case Int_const:
				case ID:
				case REAL_CONST:
				case CHAR_CONST:
				case Bool_const:
				case String_const:
					{
					setState(237);
					expr();
					}
					break;
				case T__7:
					{
					setState(238);
					list();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(246);
			match(T__8);
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

	public static class Ft_defContext extends ParserRuleContext {
		public List<Type_defContext> type_def() {
			return getRuleContexts(Type_defContext.class);
		}
		public Type_defContext type_def(int i) {
			return getRuleContext(Type_defContext.class,i);
		}
		public List<Fun_defContext> fun_def() {
			return getRuleContexts(Fun_defContext.class);
		}
		public Fun_defContext fun_def(int i) {
			return getRuleContext(Fun_defContext.class,i);
		}
		public Ft_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ft_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterFt_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitFt_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitFt_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ft_defContext ft_def() throws RecognitionException {
		Ft_defContext _localctx = new Ft_defContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ft_def);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(250); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(250);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT:
					case BOOL:
					case FLOAT:
					case LONG:
					case DOUBLE:
					case STRING:
					case CHAR:
					case ID:
						{
						setState(248);
						type_def();
						}
						break;
					case T__3:
					case FUNCTION:
						{
						setState(249);
						fun_def();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(252); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Type_defContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(lulu2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(lulu2Parser.ID, i);
		}
		public List<ComponentContext> component() {
			return getRuleContexts(ComponentContext.class);
		}
		public ComponentContext component(int i) {
			return getRuleContext(ComponentContext.class,i);
		}
		public Type_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterType_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitType_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitType_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_defContext type_def() throws RecognitionException {
		Type_defContext _localctx = new Type_defContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_type_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			type();
			setState(255);
			match(ID);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(256);
				match(T__10);
				setState(257);
				match(ID);
				}
			}

			setState(260);
			match(T__1);
			setState(262); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(261);
				component();
				}
				}
				setState(264); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << LONG) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << CONST) | (1L << FUNCTION) | (1L << ID))) != 0) );
			setState(266);
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

	public static class ComponentContext extends ParserRuleContext {
		public Var_defContext var_def() {
			return getRuleContext(Var_defContext.class,0);
		}
		public Fun_defContext fun_def() {
			return getRuleContext(Fun_defContext.class,0);
		}
		public Access_modifierContext access_modifier() {
			return getRuleContext(Access_modifierContext.class,0);
		}
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_component);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) {
				{
				setState(268);
				access_modifier();
				}
			}

			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case FLOAT:
			case LONG:
			case DOUBLE:
			case STRING:
			case CHAR:
			case CONST:
			case ID:
				{
				setState(271);
				var_def();
				}
				break;
			case T__3:
			case FUNCTION:
				{
				setState(272);
				fun_def();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Access_modifierContext extends ParserRuleContext {
		public Access_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterAccess_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitAccess_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitAccess_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Access_modifierContext access_modifier() throws RecognitionException {
		Access_modifierContext _localctx = new Access_modifierContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_access_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
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

	public static class Fun_defContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(lulu2Parser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(lulu2Parser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<Args_varContext> args_var() {
			return getRuleContexts(Args_varContext.class);
		}
		public Args_varContext args_var(int i) {
			return getRuleContext(Args_varContext.class,i);
		}
		public Fun_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterFun_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitFun_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitFun_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fun_defContext fun_def() throws RecognitionException {
		Fun_defContext _localctx = new Fun_defContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fun_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(277);
				match(T__3);
				setState(278);
				args_var(0);
				setState(279);
				match(T__4);
				setState(280);
				match(T__5);
				}
			}

			setState(284);
			match(FUNCTION);
			setState(285);
			match(ID);
			setState(286);
			match(T__3);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << LONG) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << ID))) != 0)) {
				{
				setState(287);
				args_var(0);
				}
			}

			setState(290);
			match(T__4);
			setState(291);
			block();
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

	public static class AssignContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public Np2Context np2() {
			return getRuleContext(Np2Context.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assign);
		int _la;
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
			case SUPER:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				var();
				setState(294);
				match(T__5);
				setState(295);
				np2();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				match(T__3);
				setState(298);
				var();
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(299);
					match(T__9);
					setState(300);
					var();
					}
					}
					setState(305);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(306);
				match(T__4);
				setState(307);
				match(T__5);
				setState(308);
				func_call();
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

	public static class Np2Context extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEW() { return getToken(lulu2Parser.NEW, 0); }
		public Np2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_np2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterNp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitNp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitNp2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Np2Context np2() throws RecognitionException {
		Np2Context _localctx = new Np2Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_np2);
		try {
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__16:
			case T__17:
			case T__18:
			case THIS:
			case READ:
			case SIZEOF:
			case WRITE:
			case NIL:
			case SUPER:
			case Int_const:
			case ID:
			case REAL_CONST:
			case CHAR_CONST:
			case Bool_const:
			case String_const:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				expr();
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				match(NEW);
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

	public static class VarContext extends ParserRuleContext {
		public List<RefContext> ref() {
			return getRuleContexts(RefContext.class);
		}
		public RefContext ref(int i) {
			return getRuleContext(RefContext.class,i);
		}
		public TerminalNode THIS() { return getToken(lulu2Parser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(lulu2Parser.SUPER, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_var);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THIS || _la==SUPER) {
				{
				setState(316);
				_la = _input.LA(1);
				if ( !(_la==THIS || _la==SUPER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(317);
				match(T__14);
				}
			}

			setState(320);
			ref();
			setState(325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(321);
					match(T__14);
					setState(322);
					ref();
					}
					} 
				}
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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

	public static class RefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(lulu2Parser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefContext ref() throws RecognitionException {
		RefContext _localctx = new RefContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ref);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(ID);
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(329);
				match(T__7);
				setState(330);
				expr();
				setState(331);
				match(T__8);
				}
				}
				setState(337);
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

	public static class ExprContext extends ParserRuleContext {
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Bit_unary_opContext bit_unary_op() {
			return getRuleContext(Bit_unary_opContext.class,0);
		}
		public List<TerminalNode> Int_const() { return getTokens(lulu2Parser.Int_const); }
		public TerminalNode Int_const(int i) {
			return getToken(lulu2Parser.Int_const, i);
		}
		public Const_valContext const_val() {
			return getRuleContext(Const_valContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode NIL() { return getToken(lulu2Parser.NIL, 0); }
		public Bit_binary_opContext bit_binary_op() {
			return getRuleContext(Bit_binary_opContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(338);
				match(T__3);
				setState(339);
				expr();
				setState(340);
				match(T__4);
				}
				break;
			case 2:
				{
				setState(342);
				bit_unary_op();
				setState(343);
				match(Int_const);
				}
				break;
			case 3:
				{
				setState(345);
				const_val();
				}
				break;
			case 4:
				{
				setState(346);
				func_call();
				}
				break;
			case 5:
				{
				setState(347);
				var();
				}
				break;
			case 6:
				{
				setState(348);
				match(NIL);
				}
				break;
			case 7:
				{
				setState(349);
				match(Int_const);
				setState(350);
				bit_binary_op();
				setState(351);
				match(Int_const);
				}
				break;
			}
			setState(355);
			fact();
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

	public static class FactContext extends ParserRuleContext {
		public Binary_opContext binary_op() {
			return getRuleContext(Binary_opContext.class,0);
		}
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitFact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitFact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactContext fact() throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_fact);
		try {
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				binary_op();
				{
				setState(358);
				expr();
				}
				setState(359);
				fact();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Func_callContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(lulu2Parser.READ, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode ID() { return getToken(lulu2Parser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode SIZEOF() { return getToken(lulu2Parser.SIZEOF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode WRITE() { return getToken(lulu2Parser.WRITE, 0); }
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitFunc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_func_call);
		int _la;
		try {
			setState(393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				match(READ);
				setState(365);
				match(T__3);
				setState(366);
				var();
				setState(367);
				match(T__4);
				}
				break;
			case THIS:
			case SUPER:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(369);
					var();
					setState(370);
					match(T__14);
					}
					break;
				}
				setState(374);
				match(ID);
				setState(375);
				match(T__3);
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__16 - 4)) | (1L << (T__17 - 4)) | (1L << (T__18 - 4)) | (1L << (THIS - 4)) | (1L << (READ - 4)) | (1L << (SIZEOF - 4)) | (1L << (WRITE - 4)) | (1L << (NIL - 4)) | (1L << (SUPER - 4)) | (1L << (Int_const - 4)) | (1L << (ID - 4)) | (1L << (REAL_CONST - 4)) | (1L << (CHAR_CONST - 4)) | (1L << (Bool_const - 4)) | (1L << (String_const - 4)))) != 0)) {
					{
					setState(376);
					params();
					}
				}

				setState(379);
				match(T__4);
				}
				break;
			case SIZEOF:
				enterOuterAlt(_localctx, 3);
				{
				setState(380);
				match(SIZEOF);
				setState(381);
				match(T__3);
				setState(384);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(382);
					type();
					}
					break;
				case 2:
					{
					setState(383);
					var();
					}
					break;
				}
				setState(386);
				match(T__4);
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 4);
				{
				setState(388);
				match(WRITE);
				setState(389);
				match(T__3);
				setState(390);
				var();
				setState(391);
				match(T__4);
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

	public static class ParamsContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NpContext np() {
			return getRuleContext(NpContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			expr();
			setState(396);
			np();
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

	public static class NpContext extends ParserRuleContext {
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public NpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_np; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterNp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitNp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitNp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NpContext np() throws RecognitionException {
		NpContext _localctx = new NpContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_np);
		try {
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				match(T__9);
				setState(399);
				params();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Cond_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(lulu2Parser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(lulu2Parser.ELSE, 0); }
		public TerminalNode SWITCH() { return getToken(lulu2Parser.SWITCH, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(lulu2Parser.DEFAULT, 0); }
		public List<TerminalNode> CASE() { return getTokens(lulu2Parser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(lulu2Parser.CASE, i);
		}
		public List<TerminalNode> Int_const() { return getTokens(lulu2Parser.Int_const); }
		public TerminalNode Int_const(int i) {
			return getToken(lulu2Parser.Int_const, i);
		}
		public Cond_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterCond_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitCond_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitCond_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_stmtContext cond_stmt() throws RecognitionException {
		Cond_stmtContext _localctx = new Cond_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cond_stmt);
		int _la;
		try {
			setState(432);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				match(IF);
				setState(404);
				match(T__3);
				setState(405);
				expr();
				setState(406);
				match(T__4);
				setState(407);
				block();
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(408);
					match(ELSE);
					setState(409);
					block();
					}
				}

				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				match(SWITCH);
				setState(413);
				match(T__3);
				setState(414);
				var();
				setState(415);
				match(T__15);
				setState(416);
				match(T__10);
				setState(417);
				match(T__1);
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE) {
					{
					{
					setState(418);
					match(CASE);
					setState(419);
					match(Int_const);
					setState(420);
					match(T__10);
					setState(421);
					block();
					}
					}
					setState(426);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(427);
				match(DEFAULT);
				setState(428);
				match(T__10);
				setState(429);
				block();
				setState(430);
				match(T__2);
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

	public static class Loop_stmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(lulu2Parser.FOR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Var_defContext var_def() {
			return getRuleContext(Var_defContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(lulu2Parser.WHILE, 0); }
		public Loop_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterLoop_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitLoop_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitLoop_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_stmtContext loop_stmt() throws RecognitionException {
		Loop_stmtContext _localctx = new Loop_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_loop_stmt);
		int _la;
		try {
			setState(454);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				match(FOR);
				setState(435);
				match(T__3);
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << LONG) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << CONST) | (1L << ID))) != 0)) {
					{
					setState(436);
					var_def();
					}
				}

				setState(439);
				match(T__6);
				setState(440);
				expr();
				setState(441);
				match(T__6);
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << THIS) | (1L << SUPER) | (1L << ID))) != 0)) {
					{
					setState(442);
					assign();
					}
				}

				setState(445);
				match(T__4);
				setState(446);
				block();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				match(WHILE);
				setState(449);
				match(T__3);
				setState(450);
				expr();
				setState(451);
				match(T__4);
				setState(452);
				block();
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

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(lulu2Parser.ID, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(ID);
			setState(457);
			match(T__10);
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

	public static class Const_valContext extends ParserRuleContext {
		public TerminalNode Int_const() { return getToken(lulu2Parser.Int_const, 0); }
		public TerminalNode REAL_CONST() { return getToken(lulu2Parser.REAL_CONST, 0); }
		public TerminalNode CHAR_CONST() { return getToken(lulu2Parser.CHAR_CONST, 0); }
		public TerminalNode Bool_const() { return getToken(lulu2Parser.Bool_const, 0); }
		public TerminalNode String_const() { return getToken(lulu2Parser.String_const, 0); }
		public Const_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterConst_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitConst_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitConst_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_valContext const_val() throws RecognitionException {
		Const_valContext _localctx = new Const_valContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_const_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			_la = _input.LA(1);
			if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (Int_const - 58)) | (1L << (REAL_CONST - 58)) | (1L << (CHAR_CONST - 58)) | (1L << (Bool_const - 58)) | (1L << (String_const - 58)))) != 0)) ) {
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

	public static class Bit_unary_opContext extends ParserRuleContext {
		public Bit_unary_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_unary_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterBit_unary_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitBit_unary_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitBit_unary_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bit_unary_opContext bit_unary_op() throws RecognitionException {
		Bit_unary_opContext _localctx = new Bit_unary_opContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_bit_unary_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
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

	public static class Bit_binary_opContext extends ParserRuleContext {
		public Bit_binary_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_binary_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterBit_binary_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitBit_binary_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitBit_binary_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bit_binary_opContext bit_binary_op() throws RecognitionException {
		Bit_binary_opContext _localctx = new Bit_binary_opContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_bit_binary_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
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

	public static class Binary_opContext extends ParserRuleContext {
		public TerminalNode ARITHMETIC() { return getToken(lulu2Parser.ARITHMETIC, 0); }
		public TerminalNode RELATIONAL() { return getToken(lulu2Parser.RELATIONAL, 0); }
		public Binary_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterBinary_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitBinary_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitBinary_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_opContext binary_op() throws RecognitionException {
		Binary_opContext _localctx = new Binary_opContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_binary_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			_la = _input.LA(1);
			if ( !(_la==ARITHMETIC || _la==RELATIONAL) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return args_sempred((ArgsContext)_localctx, predIndex);
		case 4:
			return args_var_sempred((Args_varContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean args_sempred(ArgsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean args_var_sempred(Args_varContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3I\u01d6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\5\2F\n\2\3\2\7\2I\n\2\f\2\16\2L\13\2\3\3\3\3\3\3\3\3\3"+
		"\3\6\3S\n\3\r\3\16\3T\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4^\n\4\3\4\3\4\3\4"+
		"\3\4\5\4d\n\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5m\n\5\f\5\16\5p\13\5\3\5"+
		"\3\5\3\5\3\5\3\5\7\5w\n\5\f\5\16\5z\13\5\7\5|\n\5\f\5\16\5\177\13\5\3"+
		"\6\3\6\3\6\3\6\3\6\7\6\u0086\n\6\f\6\16\6\u0089\13\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\7\6\u0091\n\6\f\6\16\6\u0094\13\6\7\6\u0096\n\6\f\6\16\6\u0099"+
		"\13\6\3\7\3\7\3\7\7\7\u009e\n\7\f\7\16\7\u00a1\13\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\7\b\u00bc\n\b\f\b\16\b\u00bf\13\b\3\b\3\b\5\b\u00c3\n\b\3"+
		"\t\3\t\3\n\3\n\3\n\3\13\5\13\u00cb\n\13\3\13\3\13\3\13\3\13\7\13\u00d1"+
		"\n\13\f\13\16\13\u00d4\13\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u00dc\n\f\f"+
		"\f\16\f\u00df\13\f\3\f\3\f\3\f\3\f\3\f\5\f\u00e6\n\f\5\f\u00e8\n\f\3\r"+
		"\3\r\3\r\5\r\u00ed\n\r\3\r\3\r\3\r\5\r\u00f2\n\r\7\r\u00f4\n\r\f\r\16"+
		"\r\u00f7\13\r\3\r\3\r\3\16\3\16\6\16\u00fd\n\16\r\16\16\16\u00fe\3\17"+
		"\3\17\3\17\3\17\5\17\u0105\n\17\3\17\3\17\6\17\u0109\n\17\r\17\16\17\u010a"+
		"\3\17\3\17\3\20\5\20\u0110\n\20\3\20\3\20\5\20\u0114\n\20\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\5\22\u011d\n\22\3\22\3\22\3\22\3\22\5\22\u0123"+
		"\n\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0130"+
		"\n\23\f\23\16\23\u0133\13\23\3\23\3\23\3\23\3\23\5\23\u0139\n\23\3\24"+
		"\3\24\5\24\u013d\n\24\3\25\3\25\5\25\u0141\n\25\3\25\3\25\3\25\7\25\u0146"+
		"\n\25\f\25\16\25\u0149\13\25\3\26\3\26\3\26\3\26\3\26\7\26\u0150\n\26"+
		"\f\26\16\26\u0153\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\5\27\u0164\n\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u016d\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u0177\n\31\3\31\3\31\3\31\5\31\u017c\n\31\3\31\3\31\3\31\3\31\3\31\5"+
		"\31\u0183\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u018c\n\31\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\5\33\u0194\n\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u019d\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\7\34\u01a9\n\34\f\34\16\34\u01ac\13\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u01b3\n\34\3\35\3\35\3\35\5\35\u01b8\n\35\3\35\3\35\3\35\3\35\5\35\u01be"+
		"\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01c9\n\35\3\36"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\2\4\b\n#\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\t\4\2\35#==\3\2\16"+
		"\20\4\2&&;;\6\2<<@@BBDE\3\2\23\25\3\2\26\32\3\2GH\2\u01fa\2E\3\2\2\2\4"+
		"M\3\2\2\2\6]\3\2\2\2\bh\3\2\2\2\n\u0080\3\2\2\2\f\u009a\3\2\2\2\16\u00c2"+
		"\3\2\2\2\20\u00c4\3\2\2\2\22\u00c6\3\2\2\2\24\u00ca\3\2\2\2\26\u00d7\3"+
		"\2\2\2\30\u00e9\3\2\2\2\32\u00fc\3\2\2\2\34\u0100\3\2\2\2\36\u010f\3\2"+
		"\2\2 \u0115\3\2\2\2\"\u011c\3\2\2\2$\u0138\3\2\2\2&\u013c\3\2\2\2(\u0140"+
		"\3\2\2\2*\u014a\3\2\2\2,\u0163\3\2\2\2.\u016c\3\2\2\2\60\u018b\3\2\2\2"+
		"\62\u018d\3\2\2\2\64\u0193\3\2\2\2\66\u01b2\3\2\2\28\u01c8\3\2\2\2:\u01ca"+
		"\3\2\2\2<\u01cd\3\2\2\2>\u01cf\3\2\2\2@\u01d1\3\2\2\2B\u01d3\3\2\2\2D"+
		"F\5\4\3\2ED\3\2\2\2EF\3\2\2\2FJ\3\2\2\2GI\5\32\16\2HG\3\2\2\2IL\3\2\2"+
		"\2JH\3\2\2\2JK\3\2\2\2K\3\3\2\2\2LJ\3\2\2\2MN\7\3\2\2NR\7\4\2\2OS\5\6"+
		"\4\2PS\5\22\n\2QS\5\24\13\2RO\3\2\2\2RP\3\2\2\2RQ\3\2\2\2ST\3\2\2\2TR"+
		"\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\7\5\2\2W\5\3\2\2\2XY\7\6\2\2YZ\5\b\5\2"+
		"Z[\7\7\2\2[\\\7\b\2\2\\^\3\2\2\2]X\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\7=\2"+
		"\2`c\7\6\2\2ad\5\b\5\2bd\5\n\6\2ca\3\2\2\2cb\3\2\2\2cd\3\2\2\2de\3\2\2"+
		"\2ef\7\7\2\2fg\7\t\2\2g\7\3\2\2\2hi\b\5\1\2in\5\20\t\2jk\7\n\2\2km\7\13"+
		"\2\2lj\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o}\3\2\2\2pn\3\2\2\2qr\f\3"+
		"\2\2rs\7\f\2\2sx\5\20\t\2tu\7\n\2\2uw\7\13\2\2vt\3\2\2\2wz\3\2\2\2xv\3"+
		"\2\2\2xy\3\2\2\2y|\3\2\2\2zx\3\2\2\2{q\3\2\2\2|\177\3\2\2\2}{\3\2\2\2"+
		"}~\3\2\2\2~\t\3\2\2\2\177}\3\2\2\2\u0080\u0081\b\6\1\2\u0081\u0082\5\20"+
		"\t\2\u0082\u0087\7=\2\2\u0083\u0084\7\n\2\2\u0084\u0086\7\13\2\2\u0085"+
		"\u0083\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u0097\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\f\3\2\2\u008b"+
		"\u008c\7\f\2\2\u008c\u008d\5\20\t\2\u008d\u0092\7=\2\2\u008e\u008f\7\n"+
		"\2\2\u008f\u0091\7\13\2\2\u0090\u008e\3\2\2\2\u0091\u0094\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0095\u008a\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\13\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009f\7\4\2"+
		"\2\u009b\u009e\5\16\b\2\u009c\u009e\5\24\13\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\5\2\2\u00a3"+
		"\r\3\2\2\2\u00a4\u00a5\5$\23\2\u00a5\u00a6\7\t\2\2\u00a6\u00c3\3\2\2\2"+
		"\u00a7\u00a8\5\60\31\2\u00a8\u00a9\7\t\2\2\u00a9\u00c3\3\2\2\2\u00aa\u00c3"+
		"\5\66\34\2\u00ab\u00c3\58\35\2\u00ac\u00ad\7.\2\2\u00ad\u00c3\7\t\2\2"+
		"\u00ae\u00af\7F\2\2\u00af\u00c3\7\t\2\2\u00b0\u00c3\5:\36\2\u00b1\u00b2"+
		"\5,\27\2\u00b2\u00b3\7\t\2\2\u00b3\u00c3\3\2\2\2\u00b4\u00b5\7*\2\2\u00b5"+
		"\u00c3\7\t\2\2\u00b6\u00b7\78\2\2\u00b7\u00c3\7\t\2\2\u00b8\u00bd\7\'"+
		"\2\2\u00b9\u00ba\7\n\2\2\u00ba\u00bc\7\13\2\2\u00bb\u00b9\3\2\2\2\u00bc"+
		"\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2"+
		"\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7=\2\2\u00c1\u00c3\7\t\2\2\u00c2"+
		"\u00a4\3\2\2\2\u00c2\u00a7\3\2\2\2\u00c2\u00aa\3\2\2\2\u00c2\u00ab\3\2"+
		"\2\2\u00c2\u00ac\3\2\2\2\u00c2\u00ae\3\2\2\2\u00c2\u00b0\3\2\2\2\u00c2"+
		"\u00b1\3\2\2\2\u00c2\u00b4\3\2\2\2\u00c2\u00b6\3\2\2\2\u00c2\u00b8\3\2"+
		"\2\2\u00c3\17\3\2\2\2\u00c4\u00c5\t\2\2\2\u00c5\21\3\2\2\2\u00c6\u00c7"+
		"\7=\2\2\u00c7\u00c8\7\t\2\2\u00c8\23\3\2\2\2\u00c9\u00cb\7\64\2\2\u00ca"+
		"\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\5\20"+
		"\t\2\u00cd\u00d2\5\26\f\2\u00ce\u00cf\7\f\2\2\u00cf\u00d1\5\26\f\2\u00d0"+
		"\u00ce\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7\t\2\2\u00d6"+
		"\25\3\2\2\2\u00d7\u00dd\7=\2\2\u00d8\u00d9\7\n\2\2\u00d9\u00da\7<\2\2"+
		"\u00da\u00dc\7\13\2\2\u00db\u00d8\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db"+
		"\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e7\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0"+
		"\u00e5\7\b\2\2\u00e1\u00e6\5,\27\2\u00e2\u00e6\5\30\r\2\u00e3\u00e4\7"+
		"$\2\2\u00e4\u00e6\7=\2\2\u00e5\u00e1\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e0\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8\27\3\2\2\2\u00e9\u00ec\7\n\2\2\u00ea\u00ed\5,\27\2\u00eb\u00ed"+
		"\5\30\r\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00f5\3\2\2\2"+
		"\u00ee\u00f1\7\f\2\2\u00ef\u00f2\5,\27\2\u00f0\u00f2\5\30\r\2\u00f1\u00ef"+
		"\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00ee\3\2\2\2\u00f4"+
		"\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2"+
		"\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9\7\13\2\2\u00f9\31\3\2\2\2\u00fa\u00fd"+
		"\5\34\17\2\u00fb\u00fd\5\"\22\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2"+
		"\2\u00fd\u00fe\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\33"+
		"\3\2\2\2\u0100\u0101\5\20\t\2\u0101\u0104\7=\2\2\u0102\u0103\7\r\2\2\u0103"+
		"\u0105\7=\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106\u0108\7\4\2\2\u0107\u0109\5\36\20\2\u0108\u0107\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\u010d\7\5\2\2\u010d\35\3\2\2\2\u010e\u0110\5 \21\2\u010f\u010e"+
		"\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u0114\5\24\13\2"+
		"\u0112\u0114\5\"\22\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114\37"+
		"\3\2\2\2\u0115\u0116\t\3\2\2\u0116!\3\2\2\2\u0117\u0118\7\6\2\2\u0118"+
		"\u0119\5\n\6\2\u0119\u011a\7\7\2\2\u011a\u011b\7\b\2\2\u011b\u011d\3\2"+
		"\2\2\u011c\u0117\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u011f\7\65\2\2\u011f\u0120\7=\2\2\u0120\u0122\7\6\2\2\u0121\u0123\5\n"+
		"\6\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0125\7\7\2\2\u0125\u0126\5\f\7\2\u0126#\3\2\2\2\u0127\u0128\5(\25\2"+
		"\u0128\u0129\7\b\2\2\u0129\u012a\5&\24\2\u012a\u0139\3\2\2\2\u012b\u012c"+
		"\7\6\2\2\u012c\u0131\5(\25\2\u012d\u012e\7\f\2\2\u012e\u0130\5(\25\2\u012f"+
		"\u012d\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2"+
		"\2\2\u0132\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0135\7\7\2\2\u0135"+
		"\u0136\7\b\2\2\u0136\u0137\5\60\31\2\u0137\u0139\3\2\2\2\u0138\u0127\3"+
		"\2\2\2\u0138\u012b\3\2\2\2\u0139%\3\2\2\2\u013a\u013d\5,\27\2\u013b\u013d"+
		"\7\61\2\2\u013c\u013a\3\2\2\2\u013c\u013b\3\2\2\2\u013d\'\3\2\2\2\u013e"+
		"\u013f\t\4\2\2\u013f\u0141\7\21\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3"+
		"\2\2\2\u0141\u0142\3\2\2\2\u0142\u0147\5*\26\2\u0143\u0144\7\21\2\2\u0144"+
		"\u0146\5*\26\2\u0145\u0143\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2"+
		"\2\2\u0147\u0148\3\2\2\2\u0148)\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u0151"+
		"\7=\2\2\u014b\u014c\7\n\2\2\u014c\u014d\5,\27\2\u014d\u014e\7\13\2\2\u014e"+
		"\u0150\3\2\2\2\u014f\u014b\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2"+
		"\2\2\u0151\u0152\3\2\2\2\u0152+\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155"+
		"\7\6\2\2\u0155\u0156\5,\27\2\u0156\u0157\7\7\2\2\u0157\u0164\3\2\2\2\u0158"+
		"\u0159\5> \2\u0159\u015a\7<\2\2\u015a\u0164\3\2\2\2\u015b\u0164\5<\37"+
		"\2\u015c\u0164\5\60\31\2\u015d\u0164\5(\25\2\u015e\u0164\7:\2\2\u015f"+
		"\u0160\7<\2\2\u0160\u0161\5@!\2\u0161\u0162\7<\2\2\u0162\u0164\3\2\2\2"+
		"\u0163\u0154\3\2\2\2\u0163\u0158\3\2\2\2\u0163\u015b\3\2\2\2\u0163\u015c"+
		"\3\2\2\2\u0163\u015d\3\2\2\2\u0163\u015e\3\2\2\2\u0163\u015f\3\2\2\2\u0164"+
		"\u0165\3\2\2\2\u0165\u0166\5.\30\2\u0166-\3\2\2\2\u0167\u0168\5B\"\2\u0168"+
		"\u0169\5,\27\2\u0169\u016a\5.\30\2\u016a\u016d\3\2\2\2\u016b\u016d\3\2"+
		"\2\2\u016c\u0167\3\2\2\2\u016c\u016b\3\2\2\2\u016d/\3\2\2\2\u016e\u016f"+
		"\7+\2\2\u016f\u0170\7\6\2\2\u0170\u0171\5(\25\2\u0171\u0172\7\7\2\2\u0172"+
		"\u018c\3\2\2\2\u0173\u0174\5(\25\2\u0174\u0175\7\21\2\2\u0175\u0177\3"+
		"\2\2\2\u0176\u0173\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u0179\7=\2\2\u0179\u017b\7\6\2\2\u017a\u017c\5\62\32\2\u017b\u017a\3"+
		"\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u018c\7\7\2\2\u017e"+
		"\u017f\7\62\2\2\u017f\u0182\7\6\2\2\u0180\u0183\5\20\t\2\u0181\u0183\5"+
		"(\25\2\u0182\u0180\3\2\2\2\u0182\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u0185\7\7\2\2\u0185\u018c\3\2\2\2\u0186\u0187\7\63\2\2\u0187\u0188\7"+
		"\6\2\2\u0188\u0189\5(\25\2\u0189\u018a\7\7\2\2\u018a\u018c\3\2\2\2\u018b"+
		"\u016e\3\2\2\2\u018b\u0176\3\2\2\2\u018b\u017e\3\2\2\2\u018b\u0186\3\2"+
		"\2\2\u018c\61\3\2\2\2\u018d\u018e\5,\27\2\u018e\u018f\5\64\33\2\u018f"+
		"\63\3\2\2\2\u0190\u0191\7\f\2\2\u0191\u0194\5\62\32\2\u0192\u0194\3\2"+
		"\2\2\u0193\u0190\3\2\2\2\u0193\u0192\3\2\2\2\u0194\65\3\2\2\2\u0195\u0196"+
		"\7(\2\2\u0196\u0197\7\6\2\2\u0197\u0198\5,\27\2\u0198\u0199\7\7\2\2\u0199"+
		"\u019c\5\f\7\2\u019a\u019b\7-\2\2\u019b\u019d\5\f\7\2\u019c\u019a\3\2"+
		"\2\2\u019c\u019d\3\2\2\2\u019d\u01b3\3\2\2\2\u019e\u019f\7\67\2\2\u019f"+
		"\u01a0\7\6\2\2\u01a0\u01a1\5(\25\2\u01a1\u01a2\7\22\2\2\u01a2\u01a3\7"+
		"\r\2\2\u01a3\u01aa\7\4\2\2\u01a4\u01a5\7,\2\2\u01a5\u01a6\7<\2\2\u01a6"+
		"\u01a7\7\r\2\2\u01a7\u01a9\5\f\7\2\u01a8\u01a4\3\2\2\2\u01a9\u01ac\3\2"+
		"\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ad\3\2\2\2\u01ac"+
		"\u01aa\3\2\2\2\u01ad\u01ae\7%\2\2\u01ae\u01af\7\r\2\2\u01af\u01b0\5\f"+
		"\7\2\u01b0\u01b1\7\5\2\2\u01b1\u01b3\3\2\2\2\u01b2\u0195\3\2\2\2\u01b2"+
		"\u019e\3\2\2\2\u01b3\67\3\2\2\2\u01b4\u01b5\7\66\2\2\u01b5\u01b7\7\6\2"+
		"\2\u01b6\u01b8\5\24\13\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9\u01ba\7\t\2\2\u01ba\u01bb\5,\27\2\u01bb\u01bd\7\t"+
		"\2\2\u01bc\u01be\5$\23\2\u01bd\u01bc\3\2\2\2\u01bd\u01be\3\2\2\2\u01be"+
		"\u01bf\3\2\2\2\u01bf\u01c0\7\7\2\2\u01c0\u01c1\5\f\7\2\u01c1\u01c9\3\2"+
		"\2\2\u01c2\u01c3\7/\2\2\u01c3\u01c4\7\6\2\2\u01c4\u01c5\5,\27\2\u01c5"+
		"\u01c6\7\7\2\2\u01c6\u01c7\5\f\7\2\u01c7\u01c9\3\2\2\2\u01c8\u01b4\3\2"+
		"\2\2\u01c8\u01c2\3\2\2\2\u01c99\3\2\2\2\u01ca\u01cb\7=\2\2\u01cb\u01cc"+
		"\7\r\2\2\u01cc;\3\2\2\2\u01cd\u01ce\t\5\2\2\u01ce=\3\2\2\2\u01cf\u01d0"+
		"\t\6\2\2\u01d0?\3\2\2\2\u01d1\u01d2\t\7\2\2\u01d2A\3\2\2\2\u01d3\u01d4"+
		"\t\b\2\2\u01d4C\3\2\2\2\65EJRT]cnx}\u0087\u0092\u0097\u009d\u009f\u00bd"+
		"\u00c2\u00ca\u00d2\u00dd\u00e5\u00e7\u00ec\u00f1\u00f5\u00fc\u00fe\u0104"+
		"\u010a\u010f\u0113\u011c\u0122\u0131\u0138\u013c\u0140\u0147\u0151\u0163"+
		"\u016c\u0176\u017b\u0182\u018b\u0193\u019c\u01aa\u01b2\u01b7\u01bd\u01c8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}