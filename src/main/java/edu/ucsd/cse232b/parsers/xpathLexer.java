// Generated from java-escape by ANTLR 4.11.1

package edu.ucsd.cse232b.parsers;

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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, DOC=8, TXT=9, 
		LB=10, RB=11, ID=12, SLASH=13, DOUBLESLASH=14, DOTDOT=15, DOT=16, COMMA=17, 
		LPR=18, RPR=19, STAR=20, STRING=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "DOC", "TXT", 
			"LB", "RB", "ID", "SLASH", "DOUBLESLASH", "DOTDOT", "DOT", "COMMA", "LPR", 
			"RPR", "STAR", "STRING"
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
		"\u0004\u0000\u0015n\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000bR"+
		"\b\u000b\n\u000b\f\u000bU\t\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0005\u0014j\b\u0014\n\u0014\f\u0014m\t\u0014"+
		"\u0000\u0000\u0015\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"\u0001\u0000\u0003\u0002\u0000AZaz\u0004\u000009AZ__az\u0003\u000009A"+
		"Zazo\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000"+
		"\u0000\u0000\u0001+\u0001\u0000\u0000\u0000\u0003-\u0001\u0000\u0000\u0000"+
		"\u00050\u0001\u0000\u0000\u0000\u00074\u0001\u0000\u0000\u0000\t7\u0001"+
		"\u0000\u0000\u0000\u000b;\u0001\u0000\u0000\u0000\r@\u0001\u0000\u0000"+
		"\u0000\u000fB\u0001\u0000\u0000\u0000\u0011F\u0001\u0000\u0000\u0000\u0013"+
		"K\u0001\u0000\u0000\u0000\u0015M\u0001\u0000\u0000\u0000\u0017O\u0001"+
		"\u0000\u0000\u0000\u0019V\u0001\u0000\u0000\u0000\u001bX\u0001\u0000\u0000"+
		"\u0000\u001d[\u0001\u0000\u0000\u0000\u001f^\u0001\u0000\u0000\u0000!"+
		"`\u0001\u0000\u0000\u0000#b\u0001\u0000\u0000\u0000%d\u0001\u0000\u0000"+
		"\u0000\'f\u0001\u0000\u0000\u0000)k\u0001\u0000\u0000\u0000+,\u0005=\u0000"+
		"\u0000,\u0002\u0001\u0000\u0000\u0000-.\u0005=\u0000\u0000./\u0005=\u0000"+
		"\u0000/\u0004\u0001\u0000\u0000\u000001\u0005a\u0000\u000012\u0005n\u0000"+
		"\u000023\u0005d\u0000\u00003\u0006\u0001\u0000\u0000\u000045\u0005o\u0000"+
		"\u000056\u0005r\u0000\u00006\b\u0001\u0000\u0000\u000078\u0005n\u0000"+
		"\u000089\u0005o\u0000\u00009:\u0005t\u0000\u0000:\n\u0001\u0000\u0000"+
		"\u0000;<\u0005.\u0000\u0000<=\u0005x\u0000\u0000=>\u0005m\u0000\u0000"+
		">?\u0005l\u0000\u0000?\f\u0001\u0000\u0000\u0000@A\u0005@\u0000\u0000"+
		"A\u000e\u0001\u0000\u0000\u0000BC\u0005d\u0000\u0000CD\u0005o\u0000\u0000"+
		"DE\u0005c\u0000\u0000E\u0010\u0001\u0000\u0000\u0000FG\u0005t\u0000\u0000"+
		"GH\u0005e\u0000\u0000HI\u0005x\u0000\u0000IJ\u0005t\u0000\u0000J\u0012"+
		"\u0001\u0000\u0000\u0000KL\u0005[\u0000\u0000L\u0014\u0001\u0000\u0000"+
		"\u0000MN\u0005]\u0000\u0000N\u0016\u0001\u0000\u0000\u0000OS\u0007\u0000"+
		"\u0000\u0000PR\u0007\u0001\u0000\u0000QP\u0001\u0000\u0000\u0000RU\u0001"+
		"\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000"+
		"T\u0018\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VW\u0005/\u0000"+
		"\u0000W\u001a\u0001\u0000\u0000\u0000XY\u0005/\u0000\u0000YZ\u0005/\u0000"+
		"\u0000Z\u001c\u0001\u0000\u0000\u0000[\\\u0005.\u0000\u0000\\]\u0005."+
		"\u0000\u0000]\u001e\u0001\u0000\u0000\u0000^_\u0005.\u0000\u0000_ \u0001"+
		"\u0000\u0000\u0000`a\u0005,\u0000\u0000a\"\u0001\u0000\u0000\u0000bc\u0005"+
		"(\u0000\u0000c$\u0001\u0000\u0000\u0000de\u0005)\u0000\u0000e&\u0001\u0000"+
		"\u0000\u0000fg\u0005*\u0000\u0000g(\u0001\u0000\u0000\u0000hj\u0007\u0002"+
		"\u0000\u0000ih\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001"+
		"\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000l*\u0001\u0000\u0000\u0000"+
		"mk\u0001\u0000\u0000\u0000\u0003\u0000Sk\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}