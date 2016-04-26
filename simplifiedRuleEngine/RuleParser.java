// Generated from Rule.g4 by ANTLR 4.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RuleParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, QUESTION=8, REPLYOPTION=9, 
		VALUE=10, INT=11, WS=12;
	public static final String[] tokenNames = {
		"<INVALID>", "'&'", "'>'", "')'", "'('", "'<'", "'='", "'|'", "QUESTION", 
		"REPLYOPTION", "VALUE", "INT", "WS"
	};
	public static final int
		RULE_expr = 0;
	public static final String[] ruleNames = {
		"expr"
	};

	@Override
	public String getGrammarFileName() { return "Rule.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RuleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuestionReplyOptionContext extends ExprContext {
		public TerminalNode QUESTION() { return getToken(RuleParser.QUESTION, 0); }
		public TerminalNode REPLYOPTION() { return getToken(RuleParser.REPLYOPTION, 0); }
		public QuestionReplyOptionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitQuestionReplyOption(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QuestionMoreThanValueContext extends ExprContext {
		public TerminalNode QUESTION() { return getToken(RuleParser.QUESTION, 0); }
		public TerminalNode VALUE() { return getToken(RuleParser.VALUE, 0); }
		public QuestionMoreThanValueContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitQuestionMoreThanValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QuestionValueContext extends ExprContext {
		public TerminalNode QUESTION() { return getToken(RuleParser.QUESTION, 0); }
		public TerminalNode VALUE() { return getToken(RuleParser.VALUE, 0); }
		public QuestionValueContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitQuestionValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QuestionLessThanValueContext extends ExprContext {
		public TerminalNode QUESTION() { return getToken(RuleParser.QUESTION, 0); }
		public TerminalNode VALUE() { return getToken(RuleParser.VALUE, 0); }
		public QuestionLessThanValueContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitQuestionLessThanValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				_localctx = new QuestionReplyOptionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(3); match(QUESTION);
				setState(4); match(6);
				setState(5); match(REPLYOPTION);
				}
				break;

			case 2:
				{
				_localctx = new QuestionValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(6); match(QUESTION);
				setState(7); match(6);
				setState(8); match(VALUE);
				}
				break;

			case 3:
				{
				_localctx = new QuestionMoreThanValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(9); match(QUESTION);
				setState(10); match(2);
				setState(11); match(VALUE);
				}
				break;

			case 4:
				{
				_localctx = new QuestionLessThanValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(12); match(QUESTION);
				setState(13); match(5);
				setState(14); match(VALUE);
				}
				break;

			case 5:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(15); match(4);
				setState(16); expr(0);
				setState(17); match(3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(29);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(27);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(21);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(22); match(1);
						setState(23); expr(8);
						}
						break;

					case 2:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(24);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(25); match(7);
						setState(26); expr(7);
						}
						break;
					}
					} 
				}
				setState(31);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 7);

		case 1: return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\16#\4\2\t\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\26"+
		"\n\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\2\3\2\3\2\2"+
		"\2\'\2\25\3\2\2\2\4\5\b\2\1\2\5\6\7\n\2\2\6\7\7\b\2\2\7\26\7\13\2\2\b"+
		"\t\7\n\2\2\t\n\7\b\2\2\n\26\7\f\2\2\13\f\7\n\2\2\f\r\7\4\2\2\r\26\7\f"+
		"\2\2\16\17\7\n\2\2\17\20\7\7\2\2\20\26\7\f\2\2\21\22\7\6\2\2\22\23\5\2"+
		"\2\2\23\24\7\5\2\2\24\26\3\2\2\2\25\4\3\2\2\2\25\b\3\2\2\2\25\13\3\2\2"+
		"\2\25\16\3\2\2\2\25\21\3\2\2\2\26\37\3\2\2\2\27\30\f\t\2\2\30\31\7\3\2"+
		"\2\31\36\5\2\2\n\32\33\f\b\2\2\33\34\7\t\2\2\34\36\5\2\2\t\35\27\3\2\2"+
		"\2\35\32\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \3\3\2\2\2!\37"+
		"\3\2\2\2\5\25\35\37";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}