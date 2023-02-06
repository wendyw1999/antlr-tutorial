// Generated from java-escape by ANTLR 4.11.1
package edu.ucsd.cse232b.project.xpathParsers;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class xpathLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		QUOTE=10, DOC=11, TXT=12, LB=13, RB=14, ID=15, SLASH=16, DOUBLESLASH=17, 
		DOTDOT=18, DOT=19, COMMA=20, LPR=21, RPR=22, STAR=23, STRING=24, Whitespace=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"QUOTE", "DOC", "TXT", "LB", "RB", "ID", "SLASH", "DOUBLESLASH", "DOTDOT", 
			"DOT", "COMMA", "LPR", "RPR", "STAR", "STRING", "Whitespace"
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


	public xpathLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "xpath.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0019\u0087\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0005\u000eb\b\u000e\n\u000e\f\u000ee\t\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0004\u0017{\b\u0017\u000b\u0017\f\u0017|\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0004\u0018\u0082\b\u0018\u000b\u0018\f\u0018"+
		"\u0083\u0001\u0018\u0001\u0018\u0000\u0000\u0019\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u0019\u0001\u0000"+
		"\u0004\u0002\u0000AZaz\u0004\u000009AZ__az\u0006\u0000\"\"\'\'-.09AZa"+
		"z\u0003\u0000\t\n\r\r  \u0089\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00013\u0001\u0000\u0000\u0000\u00035\u0001\u0000\u0000\u0000"+
		"\u00058\u0001\u0000\u0000\u0000\u0007;\u0001\u0000\u0000\u0000\t>\u0001"+
		"\u0000\u0000\u0000\u000bB\u0001\u0000\u0000\u0000\rE\u0001\u0000\u0000"+
		"\u0000\u000fI\u0001\u0000\u0000\u0000\u0011N\u0001\u0000\u0000\u0000\u0013"+
		"P\u0001\u0000\u0000\u0000\u0015R\u0001\u0000\u0000\u0000\u0017V\u0001"+
		"\u0000\u0000\u0000\u0019[\u0001\u0000\u0000\u0000\u001b]\u0001\u0000\u0000"+
		"\u0000\u001d_\u0001\u0000\u0000\u0000\u001ff\u0001\u0000\u0000\u0000!"+
		"h\u0001\u0000\u0000\u0000#k\u0001\u0000\u0000\u0000%n\u0001\u0000\u0000"+
		"\u0000\'p\u0001\u0000\u0000\u0000)r\u0001\u0000\u0000\u0000+t\u0001\u0000"+
		"\u0000\u0000-v\u0001\u0000\u0000\u0000/x\u0001\u0000\u0000\u00001\u0081"+
		"\u0001\u0000\u0000\u000034\u0005=\u0000\u00004\u0002\u0001\u0000\u0000"+
		"\u000056\u0005e\u0000\u000067\u0005q\u0000\u00007\u0004\u0001\u0000\u0000"+
		"\u000089\u0005=\u0000\u00009:\u0005=\u0000\u0000:\u0006\u0001\u0000\u0000"+
		"\u0000;<\u0005i\u0000\u0000<=\u0005s\u0000\u0000=\b\u0001\u0000\u0000"+
		"\u0000>?\u0005a\u0000\u0000?@\u0005n\u0000\u0000@A\u0005d\u0000\u0000"+
		"A\n\u0001\u0000\u0000\u0000BC\u0005o\u0000\u0000CD\u0005r\u0000\u0000"+
		"D\f\u0001\u0000\u0000\u0000EF\u0005n\u0000\u0000FG\u0005o\u0000\u0000"+
		"GH\u0005t\u0000\u0000H\u000e\u0001\u0000\u0000\u0000IJ\u0005.\u0000\u0000"+
		"JK\u0005x\u0000\u0000KL\u0005m\u0000\u0000LM\u0005l\u0000\u0000M\u0010"+
		"\u0001\u0000\u0000\u0000NO\u0005@\u0000\u0000O\u0012\u0001\u0000\u0000"+
		"\u0000PQ\u0005\"\u0000\u0000Q\u0014\u0001\u0000\u0000\u0000RS\u0005d\u0000"+
		"\u0000ST\u0005o\u0000\u0000TU\u0005c\u0000\u0000U\u0016\u0001\u0000\u0000"+
		"\u0000VW\u0005t\u0000\u0000WX\u0005e\u0000\u0000XY\u0005x\u0000\u0000"+
		"YZ\u0005t\u0000\u0000Z\u0018\u0001\u0000\u0000\u0000[\\\u0005[\u0000\u0000"+
		"\\\u001a\u0001\u0000\u0000\u0000]^\u0005]\u0000\u0000^\u001c\u0001\u0000"+
		"\u0000\u0000_c\u0007\u0000\u0000\u0000`b\u0007\u0001\u0000\u0000a`\u0001"+
		"\u0000\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000"+
		"cd\u0001\u0000\u0000\u0000d\u001e\u0001\u0000\u0000\u0000ec\u0001\u0000"+
		"\u0000\u0000fg\u0005/\u0000\u0000g \u0001\u0000\u0000\u0000hi\u0005/\u0000"+
		"\u0000ij\u0005/\u0000\u0000j\"\u0001\u0000\u0000\u0000kl\u0005.\u0000"+
		"\u0000lm\u0005.\u0000\u0000m$\u0001\u0000\u0000\u0000no\u0005.\u0000\u0000"+
		"o&\u0001\u0000\u0000\u0000pq\u0005,\u0000\u0000q(\u0001\u0000\u0000\u0000"+
		"rs\u0005(\u0000\u0000s*\u0001\u0000\u0000\u0000tu\u0005)\u0000\u0000u"+
		",\u0001\u0000\u0000\u0000vw\u0005*\u0000\u0000w.\u0001\u0000\u0000\u0000"+
		"xz\u0005\"\u0000\u0000y{\u0007\u0002\u0000\u0000zy\u0001\u0000\u0000\u0000"+
		"{|\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000"+
		"\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0005\"\u0000\u0000\u007f0\u0001"+
		"\u0000\u0000\u0000\u0080\u0082\u0007\u0003\u0000\u0000\u0081\u0080\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0006\u0018\u0000\u0000\u00862\u0001\u0000"+
		"\u0000\u0000\u0004\u0000c|\u0083\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}