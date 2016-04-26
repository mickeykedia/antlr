// Generated from Rule.g4 by ANTLR 4.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RuleLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, QUESTION=8, SCORINGCATEGORY=9, 
		REPLYOPTION=10, VALUE=11, INT=12, WS=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'&'", "'>'", "')'", "'('", "'<'", "'='", "'|'", "QUESTION", "SCORINGCATEGORY", 
		"REPLYOPTION", "VALUE", "INT", "WS"
	};
	public static final String[] ruleNames = {
		"T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "QUESTION", "SCORINGCATEGORY", 
		"REPLYOPTION", "VALUE", "INT", "WS"
	};


	public RuleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Rule.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17Y\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\6\f\66\n\f"+
		"\r\f\16\f\67\3\f\3\f\7\f<\n\f\f\f\16\f?\13\f\3\f\3\f\6\fC\n\f\r\f\16\f"+
		"D\3\f\6\fH\n\f\r\f\16\fI\5\fL\n\f\3\r\6\rO\n\r\r\r\16\rP\3\16\6\16T\n"+
		"\16\r\16\16\16U\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\3\2\4\3\2\62;\5\2\13\f\17\17\"\"`\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\3\35\3\2\2\2\5\37\3\2\2\2\7!\3\2\2\2\t#\3\2\2\2\13%\3"+
		"\2\2\2\r\'\3\2\2\2\17)\3\2\2\2\21+\3\2\2\2\23.\3\2\2\2\25\61\3\2\2\2\27"+
		"K\3\2\2\2\31N\3\2\2\2\33S\3\2\2\2\35\36\7(\2\2\36\4\3\2\2\2\37 \7@\2\2"+
		" \6\3\2\2\2!\"\7+\2\2\"\b\3\2\2\2#$\7*\2\2$\n\3\2\2\2%&\7>\2\2&\f\3\2"+
		"\2\2\'(\7?\2\2(\16\3\2\2\2)*\7~\2\2*\20\3\2\2\2+,\7S\2\2,-\5\31\r\2-\22"+
		"\3\2\2\2./\7U\2\2/\60\5\31\r\2\60\24\3\2\2\2\61\62\7E\2\2\62\63\5\31\r"+
		"\2\63\26\3\2\2\2\64\66\t\2\2\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2"+
		"\2\678\3\2\2\289\3\2\2\29=\7\60\2\2:<\t\2\2\2;:\3\2\2\2<?\3\2\2\2=;\3"+
		"\2\2\2=>\3\2\2\2>L\3\2\2\2?=\3\2\2\2@B\7\60\2\2AC\t\2\2\2BA\3\2\2\2CD"+
		"\3\2\2\2DB\3\2\2\2DE\3\2\2\2EL\3\2\2\2FH\t\2\2\2GF\3\2\2\2HI\3\2\2\2I"+
		"G\3\2\2\2IJ\3\2\2\2JL\3\2\2\2K\65\3\2\2\2K@\3\2\2\2KG\3\2\2\2L\30\3\2"+
		"\2\2MO\t\2\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\32\3\2\2\2RT\t"+
		"\3\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\b\16\2\2X\34"+
		"\3\2\2\2\n\2\67=DIKPU\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}