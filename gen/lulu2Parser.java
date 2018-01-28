// Generated from C:/Users/Mohammad/IdeaProjects/compiler-design-course-language\lulu2.g4 by ANTLR 4.7
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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, Single_line_c=37, Multi_line_c=38, 
		OCONTROLLS=39, OBLOCK=40, INT=41, BOOL=42, FLOAT=43, LONG=44, DOUBLE=45, 
		STRING=46, CHAR=47, ALLOCATE=48, DEFAULT=49, THIS=50, DESTRUCT=51, IF=52, 
		TRUE=53, BREAK=54, READ=55, CASE=56, ELSE=57, RETURN=58, WHILE=59, FALSE=60, 
		NEW=61, SIZEOF=62, WRITE=63, CONST=64, FUNCTION=65, FOR=66, SWITCH=67, 
		CONTINUE=68, OF=69, NIL=70, SUPER=71, Int_const=72, ID=73, LETTER=74, 
		OptionalExponent=75, REAL_CONST=76, REAL_FACT=77, CHAR_CONST=78, ASCII=79, 
		Bool_const=80, String_const=81, ARITHMETIC=82, RELATIONAL=83, WS=84;
	public static final int
		RULE_program = 0, RULE_ft_dcl = 1, RULE_func_dcl = 2, RULE_args = 3, RULE_args_var = 4, 
		RULE_array_dcl = 5, RULE_args_var_def = 6, RULE_block = 7, RULE_stmt = 8, 
		RULE_loop_cond_stmt = 9, RULE_type = 10, RULE_type_dcl = 11, RULE_var_def = 12, 
		RULE_var_val = 13, RULE_list = 14, RULE_ft_def = 15, RULE_type_def = 16, 
		RULE_component = 17, RULE_access_modifier = 18, RULE_fun_def = 19, RULE_assign = 20, 
		RULE_var = 21, RULE_ref = 22, RULE_expr = 23, RULE_func_call = 24, RULE_params = 25, 
		RULE_np = 26, RULE_cond_stmt = 27, RULE_case_stmt = 28, RULE_default_stmt = 29, 
		RULE_if_stmt = 30, RULE_else_stmt = 31, RULE_loop_stmt = 32, RULE_for_loop = 33, 
		RULE_while_loop = 34, RULE_label = 35, RULE_const_val = 36;
	public static final String[] ruleNames = {
		"program", "ft_dcl", "func_dcl", "args", "args_var", "array_dcl", "args_var_def", 
		"block", "stmt", "loop_cond_stmt", "type", "type_dcl", "var_def", "var_val", 
		"list", "ft_def", "type_def", "component", "access_modifier", "fun_def", 
		"assign", "var", "ref", "expr", "func_call", "params", "np", "cond_stmt", 
		"case_stmt", "default_stmt", "if_stmt", "else_stmt", "loop_stmt", "for_loop", 
		"while_loop", "label", "const_val"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'declare'", "'{'", "'}'", "'('", "')'", "'='", "';'", "'['", "']'", 
		"','", "'goto'", "'type'", "':'", "'private'", "'public'", "'protected'", 
		"'.'", "'!'", "'~'", "'-'", "'*'", "'/'", "'+'", "'%'", "'&'", "'|'", 
		"'^'", "'||'", "'&&'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "') of'", 
		null, null, null, null, "'int'", "'bool'", "'float'", "'long'", "'double'", 
		"'string'", "'char'", "'allocate'", "'default'", "'this'", "'destruct'", 
		"'if'", "'true'", "'break'", "'read'", "'case'", "'else'", "'return'", 
		"'while'", "'false'", "'new'", "'sizeof'", "'write'", "'const'", "'function'", 
		"'for'", "'switch'", "'continue'", "'of'", "'nil'", "'super'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "Single_line_c", "Multi_line_c", "OCONTROLLS", "OBLOCK", "INT", 
		"BOOL", "FLOAT", "LONG", "DOUBLE", "STRING", "CHAR", "ALLOCATE", "DEFAULT", 
		"THIS", "DESTRUCT", "IF", "TRUE", "BREAK", "READ", "CASE", "ELSE", "RETURN", 
		"WHILE", "FALSE", "NEW", "SIZEOF", "WRITE", "CONST", "FUNCTION", "FOR", 
		"SWITCH", "CONTINUE", "OF", "NIL", "SUPER", "Int_const", "ID", "LETTER", 
		"OptionalExponent", "REAL_CONST", "REAL_FACT", "CHAR_CONST", "ASCII", 
		"Bool_const", "String_const", "ARITHMETIC", "RELATIONAL", "WS"
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
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(74);
				ft_dcl();
				}
			}

			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__11 - 4)) | (1L << (FUNCTION - 4)))) != 0)) {
				{
				{
				setState(77);
				ft_def();
				}
				}
				setState(82);
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
			setState(83);
			match(T__0);
			setState(84);
			match(T__1);
			setState(88); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(88);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(85);
					func_dcl();
					}
					break;
				case 2:
					{
					setState(86);
					type_dcl();
					}
					break;
				case 3:
					{
					setState(87);
					var_def();
					}
					break;
				}
				}
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << LONG) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR))) != 0) || _la==CONST || _la==ID );
			setState(92);
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
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(94);
				match(T__3);
				setState(95);
				args(0);
				setState(96);
				match(T__4);
				setState(97);
				match(T__5);
				}
			}

			setState(101);
			match(ID);
			setState(102);
			match(T__3);
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(103);
				args(0);
				}
				break;
			case 2:
				{
				setState(104);
				args_var();
				}
				break;
			}
			setState(107);
			match(T__4);
			setState(108);
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
			setState(111);
			type();
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(112);
					match(T__7);
					setState(113);
					match(T__8);
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(131);
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
					setState(119);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(120);
					match(T__9);
					setState(121);
					type();
					setState(126);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(122);
							match(T__7);
							setState(123);
							match(T__8);
							}
							} 
						}
						setState(128);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					}
					}
					} 
				}
				setState(133);
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
		public List<Args_var_defContext> args_var_def() {
			return getRuleContexts(Args_var_defContext.class);
		}
		public Args_var_defContext args_var_def(int i) {
			return getRuleContext(Args_var_defContext.class,i);
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
		Args_varContext _localctx = new Args_varContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_args_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			args_var_def();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(135);
				match(T__9);
				setState(136);
				args_var_def();
				}
				}
				setState(141);
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

	public static class Array_dclContext extends ParserRuleContext {
		public Array_dclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterArray_dcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitArray_dcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitArray_dcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_dclContext array_dcl() throws RecognitionException {
		Array_dclContext _localctx = new Array_dclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_array_dcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__7);
			setState(143);
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

	public static class Args_var_defContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(lulu2Parser.ID, 0); }
		public List<Array_dclContext> array_dcl() {
			return getRuleContexts(Array_dclContext.class);
		}
		public Array_dclContext array_dcl(int i) {
			return getRuleContext(Array_dclContext.class,i);
		}
		public Args_var_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args_var_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterArgs_var_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitArgs_var_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitArgs_var_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Args_var_defContext args_var_def() throws RecognitionException {
		Args_var_defContext _localctx = new Args_var_defContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_args_var_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			type();
			setState(146);
			match(ID);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(147);
				array_dcl();
				}
				}
				setState(152);
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
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__1);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__10) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << LONG) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << THIS) | (1L << DESTRUCT) | (1L << IF) | (1L << BREAK) | (1L << READ) | (1L << RETURN) | (1L << WHILE) | (1L << SIZEOF) | (1L << WRITE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CONST - 64)) | (1L << (FOR - 64)) | (1L << (SWITCH - 64)) | (1L << (CONTINUE - 64)) | (1L << (NIL - 64)) | (1L << (SUPER - 64)) | (1L << (Int_const - 64)) | (1L << (ID - 64)) | (1L << (REAL_CONST - 64)) | (1L << (CHAR_CONST - 64)) | (1L << (Bool_const - 64)) | (1L << (String_const - 64)))) != 0)) {
				{
				setState(156);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(154);
					stmt();
					}
					break;
				case 2:
					{
					setState(155);
					var_def();
					}
					break;
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
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
		public TerminalNode ID() { return getToken(lulu2Parser.ID, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Loop_cond_stmtContext loop_cond_stmt() {
			return getRuleContext(Loop_cond_stmtContext.class,0);
		}
		public TerminalNode DESTRUCT() { return getToken(lulu2Parser.DESTRUCT, 0); }
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
		enterRule(_localctx, 16, RULE_stmt);
		int _la;
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				assign();
				setState(164);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				func_call();
				setState(167);
				match(T__6);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				cond_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				loop_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(171);
				match(RETURN);
				setState(172);
				match(T__6);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
				match(T__10);
				setState(174);
				match(ID);
				setState(175);
				match(T__6);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(176);
				label();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(177);
				expr(0);
				setState(178);
				match(T__6);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(180);
				loop_cond_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(181);
				match(DESTRUCT);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(182);
					match(T__7);
					setState(183);
					match(T__8);
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(189);
				match(ID);
				setState(190);
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

	public static class Loop_cond_stmtContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(lulu2Parser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(lulu2Parser.CONTINUE, 0); }
		public Loop_cond_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_cond_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterLoop_cond_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitLoop_cond_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitLoop_cond_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_cond_stmtContext loop_cond_stmt() throws RecognitionException {
		Loop_cond_stmtContext _localctx = new Loop_cond_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_loop_cond_stmt);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(BREAK);
				setState(194);
				match(T__6);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(CONTINUE);
				setState(196);
				match(T__6);
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
		enterRule(_localctx, 20, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_la = _input.LA(1);
			if ( !(((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (INT - 41)) | (1L << (BOOL - 41)) | (1L << (FLOAT - 41)) | (1L << (LONG - 41)) | (1L << (DOUBLE - 41)) | (1L << (STRING - 41)) | (1L << (CHAR - 41)) | (1L << (ID - 41)))) != 0)) ) {
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
		enterRule(_localctx, 22, RULE_type_dcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(ID);
			setState(202);
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
		enterRule(_localctx, 24, RULE_var_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(204);
				match(CONST);
				}
			}

			setState(207);
			type();
			setState(208);
			var_val();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(209);
				match(T__9);
				setState(210);
				var_val();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
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
		enterRule(_localctx, 26, RULE_var_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(ID);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(219);
				match(T__7);
				setState(220);
				match(Int_const);
				setState(221);
				match(T__8);
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(227);
				match(T__5);
				setState(232);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
				case T__17:
				case T__18:
				case T__19:
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
					setState(228);
					expr(0);
					}
					break;
				case T__7:
					{
					setState(229);
					list();
					}
					break;
				case ALLOCATE:
					{
					setState(230);
					match(ALLOCATE);
					setState(231);
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
		enterRule(_localctx, 28, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(T__7);
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__17:
			case T__18:
			case T__19:
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
				expr(0);
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
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(241);
				match(T__9);
				setState(244);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
				case T__17:
				case T__18:
				case T__19:
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
					setState(242);
					expr(0);
					}
					break;
				case T__7:
					{
					setState(243);
					list();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(251);
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
		enterRule(_localctx, 30, RULE_ft_def);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(255); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(255);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__11:
						{
						setState(253);
						type_def();
						}
						break;
					case T__3:
					case FUNCTION:
						{
						setState(254);
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
				setState(257); 
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
		enterRule(_localctx, 32, RULE_type_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(T__11);
			setState(260);
			match(ID);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(261);
				match(T__12);
				setState(262);
				match(ID);
				}
			}

			setState(265);
			match(T__1);
			setState(267); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(266);
				component();
				}
				}
				setState(269); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << LONG) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CONST - 64)) | (1L << (FUNCTION - 64)) | (1L << (ID - 64)))) != 0) );
			setState(271);
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
		enterRule(_localctx, 34, RULE_component);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) {
				{
				setState(273);
				access_modifier();
				}
			}

			setState(278);
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
				setState(276);
				var_def();
				}
				break;
			case T__3:
			case FUNCTION:
				{
				setState(277);
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
		enterRule(_localctx, 36, RULE_access_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
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
		enterRule(_localctx, 38, RULE_fun_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(282);
				match(T__3);
				setState(283);
				args_var();
				setState(284);
				match(T__4);
				setState(285);
				match(T__5);
				}
			}

			setState(289);
			match(FUNCTION);
			setState(290);
			match(ID);
			setState(291);
			match(T__3);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (INT - 41)) | (1L << (BOOL - 41)) | (1L << (FLOAT - 41)) | (1L << (LONG - 41)) | (1L << (DOUBLE - 41)) | (1L << (STRING - 41)) | (1L << (CHAR - 41)) | (1L << (ID - 41)))) != 0)) {
				{
				setState(292);
				args_var();
				}
			}

			setState(295);
			match(T__4);
			setState(296);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEW() { return getToken(lulu2Parser.NEW, 0); }
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
		enterRule(_localctx, 40, RULE_assign);
		int _la;
		try {
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				var();
				setState(299);
				match(T__5);
				setState(300);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				var();
				setState(303);
				match(T__5);
				setState(304);
				match(NEW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				match(T__3);
				setState(307);
				var();
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(308);
					match(T__9);
					setState(309);
					var();
					}
					}
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(315);
				match(T__4);
				setState(316);
				match(T__5);
				setState(317);
				func_call();
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
		enterRule(_localctx, 42, RULE_var);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THIS || _la==SUPER) {
				{
				setState(321);
				_la = _input.LA(1);
				if ( !(_la==THIS || _la==SUPER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(322);
				match(T__16);
				}
			}

			setState(325);
			ref();
			setState(330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(326);
					match(T__16);
					setState(327);
					ref();
					}
					} 
				}
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
		enterRule(_localctx, 44, RULE_ref);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(ID);
			setState(340);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(334);
					match(T__7);
					setState(335);
					expr(0);
					setState(336);
					match(T__8);
					}
					} 
				}
				setState(342);
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

	public static class ExprContext extends ParserRuleContext {
		public Token uop;
		public Token bop;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(344);
				((ExprContext)_localctx).uop = match(T__17);
				setState(345);
				expr(12);
				}
				break;
			case 2:
				{
				setState(346);
				((ExprContext)_localctx).uop = match(T__18);
				setState(347);
				expr(11);
				}
				break;
			case 3:
				{
				setState(348);
				((ExprContext)_localctx).uop = match(T__19);
				setState(349);
				expr(10);
				}
				break;
			case 4:
				{
				setState(350);
				((ExprContext)_localctx).uop = match(T__3);
				setState(351);
				expr(0);
				setState(352);
				match(T__4);
				}
				break;
			case 5:
				{
				setState(354);
				const_val();
				}
				break;
			case 6:
				{
				setState(355);
				func_call();
				}
				break;
			case 7:
				{
				setState(356);
				var();
				}
				break;
			case 8:
				{
				setState(357);
				match(NIL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(374);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(372);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(360);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(361);
						((ExprContext)_localctx).bop = match(T__20);
						setState(362);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(363);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(364);
						((ExprContext)_localctx).bop = match(T__21);
						setState(365);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(366);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(367);
						((ExprContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
							((ExprContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(368);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(369);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(370);
						((ExprContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
							((ExprContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(371);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(376);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
		enterRule(_localctx, 48, RULE_func_call);
		int _la;
		try {
			setState(406);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				match(READ);
				setState(378);
				match(T__3);
				setState(379);
				var();
				setState(380);
				match(T__4);
				}
				break;
			case THIS:
			case SUPER:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(382);
					var();
					setState(383);
					match(T__16);
					}
					break;
				}
				setState(387);
				match(ID);
				setState(388);
				match(T__3);
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << THIS) | (1L << READ) | (1L << SIZEOF) | (1L << WRITE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (NIL - 70)) | (1L << (SUPER - 70)) | (1L << (Int_const - 70)) | (1L << (ID - 70)) | (1L << (REAL_CONST - 70)) | (1L << (CHAR_CONST - 70)) | (1L << (Bool_const - 70)) | (1L << (String_const - 70)))) != 0)) {
					{
					setState(389);
					params();
					}
				}

				setState(392);
				match(T__4);
				}
				break;
			case SIZEOF:
				enterOuterAlt(_localctx, 3);
				{
				setState(393);
				match(SIZEOF);
				setState(394);
				match(T__3);
				setState(397);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(395);
					type();
					}
					break;
				case 2:
					{
					setState(396);
					var();
					}
					break;
				}
				setState(399);
				match(T__4);
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 4);
				{
				setState(401);
				match(WRITE);
				setState(402);
				match(T__3);
				setState(403);
				var();
				setState(404);
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
		enterRule(_localctx, 50, RULE_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			expr(0);
			setState(409);
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
		enterRule(_localctx, 52, RULE_np);
		try {
			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				match(T__9);
				setState(412);
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
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Else_stmtContext else_stmt() {
			return getRuleContext(Else_stmtContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(lulu2Parser.SWITCH, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Case_stmtContext case_stmt() {
			return getRuleContext(Case_stmtContext.class,0);
		}
		public Default_stmtContext default_stmt() {
			return getRuleContext(Default_stmtContext.class,0);
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
		enterRule(_localctx, 54, RULE_cond_stmt);
		int _la;
		try {
			setState(430);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				if_stmt();
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(417);
					else_stmt();
					}
				}

				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				match(SWITCH);
				setState(421);
				match(T__3);
				setState(422);
				var();
				setState(423);
				match(T__35);
				setState(424);
				match(T__12);
				setState(425);
				match(T__1);
				setState(426);
				case_stmt();
				setState(427);
				default_stmt();
				setState(428);
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

	public static class Case_stmtContext extends ParserRuleContext {
		public List<TerminalNode> CASE() { return getTokens(lulu2Parser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(lulu2Parser.CASE, i);
		}
		public List<TerminalNode> Int_const() { return getTokens(lulu2Parser.Int_const); }
		public TerminalNode Int_const(int i) {
			return getToken(lulu2Parser.Int_const, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public Case_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterCase_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitCase_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitCase_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_stmtContext case_stmt() throws RecognitionException {
		Case_stmtContext _localctx = new Case_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_case_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(432);
				match(CASE);
				setState(433);
				match(Int_const);
				setState(434);
				match(T__12);
				setState(435);
				block();
				}
				}
				setState(440);
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

	public static class Default_stmtContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(lulu2Parser.DEFAULT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Default_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterDefault_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitDefault_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitDefault_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_stmtContext default_stmt() throws RecognitionException {
		Default_stmtContext _localctx = new Default_stmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_default_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(DEFAULT);
			setState(442);
			match(T__12);
			setState(443);
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

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(lulu2Parser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(IF);
			setState(446);
			match(T__3);
			setState(447);
			expr(0);
			setState(448);
			match(T__4);
			setState(449);
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

	public static class Else_stmtContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(lulu2Parser.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterElse_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitElse_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitElse_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_stmtContext else_stmt() throws RecognitionException {
		Else_stmtContext _localctx = new Else_stmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_else_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(451);
			match(ELSE);
			setState(452);
			block();
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

	public static class Loop_stmtContext extends ParserRuleContext {
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
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
		enterRule(_localctx, 64, RULE_loop_stmt);
		try {
			setState(456);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				for_loop();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				while_loop();
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

	public static class For_loopContext extends ParserRuleContext {
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
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(FOR);
			setState(459);
			match(T__3);
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (INT - 41)) | (1L << (BOOL - 41)) | (1L << (FLOAT - 41)) | (1L << (LONG - 41)) | (1L << (DOUBLE - 41)) | (1L << (STRING - 41)) | (1L << (CHAR - 41)) | (1L << (CONST - 41)) | (1L << (ID - 41)))) != 0)) {
				{
				setState(460);
				var_def();
				}
			}

			setState(463);
			match(T__6);
			setState(464);
			expr(0);
			setState(465);
			match(T__6);
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3 || _la==THIS || _la==SUPER || _la==ID) {
				{
				setState(466);
				assign();
				}
			}

			setState(469);
			match(T__4);
			setState(470);
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

	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(lulu2Parser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitWhile_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(WHILE);
			setState(473);
			match(T__3);
			setState(474);
			expr(0);
			setState(475);
			match(T__4);
			setState(476);
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
		enterRule(_localctx, 70, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(ID);
			setState(479);
			match(T__12);
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
		enterRule(_localctx, 72, RULE_const_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			_la = _input.LA(1);
			if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (Int_const - 72)) | (1L << (REAL_CONST - 72)) | (1L << (CHAR_CONST - 72)) | (1L << (Bool_const - 72)) | (1L << (String_const - 72)))) != 0)) ) {
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
		case 23:
			return expr_sempred((ExprContext)_localctx, predIndex);
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
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3V\u01e6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\5\2N\n\2\3\2\7\2Q\n\2\f\2\16\2"+
		"T\13\2\3\3\3\3\3\3\3\3\3\3\6\3[\n\3\r\3\16\3\\\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\5\4f\n\4\3\4\3\4\3\4\3\4\5\4l\n\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5"+
		"u\n\5\f\5\16\5x\13\5\3\5\3\5\3\5\3\5\3\5\7\5\177\n\5\f\5\16\5\u0082\13"+
		"\5\7\5\u0084\n\5\f\5\16\5\u0087\13\5\3\6\3\6\3\6\7\6\u008c\n\6\f\6\16"+
		"\6\u008f\13\6\3\7\3\7\3\7\3\b\3\b\3\b\7\b\u0097\n\b\f\b\16\b\u009a\13"+
		"\b\3\t\3\t\3\t\7\t\u009f\n\t\f\t\16\t\u00a2\13\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\7\n\u00bb\n\n\f\n\16\n\u00be\13\n\3\n\3\n\5\n\u00c2\n\n\3\13\3\13\3\13"+
		"\3\13\5\13\u00c8\n\13\3\f\3\f\3\r\3\r\3\r\3\16\5\16\u00d0\n\16\3\16\3"+
		"\16\3\16\3\16\7\16\u00d6\n\16\f\16\16\16\u00d9\13\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\7\17\u00e1\n\17\f\17\16\17\u00e4\13\17\3\17\3\17\3\17\3"+
		"\17\3\17\5\17\u00eb\n\17\5\17\u00ed\n\17\3\20\3\20\3\20\5\20\u00f2\n\20"+
		"\3\20\3\20\3\20\5\20\u00f7\n\20\7\20\u00f9\n\20\f\20\16\20\u00fc\13\20"+
		"\3\20\3\20\3\21\3\21\6\21\u0102\n\21\r\21\16\21\u0103\3\22\3\22\3\22\3"+
		"\22\5\22\u010a\n\22\3\22\3\22\6\22\u010e\n\22\r\22\16\22\u010f\3\22\3"+
		"\22\3\23\5\23\u0115\n\23\3\23\3\23\5\23\u0119\n\23\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u0122\n\25\3\25\3\25\3\25\3\25\5\25\u0128\n\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\7\26\u0139\n\26\f\26\16\26\u013c\13\26\3\26\3\26\3\26\3\26\5\26\u0142"+
		"\n\26\3\27\3\27\5\27\u0146\n\27\3\27\3\27\3\27\7\27\u014b\n\27\f\27\16"+
		"\27\u014e\13\27\3\30\3\30\3\30\3\30\3\30\7\30\u0155\n\30\f\30\16\30\u0158"+
		"\13\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u0169\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\7\31\u0177\n\31\f\31\16\31\u017a\13\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u0184\n\32\3\32\3\32\3\32\5\32\u0189\n"+
		"\32\3\32\3\32\3\32\3\32\3\32\5\32\u0190\n\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u0199\n\32\3\33\3\33\3\33\3\34\3\34\3\34\5\34\u01a1\n"+
		"\34\3\35\3\35\5\35\u01a5\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u01b1\n\35\3\36\3\36\3\36\3\36\7\36\u01b7\n\36\f\36\16"+
		"\36\u01ba\13\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3\"\3\""+
		"\5\"\u01cb\n\"\3#\3#\3#\5#\u01d0\n#\3#\3#\3#\3#\5#\u01d6\n#\3#\3#\3#\3"+
		"$\3$\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\2\4\b\60\'\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\b\4\2+\61KK\3\2\20\22"+
		"\4\2\64\64II\4\2\26\26\31\37\3\2 %\6\2JJNNPPRS\2\u0209\2M\3\2\2\2\4U\3"+
		"\2\2\2\6e\3\2\2\2\bp\3\2\2\2\n\u0088\3\2\2\2\f\u0090\3\2\2\2\16\u0093"+
		"\3\2\2\2\20\u009b\3\2\2\2\22\u00c1\3\2\2\2\24\u00c7\3\2\2\2\26\u00c9\3"+
		"\2\2\2\30\u00cb\3\2\2\2\32\u00cf\3\2\2\2\34\u00dc\3\2\2\2\36\u00ee\3\2"+
		"\2\2 \u0101\3\2\2\2\"\u0105\3\2\2\2$\u0114\3\2\2\2&\u011a\3\2\2\2(\u0121"+
		"\3\2\2\2*\u0141\3\2\2\2,\u0145\3\2\2\2.\u014f\3\2\2\2\60\u0168\3\2\2\2"+
		"\62\u0198\3\2\2\2\64\u019a\3\2\2\2\66\u01a0\3\2\2\28\u01b0\3\2\2\2:\u01b8"+
		"\3\2\2\2<\u01bb\3\2\2\2>\u01bf\3\2\2\2@\u01c5\3\2\2\2B\u01ca\3\2\2\2D"+
		"\u01cc\3\2\2\2F\u01da\3\2\2\2H\u01e0\3\2\2\2J\u01e3\3\2\2\2LN\5\4\3\2"+
		"ML\3\2\2\2MN\3\2\2\2NR\3\2\2\2OQ\5 \21\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2"+
		"RS\3\2\2\2S\3\3\2\2\2TR\3\2\2\2UV\7\3\2\2VZ\7\4\2\2W[\5\6\4\2X[\5\30\r"+
		"\2Y[\5\32\16\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]"+
		"\3\2\2\2]^\3\2\2\2^_\7\5\2\2_\5\3\2\2\2`a\7\6\2\2ab\5\b\5\2bc\7\7\2\2"+
		"cd\7\b\2\2df\3\2\2\2e`\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\7K\2\2hk\7\6\2\2"+
		"il\5\b\5\2jl\5\n\6\2ki\3\2\2\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7\7\2\2"+
		"no\7\t\2\2o\7\3\2\2\2pq\b\5\1\2qv\5\26\f\2rs\7\n\2\2su\7\13\2\2tr\3\2"+
		"\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\u0085\3\2\2\2xv\3\2\2\2yz\f\3\2\2"+
		"z{\7\f\2\2{\u0080\5\26\f\2|}\7\n\2\2}\177\7\13\2\2~|\3\2\2\2\177\u0082"+
		"\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0084\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0083y\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2"+
		"\u0085\u0086\3\2\2\2\u0086\t\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008d\5"+
		"\16\b\2\u0089\u008a\7\f\2\2\u008a\u008c\5\16\b\2\u008b\u0089\3\2\2\2\u008c"+
		"\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\13\3\2\2"+
		"\2\u008f\u008d\3\2\2\2\u0090\u0091\7\n\2\2\u0091\u0092\7\13\2\2\u0092"+
		"\r\3\2\2\2\u0093\u0094\5\26\f\2\u0094\u0098\7K\2\2\u0095\u0097\5\f\7\2"+
		"\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099"+
		"\3\2\2\2\u0099\17\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u00a0\7\4\2\2\u009c"+
		"\u009f\5\22\n\2\u009d\u009f\5\32\16\2\u009e\u009c\3\2\2\2\u009e\u009d"+
		"\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7\5\2\2\u00a4\21\3\2\2"+
		"\2\u00a5\u00a6\5*\26\2\u00a6\u00a7\7\t\2\2\u00a7\u00c2\3\2\2\2\u00a8\u00a9"+
		"\5\62\32\2\u00a9\u00aa\7\t\2\2\u00aa\u00c2\3\2\2\2\u00ab\u00c2\58\35\2"+
		"\u00ac\u00c2\5B\"\2\u00ad\u00ae\7<\2\2\u00ae\u00c2\7\t\2\2\u00af\u00b0"+
		"\7\r\2\2\u00b0\u00b1\7K\2\2\u00b1\u00c2\7\t\2\2\u00b2\u00c2\5H%\2\u00b3"+
		"\u00b4\5\60\31\2\u00b4\u00b5\7\t\2\2\u00b5\u00c2\3\2\2\2\u00b6\u00c2\5"+
		"\24\13\2\u00b7\u00bc\7\65\2\2\u00b8\u00b9\7\n\2\2\u00b9\u00bb\7\13\2\2"+
		"\u00ba\u00b8\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd"+
		"\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\7K\2\2\u00c0"+
		"\u00c2\7\t\2\2\u00c1\u00a5\3\2\2\2\u00c1\u00a8\3\2\2\2\u00c1\u00ab\3\2"+
		"\2\2\u00c1\u00ac\3\2\2\2\u00c1\u00ad\3\2\2\2\u00c1\u00af\3\2\2\2\u00c1"+
		"\u00b2\3\2\2\2\u00c1\u00b3\3\2\2\2\u00c1\u00b6\3\2\2\2\u00c1\u00b7\3\2"+
		"\2\2\u00c2\23\3\2\2\2\u00c3\u00c4\78\2\2\u00c4\u00c8\7\t\2\2\u00c5\u00c6"+
		"\7F\2\2\u00c6\u00c8\7\t\2\2\u00c7\u00c3\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8"+
		"\25\3\2\2\2\u00c9\u00ca\t\2\2\2\u00ca\27\3\2\2\2\u00cb\u00cc\7K\2\2\u00cc"+
		"\u00cd\7\t\2\2\u00cd\31\3\2\2\2\u00ce\u00d0\7B\2\2\u00cf\u00ce\3\2\2\2"+
		"\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\5\26\f\2\u00d2\u00d7"+
		"\5\34\17\2\u00d3\u00d4\7\f\2\2\u00d4\u00d6\5\34\17\2\u00d5\u00d3\3\2\2"+
		"\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da"+
		"\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7\t\2\2\u00db\33\3\2\2\2\u00dc"+
		"\u00e2\7K\2\2\u00dd\u00de\7\n\2\2\u00de\u00df\7J\2\2\u00df\u00e1\7\13"+
		"\2\2\u00e0\u00dd\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00ec\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00ea\7\b"+
		"\2\2\u00e6\u00eb\5\60\31\2\u00e7\u00eb\5\36\20\2\u00e8\u00e9\7\62\2\2"+
		"\u00e9\u00eb\7K\2\2\u00ea\u00e6\3\2\2\2\u00ea\u00e7\3\2\2\2\u00ea\u00e8"+
		"\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00e5\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\35\3\2\2\2\u00ee\u00f1\7\n\2\2\u00ef\u00f2\5\60\31\2\u00f0\u00f2\5\36"+
		"\20\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00fa\3\2\2\2\u00f3"+
		"\u00f6\7\f\2\2\u00f4\u00f7\5\60\31\2\u00f5\u00f7\5\36\20\2\u00f6\u00f4"+
		"\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f3\3\2\2\2\u00f9"+
		"\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2"+
		"\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\7\13\2\2\u00fe\37\3\2\2\2\u00ff\u0102"+
		"\5\"\22\2\u0100\u0102\5(\25\2\u0101\u00ff\3\2\2\2\u0101\u0100\3\2\2\2"+
		"\u0102\u0103\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104!\3"+
		"\2\2\2\u0105\u0106\7\16\2\2\u0106\u0109\7K\2\2\u0107\u0108\7\17\2\2\u0108"+
		"\u010a\7K\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2"+
		"\2\2\u010b\u010d\7\4\2\2\u010c\u010e\5$\23\2\u010d\u010c\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\u0112\7\5\2\2\u0112#\3\2\2\2\u0113\u0115\5&\24\2\u0114\u0113"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0119\5\32\16\2"+
		"\u0117\u0119\5(\25\2\u0118\u0116\3\2\2\2\u0118\u0117\3\2\2\2\u0119%\3"+
		"\2\2\2\u011a\u011b\t\3\2\2\u011b\'\3\2\2\2\u011c\u011d\7\6\2\2\u011d\u011e"+
		"\5\n\6\2\u011e\u011f\7\7\2\2\u011f\u0120\7\b\2\2\u0120\u0122\3\2\2\2\u0121"+
		"\u011c\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\7C"+
		"\2\2\u0124\u0125\7K\2\2\u0125\u0127\7\6\2\2\u0126\u0128\5\n\6\2\u0127"+
		"\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\7\7"+
		"\2\2\u012a\u012b\5\20\t\2\u012b)\3\2\2\2\u012c\u012d\5,\27\2\u012d\u012e"+
		"\7\b\2\2\u012e\u012f\5\60\31\2\u012f\u0142\3\2\2\2\u0130\u0131\5,\27\2"+
		"\u0131\u0132\7\b\2\2\u0132\u0133\7?\2\2\u0133\u0142\3\2\2\2\u0134\u0135"+
		"\7\6\2\2\u0135\u013a\5,\27\2\u0136\u0137\7\f\2\2\u0137\u0139\5,\27\2\u0138"+
		"\u0136\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2"+
		"\2\2\u013b\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013e\7\7\2\2\u013e"+
		"\u013f\7\b\2\2\u013f\u0140\5\62\32\2\u0140\u0142\3\2\2\2\u0141\u012c\3"+
		"\2\2\2\u0141\u0130\3\2\2\2\u0141\u0134\3\2\2\2\u0142+\3\2\2\2\u0143\u0144"+
		"\t\4\2\2\u0144\u0146\7\23\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2"+
		"\u0146\u0147\3\2\2\2\u0147\u014c\5.\30\2\u0148\u0149\7\23\2\2\u0149\u014b"+
		"\5.\30\2\u014a\u0148\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d-\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0156\7K\2\2\u0150"+
		"\u0151\7\n\2\2\u0151\u0152\5\60\31\2\u0152\u0153\7\13\2\2\u0153\u0155"+
		"\3\2\2\2\u0154\u0150\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157/\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015a\b\31\1\2"+
		"\u015a\u015b\7\24\2\2\u015b\u0169\5\60\31\16\u015c\u015d\7\25\2\2\u015d"+
		"\u0169\5\60\31\r\u015e\u015f\7\26\2\2\u015f\u0169\5\60\31\f\u0160\u0161"+
		"\7\6\2\2\u0161\u0162\5\60\31\2\u0162\u0163\7\7\2\2\u0163\u0169\3\2\2\2"+
		"\u0164\u0169\5J&\2\u0165\u0169\5\62\32\2\u0166\u0169\5,\27\2\u0167\u0169"+
		"\7H\2\2\u0168\u0159\3\2\2\2\u0168\u015c\3\2\2\2\u0168\u015e\3\2\2\2\u0168"+
		"\u0160\3\2\2\2\u0168\u0164\3\2\2\2\u0168\u0165\3\2\2\2\u0168\u0166\3\2"+
		"\2\2\u0168\u0167\3\2\2\2\u0169\u0178\3\2\2\2\u016a\u016b\f\n\2\2\u016b"+
		"\u016c\7\27\2\2\u016c\u0177\5\60\31\13\u016d\u016e\f\t\2\2\u016e\u016f"+
		"\7\30\2\2\u016f\u0177\5\60\31\n\u0170\u0171\f\b\2\2\u0171\u0172\t\5\2"+
		"\2\u0172\u0177\5\60\31\t\u0173\u0174\f\7\2\2\u0174\u0175\t\6\2\2\u0175"+
		"\u0177\5\60\31\b\u0176\u016a\3\2\2\2\u0176\u016d\3\2\2\2\u0176\u0170\3"+
		"\2\2\2\u0176\u0173\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\61\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017c\79\2\2"+
		"\u017c\u017d\7\6\2\2\u017d\u017e\5,\27\2\u017e\u017f\7\7\2\2\u017f\u0199"+
		"\3\2\2\2\u0180\u0181\5,\27\2\u0181\u0182\7\23\2\2\u0182\u0184\3\2\2\2"+
		"\u0183\u0180\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186"+
		"\7K\2\2\u0186\u0188\7\6\2\2\u0187\u0189\5\64\33\2\u0188\u0187\3\2\2\2"+
		"\u0188\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u0199\7\7\2\2\u018b\u018c"+
		"\7@\2\2\u018c\u018f\7\6\2\2\u018d\u0190\5\26\f\2\u018e\u0190\5,\27\2\u018f"+
		"\u018d\3\2\2\2\u018f\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\7\7"+
		"\2\2\u0192\u0199\3\2\2\2\u0193\u0194\7A\2\2\u0194\u0195\7\6\2\2\u0195"+
		"\u0196\5,\27\2\u0196\u0197\7\7\2\2\u0197\u0199\3\2\2\2\u0198\u017b\3\2"+
		"\2\2\u0198\u0183\3\2\2\2\u0198\u018b\3\2\2\2\u0198\u0193\3\2\2\2\u0199"+
		"\63\3\2\2\2\u019a\u019b\5\60\31\2\u019b\u019c\5\66\34\2\u019c\65\3\2\2"+
		"\2\u019d\u019e\7\f\2\2\u019e\u01a1\5\64\33\2\u019f\u01a1\3\2\2\2\u01a0"+
		"\u019d\3\2\2\2\u01a0\u019f\3\2\2\2\u01a1\67\3\2\2\2\u01a2\u01a4\5> \2"+
		"\u01a3\u01a5\5@!\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01b1"+
		"\3\2\2\2\u01a6\u01a7\7E\2\2\u01a7\u01a8\7\6\2\2\u01a8\u01a9\5,\27\2\u01a9"+
		"\u01aa\7&\2\2\u01aa\u01ab\7\17\2\2\u01ab\u01ac\7\4\2\2\u01ac\u01ad\5:"+
		"\36\2\u01ad\u01ae\5<\37\2\u01ae\u01af\7\5\2\2\u01af\u01b1\3\2\2\2\u01b0"+
		"\u01a2\3\2\2\2\u01b0\u01a6\3\2\2\2\u01b19\3\2\2\2\u01b2\u01b3\7:\2\2\u01b3"+
		"\u01b4\7J\2\2\u01b4\u01b5\7\17\2\2\u01b5\u01b7\5\20\t\2\u01b6\u01b2\3"+
		"\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9"+
		";\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bc\7\63\2\2\u01bc\u01bd\7\17\2"+
		"\2\u01bd\u01be\5\20\t\2\u01be=\3\2\2\2\u01bf\u01c0\7\66\2\2\u01c0\u01c1"+
		"\7\6\2\2\u01c1\u01c2\5\60\31\2\u01c2\u01c3\7\7\2\2\u01c3\u01c4\5\20\t"+
		"\2\u01c4?\3\2\2\2\u01c5\u01c6\7;\2\2\u01c6\u01c7\5\20\t\2\u01c7A\3\2\2"+
		"\2\u01c8\u01cb\5D#\2\u01c9\u01cb\5F$\2\u01ca\u01c8\3\2\2\2\u01ca\u01c9"+
		"\3\2\2\2\u01cbC\3\2\2\2\u01cc\u01cd\7D\2\2\u01cd\u01cf\7\6\2\2\u01ce\u01d0"+
		"\5\32\16\2\u01cf\u01ce\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\3\2\2\2"+
		"\u01d1\u01d2\7\t\2\2\u01d2\u01d3\5\60\31\2\u01d3\u01d5\7\t\2\2\u01d4\u01d6"+
		"\5*\26\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7"+
		"\u01d8\7\7\2\2\u01d8\u01d9\5\20\t\2\u01d9E\3\2\2\2\u01da\u01db\7=\2\2"+
		"\u01db\u01dc\7\6\2\2\u01dc\u01dd\5\60\31\2\u01dd\u01de\7\7\2\2\u01de\u01df"+
		"\5\20\t\2\u01dfG\3\2\2\2\u01e0\u01e1\7K\2\2\u01e1\u01e2\7\17\2\2\u01e2"+
		"I\3\2\2\2\u01e3\u01e4\t\7\2\2\u01e4K\3\2\2\2\65MRZ\\ekv\u0080\u0085\u008d"+
		"\u0098\u009e\u00a0\u00bc\u00c1\u00c7\u00cf\u00d7\u00e2\u00ea\u00ec\u00f1"+
		"\u00f6\u00fa\u0101\u0103\u0109\u010f\u0114\u0118\u0121\u0127\u013a\u0141"+
		"\u0145\u014c\u0156\u0168\u0176\u0178\u0183\u0188\u018f\u0198\u01a0\u01a4"+
		"\u01b0\u01b8\u01ca\u01cf\u01d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}