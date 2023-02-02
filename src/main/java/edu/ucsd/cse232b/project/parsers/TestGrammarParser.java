// Generated from java-escape by ANTLR 4.11.1

package edu.ucsd.cse232b.project.parsers;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TestGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AP=1, RP=2, DOTDOT=3, DOT=4, FILE=5, TXT=6, LPR=7, RPR=8, DOC=9, STAR=10, 
		NUM=11, TAGNAME=12, ATTNAME=13;
	public static final int
		RULE_prog = 0, RULE_xpath = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "xpath"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'/'", "'//'", "'..'", "'.'", null, "'text'", "'('", "')'", "'doc'", 
			"'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AP", "RP", "DOTDOT", "DOT", "FILE", "TXT", "LPR", "RPR", "DOC", 
			"STAR", "NUM", "TAGNAME", "ATTNAME"
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

	public TestGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public XpathContext xpath() {
			return getRuleContext(XpathContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TestGrammarParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGrammarVisitor ) return ((TestGrammarVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			xpath();
			setState(5);
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
	public static class Txt_Lpr_RprContext extends XpathContext {
		public TerminalNode TXT() { return getToken(TestGrammarParser.TXT, 0); }
		public TerminalNode LPR() { return getToken(TestGrammarParser.LPR, 0); }
		public TerminalNode RPR() { return getToken(TestGrammarParser.RPR, 0); }
		public Txt_Lpr_RprContext(XpathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).enterTxt_Lpr_Rpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).exitTxt_Lpr_Rpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGrammarVisitor ) return ((TestGrammarVisitor<? extends T>)visitor).visitTxt_Lpr_Rpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttnameContext extends XpathContext {
		public TerminalNode ATTNAME() { return getToken(TestGrammarParser.ATTNAME, 0); }
		public AttnameContext(XpathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).enterAttname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).exitAttname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGrammarVisitor ) return ((TestGrammarVisitor<? extends T>)visitor).visitAttname(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Ap_XpathContext extends XpathContext {
		public TerminalNode AP() { return getToken(TestGrammarParser.AP, 0); }
		public XpathContext xpath() {
			return getRuleContext(XpathContext.class,0);
		}
		public Ap_XpathContext(XpathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).enterAp_Xpath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).exitAp_Xpath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGrammarVisitor ) return ((TestGrammarVisitor<? extends T>)visitor).visitAp_Xpath(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Lpr_Xpath_RprContext extends XpathContext {
		public TerminalNode LPR() { return getToken(TestGrammarParser.LPR, 0); }
		public XpathContext xpath() {
			return getRuleContext(XpathContext.class,0);
		}
		public TerminalNode RPR() { return getToken(TestGrammarParser.RPR, 0); }
		public Lpr_Xpath_RprContext(XpathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).enterLpr_Xpath_Rpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).exitLpr_Xpath_Rpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGrammarVisitor ) return ((TestGrammarVisitor<? extends T>)visitor).visitLpr_Xpath_Rpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarContext extends XpathContext {
		public TerminalNode STAR() { return getToken(TestGrammarParser.STAR, 0); }
		public StarContext(XpathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).exitStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGrammarVisitor ) return ((TestGrammarVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TagnameContext extends XpathContext {
		public TerminalNode TAGNAME() { return getToken(TestGrammarParser.TAGNAME, 0); }
		public TagnameContext(XpathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).enterTagname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).exitTagname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGrammarVisitor ) return ((TestGrammarVisitor<? extends T>)visitor).visitTagname(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Doc_XpathContext extends XpathContext {
		public TerminalNode DOC() { return getToken(TestGrammarParser.DOC, 0); }
		public TerminalNode LPR() { return getToken(TestGrammarParser.LPR, 0); }
		public TerminalNode FILE() { return getToken(TestGrammarParser.FILE, 0); }
		public TerminalNode RPR() { return getToken(TestGrammarParser.RPR, 0); }
		public XpathContext xpath() {
			return getRuleContext(XpathContext.class,0);
		}
		public Doc_XpathContext(XpathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).enterDoc_Xpath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).exitDoc_Xpath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGrammarVisitor ) return ((TestGrammarVisitor<? extends T>)visitor).visitDoc_Xpath(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DotContext extends XpathContext {
		public TerminalNode DOT() { return getToken(TestGrammarParser.DOT, 0); }
		public DotContext(XpathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).enterDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).exitDot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGrammarVisitor ) return ((TestGrammarVisitor<? extends T>)visitor).visitDot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DocContext extends XpathContext {
		public TerminalNode DOC() { return getToken(TestGrammarParser.DOC, 0); }
		public TerminalNode LPR() { return getToken(TestGrammarParser.LPR, 0); }
		public TerminalNode FILE() { return getToken(TestGrammarParser.FILE, 0); }
		public TerminalNode RPR() { return getToken(TestGrammarParser.RPR, 0); }
		public DocContext(XpathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).enterDoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).exitDoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGrammarVisitor ) return ((TestGrammarVisitor<? extends T>)visitor).visitDoc(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DotdotContext extends XpathContext {
		public TerminalNode DOTDOT() { return getToken(TestGrammarParser.DOTDOT, 0); }
		public DotdotContext(XpathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).enterDotdot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).exitDotdot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGrammarVisitor ) return ((TestGrammarVisitor<? extends T>)visitor).visitDotdot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Rp_XpathContext extends XpathContext {
		public TerminalNode RP() { return getToken(TestGrammarParser.RP, 0); }
		public XpathContext xpath() {
			return getRuleContext(XpathContext.class,0);
		}
		public Rp_XpathContext(XpathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).enterRp_Xpath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).exitRp_Xpath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGrammarVisitor ) return ((TestGrammarVisitor<? extends T>)visitor).visitRp_Xpath(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Tagname_XpathContext extends XpathContext {
		public TerminalNode TAGNAME() { return getToken(TestGrammarParser.TAGNAME, 0); }
		public XpathContext xpath() {
			return getRuleContext(XpathContext.class,0);
		}
		public Tagname_XpathContext(XpathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).enterTagname_Xpath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).exitTagname_Xpath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGrammarVisitor ) return ((TestGrammarVisitor<? extends T>)visitor).visitTagname_Xpath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XpathContext xpath() throws RecognitionException {
		XpathContext _localctx = new XpathContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_xpath);
		try {
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new DocContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(7);
				match(DOC);
				setState(8);
				match(LPR);
				setState(9);
				match(FILE);
				setState(10);
				match(RPR);
				}
				break;
			case 2:
				_localctx = new Doc_XpathContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(11);
				match(DOC);
				setState(12);
				match(LPR);
				setState(13);
				match(FILE);
				setState(14);
				match(RPR);
				setState(15);
				xpath();
				}
				break;
			case 3:
				_localctx = new Lpr_Xpath_RprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(16);
				match(LPR);
				setState(17);
				xpath();
				setState(18);
				match(RPR);
				}
				break;
			case 4:
				_localctx = new Ap_XpathContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(20);
				match(AP);
				setState(21);
				xpath();
				}
				break;
			case 5:
				_localctx = new Rp_XpathContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(22);
				match(RP);
				setState(23);
				xpath();
				}
				break;
			case 6:
				_localctx = new DotContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(24);
				match(DOT);
				}
				break;
			case 7:
				_localctx = new DotdotContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(25);
				match(DOTDOT);
				}
				break;
			case 8:
				_localctx = new StarContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(26);
				match(STAR);
				}
				break;
			case 9:
				_localctx = new Txt_Lpr_RprContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(27);
				match(TXT);
				setState(28);
				match(LPR);
				setState(29);
				match(RPR);
				}
				break;
			case 10:
				_localctx = new TagnameContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(30);
				match(TAGNAME);
				}
				break;
			case 11:
				_localctx = new AttnameContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(31);
				match(ATTNAME);
				}
				break;
			case 12:
				_localctx = new Tagname_XpathContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(32);
				match(TAGNAME);
				setState(33);
				xpath();
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

	public static final String _serializedATN =
		"\u0004\u0001\r%\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001#\b\u0001\u0001\u0001\u0000\u0000\u0002\u0000\u0002\u0000\u0000"+
		"-\u0000\u0004\u0001\u0000\u0000\u0000\u0002\"\u0001\u0000\u0000\u0000"+
		"\u0004\u0005\u0003\u0002\u0001\u0000\u0005\u0006\u0005\u0000\u0000\u0001"+
		"\u0006\u0001\u0001\u0000\u0000\u0000\u0007\b\u0005\t\u0000\u0000\b\t\u0005"+
		"\u0007\u0000\u0000\t\n\u0005\u0005\u0000\u0000\n#\u0005\b\u0000\u0000"+
		"\u000b\f\u0005\t\u0000\u0000\f\r\u0005\u0007\u0000\u0000\r\u000e\u0005"+
		"\u0005\u0000\u0000\u000e\u000f\u0005\b\u0000\u0000\u000f#\u0003\u0002"+
		"\u0001\u0000\u0010\u0011\u0005\u0007\u0000\u0000\u0011\u0012\u0003\u0002"+
		"\u0001\u0000\u0012\u0013\u0005\b\u0000\u0000\u0013#\u0001\u0000\u0000"+
		"\u0000\u0014\u0015\u0005\u0001\u0000\u0000\u0015#\u0003\u0002\u0001\u0000"+
		"\u0016\u0017\u0005\u0002\u0000\u0000\u0017#\u0003\u0002\u0001\u0000\u0018"+
		"#\u0005\u0004\u0000\u0000\u0019#\u0005\u0003\u0000\u0000\u001a#\u0005"+
		"\n\u0000\u0000\u001b\u001c\u0005\u0006\u0000\u0000\u001c\u001d\u0005\u0007"+
		"\u0000\u0000\u001d#\u0005\b\u0000\u0000\u001e#\u0005\f\u0000\u0000\u001f"+
		"#\u0005\r\u0000\u0000 !\u0005\f\u0000\u0000!#\u0003\u0002\u0001\u0000"+
		"\"\u0007\u0001\u0000\u0000\u0000\"\u000b\u0001\u0000\u0000\u0000\"\u0010"+
		"\u0001\u0000\u0000\u0000\"\u0014\u0001\u0000\u0000\u0000\"\u0016\u0001"+
		"\u0000\u0000\u0000\"\u0018\u0001\u0000\u0000\u0000\"\u0019\u0001\u0000"+
		"\u0000\u0000\"\u001a\u0001\u0000\u0000\u0000\"\u001b\u0001\u0000\u0000"+
		"\u0000\"\u001e\u0001\u0000\u0000\u0000\"\u001f\u0001\u0000\u0000\u0000"+
		"\" \u0001\u0000\u0000\u0000#\u0003\u0001\u0000\u0000\u0000\u0001\"";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}