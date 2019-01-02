// Generated from src/IMP.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IMPParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, AVAL=17, 
		BVAL=18, VAR=19, WS=20;
	public static final int
		RULE_integer = 0, RULE_bool = 1, RULE_var = 2, RULE_block = 3, RULE_assignment = 4, 
		RULE_ifStmt = 5, RULE_whileStmt = 6, RULE_sequence = 7, RULE_varList = 8, 
		RULE_varDecl = 9, RULE_mainNode = 10, RULE_plus = 11, RULE_div = 12, RULE_bracketAExpr = 13, 
		RULE_bracketBExpr = 14, RULE_and = 15, RULE_greater = 16, RULE_not = 17;
	public static final String[] ruleNames = {
		"integer", "bool", "var", "block", "assignment", "ifStmt", "whileStmt", 
		"sequence", "varList", "varDecl", "mainNode", "plus", "div", "bracketAExpr", 
		"bracketBExpr", "and", "greater", "not"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'='", "';'", "'if'", "'else'", "'while'", "','", 
		"'int'", "'+'", "'/'", "'('", "')'", "'&&'", "'>'", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "AVAL", "BVAL", "VAR", "WS"
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
	public String getGrammarFileName() { return "IMP.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IMPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode AVAL() { return getToken(IMPParser.AVAL, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(AVAL);
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode BVAL() { return getToken(IMPParser.BVAL, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(BVAL);
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
		public TerminalNode VAR() { return getToken(IMPParser.VAR, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(VAR);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(T__0);
				setState(43);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(T__0);
				setState(50);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(45);
					block();
					}
					break;
				case 2:
					{
					setState(46);
					assignment();
					}
					break;
				case 3:
					{
					setState(47);
					ifStmt();
					}
					break;
				case 4:
					{
					setState(48);
					whileStmt();
					}
					break;
				case 5:
					{
					setState(49);
					sequence();
					}
					break;
				}
				setState(52);
				match(T__1);
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

	public static class AssignmentContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public PlusContext plus() {
			return getRuleContext(PlusContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public BracketAExprContext bracketAExpr() {
			return getRuleContext(BracketAExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			var();
			setState(57);
			match(T__2);
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(58);
				var();
				}
				break;
			case 2:
				{
				setState(59);
				integer();
				}
				break;
			case 3:
				{
				setState(60);
				plus(0);
				}
				break;
			case 4:
				{
				setState(61);
				div(0);
				}
				break;
			case 5:
				{
				setState(62);
				bracketAExpr();
				}
				break;
			}
			setState(65);
			match(T__3);
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

	public static class IfStmtContext extends ParserRuleContext {
		public BracketBExprContext bracketBExpr() {
			return getRuleContext(BracketBExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__4);
			setState(68);
			bracketBExpr();
			setState(69);
			block();
			setState(70);
			match(T__5);
			setState(71);
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

	public static class WhileStmtContext extends ParserRuleContext {
		public BracketBExprContext bracketBExpr() {
			return getRuleContext(BracketBExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__6);
			setState(74);
			bracketBExpr();
			setState(75);
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

	public static class SequenceContext extends ParserRuleContext {
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<IfStmtContext> ifStmt() {
			return getRuleContexts(IfStmtContext.class);
		}
		public IfStmtContext ifStmt(int i) {
			return getRuleContext(IfStmtContext.class,i);
		}
		public List<WhileStmtContext> whileStmt() {
			return getRuleContexts(WhileStmtContext.class);
		}
		public WhileStmtContext whileStmt(int i) {
			return getRuleContext(WhileStmtContext.class,i);
		}
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public SequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).enterSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).exitSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceContext sequence() throws RecognitionException {
		SequenceContext _localctx = new SequenceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(77);
				block();
				}
				break;
			case VAR:
				{
				setState(78);
				assignment();
				}
				break;
			case T__4:
				{
				setState(79);
				ifStmt();
				}
				break;
			case T__6:
				{
				setState(80);
				whileStmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(83);
				block();
				}
				break;
			case 2:
				{
				setState(84);
				assignment();
				}
				break;
			case 3:
				{
				setState(85);
				ifStmt();
				}
				break;
			case 4:
				{
				setState(86);
				whileStmt();
				}
				break;
			case 5:
				{
				setState(87);
				sequence();
				}
				break;
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

	public static class VarListContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public VarListContext varList() {
			return getRuleContext(VarListContext.class,0);
		}
		public VarListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).enterVarList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).exitVarList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitVarList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarListContext varList() throws RecognitionException {
		VarListContext _localctx = new VarListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varList);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				var();
				setState(91);
				match(T__7);
				setState(92);
				varList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				var();
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

	public static class VarDeclContext extends ParserRuleContext {
		public VarListContext varList() {
			return getRuleContext(VarListContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__8);
			setState(98);
			varList();
			setState(99);
			match(T__3);
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

	public static class MainNodeContext extends ParserRuleContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public MainNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).enterMainNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).exitMainNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitMainNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainNodeContext mainNode() throws RecognitionException {
		MainNodeContext _localctx = new MainNodeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mainNode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			varDecl();
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(102);
				block();
				}
				break;
			case 2:
				{
				setState(103);
				assignment();
				}
				break;
			case 3:
				{
				setState(104);
				ifStmt();
				}
				break;
			case 4:
				{
				setState(105);
				whileStmt();
				}
				break;
			case 5:
				{
				setState(106);
				sequence();
				}
				break;
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

	public static class PlusContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public List<DivContext> div() {
			return getRuleContexts(DivContext.class);
		}
		public DivContext div(int i) {
			return getRuleContext(DivContext.class,i);
		}
		public List<BracketAExprContext> bracketAExpr() {
			return getRuleContexts(BracketAExprContext.class);
		}
		public BracketAExprContext bracketAExpr(int i) {
			return getRuleContext(BracketAExprContext.class,i);
		}
		public PlusContext plus() {
			return getRuleContext(PlusContext.class,0);
		}
		public PlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).exitPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusContext plus() throws RecognitionException {
		return plus(0);
	}

	private PlusContext plus(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PlusContext _localctx = new PlusContext(_ctx, _parentState);
		PlusContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_plus, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(110);
				var();
				}
				break;
			case 2:
				{
				setState(111);
				integer();
				}
				break;
			case 3:
				{
				setState(112);
				div(0);
				}
				break;
			case 4:
				{
				setState(113);
				bracketAExpr();
				}
				break;
			}
			setState(116);
			match(T__9);
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(117);
				var();
				}
				break;
			case 2:
				{
				setState(118);
				integer();
				}
				break;
			case 3:
				{
				setState(119);
				div(0);
				}
				break;
			case 4:
				{
				setState(120);
				bracketAExpr();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PlusContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_plus);
					setState(123);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(124);
					match(T__9);
					setState(129);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(125);
						var();
						}
						break;
					case 2:
						{
						setState(126);
						integer();
						}
						break;
					case 3:
						{
						setState(127);
						div(0);
						}
						break;
					case 4:
						{
						setState(128);
						bracketAExpr();
						}
						break;
					}
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class DivContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public List<BracketAExprContext> bracketAExpr() {
			return getRuleContexts(BracketAExprContext.class);
		}
		public BracketAExprContext bracketAExpr(int i) {
			return getRuleContext(BracketAExprContext.class,i);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		return div(0);
	}

	private DivContext div(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DivContext _localctx = new DivContext(_ctx, _parentState);
		DivContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_div, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(137);
				var();
				}
				break;
			case AVAL:
				{
				setState(138);
				integer();
				}
				break;
			case T__11:
				{
				setState(139);
				bracketAExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(142);
			match(T__10);
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(143);
				var();
				}
				break;
			case AVAL:
				{
				setState(144);
				integer();
				}
				break;
			case T__11:
				{
				setState(145);
				bracketAExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DivContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_div);
					setState(148);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(149);
					match(T__10);
					setState(153);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case VAR:
						{
						setState(150);
						var();
						}
						break;
					case AVAL:
						{
						setState(151);
						integer();
						}
						break;
					case T__11:
						{
						setState(152);
						bracketAExpr();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(159);
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

	public static class BracketAExprContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public PlusContext plus() {
			return getRuleContext(PlusContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public BracketAExprContext bracketAExpr() {
			return getRuleContext(BracketAExprContext.class,0);
		}
		public BracketAExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketAExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).enterBracketAExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).exitBracketAExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitBracketAExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracketAExprContext bracketAExpr() throws RecognitionException {
		BracketAExprContext _localctx = new BracketAExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bracketAExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__11);
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(161);
				var();
				}
				break;
			case 2:
				{
				setState(162);
				integer();
				}
				break;
			case 3:
				{
				setState(163);
				plus(0);
				}
				break;
			case 4:
				{
				setState(164);
				div(0);
				}
				break;
			case 5:
				{
				setState(165);
				bracketAExpr();
				}
				break;
			}
			setState(168);
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

	public static class BracketBExprContext extends ParserRuleContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public GreaterContext greater() {
			return getRuleContext(GreaterContext.class,0);
		}
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
		}
		public BracketBExprContext bracketBExpr() {
			return getRuleContext(BracketBExprContext.class,0);
		}
		public BracketBExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketBExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).enterBracketBExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).exitBracketBExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitBracketBExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracketBExprContext bracketBExpr() throws RecognitionException {
		BracketBExprContext _localctx = new BracketBExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_bracketBExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__11);
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(171);
				bool();
				}
				break;
			case 2:
				{
				setState(172);
				and(0);
				}
				break;
			case 3:
				{
				setState(173);
				greater();
				}
				break;
			case 4:
				{
				setState(174);
				not();
				}
				break;
			case 5:
				{
				setState(175);
				bracketBExpr();
				}
				break;
			}
			setState(178);
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

	public static class AndContext extends ParserRuleContext {
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public List<GreaterContext> greater() {
			return getRuleContexts(GreaterContext.class);
		}
		public GreaterContext greater(int i) {
			return getRuleContext(GreaterContext.class,i);
		}
		public List<NotContext> not() {
			return getRuleContexts(NotContext.class);
		}
		public NotContext not(int i) {
			return getRuleContext(NotContext.class,i);
		}
		public List<BracketBExprContext> bracketBExpr() {
			return getRuleContexts(BracketBExprContext.class);
		}
		public BracketBExprContext bracketBExpr(int i) {
			return getRuleContext(BracketBExprContext.class,i);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		return and(0);
	}

	private AndContext and(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndContext _localctx = new AndContext(_ctx, _parentState);
		AndContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_and, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(181);
				bool();
				}
				break;
			case 2:
				{
				setState(182);
				greater();
				}
				break;
			case 3:
				{
				setState(183);
				not();
				}
				break;
			case 4:
				{
				setState(184);
				bracketBExpr();
				}
				break;
			}
			setState(187);
			match(T__13);
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(188);
				bool();
				}
				break;
			case 2:
				{
				setState(189);
				greater();
				}
				break;
			case 3:
				{
				setState(190);
				not();
				}
				break;
			case 4:
				{
				setState(191);
				bracketBExpr();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_and);
					setState(194);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(195);
					match(T__13);
					setState(200);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						setState(196);
						bool();
						}
						break;
					case 2:
						{
						setState(197);
						greater();
						}
						break;
					case 3:
						{
						setState(198);
						not();
						}
						break;
					case 4:
						{
						setState(199);
						bracketBExpr();
						}
						break;
					}
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class GreaterContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public List<PlusContext> plus() {
			return getRuleContexts(PlusContext.class);
		}
		public PlusContext plus(int i) {
			return getRuleContext(PlusContext.class,i);
		}
		public List<DivContext> div() {
			return getRuleContexts(DivContext.class);
		}
		public DivContext div(int i) {
			return getRuleContext(DivContext.class,i);
		}
		public List<BracketAExprContext> bracketAExpr() {
			return getRuleContexts(BracketAExprContext.class);
		}
		public BracketAExprContext bracketAExpr(int i) {
			return getRuleContext(BracketAExprContext.class,i);
		}
		public GreaterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greater; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).enterGreater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).exitGreater(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitGreater(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreaterContext greater() throws RecognitionException {
		GreaterContext _localctx = new GreaterContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_greater);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(207);
				var();
				}
				break;
			case 2:
				{
				setState(208);
				integer();
				}
				break;
			case 3:
				{
				setState(209);
				plus(0);
				}
				break;
			case 4:
				{
				setState(210);
				div(0);
				}
				break;
			case 5:
				{
				setState(211);
				bracketAExpr();
				}
				break;
			}
			setState(214);
			match(T__14);
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(215);
				var();
				}
				break;
			case 2:
				{
				setState(216);
				integer();
				}
				break;
			case 3:
				{
				setState(217);
				plus(0);
				}
				break;
			case 4:
				{
				setState(218);
				div(0);
				}
				break;
			case 5:
				{
				setState(219);
				bracketAExpr();
				}
				break;
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

	public static class NotContext extends ParserRuleContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public BracketBExprContext bracketBExpr() {
			return getRuleContext(BracketBExprContext.class,0);
		}
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public GreaterContext greater() {
			return getRuleContext(GreaterContext.class,0);
		}
		public NotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IMPListener ) ((IMPListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IMPVisitor ) return ((IMPVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(T__15);
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(223);
				bool();
				}
				break;
			case 2:
				{
				setState(224);
				bracketBExpr();
				}
				break;
			case 3:
				{
				setState(225);
				not();
				}
				break;
			case 4:
				{
				setState(226);
				and(0);
				}
				break;
			case 5:
				{
				setState(227);
				greater();
				}
				break;
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
		case 11:
			return plus_sempred((PlusContext)_localctx, predIndex);
		case 12:
			return div_sempred((DivContext)_localctx, predIndex);
		case 15:
			return and_sempred((AndContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean plus_sempred(PlusContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean div_sempred(DivContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean and_sempred(AndContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\u00e9\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"\65\n\5\3\5\3\5\5\59\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6B\n\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\tT\n\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t[\n\t\3\n\3\n\3\n\3\n\3\n\5\nb\n\n\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\fn\n\f\3\r\3\r\3\r\3\r\3\r\5\ru\n\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r|\n\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0084\n\r\7\r"+
		"\u0086\n\r\f\r\16\r\u0089\13\r\3\16\3\16\3\16\3\16\5\16\u008f\n\16\3\16"+
		"\3\16\3\16\3\16\5\16\u0095\n\16\3\16\3\16\3\16\3\16\3\16\5\16\u009c\n"+
		"\16\7\16\u009e\n\16\f\16\16\16\u00a1\13\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\5\17\u00a9\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00b3"+
		"\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u00bc\n\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00c3\n\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00cb\n"+
		"\21\7\21\u00cd\n\21\f\21\16\21\u00d0\13\21\3\22\3\22\3\22\3\22\3\22\5"+
		"\22\u00d7\n\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00df\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u00e7\n\23\3\23\2\5\30\32 \24\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$\2\2\2\u011a\2&\3\2\2\2\4(\3\2\2\2\6*\3\2"+
		"\2\2\b8\3\2\2\2\n:\3\2\2\2\fE\3\2\2\2\16K\3\2\2\2\20S\3\2\2\2\22a\3\2"+
		"\2\2\24c\3\2\2\2\26g\3\2\2\2\30o\3\2\2\2\32\u008a\3\2\2\2\34\u00a2\3\2"+
		"\2\2\36\u00ac\3\2\2\2 \u00b6\3\2\2\2\"\u00d6\3\2\2\2$\u00e0\3\2\2\2&\'"+
		"\7\23\2\2\'\3\3\2\2\2()\7\24\2\2)\5\3\2\2\2*+\7\25\2\2+\7\3\2\2\2,-\7"+
		"\3\2\2-9\7\4\2\2.\64\7\3\2\2/\65\5\b\5\2\60\65\5\n\6\2\61\65\5\f\7\2\62"+
		"\65\5\16\b\2\63\65\5\20\t\2\64/\3\2\2\2\64\60\3\2\2\2\64\61\3\2\2\2\64"+
		"\62\3\2\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66\67\7\4\2\2\679\3\2\2\28,\3"+
		"\2\2\28.\3\2\2\29\t\3\2\2\2:;\5\6\4\2;A\7\5\2\2<B\5\6\4\2=B\5\2\2\2>B"+
		"\5\30\r\2?B\5\32\16\2@B\5\34\17\2A<\3\2\2\2A=\3\2\2\2A>\3\2\2\2A?\3\2"+
		"\2\2A@\3\2\2\2BC\3\2\2\2CD\7\6\2\2D\13\3\2\2\2EF\7\7\2\2FG\5\36\20\2G"+
		"H\5\b\5\2HI\7\b\2\2IJ\5\b\5\2J\r\3\2\2\2KL\7\t\2\2LM\5\36\20\2MN\5\b\5"+
		"\2N\17\3\2\2\2OT\5\b\5\2PT\5\n\6\2QT\5\f\7\2RT\5\16\b\2SO\3\2\2\2SP\3"+
		"\2\2\2SQ\3\2\2\2SR\3\2\2\2TZ\3\2\2\2U[\5\b\5\2V[\5\n\6\2W[\5\f\7\2X[\5"+
		"\16\b\2Y[\5\20\t\2ZU\3\2\2\2ZV\3\2\2\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2["+
		"\21\3\2\2\2\\]\5\6\4\2]^\7\n\2\2^_\5\22\n\2_b\3\2\2\2`b\5\6\4\2a\\\3\2"+
		"\2\2a`\3\2\2\2b\23\3\2\2\2cd\7\13\2\2de\5\22\n\2ef\7\6\2\2f\25\3\2\2\2"+
		"gm\5\24\13\2hn\5\b\5\2in\5\n\6\2jn\5\f\7\2kn\5\16\b\2ln\5\20\t\2mh\3\2"+
		"\2\2mi\3\2\2\2mj\3\2\2\2mk\3\2\2\2ml\3\2\2\2n\27\3\2\2\2ot\b\r\1\2pu\5"+
		"\6\4\2qu\5\2\2\2ru\5\32\16\2su\5\34\17\2tp\3\2\2\2tq\3\2\2\2tr\3\2\2\2"+
		"ts\3\2\2\2uv\3\2\2\2v{\7\f\2\2w|\5\6\4\2x|\5\2\2\2y|\5\32\16\2z|\5\34"+
		"\17\2{w\3\2\2\2{x\3\2\2\2{y\3\2\2\2{z\3\2\2\2|\u0087\3\2\2\2}~\f\4\2\2"+
		"~\u0083\7\f\2\2\177\u0084\5\6\4\2\u0080\u0084\5\2\2\2\u0081\u0084\5\32"+
		"\16\2\u0082\u0084\5\34\17\2\u0083\177\3\2\2\2\u0083\u0080\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\u0086\3\2\2\2\u0085}\3\2\2\2"+
		"\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\31"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008e\b\16\1\2\u008b\u008f\5\6\4\2"+
		"\u008c\u008f\5\2\2\2\u008d\u008f\5\34\17\2\u008e\u008b\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0094\7\r\2\2\u0091"+
		"\u0095\5\6\4\2\u0092\u0095\5\2\2\2\u0093\u0095\5\34\17\2\u0094\u0091\3"+
		"\2\2\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\u009f\3\2\2\2\u0096"+
		"\u0097\f\4\2\2\u0097\u009b\7\r\2\2\u0098\u009c\5\6\4\2\u0099\u009c\5\2"+
		"\2\2\u009a\u009c\5\34\17\2\u009b\u0098\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009a\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u0096\3\2\2\2\u009e\u00a1\3\2"+
		"\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\33\3\2\2\2\u00a1\u009f"+
		"\3\2\2\2\u00a2\u00a8\7\16\2\2\u00a3\u00a9\5\6\4\2\u00a4\u00a9\5\2\2\2"+
		"\u00a5\u00a9\5\30\r\2\u00a6\u00a9\5\32\16\2\u00a7\u00a9\5\34\17\2\u00a8"+
		"\u00a3\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a8\u00a5\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7\17\2\2\u00ab"+
		"\35\3\2\2\2\u00ac\u00b2\7\16\2\2\u00ad\u00b3\5\4\3\2\u00ae\u00b3\5 \21"+
		"\2\u00af\u00b3\5\"\22\2\u00b0\u00b3\5$\23\2\u00b1\u00b3\5\36\20\2\u00b2"+
		"\u00ad\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b2\u00af\3\2\2\2\u00b2\u00b0\3\2"+
		"\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\7\17\2\2\u00b5"+
		"\37\3\2\2\2\u00b6\u00bb\b\21\1\2\u00b7\u00bc\5\4\3\2\u00b8\u00bc\5\"\22"+
		"\2\u00b9\u00bc\5$\23\2\u00ba\u00bc\5\36\20\2\u00bb\u00b7\3\2\2\2\u00bb"+
		"\u00b8\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00c2\7\20\2\2\u00be\u00c3\5\4\3\2\u00bf\u00c3\5\"\22\2\u00c0"+
		"\u00c3\5$\23\2\u00c1\u00c3\5\36\20\2\u00c2\u00be\3\2\2\2\u00c2\u00bf\3"+
		"\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00ce\3\2\2\2\u00c4"+
		"\u00c5\f\4\2\2\u00c5\u00ca\7\20\2\2\u00c6\u00cb\5\4\3\2\u00c7\u00cb\5"+
		"\"\22\2\u00c8\u00cb\5$\23\2\u00c9\u00cb\5\36\20\2\u00ca\u00c6\3\2\2\2"+
		"\u00ca\u00c7\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00cd"+
		"\3\2\2\2\u00cc\u00c4\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf!\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d7\5\6\4\2"+
		"\u00d2\u00d7\5\2\2\2\u00d3\u00d7\5\30\r\2\u00d4\u00d7\5\32\16\2\u00d5"+
		"\u00d7\5\34\17\2\u00d6\u00d1\3\2\2\2\u00d6\u00d2\3\2\2\2\u00d6\u00d3\3"+
		"\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00de\7\21\2\2\u00d9\u00df\5\6\4\2\u00da\u00df\5\2\2\2\u00db\u00df\5"+
		"\30\r\2\u00dc\u00df\5\32\16\2\u00dd\u00df\5\34\17\2\u00de\u00d9\3\2\2"+
		"\2\u00de\u00da\3\2\2\2\u00de\u00db\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00dd"+
		"\3\2\2\2\u00df#\3\2\2\2\u00e0\u00e6\7\22\2\2\u00e1\u00e7\5\4\3\2\u00e2"+
		"\u00e7\5\36\20\2\u00e3\u00e7\5$\23\2\u00e4\u00e7\5 \21\2\u00e5\u00e7\5"+
		"\"\22\2\u00e6\u00e1\3\2\2\2\u00e6\u00e2\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7%\3\2\2\2\32\648ASZamt{\u0083"+
		"\u0087\u008e\u0094\u009b\u009f\u00a8\u00b2\u00bb\u00c2\u00ca\u00ce\u00d6"+
		"\u00de\u00e6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}