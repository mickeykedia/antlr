import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends ExprBaseVisitor<Integer> {

	Map<String, Integer> memory = new HashMap<String, Integer>();


	@Override
	public Integer visitAssign(ExprParser.AssignContext ctx){
		String id = ctx.ID().getText();
		int value = visit(ctx.expr()); // compute value of expression on right 
		memory.put(id, value); // store it in our memory
		return value;
	}

	@Override
	public Integer visitPrintExpr(ExprParser.PrintExprContext ctx) {
		Integer value = visit(ctx.expr()); // evaluate the expr child 
		System.out.println(value); // print the result
		return 0; // return dummy value
	}
	@Override
	public Integer visitInt(ExprParser.IntContext ctx) {
		return Integer.valueOf(ctx.INT().getText()); 
	}
	@Override
	public Integer visitId(ExprParser.IdContext ctx) {
		String id = ctx.ID().getText();
		if ( memory.containsKey(id) ) return memory.get(id); return 0;
	}

	@Override
	public Integer visitMulDiv(ExprParser.MulDivContext ctx) {
		int left = visit(ctx.expr(0)); // get value of left subexpression 
		int right = visit(ctx.expr(1)); // get value of right subexpression 
		if ( ctx.op.getType() == ExprParser.MUL ) return left * right; 
		return left / right; // must be DIV
	}

	@Override
	public Integer visitAddSub(ExprParser.AddSubContext ctx) {
		int left = visit(ctx.expr(0)); // get value of left subexpression 
		int right = visit(ctx.expr(1)); // get value of right subexpression 
		if ( ctx.op.getType() == ExprParser.ADD ) return left + right; 
		return left - right; // must be SUB
	}

	@Override
	public Integer visitParens(ExprParser.ParensContext ctx) {
		return visit(ctx.expr()); // return child expr's value 
	}

	@Override
	public Integer visitClear(ExprParser.ClearContext ctx) {
		memory.clear();
		return 0;
	}






	}
