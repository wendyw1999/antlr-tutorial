// Generated from java-escape by ANTLR 4.11.1
package edu.ucsd.cse232b.project.xpathParsers;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class xpathParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		QUOTE=10, DOC=11, TXT=12, LB=13, RB=14, ID=15, SLASH=16, DOUBLESLASH=17, 
		DOTDOT=18, DOT=19, COMMA=20, LPR=21, RPR=22, STAR=23, STRING=24, Whitespace=25;
	public static final int
		RULE_prog = 0, RULE_xpath = 1, RULE_rp = 2, RULE_filter = 3, RULE_fileName = 4, 
		RULE_attname = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "xpath", "rp", "filter", "fileName", "attname"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'eq'", "'=='", "'is'", "'and'", "'or'", "'not'", "'.xml'", 
			"'@'", "'\"'", "'doc'", "'text'", "'['", "']'", null, "'/'", "'//'", 
			"'..'", "'.'", "','", "'('", "')'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "QUOTE", 
			"DOC", "TXT", "LB", "RB", "ID", "SLASH", "DOUBLESLASH", "DOTDOT", "DOT", 
			"COMMA", "LPR", "RPR", "STAR", "STRING", "Whitespace"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public xpathParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(xpathParser.EOF, 0); }
		public List<XpathContext> xpath() {
			return getRuleContexts(XpathContext.class);
		}
		public XpathContext xpath(int i) {
			return getRuleContext(XpathContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				xpath();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DOC );
			setState(17);
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
	public static class XpathContext extends ParserRuleContext {
		public XpathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xpath; }
	 
		public XpathContext() { }
		public void copyFrom(XpathContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChildRootContext extends XpathContext {
		public TerminalNode DOC() { return getToken(xpathParser.DOC, 0); }
		public TerminalNode LPR() { return getToken(xpathParser.LPR, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(xpathParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(xpathParser.QUOTE, i);
		}
		public FileNameContext fileName() {
			return getRuleContext(FileNameContext.class,0);
		}
		public TerminalNode RPR() { return getToken(xpathParser.RPR, 0); }
		public TerminalNode SLASH() { return getToken(xpathParser.SLASH, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public ChildRootContext(XpathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterChildRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitChildRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitChildRoot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DescRootContext extends XpathContext {
		public TerminalNode DOC() { return getToken(xpathParser.DOC, 0); }
		public TerminalNode LPR() { return getToken(xpathParser.LPR, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(xpathParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(xpathParser.QUOTE, i);
		}
		public FileNameContext fileName() {
			return getRuleContext(FileNameContext.class,0);
		}
		public TerminalNode RPR() { return getToken(xpathParser.RPR, 0); }
		public TerminalNode DOUBLESLASH() { return getToken(xpathParser.DOUBLESLASH, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public DescRootContext(XpathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterDescRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitDescRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitDescRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XpathContext xpath() throws RecognitionException {
		XpathContext _localctx = new XpathContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_xpath);
		try {
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new ChildRootContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				match(DOC);
				setState(20);
				match(LPR);
				setState(21);
				match(QUOTE);
				setState(22);
				fileName();
				setState(23);
				match(QUOTE);
				setState(24);
				match(RPR);
				setState(25);
				match(SLASH);
				setState(26);
				rp(0);
				}
				break;
			case 2:
				_localctx = new DescRootContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				match(DOC);
				setState(29);
				match(LPR);
				setState(30);
				match(QUOTE);
				setState(31);
				fileName();
				setState(32);
				match(QUOTE);
				setState(33);
				match(RPR);
				setState(34);
				match(DOUBLESLASH);
				setState(35);
				rp(0);
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
	public static class RpContext extends ParserRuleContext {
		public RpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rp; }
	 
		public RpContext() { }
		public void copyFrom(RpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CHILD_RPContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode SLASH() { return getToken(xpathParser.SLASH, 0); }
		public CHILD_RPContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterCHILD_RP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitCHILD_RP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitCHILD_RP(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SELF_AXISContext extends RpContext {
		public TerminalNode DOT() { return getToken(xpathParser.DOT, 0); }
		public SELF_AXISContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterSELF_AXIS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitSELF_AXIS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitSELF_AXIS(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class STARContext extends RpContext {
		public TerminalNode STAR() { return getToken(xpathParser.STAR, 0); }
		public STARContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterSTAR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitSTAR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitSTAR(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PARENT_AXISContext extends RpContext {
		public TerminalNode DOTDOT() { return getToken(xpathParser.DOTDOT, 0); }
		public PARENT_AXISContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterPARENT_AXIS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitPARENT_AXIS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitPARENT_AXIS(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TWO_RPContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(xpathParser.COMMA, 0); }
		public TWO_RPContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterTWO_RP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitTWO_RP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitTWO_RP(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PARENTHESISContext extends RpContext {
		public List<TerminalNode> LPR() { return getTokens(xpathParser.LPR); }
		public TerminalNode LPR(int i) {
			return getToken(xpathParser.LPR, i);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public PARENTHESISContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterPARENTHESIS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitPARENTHESIS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitPARENTHESIS(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TEXT_AXISContext extends RpContext {
		public TerminalNode TXT() { return getToken(xpathParser.TXT, 0); }
		public TerminalNode LPR() { return getToken(xpathParser.LPR, 0); }
		public TerminalNode RPR() { return getToken(xpathParser.RPR, 0); }
		public TEXT_AXISContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterTEXT_AXIS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitTEXT_AXIS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitTEXT_AXIS(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ATTR_AXISContext extends RpContext {
		public AttnameContext attname() {
			return getRuleContext(AttnameContext.class,0);
		}
		public ATTR_AXISContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterATTR_AXIS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitATTR_AXIS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitATTR_AXIS(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FILTER_RPContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public TerminalNode LB() { return getToken(xpathParser.LB, 0); }
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public TerminalNode RB() { return getToken(xpathParser.RB, 0); }
		public FILTER_RPContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterFILTER_RP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitFILTER_RP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitFILTER_RP(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DESC_RPContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode DOUBLESLASH() { return getToken(xpathParser.DOUBLESLASH, 0); }
		public DESC_RPContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterDESC_RP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitDESC_RP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitDESC_RP(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TAG_NAMEContext extends RpContext {
		public TerminalNode ID() { return getToken(xpathParser.ID, 0); }
		public TAG_NAMEContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterTAG_NAME(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitTAG_NAME(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitTAG_NAME(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RpContext rp() throws RecognitionException {
		return rp(0);
	}

	private RpContext rp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RpContext _localctx = new RpContext(_ctx, _parentState);
		RpContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new TAG_NAMEContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(40);
				match(ID);
				}
				break;
			case STAR:
				{
				_localctx = new STARContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(41);
				match(STAR);
				}
				break;
			case DOT:
				{
				_localctx = new SELF_AXISContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42);
				match(DOT);
				}
				break;
			case DOTDOT:
				{
				_localctx = new PARENT_AXISContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(43);
				match(DOTDOT);
				}
				break;
			case TXT:
				{
				_localctx = new TEXT_AXISContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(44);
				match(TXT);
				setState(45);
				match(LPR);
				setState(46);
				match(RPR);
				}
				break;
			case T__8:
				{
				_localctx = new ATTR_AXISContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(47);
				attname();
				}
				break;
			case LPR:
				{
				_localctx = new PARENTHESISContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(48);
				match(LPR);
				setState(49);
				rp(0);
				setState(50);
				match(LPR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(68);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new CHILD_RPContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(54);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(55);
						match(SLASH);
						setState(56);
						rp(5);
						}
						break;
					case 2:
						{
						_localctx = new DESC_RPContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(57);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(58);
						match(DOUBLESLASH);
						setState(59);
						rp(4);
						}
						break;
					case 3:
						{
						_localctx = new TWO_RPContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(60);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(61);
						match(COMMA);
						setState(62);
						rp(2);
						}
						break;
					case 4:
						{
						_localctx = new FILTER_RPContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(63);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(64);
						match(LB);
						setState(65);
						filter(0);
						setState(66);
						match(RB);
						}
						break;
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
	public static class FilterContext extends ParserRuleContext {
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
	 
		public FilterContext() { }
		public void copyFrom(FilterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FILTERNOTContext extends FilterContext {
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public FILTERNOTContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterFILTERNOT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitFILTERNOT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitFILTERNOT(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FILTER_ORContext extends FilterContext {
		public List<FilterContext> filter() {
			return getRuleContexts(FilterContext.class);
		}
		public FilterContext filter(int i) {
			return getRuleContext(FilterContext.class,i);
		}
		public FILTER_ORContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterFILTER_OR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitFILTER_OR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitFILTER_OR(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FILTER_EQ_STRINGContext extends FilterContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public TerminalNode STRING() { return getToken(xpathParser.STRING, 0); }
		public FILTER_EQ_STRINGContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterFILTER_EQ_STRING(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitFILTER_EQ_STRING(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitFILTER_EQ_STRING(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FILTER_PARENTContext extends FilterContext {
		public TerminalNode LPR() { return getToken(xpathParser.LPR, 0); }
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public TerminalNode RPR() { return getToken(xpathParser.RPR, 0); }
		public FILTER_PARENTContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterFILTER_PARENT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitFILTER_PARENT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitFILTER_PARENT(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FILTER_ANDContext extends FilterContext {
		public List<FilterContext> filter() {
			return getRuleContexts(FilterContext.class);
		}
		public FilterContext filter(int i) {
			return getRuleContext(FilterContext.class,i);
		}
		public FILTER_ANDContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterFILTER_AND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitFILTER_AND(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitFILTER_AND(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FILTER_EQContext extends FilterContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public FILTER_EQContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterFILTER_EQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitFILTER_EQ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitFILTER_EQ(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FILTER_EXISTContext extends FilterContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public FILTER_EXISTContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterFILTER_EXIST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitFILTER_EXIST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitFILTER_EXIST(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FILTER_ISContext extends FilterContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public FILTER_ISContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterFILTER_IS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitFILTER_IS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitFILTER_IS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		return filter(0);
	}

	private FilterContext filter(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FilterContext _localctx = new FilterContext(_ctx, _parentState);
		FilterContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_filter, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new FILTER_EXISTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(74);
				rp(0);
				}
				break;
			case 2:
				{
				_localctx = new FILTER_EQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				rp(0);
				setState(76);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(77);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new FILTER_ISContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				rp(0);
				setState(80);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__3) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(81);
				rp(0);
				}
				break;
			case 4:
				{
				_localctx = new FILTER_EQ_STRINGContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				rp(0);
				setState(84);
				match(T__0);
				setState(85);
				match(STRING);
				}
				break;
			case 5:
				{
				_localctx = new FILTER_PARENTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				match(LPR);
				setState(88);
				filter(0);
				setState(89);
				match(RPR);
				}
				break;
			case 6:
				{
				_localctx = new FILTERNOTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				match(T__6);
				setState(92);
				filter(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(101);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new FILTER_ANDContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(95);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(96);
						match(T__4);
						setState(97);
						filter(4);
						}
						break;
					case 2:
						{
						_localctx = new FILTER_ORContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(98);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(99);
						match(T__5);
						setState(100);
						filter(3);
						}
						break;
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
	public static class FileNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(xpathParser.ID, 0); }
		public FileNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterFileName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitFileName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitFileName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileNameContext fileName() throws RecognitionException {
		FileNameContext _localctx = new FileNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fileName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(ID);
			setState(107);
			match(T__7);
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
	public static class AttnameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(xpathParser.ID, 0); }
		public AttnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterAttname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitAttname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitAttname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttnameContext attname() throws RecognitionException {
		AttnameContext _localctx = new AttnameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__8);
			setState(110);
			match(ID);
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
		case 2:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 3:
			return filter_sempred((FilterContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean rp_sempred(RpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 1);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean filter_sempred(FilterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0019q\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0004\u0000\u000e\b\u0000\u000b\u0000\f"+
		"\u0000\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001&\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u00025\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002E\b\u0002"+
		"\n\u0002\f\u0002H\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003^\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003f\b\u0003\n\u0003\f\u0003i\t\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0000\u0002"+
		"\u0004\u0006\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u0002\u0001\u0000"+
		"\u0001\u0002\u0001\u0000\u0003\u0004}\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0002%\u0001\u0000\u0000\u0000\u00044\u0001\u0000\u0000\u0000\u0006]"+
		"\u0001\u0000\u0000\u0000\bj\u0001\u0000\u0000\u0000\nm\u0001\u0000\u0000"+
		"\u0000\f\u000e\u0003\u0002\u0001\u0000\r\f\u0001\u0000\u0000\u0000\u000e"+
		"\u000f\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000\u000f\u0010"+
		"\u0001\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000\u0000\u0011\u0012"+
		"\u0005\u0000\u0000\u0001\u0012\u0001\u0001\u0000\u0000\u0000\u0013\u0014"+
		"\u0005\u000b\u0000\u0000\u0014\u0015\u0005\u0015\u0000\u0000\u0015\u0016"+
		"\u0005\n\u0000\u0000\u0016\u0017\u0003\b\u0004\u0000\u0017\u0018\u0005"+
		"\n\u0000\u0000\u0018\u0019\u0005\u0016\u0000\u0000\u0019\u001a\u0005\u0010"+
		"\u0000\u0000\u001a\u001b\u0003\u0004\u0002\u0000\u001b&\u0001\u0000\u0000"+
		"\u0000\u001c\u001d\u0005\u000b\u0000\u0000\u001d\u001e\u0005\u0015\u0000"+
		"\u0000\u001e\u001f\u0005\n\u0000\u0000\u001f \u0003\b\u0004\u0000 !\u0005"+
		"\n\u0000\u0000!\"\u0005\u0016\u0000\u0000\"#\u0005\u0011\u0000\u0000#"+
		"$\u0003\u0004\u0002\u0000$&\u0001\u0000\u0000\u0000%\u0013\u0001\u0000"+
		"\u0000\u0000%\u001c\u0001\u0000\u0000\u0000&\u0003\u0001\u0000\u0000\u0000"+
		"\'(\u0006\u0002\uffff\uffff\u0000(5\u0005\u000f\u0000\u0000)5\u0005\u0017"+
		"\u0000\u0000*5\u0005\u0013\u0000\u0000+5\u0005\u0012\u0000\u0000,-\u0005"+
		"\f\u0000\u0000-.\u0005\u0015\u0000\u0000.5\u0005\u0016\u0000\u0000/5\u0003"+
		"\n\u0005\u000001\u0005\u0015\u0000\u000012\u0003\u0004\u0002\u000023\u0005"+
		"\u0015\u0000\u000035\u0001\u0000\u0000\u00004\'\u0001\u0000\u0000\u0000"+
		"4)\u0001\u0000\u0000\u00004*\u0001\u0000\u0000\u00004+\u0001\u0000\u0000"+
		"\u00004,\u0001\u0000\u0000\u00004/\u0001\u0000\u0000\u000040\u0001\u0000"+
		"\u0000\u00005F\u0001\u0000\u0000\u000067\n\u0004\u0000\u000078\u0005\u0010"+
		"\u0000\u00008E\u0003\u0004\u0002\u00059:\n\u0003\u0000\u0000:;\u0005\u0011"+
		"\u0000\u0000;E\u0003\u0004\u0002\u0004<=\n\u0001\u0000\u0000=>\u0005\u0014"+
		"\u0000\u0000>E\u0003\u0004\u0002\u0002?@\n\u0002\u0000\u0000@A\u0005\r"+
		"\u0000\u0000AB\u0003\u0006\u0003\u0000BC\u0005\u000e\u0000\u0000CE\u0001"+
		"\u0000\u0000\u0000D6\u0001\u0000\u0000\u0000D9\u0001\u0000\u0000\u0000"+
		"D<\u0001\u0000\u0000\u0000D?\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000"+
		"\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000G\u0005\u0001"+
		"\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000IJ\u0006\u0003\uffff\uffff"+
		"\u0000J^\u0003\u0004\u0002\u0000KL\u0003\u0004\u0002\u0000LM\u0007\u0000"+
		"\u0000\u0000MN\u0003\u0004\u0002\u0000N^\u0001\u0000\u0000\u0000OP\u0003"+
		"\u0004\u0002\u0000PQ\u0007\u0001\u0000\u0000QR\u0003\u0004\u0002\u0000"+
		"R^\u0001\u0000\u0000\u0000ST\u0003\u0004\u0002\u0000TU\u0005\u0001\u0000"+
		"\u0000UV\u0005\u0018\u0000\u0000V^\u0001\u0000\u0000\u0000WX\u0005\u0015"+
		"\u0000\u0000XY\u0003\u0006\u0003\u0000YZ\u0005\u0016\u0000\u0000Z^\u0001"+
		"\u0000\u0000\u0000[\\\u0005\u0007\u0000\u0000\\^\u0003\u0006\u0003\u0001"+
		"]I\u0001\u0000\u0000\u0000]K\u0001\u0000\u0000\u0000]O\u0001\u0000\u0000"+
		"\u0000]S\u0001\u0000\u0000\u0000]W\u0001\u0000\u0000\u0000][\u0001\u0000"+
		"\u0000\u0000^g\u0001\u0000\u0000\u0000_`\n\u0003\u0000\u0000`a\u0005\u0005"+
		"\u0000\u0000af\u0003\u0006\u0003\u0004bc\n\u0002\u0000\u0000cd\u0005\u0006"+
		"\u0000\u0000df\u0003\u0006\u0003\u0003e_\u0001\u0000\u0000\u0000eb\u0001"+
		"\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000"+
		"gh\u0001\u0000\u0000\u0000h\u0007\u0001\u0000\u0000\u0000ig\u0001\u0000"+
		"\u0000\u0000jk\u0005\u000f\u0000\u0000kl\u0005\b\u0000\u0000l\t\u0001"+
		"\u0000\u0000\u0000mn\u0005\t\u0000\u0000no\u0005\u000f\u0000\u0000o\u000b"+
		"\u0001\u0000\u0000\u0000\b\u000f%4DF]eg";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}