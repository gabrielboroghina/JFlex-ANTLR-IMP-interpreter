// Generated from src/IMP.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IMPLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, AVAL=17, 
		BVAL=18, VAR=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "AVAL", 
		"BVAL", "VAR", "WS"
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


	public IMPLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "IMP.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26t\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\7\22Y\n\22\f\22\16\22\\\13\22\3\22\5\22_\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23j\n\23\3\24\6\24m\n\24\r\24\16"+
		"\24n\3\25\3\25\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26\3\2\6\3\2\63"+
		";\3\2\62;\3\2c|\5\2\13\f\17\17\"\"\2w\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7/\3\2\2\2\t\61\3\2\2\2\13\63\3\2\2\2\r\66"+
		"\3\2\2\2\17;\3\2\2\2\21A\3\2\2\2\23C\3\2\2\2\25G\3\2\2\2\27I\3\2\2\2\31"+
		"K\3\2\2\2\33M\3\2\2\2\35O\3\2\2\2\37R\3\2\2\2!T\3\2\2\2#^\3\2\2\2%i\3"+
		"\2\2\2\'l\3\2\2\2)p\3\2\2\2+,\7}\2\2,\4\3\2\2\2-.\7\177\2\2.\6\3\2\2\2"+
		"/\60\7?\2\2\60\b\3\2\2\2\61\62\7=\2\2\62\n\3\2\2\2\63\64\7k\2\2\64\65"+
		"\7h\2\2\65\f\3\2\2\2\66\67\7g\2\2\678\7n\2\289\7u\2\29:\7g\2\2:\16\3\2"+
		"\2\2;<\7y\2\2<=\7j\2\2=>\7k\2\2>?\7n\2\2?@\7g\2\2@\20\3\2\2\2AB\7.\2\2"+
		"B\22\3\2\2\2CD\7k\2\2DE\7p\2\2EF\7v\2\2F\24\3\2\2\2GH\7-\2\2H\26\3\2\2"+
		"\2IJ\7\61\2\2J\30\3\2\2\2KL\7*\2\2L\32\3\2\2\2MN\7+\2\2N\34\3\2\2\2OP"+
		"\7(\2\2PQ\7(\2\2Q\36\3\2\2\2RS\7@\2\2S \3\2\2\2TU\7#\2\2U\"\3\2\2\2VZ"+
		"\t\2\2\2WY\t\3\2\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[_\3\2\2\2"+
		"\\Z\3\2\2\2]_\7\62\2\2^V\3\2\2\2^]\3\2\2\2_$\3\2\2\2`a\7v\2\2ab\7t\2\2"+
		"bc\7w\2\2cj\7g\2\2de\7h\2\2ef\7c\2\2fg\7n\2\2gh\7u\2\2hj\7g\2\2i`\3\2"+
		"\2\2id\3\2\2\2j&\3\2\2\2km\t\4\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2"+
		"\2\2o(\3\2\2\2pq\t\5\2\2qr\3\2\2\2rs\b\25\2\2s*\3\2\2\2\7\2Z^in\3\b\2"+
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