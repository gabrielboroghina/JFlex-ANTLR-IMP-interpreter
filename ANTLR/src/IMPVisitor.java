// Generated from src/IMP.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IMPParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IMPVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IMPParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(IMPParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link IMPParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(IMPParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link IMPParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(IMPParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link IMPParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(IMPParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link IMPParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(IMPParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link IMPParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(IMPParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link IMPParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(IMPParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link IMPParser#sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence(IMPParser.SequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link IMPParser#varList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarList(IMPParser.VarListContext ctx);
	/**
	 * Visit a parse tree produced by {@link IMPParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(IMPParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link IMPParser#mainNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainNode(IMPParser.MainNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link IMPParser#plus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(IMPParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link IMPParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(IMPParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by {@link IMPParser#bracketAExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketAExpr(IMPParser.BracketAExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link IMPParser#bracketBExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketBExpr(IMPParser.BracketBExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link IMPParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(IMPParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link IMPParser#greater}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreater(IMPParser.GreaterContext ctx);
	/**
	 * Visit a parse tree produced by {@link IMPParser#not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(IMPParser.NotContext ctx);
}