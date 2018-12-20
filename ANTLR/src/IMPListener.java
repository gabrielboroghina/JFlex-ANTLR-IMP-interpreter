// Generated from src/IMP.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IMPParser}.
 */
public interface IMPListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IMPParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(IMPParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link IMPParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(IMPParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link IMPParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(IMPParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link IMPParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(IMPParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link IMPParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(IMPParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link IMPParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(IMPParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link IMPParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(IMPParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link IMPParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(IMPParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link IMPParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(IMPParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link IMPParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(IMPParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link IMPParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(IMPParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link IMPParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(IMPParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link IMPParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(IMPParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link IMPParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(IMPParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link IMPParser#sequence}.
	 * @param ctx the parse tree
	 */
	void enterSequence(IMPParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link IMPParser#sequence}.
	 * @param ctx the parse tree
	 */
	void exitSequence(IMPParser.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link IMPParser#varList}.
	 * @param ctx the parse tree
	 */
	void enterVarList(IMPParser.VarListContext ctx);
	/**
	 * Exit a parse tree produced by {@link IMPParser#varList}.
	 * @param ctx the parse tree
	 */
	void exitVarList(IMPParser.VarListContext ctx);
	/**
	 * Enter a parse tree produced by {@link IMPParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(IMPParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link IMPParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(IMPParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link IMPParser#mainNode}.
	 * @param ctx the parse tree
	 */
	void enterMainNode(IMPParser.MainNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link IMPParser#mainNode}.
	 * @param ctx the parse tree
	 */
	void exitMainNode(IMPParser.MainNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link IMPParser#plus}.
	 * @param ctx the parse tree
	 */
	void enterPlus(IMPParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link IMPParser#plus}.
	 * @param ctx the parse tree
	 */
	void exitPlus(IMPParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link IMPParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(IMPParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link IMPParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(IMPParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link IMPParser#bracketAExpr}.
	 * @param ctx the parse tree
	 */
	void enterBracketAExpr(IMPParser.BracketAExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IMPParser#bracketAExpr}.
	 * @param ctx the parse tree
	 */
	void exitBracketAExpr(IMPParser.BracketAExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IMPParser#bracketBExpr}.
	 * @param ctx the parse tree
	 */
	void enterBracketBExpr(IMPParser.BracketBExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IMPParser#bracketBExpr}.
	 * @param ctx the parse tree
	 */
	void exitBracketBExpr(IMPParser.BracketBExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IMPParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(IMPParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link IMPParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(IMPParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link IMPParser#greater}.
	 * @param ctx the parse tree
	 */
	void enterGreater(IMPParser.GreaterContext ctx);
	/**
	 * Exit a parse tree produced by {@link IMPParser#greater}.
	 * @param ctx the parse tree
	 */
	void exitGreater(IMPParser.GreaterContext ctx);
	/**
	 * Enter a parse tree produced by {@link IMPParser#not}.
	 * @param ctx the parse tree
	 */
	void enterNot(IMPParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by {@link IMPParser#not}.
	 * @param ctx the parse tree
	 */
	void exitNot(IMPParser.NotContext ctx);
}