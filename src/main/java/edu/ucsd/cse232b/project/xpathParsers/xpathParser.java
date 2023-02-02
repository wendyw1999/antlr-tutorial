// Generated from xpath.g4 by ANTLR 4.7.2

package edu.ucsd.cse232b.project.xpathParsers;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class xpathParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, DOC=8, TXT=9, 
		LB=10, RB=11, ID=12, SLASH=13, DOUBLESLASH=14, DOTDOT=15, DOT=16, COMMA=17, 
		LPR=18, RPR=19, STAR=20, STRING=21;
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
	public String getGrammarFileName() { return "xpath.g4"; }

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
	public static class ChildRootContext extends XpathContext {
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
	public static class DescRootContext extends XpathContext {
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
			setState(33);
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
				fileName();
				setState(22);
				match(RPR);
				setState(23);
				match(SLASH);
				setState(24);
				rp(0);
				}
				break;
			case 2:
				_localctx = new DescRootContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(DOC);
				setState(27);
				match(LPR);
				setState(28);
				fileName();
				setState(29);
				match(RPR);
				setState(30);
				match(DOUBLESLASH);
				setState(31);
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
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new TAG_NAMEContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(36);
				match(ID);
				}
				break;
			case STAR:
				{
				_localctx = new STARContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(37);
				match(STAR);
				}
				break;
			case DOT:
				{
				_localctx = new SELF_AXISContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(38);
				match(DOT);
				}
				break;
			case DOTDOT:
				{
				_localctx = new PARENT_AXISContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(39);
				match(DOTDOT);
				}
				break;
			case TXT:
				{
				_localctx = new TEXT_AXISContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				match(TXT);
				setState(41);
				match(LPR);
				setState(42);
				match(RPR);
				}
				break;
			case T__6:
				{
				_localctx = new ATTR_AXISContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(43);
				attname();
				}
				break;
			case LPR:
				{
				_localctx = new PARENTHESISContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(44);
				match(LPR);
				setState(45);
				rp(0);
				setState(46);
				match(LPR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(64);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new CHILD_RPContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(50);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(51);
						match(SLASH);
						setState(52);
						rp(5);
						}
						break;
					case 2:
						{
						_localctx = new DESC_RPContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(53);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(54);
						match(DOUBLESLASH);
						setState(55);
						rp(4);
						}
						break;
					case 3:
						{
						_localctx = new TWO_RPContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(56);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(57);
						match(COMMA);
						setState(58);
						rp(2);
						}
						break;
					case 4:
						{
						_localctx = new FILTER_RPContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(59);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(60);
						match(LB);
						setState(61);
						filter(0);
						setState(62);
						match(RB);
						}
						break;
					}
					} 
				}
				setState(68);
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
	public static class FILTEER_EXISTContext extends FilterContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public FILTEER_EXISTContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterFILTEER_EXIST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitFILTEER_EXIST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathVisitor ) return ((xpathVisitor<? extends T>)visitor).visitFILTEER_EXIST(this);
			else return visitor.visitChildren(this);
		}
	}
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new FILTEER_EXISTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(70);
				rp(0);
				}
				break;
			case 2:
				{
				_localctx = new FILTER_EQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				rp(0);
				setState(72);
				match(T__0);
				setState(73);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new FILTER_ISContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				rp(0);
				setState(76);
				match(T__1);
				setState(77);
				rp(0);
				}
				break;
			case 4:
				{
				_localctx = new FILTER_EQ_STRINGContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				rp(0);
				setState(80);
				match(T__0);
				setState(81);
				match(STRING);
				}
				break;
			case 5:
				{
				_localctx = new FILTER_PARENTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				match(LPR);
				setState(84);
				filter(0);
				setState(85);
				match(RPR);
				}
				break;
			case 6:
				{
				_localctx = new FILTERNOTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				match(T__4);
				setState(88);
				filter(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(97);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new FILTER_ANDContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(91);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(92);
						match(T__2);
						setState(93);
						filter(4);
						}
						break;
					case 2:
						{
						_localctx = new FILTER_ORContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(94);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(95);
						match(T__3);
						setState(96);
						filter(3);
						}
						break;
					}
					} 
				}
				setState(101);
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
			setState(102);
			match(ID);
			setState(103);
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
			setState(105);
			match(T__6);
			setState(106);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27o\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\20\n\2\r\2\16\2\21\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3$\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\63\n\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4C\n\4\f\4\16\4F\13\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5\\\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5d\n\5\f\5\16\5g\13\5\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\2\4\6\b\b\2\4\6\b\n\f\2\2\2{\2\17\3\2\2\2\4"+
		"#\3\2\2\2\6\62\3\2\2\2\b[\3\2\2\2\nh\3\2\2\2\fk\3\2\2\2\16\20\5\4\3\2"+
		"\17\16\3\2\2\2\20\21\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\23\3\2\2\2"+
		"\23\24\7\2\2\3\24\3\3\2\2\2\25\26\7\n\2\2\26\27\7\24\2\2\27\30\5\n\6\2"+
		"\30\31\7\25\2\2\31\32\7\17\2\2\32\33\5\6\4\2\33$\3\2\2\2\34\35\7\n\2\2"+
		"\35\36\7\24\2\2\36\37\5\n\6\2\37 \7\25\2\2 !\7\20\2\2!\"\5\6\4\2\"$\3"+
		"\2\2\2#\25\3\2\2\2#\34\3\2\2\2$\5\3\2\2\2%&\b\4\1\2&\63\7\16\2\2\'\63"+
		"\7\26\2\2(\63\7\22\2\2)\63\7\21\2\2*+\7\13\2\2+,\7\24\2\2,\63\7\25\2\2"+
		"-\63\5\f\7\2./\7\24\2\2/\60\5\6\4\2\60\61\7\24\2\2\61\63\3\2\2\2\62%\3"+
		"\2\2\2\62\'\3\2\2\2\62(\3\2\2\2\62)\3\2\2\2\62*\3\2\2\2\62-\3\2\2\2\62"+
		".\3\2\2\2\63D\3\2\2\2\64\65\f\6\2\2\65\66\7\17\2\2\66C\5\6\4\7\678\f\5"+
		"\2\289\7\20\2\29C\5\6\4\6:;\f\3\2\2;<\7\23\2\2<C\5\6\4\4=>\f\4\2\2>?\7"+
		"\f\2\2?@\5\b\5\2@A\7\r\2\2AC\3\2\2\2B\64\3\2\2\2B\67\3\2\2\2B:\3\2\2\2"+
		"B=\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\7\3\2\2\2FD\3\2\2\2GH\b\5\1"+
		"\2H\\\5\6\4\2IJ\5\6\4\2JK\7\3\2\2KL\5\6\4\2L\\\3\2\2\2MN\5\6\4\2NO\7\4"+
		"\2\2OP\5\6\4\2P\\\3\2\2\2QR\5\6\4\2RS\7\3\2\2ST\7\27\2\2T\\\3\2\2\2UV"+
		"\7\24\2\2VW\5\b\5\2WX\7\25\2\2X\\\3\2\2\2YZ\7\7\2\2Z\\\5\b\5\3[G\3\2\2"+
		"\2[I\3\2\2\2[M\3\2\2\2[Q\3\2\2\2[U\3\2\2\2[Y\3\2\2\2\\e\3\2\2\2]^\f\5"+
		"\2\2^_\7\5\2\2_d\5\b\5\6`a\f\4\2\2ab\7\6\2\2bd\5\b\5\5c]\3\2\2\2c`\3\2"+
		"\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\t\3\2\2\2ge\3\2\2\2hi\7\16\2\2ij\7"+
		"\b\2\2j\13\3\2\2\2kl\7\t\2\2lm\7\16\2\2m\r\3\2\2\2\n\21#\62BD[ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}