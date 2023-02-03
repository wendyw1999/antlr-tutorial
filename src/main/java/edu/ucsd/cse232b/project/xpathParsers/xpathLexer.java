// Generated from xpath.g4 by ANTLR 4.7.2

package edu.ucsd.cse232b.project.xpathParsers;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class xpathLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, QUOTE=8, DOC=9, 
		TXT=10, LB=11, RB=12, ID=13, SLASH=14, DOUBLESLASH=15, DOTDOT=16, DOT=17, 
		COMMA=18, LPR=19, RPR=20, STAR=21, STRING=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "QUOTE", "DOC", 
			"TXT", "LB", "RB", "ID", "SLASH", "DOUBLESLASH", "DOTDOT", "DOT", "COMMA", 
			"LPR", "RPR", "STAR", "STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'=='", "'and'", "'or'", "'not'", "'.xml'", "'@'", "'\"'", 
			"'doc'", "'text'", "'['", "']'", null, "'/'", "'//'", "'..'", "'.'", 
			"','", "'('", "')'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "QUOTE", "DOC", "TXT", 
			"LB", "RB", "ID", "SLASH", "DOUBLESLASH", "DOTDOT", "DOT", "COMMA", "LPR", 
			"RPR", "STAR", "STRING"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30s\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\7\16X\n\16\f\16\16\16[\13\16\3\17\3\17\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\6\27p"+
		"\n\27\r\27\16\27q\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\5\4\2C"+
		"\\c|\6\2\62;C\\aac|\5\2\62;C\\c|\2t\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2\2\7\64\3\2\2\2\t8\3\2"+
		"\2\2\13;\3\2\2\2\r?\3\2\2\2\17D\3\2\2\2\21F\3\2\2\2\23H\3\2\2\2\25L\3"+
		"\2\2\2\27Q\3\2\2\2\31S\3\2\2\2\33U\3\2\2\2\35\\\3\2\2\2\37^\3\2\2\2!a"+
		"\3\2\2\2#d\3\2\2\2%f\3\2\2\2\'h\3\2\2\2)j\3\2\2\2+l\3\2\2\2-o\3\2\2\2"+
		"/\60\7?\2\2\60\4\3\2\2\2\61\62\7?\2\2\62\63\7?\2\2\63\6\3\2\2\2\64\65"+
		"\7c\2\2\65\66\7p\2\2\66\67\7f\2\2\67\b\3\2\2\289\7q\2\29:\7t\2\2:\n\3"+
		"\2\2\2;<\7p\2\2<=\7q\2\2=>\7v\2\2>\f\3\2\2\2?@\7\60\2\2@A\7z\2\2AB\7o"+
		"\2\2BC\7n\2\2C\16\3\2\2\2DE\7B\2\2E\20\3\2\2\2FG\7$\2\2G\22\3\2\2\2HI"+
		"\7f\2\2IJ\7q\2\2JK\7e\2\2K\24\3\2\2\2LM\7v\2\2MN\7g\2\2NO\7z\2\2OP\7v"+
		"\2\2P\26\3\2\2\2QR\7]\2\2R\30\3\2\2\2ST\7_\2\2T\32\3\2\2\2UY\t\2\2\2V"+
		"X\t\3\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\34\3\2\2\2[Y\3\2\2"+
		"\2\\]\7\61\2\2]\36\3\2\2\2^_\7\61\2\2_`\7\61\2\2` \3\2\2\2ab\7\60\2\2"+
		"bc\7\60\2\2c\"\3\2\2\2de\7\60\2\2e$\3\2\2\2fg\7.\2\2g&\3\2\2\2hi\7*\2"+
		"\2i(\3\2\2\2jk\7+\2\2k*\3\2\2\2lm\7,\2\2m,\3\2\2\2np\t\4\2\2on\3\2\2\2"+
		"pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2r.\3\2\2\2\5\2Yq\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}