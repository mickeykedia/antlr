// Generated from Rule.g4 by ANTLR 4.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RuleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RuleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RuleParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(@NotNull RuleParser.AndExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link RuleParser#questionReplyOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionReplyOption(@NotNull RuleParser.QuestionReplyOptionContext ctx);

	/**
	 * Visit a parse tree produced by {@link RuleParser#questionMoreThanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionMoreThanValue(@NotNull RuleParser.QuestionMoreThanValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link RuleParser#questionValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionValue(@NotNull RuleParser.QuestionValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link RuleParser#parens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(@NotNull RuleParser.ParensContext ctx);

	/**
	 * Visit a parse tree produced by {@link RuleParser#questionLessThanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionLessThanValue(@NotNull RuleParser.QuestionLessThanValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link RuleParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(@NotNull RuleParser.OrExprContext ctx);
}