import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends RuleBaseVisitor<Boolean> {

	@Override public Boolean visitAndExpr( RuleParser.AndExprContext ctx) { 

		System.out.println("AND operations now");
		return (visit(ctx.expr(0)) && visit(ctx.expr(1)));       
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override 
	public Boolean visitQuestionReplyOption( RuleParser.QuestionReplyOptionContext ctx) { 
		return Utility.compareQuestionReplyOption(ctx.QUESTION().getText(),ctx.REPLYOPTION().getText());
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Boolean visitQuestionMoreThanValue( RuleParser.QuestionMoreThanValueContext ctx) { 
       
		return Utility.compareQuestionValue(ctx.QUESTION().getText(),ctx.VALUE().getText(),Utility.Comparison.MORE_THAN);

	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Boolean visitQuestionValue( RuleParser.QuestionValueContext ctx) { 
		return Utility.compareQuestionValue(ctx.QUESTION().getText(),ctx.VALUE().getText(),Utility.Comparison.EQUALS);

	
	}


	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Boolean visitParens( RuleParser.ParensContext ctx) { 
		System.out.println("Expression inside parens being evaluated now");
		return visit(ctx.expr());
	}

	

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Boolean visitQuestionLessThanValue( RuleParser.QuestionLessThanValueContext ctx) { 
		return Utility.compareQuestionValue(ctx.QUESTION().getText(),ctx.VALUE().getText(),Utility.Comparison.LESS_THAN);
       
	}


	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Boolean visitOrExpr( RuleParser.OrExprContext ctx) { 
		System.out.println("OR operations now");
		return (visit(ctx.expr(0)) || visit(ctx.expr(1)));       
	}
	
}
