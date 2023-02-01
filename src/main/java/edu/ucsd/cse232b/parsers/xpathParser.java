// Generated from java-escape by ANTLR 4.11.1

package edu.ucsd.cse232b.parsers;

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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, DOC=8, TXT=9, 
		LB=10, RB=11, ID=12, SLASH=13, DOUBLESLASH=14, DOTDOT=15, DOT=16, COMMA=17, 
		LPR=18, RPR=19, STAR=20, STRING=21;
	public static final int
		RULE_prog = 0, RULE_xpath = 1, RULE_ap = 2, RULE_rp = 3, RULE_filter = 4, 
		RULE_fileName = 5, RULE_tagname = 6, RULE_attname = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "xpath", "ap", "rp", "filter", "fileName", "tagname", "attname"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'=='", "'and'", "'or'", "'not'", "'.xml'", "'@'", "'doc'", 
			"'text'", "'['", "']'", null, "'/'", "'//'", "'..'", "'.'", "','", "'('", 
			"')'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "DOC", "TXT", "LB", "RB", 
			"ID", "SLASH", "DOUBLESLASH", "DOTDOT", "DOT", "COMMA", "LPR", "RPR", 
			"STAR", "STRING"
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
		public XpathContext xpath() {
			return getRuleContext(XpathContext.class,0);
		}
		public TerminalNode EOF() { return getToken(xpathParser.EOF, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			xpath();
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
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public XpathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xpath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterXpath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitXpath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitXpath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XpathContext xpath() throws RecognitionException {
		XpathContext _localctx = new XpathContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_xpath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			ap();
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
	public static class ApContext extends ParserRuleContext {
		public ApContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ap; }
	 
		public ApContext() { }
		public void copyFrom(ApContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChildRootContext extends ApContext {
		public TerminalNode DOC() { return getToken(xpathParser.DOC, 0); }
		public TerminalNode LPR() { return getToken(xpathParser.LPR, 0); }
		public FileNameContext fileName() {
			return getRuleContext(FileNameContext.class,0);
		}
		public TerminalNode RPR() { return getToken(xpathParser.RPR, 0); }
		public TerminalNode SLASH() { return getToken(xpathParser.SLASH, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public ChildRootContext(ApContext ctx) { copyFrom(ctx); }
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
	public static class DescRootContext extends ApContext {
		public TerminalNode DOC() { return getToken(xpathParser.DOC, 0); }
		public TerminalNode LPR() { return getToken(xpathParser.LPR, 0); }
		public FileNameContext fileName() {
			return getRuleContext(FileNameContext.class,0);
		}
		public TerminalNode RPR() { return getToken(xpathParser.RPR, 0); }
		public TerminalNode DOUBLESLASH() { return getToken(xpathParser.DOUBLESLASH, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public DescRootContext(ApContext ctx) { copyFrom(ctx); }
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

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ap);
		try {
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new ChildRootContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				match(DOC);
				setState(22);
				match(LPR);
				setState(23);
				fileName();
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
				fileName();
				setState(31);
				match(RPR);
				setState(32);
				match(DOUBLESLASH);
				setState(33);
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
	public static class TextAxisContext extends RpContext {
		public TerminalNode TXT() { return getToken(xpathParser.TXT, 0); }
		public TerminalNode LPR() { return getToken(xpathParser.LPR, 0); }
		public TerminalNode RPR() { return getToken(xpathParser.RPR, 0); }
		public TextAxisContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterTextAxis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitTextAxis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitTextAxis(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DescRpContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode DOUBLESLASH() { return getToken(xpathParser.DOUBLESLASH, 0); }
		public DescRpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterDescRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitDescRp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitDescRp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelfAxisContext extends RpContext {
		public TerminalNode DOT() { return getToken(xpathParser.DOT, 0); }
		public SelfAxisContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterSelfAxis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitSelfAxis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitSelfAxis(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesisContext extends RpContext {
		public List<TerminalNode> LPR() { return getTokens(xpathParser.LPR); }
		public TerminalNode LPR(int i) {
			return getToken(xpathParser.LPR, i);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public ParenthesisContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TagNameContext extends RpContext {
		public TagnameContext tagname() {
			return getRuleContext(TagnameContext.class,0);
		}
		public TagNameContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitTagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitTagName(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarContext extends RpContext {
		public TerminalNode STAR() { return getToken(xpathParser.STAR, 0); }
		public StarContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttrAxisContext extends RpContext {
		public AttnameContext attname() {
			return getRuleContext(AttnameContext.class,0);
		}
		public AttrAxisContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterAttrAxis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitAttrAxis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitAttrAxis(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParentAxisContext extends RpContext {
		public TerminalNode DOTDOT() { return getToken(xpathParser.DOTDOT, 0); }
		public ParentAxisContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterParentAxis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitParentAxis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitParentAxis(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilterRpContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public TerminalNode LB() { return getToken(xpathParser.LB, 0); }
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public TerminalNode RB() { return getToken(xpathParser.RB, 0); }
		public FilterRpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterFilterRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitFilterRp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitFilterRp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChildRpContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode SLASH() { return getToken(xpathParser.SLASH, 0); }
		public ChildRpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterChildRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitChildRp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitChildRp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TwoRpContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(xpathParser.COMMA, 0); }
		public TwoRpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterTwoRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitTwoRp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitTwoRp(this);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new TagNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(38);
				tagname();
				}
				break;
			case STAR:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(39);
				match(STAR);
				}
				break;
			case DOT:
				{
				_localctx = new SelfAxisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				match(DOT);
				}
				break;
			case DOTDOT:
				{
				_localctx = new ParentAxisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(41);
				match(DOTDOT);
				}
				break;
			case TXT:
				{
				_localctx = new TextAxisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42);
				match(TXT);
				setState(43);
				match(LPR);
				setState(44);
				match(RPR);
				}
				break;
			case T__6:
				{
				_localctx = new AttrAxisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(45);
				attname();
				}
				break;
			case LPR:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(46);
				match(LPR);
				setState(47);
				rp(0);
				setState(48);
				match(LPR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(66);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ChildRpContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(52);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(53);
						match(SLASH);
						setState(54);
						rp(5);
						}
						break;
					case 2:
						{
						_localctx = new DescRpContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(55);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(56);
						match(DOUBLESLASH);
						setState(57);
						rp(4);
						}
						break;
					case 3:
						{
						_localctx = new TwoRpContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(58);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(59);
						match(COMMA);
						setState(60);
						rp(2);
						}
						break;
					case 4:
						{
						_localctx = new FilterRpContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(61);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(62);
						match(LB);
						setState(63);
						filter(0);
						setState(64);
						match(RB);
						}
						break;
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
	public static class FilterEqStringContext extends FilterContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public TerminalNode STRING() { return getToken(xpathParser.STRING, 0); }
		public FilterEqStringContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterFilterEqString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitFilterEqString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitFilterEqString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilterNotContext extends FilterContext {
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public FilterNotContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterFilterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitFilterNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitFilterNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilterOrContext extends FilterContext {
		public List<FilterContext> filter() {
			return getRuleContexts(FilterContext.class);
		}
		public FilterContext filter(int i) {
			return getRuleContext(FilterContext.class,i);
		}
		public FilterOrContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterFilterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitFilterOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitFilterOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilterAndContext extends FilterContext {
		public List<FilterContext> filter() {
			return getRuleContexts(FilterContext.class);
		}
		public FilterContext filter(int i) {
			return getRuleContext(FilterContext.class,i);
		}
		public FilterAndContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterFilterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitFilterAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitFilterAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilterParentContext extends FilterContext {
		public TerminalNode LPR() { return getToken(xpathParser.LPR, 0); }
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public TerminalNode RPR() { return getToken(xpathParser.RPR, 0); }
		public FilterParentContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterFilterParent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitFilterParent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitFilterParent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilterEqContext extends FilterContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public FilterEqContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterFilterEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitFilterEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitFilterEq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilterIsContext extends FilterContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public FilterIsContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterFilterIs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitFilterIs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitFilterIs(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilterExistContext extends FilterContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public FilterExistContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterFilterExist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitFilterExist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitFilterExist(this);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_filter, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new FilterExistContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(72);
				rp(0);
				}
				break;
			case 2:
				{
				_localctx = new FilterEqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73);
				rp(0);
				setState(74);
				match(T__0);
				setState(75);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new FilterIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
				rp(0);
				setState(78);
				match(T__1);
				setState(79);
				rp(0);
				}
				break;
			case 4:
				{
				_localctx = new FilterEqStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				rp(0);
				setState(82);
				match(T__0);
				setState(83);
				match(STRING);
				}
				break;
			case 5:
				{
				_localctx = new FilterParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				match(LPR);
				setState(86);
				filter(0);
				setState(87);
				match(RPR);
				}
				break;
			case 6:
				{
				_localctx = new FilterNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				match(T__4);
				setState(90);
				filter(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(99);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new FilterAndContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(93);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(94);
						match(T__2);
						setState(95);
						filter(4);
						}
						break;
					case 2:
						{
						_localctx = new FilterOrContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(96);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(97);
						match(T__3);
						setState(98);
						filter(3);
						}
						break;
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		public FileNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileName; }
	 
		public FileNameContext() { }
		public void copyFrom(FileNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Xml_FileContext extends FileNameContext {
		public TerminalNode ID() { return getToken(xpathParser.ID, 0); }
		public Xml_FileContext(FileNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterXml_File(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitXml_File(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitXml_File(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileNameContext fileName() throws RecognitionException {
		FileNameContext _localctx = new FileNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fileName);
		try {
			_localctx = new Xml_FileContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(ID);
			setState(105);
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
	public static class TagnameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(xpathParser.ID, 0); }
		public TagnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterTagname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitTagname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitTagname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagnameContext tagname() throws RecognitionException {
		TagnameContext _localctx = new TagnameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tagname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
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
		enterRule(_localctx, 14, RULE_attname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__6);
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
		case 3:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 4:
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
		"\u0004\u0001\u0015q\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002$\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u00033\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003C\b\u0003\n\u0003\f\u0003F\t\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\\\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004d\b\u0004\n\u0004"+
		"\f\u0004g\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0000\u0002\u0006"+
		"\b\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000\u0000z\u0000\u0010\u0001"+
		"\u0000\u0000\u0000\u0002\u0013\u0001\u0000\u0000\u0000\u0004#\u0001\u0000"+
		"\u0000\u0000\u00062\u0001\u0000\u0000\u0000\b[\u0001\u0000\u0000\u0000"+
		"\nh\u0001\u0000\u0000\u0000\fk\u0001\u0000\u0000\u0000\u000em\u0001\u0000"+
		"\u0000\u0000\u0010\u0011\u0003\u0002\u0001\u0000\u0011\u0012\u0005\u0000"+
		"\u0000\u0001\u0012\u0001\u0001\u0000\u0000\u0000\u0013\u0014\u0003\u0004"+
		"\u0002\u0000\u0014\u0003\u0001\u0000\u0000\u0000\u0015\u0016\u0005\b\u0000"+
		"\u0000\u0016\u0017\u0005\u0012\u0000\u0000\u0017\u0018\u0003\n\u0005\u0000"+
		"\u0018\u0019\u0005\u0013\u0000\u0000\u0019\u001a\u0005\r\u0000\u0000\u001a"+
		"\u001b\u0003\u0006\u0003\u0000\u001b$\u0001\u0000\u0000\u0000\u001c\u001d"+
		"\u0005\b\u0000\u0000\u001d\u001e\u0005\u0012\u0000\u0000\u001e\u001f\u0003"+
		"\n\u0005\u0000\u001f \u0005\u0013\u0000\u0000 !\u0005\u000e\u0000\u0000"+
		"!\"\u0003\u0006\u0003\u0000\"$\u0001\u0000\u0000\u0000#\u0015\u0001\u0000"+
		"\u0000\u0000#\u001c\u0001\u0000\u0000\u0000$\u0005\u0001\u0000\u0000\u0000"+
		"%&\u0006\u0003\uffff\uffff\u0000&3\u0003\f\u0006\u0000\'3\u0005\u0014"+
		"\u0000\u0000(3\u0005\u0010\u0000\u0000)3\u0005\u000f\u0000\u0000*+\u0005"+
		"\t\u0000\u0000+,\u0005\u0012\u0000\u0000,3\u0005\u0013\u0000\u0000-3\u0003"+
		"\u000e\u0007\u0000./\u0005\u0012\u0000\u0000/0\u0003\u0006\u0003\u0000"+
		"01\u0005\u0012\u0000\u000013\u0001\u0000\u0000\u00002%\u0001\u0000\u0000"+
		"\u00002\'\u0001\u0000\u0000\u00002(\u0001\u0000\u0000\u00002)\u0001\u0000"+
		"\u0000\u00002*\u0001\u0000\u0000\u00002-\u0001\u0000\u0000\u00002.\u0001"+
		"\u0000\u0000\u00003D\u0001\u0000\u0000\u000045\n\u0004\u0000\u000056\u0005"+
		"\r\u0000\u00006C\u0003\u0006\u0003\u000578\n\u0003\u0000\u000089\u0005"+
		"\u000e\u0000\u00009C\u0003\u0006\u0003\u0004:;\n\u0001\u0000\u0000;<\u0005"+
		"\u0011\u0000\u0000<C\u0003\u0006\u0003\u0002=>\n\u0002\u0000\u0000>?\u0005"+
		"\n\u0000\u0000?@\u0003\b\u0004\u0000@A\u0005\u000b\u0000\u0000AC\u0001"+
		"\u0000\u0000\u0000B4\u0001\u0000\u0000\u0000B7\u0001\u0000\u0000\u0000"+
		"B:\u0001\u0000\u0000\u0000B=\u0001\u0000\u0000\u0000CF\u0001\u0000\u0000"+
		"\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000E\u0007\u0001"+
		"\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GH\u0006\u0004\uffff\uffff"+
		"\u0000H\\\u0003\u0006\u0003\u0000IJ\u0003\u0006\u0003\u0000JK\u0005\u0001"+
		"\u0000\u0000KL\u0003\u0006\u0003\u0000L\\\u0001\u0000\u0000\u0000MN\u0003"+
		"\u0006\u0003\u0000NO\u0005\u0002\u0000\u0000OP\u0003\u0006\u0003\u0000"+
		"P\\\u0001\u0000\u0000\u0000QR\u0003\u0006\u0003\u0000RS\u0005\u0001\u0000"+
		"\u0000ST\u0005\u0015\u0000\u0000T\\\u0001\u0000\u0000\u0000UV\u0005\u0012"+
		"\u0000\u0000VW\u0003\b\u0004\u0000WX\u0005\u0013\u0000\u0000X\\\u0001"+
		"\u0000\u0000\u0000YZ\u0005\u0005\u0000\u0000Z\\\u0003\b\u0004\u0001[G"+
		"\u0001\u0000\u0000\u0000[I\u0001\u0000\u0000\u0000[M\u0001\u0000\u0000"+
		"\u0000[Q\u0001\u0000\u0000\u0000[U\u0001\u0000\u0000\u0000[Y\u0001\u0000"+
		"\u0000\u0000\\e\u0001\u0000\u0000\u0000]^\n\u0003\u0000\u0000^_\u0005"+
		"\u0003\u0000\u0000_d\u0003\b\u0004\u0004`a\n\u0002\u0000\u0000ab\u0005"+
		"\u0004\u0000\u0000bd\u0003\b\u0004\u0003c]\u0001\u0000\u0000\u0000c`\u0001"+
		"\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000"+
		"ef\u0001\u0000\u0000\u0000f\t\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000"+
		"\u0000hi\u0005\f\u0000\u0000ij\u0005\u0006\u0000\u0000j\u000b\u0001\u0000"+
		"\u0000\u0000kl\u0005\f\u0000\u0000l\r\u0001\u0000\u0000\u0000mn\u0005"+
		"\u0007\u0000\u0000no\u0005\f\u0000\u0000o\u000f\u0001\u0000\u0000\u0000"+
		"\u0007#2BD[ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}