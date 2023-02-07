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
			"'@'", null, "'doc'", "'text'", "'['", "']'", null, "'/'", "'//'", "'..'", 
			"'.'", "','", "'('", "')'", "'*'"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u0089\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\7\20d\n\20\f\20\16\20g\13\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\6\31}\n\31"+
		"\r\31\16\31~\3\31\3\31\3\32\6\32\u0084\n\32\r\32\16\32\u0085\3\32\3\32"+
		"\2\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\3\2\7\5\2$$"+
		"))~~\4\2C\\c|\6\2\62;C\\aac|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\2\u008b\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5\67\3\2\2\2\7:\3\2\2\2\t=\3\2"+
		"\2\2\13@\3\2\2\2\rD\3\2\2\2\17G\3\2\2\2\21K\3\2\2\2\23P\3\2\2\2\25R\3"+
		"\2\2\2\27T\3\2\2\2\31X\3\2\2\2\33]\3\2\2\2\35_\3\2\2\2\37a\3\2\2\2!h\3"+
		"\2\2\2#j\3\2\2\2%m\3\2\2\2\'p\3\2\2\2)r\3\2\2\2+t\3\2\2\2-v\3\2\2\2/x"+
		"\3\2\2\2\61z\3\2\2\2\63\u0083\3\2\2\2\65\66\7?\2\2\66\4\3\2\2\2\678\7"+
		"g\2\289\7s\2\29\6\3\2\2\2:;\7?\2\2;<\7?\2\2<\b\3\2\2\2=>\7k\2\2>?\7u\2"+
		"\2?\n\3\2\2\2@A\7c\2\2AB\7p\2\2BC\7f\2\2C\f\3\2\2\2DE\7q\2\2EF\7t\2\2"+
		"F\16\3\2\2\2GH\7p\2\2HI\7q\2\2IJ\7v\2\2J\20\3\2\2\2KL\7\60\2\2LM\7z\2"+
		"\2MN\7o\2\2NO\7n\2\2O\22\3\2\2\2PQ\7B\2\2Q\24\3\2\2\2RS\t\2\2\2S\26\3"+
		"\2\2\2TU\7f\2\2UV\7q\2\2VW\7e\2\2W\30\3\2\2\2XY\7v\2\2YZ\7g\2\2Z[\7z\2"+
		"\2[\\\7v\2\2\\\32\3\2\2\2]^\7]\2\2^\34\3\2\2\2_`\7_\2\2`\36\3\2\2\2ae"+
		"\t\3\2\2bd\t\4\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f \3\2\2\2g"+
		"e\3\2\2\2hi\7\61\2\2i\"\3\2\2\2jk\7\61\2\2kl\7\61\2\2l$\3\2\2\2mn\7\60"+
		"\2\2no\7\60\2\2o&\3\2\2\2pq\7\60\2\2q(\3\2\2\2rs\7.\2\2s*\3\2\2\2tu\7"+
		"*\2\2u,\3\2\2\2vw\7+\2\2w.\3\2\2\2xy\7,\2\2y\60\3\2\2\2z|\5\25\13\2{}"+
		"\t\5\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2"+
		"\u0080\u0081\5\25\13\2\u0081\62\3\2\2\2\u0082\u0084\t\6\2\2\u0083\u0082"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0088\b\32\2\2\u0088\64\3\2\2\2\6\2e~\u0085\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}