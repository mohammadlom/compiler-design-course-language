// Generated from C:/Users/Mohammad/IdeaProjects/compiler-design-course-language/src\lulu2.g4 by ANTLR 4.7
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
		Single_line_c=25, Multi_line_c=26, OCONTROLLS=27, OBLOCK=28, INT=29, BOOL=30, 
		FLOAT=31, LONG=32, DOUBLE=33, STRING=34, CHAR=35, ALLOCATE=36, DEFAULT=37, 
		THIS=38, DESTRUCT=39, IF=40, TRUE=41, BREAK=42, READ=43, CASE=44, ELSE=45, 
		RETURN=46, WHILE=47, FALSE=48, NEW=49, SIZEOF=50, WRITE=51, CONST=52, 
		FUNCTION=53, FOR=54, SWITCH=55, CONTINUE=56, OF=57, NIL=58, SUPER=59, 
		Int_const=60, ID=61, LETTER=62, OptionalExponent=63, REAL_CONST=64, REAL_FACT=65, 
		CHAR_CONST=66, ASCII=67, Bool_const=68, String_const=69, GOTO=70, ARITHMETIC=71, 
		RELATIONAL=72, WS=73;
	public static final int
		RULE_program = 0, RULE_comments = 1, RULE_ft_dcl = 2, RULE_func_dcl = 3, 
		RULE_args = 4, RULE_args_var = 5, RULE_block = 6, RULE_stmt = 7, RULE_type = 8, 
		RULE_type_dcl = 9, RULE_var_def = 10, RULE_var_val = 11, RULE_list = 12, 
		RULE_ft_def = 13, RULE_type_def = 14, RULE_component = 15, RULE_access_modifier = 16, 
		RULE_fun_def = 17, RULE_assign = 18, RULE_np2 = 19, RULE_var = 20, RULE_ref = 21, 
		RULE_expr = 22, RULE_fact = 23, RULE_func_call = 24, RULE_params = 25, 
		RULE_np = 26, RULE_cond_stmt = 27, RULE_loop_stmt = 28, RULE_label = 29, 
		RULE_const_val = 30, RULE_bit_unary_op = 31, RULE_bit_binary_op = 32, 
		RULE_binary_op = 33;
	public static final String[] ruleNames = {
		"program", "comments", "ft_dcl", "func_dcl", "args", "args_var", "block", 
		"stmt", "type", "type_dcl", "var_def", "var_val", "list", "ft_def", "type_def", 
		"component", "access_modifier", "fun_def", "assign", "np2", "var", "ref", 
		"expr", "fact", "func_call", "params", "np", "cond_stmt", "loop_stmt", 
		"label", "const_val", "bit_unary_op", "bit_binary_op", "binary_op"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'declare'", "'{'", "'}'", "'('", "')'", "'='", "';'", "'['", "']'", 
		"','", "':'", "'private'", "'public'", "'protected'", "'.'", "') of'", 
		"'-'", "'!'", "'~'", "'&'", "'|'", "'^'", "'||'", "'&&'", null, null, 
		null, null, "'int'", "'bool'", "'float'", "'long'", "'double'", "'string'", 
		"'char'", "'allocate'", "'default'", "'this'", "'destruct'", "'if'", "'true'", 
		"'break'", "'read'", "'case'", "'else'", "'return'", "'while'", "'false'", 
		"'new'", "'sizeof'", "'write'", "'const'", "'function'", "'for'", "'switch'", 
		"'continue'", "'of'", "'nil'", "'super'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "Single_line_c", "Multi_line_c", "OCONTROLLS", "OBLOCK", "INT", 
		"BOOL", "FLOAT", "LONG", "DOUBLE", "STRING", "CHAR", "ALLOCATE", "DEFAULT", 
		"THIS", "DESTRUCT", "IF", "TRUE", "BREAK", "READ", "CASE", "ELSE", "RETURN", 
		"WHILE", "FALSE", "NEW", "SIZEOF", "WRITE", "CONST", "FUNCTION", "FOR", 
		"SWITCH", "CONTINUE", "OF", "NIL", "SUPER", "Int_const", "ID", "LETTER", 
		"OptionalExponent", "REAL_CONST", "REAL_FACT", "CHAR_CONST", "ASCII", 
		"Bool_const", "String_const", "GOTO", "ARITHMETIC", "RELATIONAL", "WS"
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
		public List<CommentsContext> comments() {
			return getRuleContexts(CommentsContext.class);
		}
		public CommentsContext comments(int i) {
			return getRuleContext(CommentsContext.class,i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(68);
					comments();
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(74);
				ft_dcl();
				}
			}

			{
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(77);
					comments();
					}
					} 
				}
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << LONG) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << FUNCTION) | (1L << ID))) != 0)) {
				{
				{
				setState(83);
				ft_def();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Single_line_c || _la==Multi_line_c) {
				{
				{
				setState(89);
				comments();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class CommentsContext extends ParserRuleContext {
		public TerminalNode Single_line_c() { return getToken(lulu2Parser.Single_line_c, 0); }
		public TerminalNode Multi_line_c() { return getToken(lulu2Parser.Multi_line_c, 0); }
		public CommentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).enterComments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lulu2Listener ) ((lulu2Listener)listener).exitComments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lulu2Visitor ) return ((lulu2Visitor<? extends T>)visitor).visitComments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentsContext comments() throws RecognitionException {
		CommentsContext _localctx = new CommentsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_la = _input.LA(1);
			if ( !(_la==Single_line_c || _la==Multi_line_c) ) {
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
		public List<CommentsContext> comments() {
			return getRuleContexts(CommentsContext.class);
		}
		public CommentsContext comments(int i) {
			return getRuleContext(CommentsContext.class,i);
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
		enterRule(_localctx, 4, RULE_ft_dcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__0);
			setState(98);
			match(T__1);
			setState(103); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(103);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(99);
					func_dcl();
					}
					break;
				case 2:
					{
					setState(100);
					type_dcl();
					}
					break;
				case 3:
					{
					setState(101);
					var_def();
					}
					break;
				case 4:
					{
					setState(102);
					comments();
					}
					break;
				}
				}
				setState(105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << Single_line_c) | (1L << Multi_line_c) | (1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << LONG) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << CONST) | (1L << ID))) != 0) );
			setState(107);
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
		enterRule(_localctx, 6, RULE_func_dcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(109);
				match(T__3);
				setState(110);
				args(0);
				setState(111);
				match(T__4);
				setState(112);
				match(T__5);
				}
			}

			setState(116);
			match(ID);
			setState(117);
			match(T__3);
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(118);
				args(0);
				}
				break;
			case 2:
				{
				setState(119);
				args_var(0);
				}
				break;
			}
			setState(122);
			match(T__4);
			setState(123);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_args, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(126);
			type();
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(127);
					match(T__7);
					setState(128);
					match(T__8);
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_args);
					setState(134);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(135);
					match(T__9);
					setState(136);
					type();
					setState(141);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(137);
							match(T__7);
							setState(138);
							match(T__8);
							}
							} 
						}
						setState(143);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					}
					}
					} 
				}
				setState(148);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_args_var, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(150);
			type();
			setState(151);
			match(ID);
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(152);
					match(T__7);
					setState(153);
					match(T__8);
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Args_varContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_args_var);
					setState(159);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(160);
					match(T__9);
					setState(161);
					type();
					setState(162);
					match(ID);
					setState(167);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(163);
							match(T__7);
							setState(164);
							match(T__8);
							}
							} 
						}
						setState(169);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					}
					}
					} 
				}
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		public List<CommentsContext> comments() {
			return getRuleContexts(CommentsContext.class);
		}
		public CommentsContext comments(int i) {
			return getRuleContext(CommentsContext.class,i);
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
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__1);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << Single_line_c) | (1L << Multi_line_c) | (1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << LONG) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << THIS) | (1L << DESTRUCT) | (1L << IF) | (1L << BREAK) | (1L << READ) | (1L << RETURN) | (1L << WHILE) | (1L << SIZEOF) | (1L << WRITE) | (1L << CONST) | (1L << FOR) | (1L << SWITCH) | (1L << CONTINUE) | (1L << NIL) | (1L << SUPER) | (1L << Int_const) | (1L << ID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (REAL_CONST - 64)) | (1L << (CHAR_CONST - 64)) | (1L << (Bool_const - 64)) | (1L << (String_const - 64)) | (1L << (GOTO - 64)))) != 0)) {
				{
				setState(179);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(176);
					stmt();
					}
					break;
				case 2:
					{
					setState(177);
					var_def();
					}
					break;
				case 3:
					{
					setState(178);
					comments();
					}
					break;
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
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
		enterRule(_localctx, 14, RULE_stmt);
		int _la;
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				assign();
				setState(187);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				func_call();
				setState(190);
				match(T__6);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				cond_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				loop_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(194);
				match(RETURN);
				setState(195);
				match(T__6);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(196);
				match(GOTO);
				setState(197);
				match(T__6);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(198);
				label();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(199);
				expr();
				setState(200);
				match(T__6);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(202);
				match(BREAK);
				setState(203);
				match(T__6);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(204);
				match(CONTINUE);
				setState(205);
				match(T__6);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(206);
				match(DESTRUCT);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(207);
					match(T__7);
					setState(208);
					match(T__8);
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(214);
				match(ID);
				setState(215);
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
		enterRule(_localctx, 16, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
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
		enterRule(_localctx, 18, RULE_type_dcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(ID);
			setState(221);
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
		enterRule(_localctx, 20, RULE_var_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(223);
				match(CONST);
				}
			}

			setState(226);
			type();
			setState(227);
			var_val();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(228);
				match(T__9);
				setState(229);
				var_val();
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235);
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
		enterRule(_localctx, 22, RULE_var_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(ID);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(238);
				match(T__7);
				setState(239);
				match(Int_const);
				setState(240);
				match(T__8);
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(246);
				match(T__5);
				setState(251);
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
					setState(247);
					expr();
					}
					break;
				case T__7:
					{
					setState(248);
					list();
					}
					break;
				case ALLOCATE:
					{
					setState(249);
					match(ALLOCATE);
					setState(250);
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
		enterRule(_localctx, 24, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(T__7);
			setState(258);
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
				setState(256);
				expr();
				}
				break;
			case T__7:
				{
				setState(257);
				list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(260);
				match(T__9);
				setState(263);
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
					setState(261);
					expr();
					}
					break;
				case T__7:
					{
					setState(262);
					list();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270);
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
		enterRule(_localctx, 26, RULE_ft_def);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(274); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(274);
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
						setState(272);
						type_def();
						}
						break;
					case T__3:
					case FUNCTION:
						{
						setState(273);
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
				setState(276); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		public List<CommentsContext> comments() {
			return getRuleContexts(CommentsContext.class);
		}
		public CommentsContext comments(int i) {
			return getRuleContext(CommentsContext.class,i);
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
		enterRule(_localctx, 28, RULE_type_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			type();
			setState(279);
			match(ID);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(280);
				match(T__10);
				setState(281);
				match(ID);
				}
			}

			setState(284);
			match(T__1);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Single_line_c || _la==Multi_line_c) {
				{
				{
				setState(285);
				comments();
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(291);
				component();
				}
				}
				setState(294); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << LONG) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << CONST) | (1L << FUNCTION) | (1L << ID))) != 0) );
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Single_line_c || _la==Multi_line_c) {
				{
				{
				setState(296);
				comments();
				}
				}
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(302);
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
		enterRule(_localctx, 30, RULE_component);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) {
				{
				setState(304);
				access_modifier();
				}
			}

			setState(309);
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
				setState(307);
				var_def();
				}
				break;
			case T__3:
			case FUNCTION:
				{
				setState(308);
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
		enterRule(_localctx, 32, RULE_access_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
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
		enterRule(_localctx, 34, RULE_fun_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(313);
				match(T__3);
				setState(314);
				args_var(0);
				setState(315);
				match(T__4);
				setState(316);
				match(T__5);
				}
			}

			setState(320);
			match(FUNCTION);
			setState(321);
			match(ID);
			setState(322);
			match(T__3);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << LONG) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << ID))) != 0)) {
				{
				setState(323);
				args_var(0);
				}
			}

			setState(326);
			match(T__4);
			setState(327);
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
		enterRule(_localctx, 36, RULE_assign);
		int _la;
		try {
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
			case SUPER:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				var();
				setState(330);
				match(T__5);
				setState(331);
				np2();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				match(T__3);
				setState(334);
				var();
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(335);
					match(T__9);
					setState(336);
					var();
					}
					}
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(342);
				match(T__4);
				setState(343);
				match(T__5);
				setState(344);
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
		enterRule(_localctx, 38, RULE_np2);
		try {
			setState(350);
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
				setState(348);
				expr();
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
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
		enterRule(_localctx, 40, RULE_var);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THIS || _la==SUPER) {
				{
				setState(352);
				_la = _input.LA(1);
				if ( !(_la==THIS || _la==SUPER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(353);
				match(T__14);
				}
			}

			setState(356);
			ref();
			setState(361);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(357);
					match(T__14);
					setState(358);
					ref();
					}
					} 
				}
				setState(363);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
		enterRule(_localctx, 42, RULE_ref);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(ID);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(365);
				match(T__7);
				setState(366);
				expr();
				setState(367);
				match(T__8);
				}
				}
				setState(373);
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
		enterRule(_localctx, 44, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(374);
				match(T__3);
				setState(375);
				expr();
				setState(376);
				match(T__4);
				}
				break;
			case 2:
				{
				setState(378);
				bit_unary_op();
				setState(379);
				match(Int_const);
				}
				break;
			case 3:
				{
				setState(381);
				const_val();
				}
				break;
			case 4:
				{
				setState(382);
				func_call();
				}
				break;
			case 5:
				{
				setState(383);
				var();
				}
				break;
			case 6:
				{
				setState(384);
				match(NIL);
				}
				break;
			case 7:
				{
				setState(385);
				match(Int_const);
				setState(386);
				bit_binary_op();
				setState(387);
				match(Int_const);
				}
				break;
			}
			setState(391);
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
		enterRule(_localctx, 46, RULE_fact);
		try {
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				binary_op();
				{
				setState(394);
				expr();
				}
				setState(395);
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
		enterRule(_localctx, 48, RULE_func_call);
		int _la;
		try {
			setState(429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				match(READ);
				setState(401);
				match(T__3);
				setState(402);
				var();
				setState(403);
				match(T__4);
				}
				break;
			case THIS:
			case SUPER:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(405);
					var();
					setState(406);
					match(T__14);
					}
					break;
				}
				setState(410);
				match(ID);
				setState(411);
				match(T__3);
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << THIS) | (1L << READ) | (1L << SIZEOF) | (1L << WRITE) | (1L << NIL) | (1L << SUPER) | (1L << Int_const) | (1L << ID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (REAL_CONST - 64)) | (1L << (CHAR_CONST - 64)) | (1L << (Bool_const - 64)) | (1L << (String_const - 64)))) != 0)) {
					{
					setState(412);
					params();
					}
				}

				setState(415);
				match(T__4);
				}
				break;
			case SIZEOF:
				enterOuterAlt(_localctx, 3);
				{
				setState(416);
				match(SIZEOF);
				setState(417);
				match(T__3);
				setState(420);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(418);
					type();
					}
					break;
				case 2:
					{
					setState(419);
					var();
					}
					break;
				}
				setState(422);
				match(T__4);
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 4);
				{
				setState(424);
				match(WRITE);
				setState(425);
				match(T__3);
				setState(426);
				var();
				setState(427);
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
			setState(431);
			expr();
			setState(432);
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
			setState(437);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				match(T__9);
				setState(435);
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
		enterRule(_localctx, 54, RULE_cond_stmt);
		int _la;
		try {
			setState(468);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				match(IF);
				setState(440);
				match(T__3);
				setState(441);
				expr();
				setState(442);
				match(T__4);
				setState(443);
				block();
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(444);
					match(ELSE);
					setState(445);
					block();
					}
				}

				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				match(SWITCH);
				setState(449);
				match(T__3);
				setState(450);
				var();
				setState(451);
				match(T__15);
				setState(452);
				match(T__10);
				setState(453);
				match(T__1);
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE) {
					{
					{
					setState(454);
					match(CASE);
					setState(455);
					match(Int_const);
					setState(456);
					match(T__10);
					setState(457);
					block();
					}
					}
					setState(462);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(463);
				match(DEFAULT);
				setState(464);
				match(T__10);
				setState(465);
				block();
				setState(466);
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
		enterRule(_localctx, 56, RULE_loop_stmt);
		int _la;
		try {
			setState(490);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				match(FOR);
				setState(471);
				match(T__3);
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << LONG) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << CONST) | (1L << ID))) != 0)) {
					{
					setState(472);
					var_def();
					}
				}

				setState(475);
				match(T__6);
				setState(476);
				expr();
				setState(477);
				match(T__6);
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << THIS) | (1L << SUPER) | (1L << ID))) != 0)) {
					{
					setState(478);
					assign();
					}
				}

				setState(481);
				match(T__4);
				setState(482);
				block();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(484);
				match(WHILE);
				setState(485);
				match(T__3);
				setState(486);
				expr();
				setState(487);
				match(T__4);
				setState(488);
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
		enterRule(_localctx, 58, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(ID);
			setState(493);
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
		enterRule(_localctx, 60, RULE_const_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			_la = _input.LA(1);
			if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (Int_const - 60)) | (1L << (REAL_CONST - 60)) | (1L << (CHAR_CONST - 60)) | (1L << (Bool_const - 60)) | (1L << (String_const - 60)))) != 0)) ) {
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
		enterRule(_localctx, 62, RULE_bit_unary_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
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
		enterRule(_localctx, 64, RULE_bit_binary_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
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
		enterRule(_localctx, 66, RULE_binary_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
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
		case 4:
			return args_sempred((ArgsContext)_localctx, predIndex);
		case 5:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3K\u01fa\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\7\2H\n\2\f\2\16\2K\13\2\3\2\5\2N\n\2\3\2\7\2Q\n"+
		"\2\f\2\16\2T\13\2\3\2\7\2W\n\2\f\2\16\2Z\13\2\3\2\7\2]\n\2\f\2\16\2`\13"+
		"\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\6\4j\n\4\r\4\16\4k\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\5\5u\n\5\3\5\3\5\3\5\3\5\5\5{\n\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\7\6\u0084\n\6\f\6\16\6\u0087\13\6\3\6\3\6\3\6\3\6\3\6\7\6\u008e\n"+
		"\6\f\6\16\6\u0091\13\6\7\6\u0093\n\6\f\6\16\6\u0096\13\6\3\7\3\7\3\7\3"+
		"\7\3\7\7\7\u009d\n\7\f\7\16\7\u00a0\13\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00a8"+
		"\n\7\f\7\16\7\u00ab\13\7\7\7\u00ad\n\7\f\7\16\7\u00b0\13\7\3\b\3\b\3\b"+
		"\3\b\7\b\u00b6\n\b\f\b\16\b\u00b9\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7"+
		"\t\u00d4\n\t\f\t\16\t\u00d7\13\t\3\t\3\t\5\t\u00db\n\t\3\n\3\n\3\13\3"+
		"\13\3\13\3\f\5\f\u00e3\n\f\3\f\3\f\3\f\3\f\7\f\u00e9\n\f\f\f\16\f\u00ec"+
		"\13\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u00f4\n\r\f\r\16\r\u00f7\13\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u00fe\n\r\5\r\u0100\n\r\3\16\3\16\3\16\5\16\u0105\n"+
		"\16\3\16\3\16\3\16\5\16\u010a\n\16\7\16\u010c\n\16\f\16\16\16\u010f\13"+
		"\16\3\16\3\16\3\17\3\17\6\17\u0115\n\17\r\17\16\17\u0116\3\20\3\20\3\20"+
		"\3\20\5\20\u011d\n\20\3\20\3\20\7\20\u0121\n\20\f\20\16\20\u0124\13\20"+
		"\3\20\6\20\u0127\n\20\r\20\16\20\u0128\3\20\7\20\u012c\n\20\f\20\16\20"+
		"\u012f\13\20\3\20\3\20\3\21\5\21\u0134\n\21\3\21\3\21\5\21\u0138\n\21"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u0141\n\23\3\23\3\23\3\23\3\23"+
		"\5\23\u0147\n\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\7\24\u0154\n\24\f\24\16\24\u0157\13\24\3\24\3\24\3\24\3\24\5\24\u015d"+
		"\n\24\3\25\3\25\5\25\u0161\n\25\3\26\3\26\5\26\u0165\n\26\3\26\3\26\3"+
		"\26\7\26\u016a\n\26\f\26\16\26\u016d\13\26\3\27\3\27\3\27\3\27\3\27\7"+
		"\27\u0174\n\27\f\27\16\27\u0177\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0188\n\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u0191\n\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u019b\n\32\3\32\3\32\3\32\5\32\u01a0\n\32\3\32\3\32\3"+
		"\32\3\32\3\32\5\32\u01a7\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u01b0\n\32\3\33\3\33\3\33\3\34\3\34\3\34\5\34\u01b8\n\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\5\35\u01c1\n\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\7\35\u01cd\n\35\f\35\16\35\u01d0\13\35\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u01d7\n\35\3\36\3\36\3\36\5\36\u01dc\n\36\3\36\3"+
		"\36\3\36\3\36\5\36\u01e2\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\5\36\u01ed\n\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\2\4"+
		"\n\f$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>"+
		"@BD\2\n\3\2\33\34\4\2\37%??\3\2\16\20\4\2((==\6\2>>BBDDFG\3\2\23\25\3"+
		"\2\26\32\3\2IJ\2\u0224\2I\3\2\2\2\4a\3\2\2\2\6c\3\2\2\2\bt\3\2\2\2\n\177"+
		"\3\2\2\2\f\u0097\3\2\2\2\16\u00b1\3\2\2\2\20\u00da\3\2\2\2\22\u00dc\3"+
		"\2\2\2\24\u00de\3\2\2\2\26\u00e2\3\2\2\2\30\u00ef\3\2\2\2\32\u0101\3\2"+
		"\2\2\34\u0114\3\2\2\2\36\u0118\3\2\2\2 \u0133\3\2\2\2\"\u0139\3\2\2\2"+
		"$\u0140\3\2\2\2&\u015c\3\2\2\2(\u0160\3\2\2\2*\u0164\3\2\2\2,\u016e\3"+
		"\2\2\2.\u0187\3\2\2\2\60\u0190\3\2\2\2\62\u01af\3\2\2\2\64\u01b1\3\2\2"+
		"\2\66\u01b7\3\2\2\28\u01d6\3\2\2\2:\u01ec\3\2\2\2<\u01ee\3\2\2\2>\u01f1"+
		"\3\2\2\2@\u01f3\3\2\2\2B\u01f5\3\2\2\2D\u01f7\3\2\2\2FH\5\4\3\2GF\3\2"+
		"\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JM\3\2\2\2KI\3\2\2\2LN\5\6\4\2ML\3\2"+
		"\2\2MN\3\2\2\2NR\3\2\2\2OQ\5\4\3\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2"+
		"\2\2SX\3\2\2\2TR\3\2\2\2UW\5\34\17\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3"+
		"\2\2\2Y^\3\2\2\2ZX\3\2\2\2[]\5\4\3\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^"+
		"_\3\2\2\2_\3\3\2\2\2`^\3\2\2\2ab\t\2\2\2b\5\3\2\2\2cd\7\3\2\2di\7\4\2"+
		"\2ej\5\b\5\2fj\5\24\13\2gj\5\26\f\2hj\5\4\3\2ie\3\2\2\2if\3\2\2\2ig\3"+
		"\2\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7\5\2\2n\7"+
		"\3\2\2\2op\7\6\2\2pq\5\n\6\2qr\7\7\2\2rs\7\b\2\2su\3\2\2\2to\3\2\2\2t"+
		"u\3\2\2\2uv\3\2\2\2vw\7?\2\2wz\7\6\2\2x{\5\n\6\2y{\5\f\7\2zx\3\2\2\2z"+
		"y\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\7\7\2\2}~\7\t\2\2~\t\3\2\2\2\177\u0080"+
		"\b\6\1\2\u0080\u0085\5\22\n\2\u0081\u0082\7\n\2\2\u0082\u0084\7\13\2\2"+
		"\u0083\u0081\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0094\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\f\3\2\2\u0089"+
		"\u008a\7\f\2\2\u008a\u008f\5\22\n\2\u008b\u008c\7\n\2\2\u008c\u008e\7"+
		"\13\2\2\u008d\u008b\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0088\3\2"+
		"\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\13\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\b\7\1\2\u0098\u0099\5\22\n"+
		"\2\u0099\u009e\7?\2\2\u009a\u009b\7\n\2\2\u009b\u009d\7\13\2\2\u009c\u009a"+
		"\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00ae\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\f\3\2\2\u00a2\u00a3\7\f"+
		"\2\2\u00a3\u00a4\5\22\n\2\u00a4\u00a9\7?\2\2\u00a5\u00a6\7\n\2\2\u00a6"+
		"\u00a8\7\13\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3"+
		"\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac"+
		"\u00a1\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\r\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b7\7\4\2\2\u00b2\u00b6"+
		"\5\20\t\2\u00b3\u00b6\5\26\f\2\u00b4\u00b6\5\4\3\2\u00b5\u00b2\3\2\2\2"+
		"\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5"+
		"\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba"+
		"\u00bb\7\5\2\2\u00bb\17\3\2\2\2\u00bc\u00bd\5&\24\2\u00bd\u00be\7\t\2"+
		"\2\u00be\u00db\3\2\2\2\u00bf\u00c0\5\62\32\2\u00c0\u00c1\7\t\2\2\u00c1"+
		"\u00db\3\2\2\2\u00c2\u00db\58\35\2\u00c3\u00db\5:\36\2\u00c4\u00c5\7\60"+
		"\2\2\u00c5\u00db\7\t\2\2\u00c6\u00c7\7H\2\2\u00c7\u00db\7\t\2\2\u00c8"+
		"\u00db\5<\37\2\u00c9\u00ca\5.\30\2\u00ca\u00cb\7\t\2\2\u00cb\u00db\3\2"+
		"\2\2\u00cc\u00cd\7,\2\2\u00cd\u00db\7\t\2\2\u00ce\u00cf\7:\2\2\u00cf\u00db"+
		"\7\t\2\2\u00d0\u00d5\7)\2\2\u00d1\u00d2\7\n\2\2\u00d2\u00d4\7\13\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2"+
		"\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\7?\2\2\u00d9"+
		"\u00db\7\t\2\2\u00da\u00bc\3\2\2\2\u00da\u00bf\3\2\2\2\u00da\u00c2\3\2"+
		"\2\2\u00da\u00c3\3\2\2\2\u00da\u00c4\3\2\2\2\u00da\u00c6\3\2\2\2\u00da"+
		"\u00c8\3\2\2\2\u00da\u00c9\3\2\2\2\u00da\u00cc\3\2\2\2\u00da\u00ce\3\2"+
		"\2\2\u00da\u00d0\3\2\2\2\u00db\21\3\2\2\2\u00dc\u00dd\t\3\2\2\u00dd\23"+
		"\3\2\2\2\u00de\u00df\7?\2\2\u00df\u00e0\7\t\2\2\u00e0\25\3\2\2\2\u00e1"+
		"\u00e3\7\66\2\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3"+
		"\2\2\2\u00e4\u00e5\5\22\n\2\u00e5\u00ea\5\30\r\2\u00e6\u00e7\7\f\2\2\u00e7"+
		"\u00e9\5\30\r\2\u00e8\u00e6\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3"+
		"\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed"+
		"\u00ee\7\t\2\2\u00ee\27\3\2\2\2\u00ef\u00f5\7?\2\2\u00f0\u00f1\7\n\2\2"+
		"\u00f1\u00f2\7>\2\2\u00f2\u00f4\7\13\2\2\u00f3\u00f0\3\2\2\2\u00f4\u00f7"+
		"\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00ff\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f8\u00fd\7\b\2\2\u00f9\u00fe\5.\30\2\u00fa\u00fe\5\32"+
		"\16\2\u00fb\u00fc\7&\2\2\u00fc\u00fe\7?\2\2\u00fd\u00f9\3\2\2\2\u00fd"+
		"\u00fa\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00f8\3\2"+
		"\2\2\u00ff\u0100\3\2\2\2\u0100\31\3\2\2\2\u0101\u0104\7\n\2\2\u0102\u0105"+
		"\5.\30\2\u0103\u0105\5\32\16\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2"+
		"\u0105\u010d\3\2\2\2\u0106\u0109\7\f\2\2\u0107\u010a\5.\30\2\u0108\u010a"+
		"\5\32\16\2\u0109\u0107\3\2\2\2\u0109\u0108\3\2\2\2\u010a\u010c\3\2\2\2"+
		"\u010b\u0106\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e"+
		"\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111\7\13\2\2"+
		"\u0111\33\3\2\2\2\u0112\u0115\5\36\20\2\u0113\u0115\5$\23\2\u0114\u0112"+
		"\3\2\2\2\u0114\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\35\3\2\2\2\u0118\u0119\5\22\n\2\u0119\u011c\7?\2"+
		"\2\u011a\u011b\7\r\2\2\u011b\u011d\7?\2\2\u011c\u011a\3\2\2\2\u011c\u011d"+
		"\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0122\7\4\2\2\u011f\u0121\5\4\3\2\u0120"+
		"\u011f\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2"+
		"\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0127\5 \21\2\u0126"+
		"\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2"+
		"\2\2\u0129\u012d\3\2\2\2\u012a\u012c\5\4\3\2\u012b\u012a\3\2\2\2\u012c"+
		"\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2"+
		"\2\2\u012f\u012d\3\2\2\2\u0130\u0131\7\5\2\2\u0131\37\3\2\2\2\u0132\u0134"+
		"\5\"\22\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0137\3\2\2\2"+
		"\u0135\u0138\5\26\f\2\u0136\u0138\5$\23\2\u0137\u0135\3\2\2\2\u0137\u0136"+
		"\3\2\2\2\u0138!\3\2\2\2\u0139\u013a\t\4\2\2\u013a#\3\2\2\2\u013b\u013c"+
		"\7\6\2\2\u013c\u013d\5\f\7\2\u013d\u013e\7\7\2\2\u013e\u013f\7\b\2\2\u013f"+
		"\u0141\3\2\2\2\u0140\u013b\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\3\2"+
		"\2\2\u0142\u0143\7\67\2\2\u0143\u0144\7?\2\2\u0144\u0146\7\6\2\2\u0145"+
		"\u0147\5\f\7\2\u0146\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2"+
		"\2\2\u0148\u0149\7\7\2\2\u0149\u014a\5\16\b\2\u014a%\3\2\2\2\u014b\u014c"+
		"\5*\26\2\u014c\u014d\7\b\2\2\u014d\u014e\5(\25\2\u014e\u015d\3\2\2\2\u014f"+
		"\u0150\7\6\2\2\u0150\u0155\5*\26\2\u0151\u0152\7\f\2\2\u0152\u0154\5*"+
		"\26\2\u0153\u0151\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155"+
		"\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u0159\7\7"+
		"\2\2\u0159\u015a\7\b\2\2\u015a\u015b\5\62\32\2\u015b\u015d\3\2\2\2\u015c"+
		"\u014b\3\2\2\2\u015c\u014f\3\2\2\2\u015d\'\3\2\2\2\u015e\u0161\5.\30\2"+
		"\u015f\u0161\7\63\2\2\u0160\u015e\3\2\2\2\u0160\u015f\3\2\2\2\u0161)\3"+
		"\2\2\2\u0162\u0163\t\5\2\2\u0163\u0165\7\21\2\2\u0164\u0162\3\2\2\2\u0164"+
		"\u0165\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u016b\5,\27\2\u0167\u0168\7\21"+
		"\2\2\u0168\u016a\5,\27\2\u0169\u0167\3\2\2\2\u016a\u016d\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c+\3\2\2\2\u016d\u016b\3\2\2\2"+
		"\u016e\u0175\7?\2\2\u016f\u0170\7\n\2\2\u0170\u0171\5.\30\2\u0171\u0172"+
		"\7\13\2\2\u0172\u0174\3\2\2\2\u0173\u016f\3\2\2\2\u0174\u0177\3\2\2\2"+
		"\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176-\3\2\2\2\u0177\u0175\3"+
		"\2\2\2\u0178\u0179\7\6\2\2\u0179\u017a\5.\30\2\u017a\u017b\7\7\2\2\u017b"+
		"\u0188\3\2\2\2\u017c\u017d\5@!\2\u017d\u017e\7>\2\2\u017e\u0188\3\2\2"+
		"\2\u017f\u0188\5> \2\u0180\u0188\5\62\32\2\u0181\u0188\5*\26\2\u0182\u0188"+
		"\7<\2\2\u0183\u0184\7>\2\2\u0184\u0185\5B\"\2\u0185\u0186\7>\2\2\u0186"+
		"\u0188\3\2\2\2\u0187\u0178\3\2\2\2\u0187\u017c\3\2\2\2\u0187\u017f\3\2"+
		"\2\2\u0187\u0180\3\2\2\2\u0187\u0181\3\2\2\2\u0187\u0182\3\2\2\2\u0187"+
		"\u0183\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\5\60\31\2\u018a/\3\2\2"+
		"\2\u018b\u018c\5D#\2\u018c\u018d\5.\30\2\u018d\u018e\5\60\31\2\u018e\u0191"+
		"\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u018b\3\2\2\2\u0190\u018f\3\2\2\2\u0191"+
		"\61\3\2\2\2\u0192\u0193\7-\2\2\u0193\u0194\7\6\2\2\u0194\u0195\5*\26\2"+
		"\u0195\u0196\7\7\2\2\u0196\u01b0\3\2\2\2\u0197\u0198\5*\26\2\u0198\u0199"+
		"\7\21\2\2\u0199\u019b\3\2\2\2\u019a\u0197\3\2\2\2\u019a\u019b\3\2\2\2"+
		"\u019b\u019c\3\2\2\2\u019c\u019d\7?\2\2\u019d\u019f\7\6\2\2\u019e\u01a0"+
		"\5\64\33\2\u019f\u019e\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\3\2\2\2"+
		"\u01a1\u01b0\7\7\2\2\u01a2\u01a3\7\64\2\2\u01a3\u01a6\7\6\2\2\u01a4\u01a7"+
		"\5\22\n\2\u01a5\u01a7\5*\26\2\u01a6\u01a4\3\2\2\2\u01a6\u01a5\3\2\2\2"+
		"\u01a7\u01a8\3\2\2\2\u01a8\u01a9\7\7\2\2\u01a9\u01b0\3\2\2\2\u01aa\u01ab"+
		"\7\65\2\2\u01ab\u01ac\7\6\2\2\u01ac\u01ad\5*\26\2\u01ad\u01ae\7\7\2\2"+
		"\u01ae\u01b0\3\2\2\2\u01af\u0192\3\2\2\2\u01af\u019a\3\2\2\2\u01af\u01a2"+
		"\3\2\2\2\u01af\u01aa\3\2\2\2\u01b0\63\3\2\2\2\u01b1\u01b2\5.\30\2\u01b2"+
		"\u01b3\5\66\34\2\u01b3\65\3\2\2\2\u01b4\u01b5\7\f\2\2\u01b5\u01b8\5\64"+
		"\33\2\u01b6\u01b8\3\2\2\2\u01b7\u01b4\3\2\2\2\u01b7\u01b6\3\2\2\2\u01b8"+
		"\67\3\2\2\2\u01b9\u01ba\7*\2\2\u01ba\u01bb\7\6\2\2\u01bb\u01bc\5.\30\2"+
		"\u01bc\u01bd\7\7\2\2\u01bd\u01c0\5\16\b\2\u01be\u01bf\7/\2\2\u01bf\u01c1"+
		"\5\16\b\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01d7\3\2\2\2"+
		"\u01c2\u01c3\79\2\2\u01c3\u01c4\7\6\2\2\u01c4\u01c5\5*\26\2\u01c5\u01c6"+
		"\7\22\2\2\u01c6\u01c7\7\r\2\2\u01c7\u01ce\7\4\2\2\u01c8\u01c9\7.\2\2\u01c9"+
		"\u01ca\7>\2\2\u01ca\u01cb\7\r\2\2\u01cb\u01cd\5\16\b\2\u01cc\u01c8\3\2"+
		"\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf"+
		"\u01d1\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d2\7\'\2\2\u01d2\u01d3\7\r"+
		"\2\2\u01d3\u01d4\5\16\b\2\u01d4\u01d5\7\5\2\2\u01d5\u01d7\3\2\2\2\u01d6"+
		"\u01b9\3\2\2\2\u01d6\u01c2\3\2\2\2\u01d79\3\2\2\2\u01d8\u01d9\78\2\2\u01d9"+
		"\u01db\7\6\2\2\u01da\u01dc\5\26\f\2\u01db\u01da\3\2\2\2\u01db\u01dc\3"+
		"\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\7\t\2\2\u01de\u01df\5.\30\2\u01df"+
		"\u01e1\7\t\2\2\u01e0\u01e2\5&\24\2\u01e1\u01e0\3\2\2\2\u01e1\u01e2\3\2"+
		"\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\7\7\2\2\u01e4\u01e5\5\16\b\2\u01e5"+
		"\u01ed\3\2\2\2\u01e6\u01e7\7\61\2\2\u01e7\u01e8\7\6\2\2\u01e8\u01e9\5"+
		".\30\2\u01e9\u01ea\7\7\2\2\u01ea\u01eb\5\16\b\2\u01eb\u01ed\3\2\2\2\u01ec"+
		"\u01d8\3\2\2\2\u01ec\u01e6\3\2\2\2\u01ed;\3\2\2\2\u01ee\u01ef\7?\2\2\u01ef"+
		"\u01f0\7\r\2\2\u01f0=\3\2\2\2\u01f1\u01f2\t\6\2\2\u01f2?\3\2\2\2\u01f3"+
		"\u01f4\t\7\2\2\u01f4A\3\2\2\2\u01f5\u01f6\t\b\2\2\u01f6C\3\2\2\2\u01f7"+
		"\u01f8\t\t\2\2\u01f8E\3\2\2\2:IMRX^iktz\u0085\u008f\u0094\u009e\u00a9"+
		"\u00ae\u00b5\u00b7\u00d5\u00da\u00e2\u00ea\u00f5\u00fd\u00ff\u0104\u0109"+
		"\u010d\u0114\u0116\u011c\u0122\u0128\u012d\u0133\u0137\u0140\u0146\u0155"+
		"\u015c\u0160\u0164\u016b\u0175\u0187\u0190\u019a\u019f\u01a6\u01af\u01b7"+
		"\u01c0\u01ce\u01d6\u01db\u01e1\u01ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}