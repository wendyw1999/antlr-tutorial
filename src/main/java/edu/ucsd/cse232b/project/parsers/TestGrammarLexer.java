// Generated from java-escape by ANTLR 4.11.1

package edu.ucsd.cse232b.project.parsers;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TestGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AP=1, RP=2, DOTDOT=3, DOT=4, FILE=5, TXT=6, LPR=7, RPR=8, DOC=9, STAR=10, 
		NUM=11, TAGNAME=12, ATTNAME=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"AP", "RP", "DOTDOT", "DOT", "FILE", "TXT", "LPR", "RPR", "DOC", "STAR", 
			"NUM", "TAGNAME", "ATTNAME"
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


	public TestGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TestGrammar.g4"; }

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
		"\u0004\u0000\r\\\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0005\u0004(\b\u0004\n\u0004\f\u0004+\t"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0003\nC\b\n\u0001\n\u0001\n\u0005\nG\b\n\n\n"+
		"\f\nJ\t\n\u0003\nL\b\n\u0001\u000b\u0001\u000b\u0005\u000bP\b\u000b\n"+
		"\u000b\f\u000bS\t\u000b\u0001\f\u0001\f\u0001\f\u0005\fX\b\f\n\f\f\f["+
		"\t\f\u0000\u0000\r\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u0001\u0000\u0004\u0002\u0000AZaz\u0004\u000009AZ__az\u0001\u00001"+
		"9\u0001\u000009a\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0001\u001b\u0001\u0000\u0000"+
		"\u0000\u0003\u001d\u0001\u0000\u0000\u0000\u0005 \u0001\u0000\u0000\u0000"+
		"\u0007#\u0001\u0000\u0000\u0000\t%\u0001\u0000\u0000\u0000\u000b1\u0001"+
		"\u0000\u0000\u0000\r6\u0001\u0000\u0000\u0000\u000f8\u0001\u0000\u0000"+
		"\u0000\u0011:\u0001\u0000\u0000\u0000\u0013>\u0001\u0000\u0000\u0000\u0015"+
		"K\u0001\u0000\u0000\u0000\u0017M\u0001\u0000\u0000\u0000\u0019T\u0001"+
		"\u0000\u0000\u0000\u001b\u001c\u0005/\u0000\u0000\u001c\u0002\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0005/\u0000\u0000\u001e\u001f\u0005/\u0000\u0000"+
		"\u001f\u0004\u0001\u0000\u0000\u0000 !\u0005.\u0000\u0000!\"\u0005.\u0000"+
		"\u0000\"\u0006\u0001\u0000\u0000\u0000#$\u0005.\u0000\u0000$\b\u0001\u0000"+
		"\u0000\u0000%)\u0007\u0000\u0000\u0000&(\u0007\u0001\u0000\u0000\'&\u0001"+
		"\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000"+
		")*\u0001\u0000\u0000\u0000*,\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000"+
		"\u0000,-\u0005.\u0000\u0000-.\u0005x\u0000\u0000./\u0005m\u0000\u0000"+
		"/0\u0005l\u0000\u00000\n\u0001\u0000\u0000\u000012\u0005t\u0000\u0000"+
		"23\u0005e\u0000\u000034\u0005x\u0000\u000045\u0005t\u0000\u00005\f\u0001"+
		"\u0000\u0000\u000067\u0005(\u0000\u00007\u000e\u0001\u0000\u0000\u0000"+
		"89\u0005)\u0000\u00009\u0010\u0001\u0000\u0000\u0000:;\u0005d\u0000\u0000"+
		";<\u0005o\u0000\u0000<=\u0005c\u0000\u0000=\u0012\u0001\u0000\u0000\u0000"+
		">?\u0005*\u0000\u0000?\u0014\u0001\u0000\u0000\u0000@L\u00050\u0000\u0000"+
		"AC\u0005-\u0000\u0000BA\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000"+
		"CD\u0001\u0000\u0000\u0000DH\u0007\u0002\u0000\u0000EG\u0007\u0003\u0000"+
		"\u0000FE\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001\u0000"+
		"\u0000\u0000HI\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000K@\u0001\u0000\u0000\u0000KB\u0001\u0000\u0000\u0000"+
		"L\u0016\u0001\u0000\u0000\u0000MQ\u0007\u0000\u0000\u0000NP\u0007\u0001"+
		"\u0000\u0000ON\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001"+
		"\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000R\u0018\u0001\u0000\u0000"+
		"\u0000SQ\u0001\u0000\u0000\u0000TU\u0005@\u0000\u0000UY\u0007\u0000\u0000"+
		"\u0000VX\u0007\u0001\u0000\u0000WV\u0001\u0000\u0000\u0000X[\u0001\u0000"+
		"\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\u001a"+
		"\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000\u0007\u0000)BHKQY\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}