import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.PrintWriter;

public class ParseTreePrinter implements IMPVisitor<Object> {

    private PrintWriter writer;
    private StringBuilder indent;

    public ParseTreePrinter(PrintWriter writer) {
        this.writer = writer;
        this.indent = new StringBuilder();
    }

    @Override
    public Object visit(ParseTree parseTree) {
        return null;
    }

    @Override
    public Object visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public Object visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public Object visitErrorNode(ErrorNode errorNode) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link IMPParser#integer}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitInteger(IMPParser.IntegerContext ctx) {
        indent.append("\t");
        writer.println(ctx.AVAL().getSymbol());
        indent.deleteCharAt(indent.length() - 1);
        return null;
    }

    /**
     * Visit a parse tree produced by {@link IMPParser#bool}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitBool(IMPParser.BoolContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link IMPParser#var}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitVar(IMPParser.VarContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link IMPParser#block}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitBlock(IMPParser.BlockContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link IMPParser#assignment}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitAssignment(IMPParser.AssignmentContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link IMPParser#ifStmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitIfStmt(IMPParser.IfStmtContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link IMPParser#whileStmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitWhileStmt(IMPParser.WhileStmtContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link IMPParser#sequence}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitSequence(IMPParser.SequenceContext ctx) {
        writer.println("<SequenceNode>");
        return null;
    }

    /**
     * Visit a parse tree produced by {@link IMPParser#varList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitVarList(IMPParser.VarListContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link IMPParser#mainNode}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitMainNode(IMPParser.MainNodeContext ctx) {
        writer.println("<MainNode>");
        ctx.getChild(3).accept(this);
        return null;
    }

    /**
     * Visit a parse tree produced by {@link IMPParser#plus}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitPlus(IMPParser.PlusContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link IMPParser#div}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitDiv(IMPParser.DivContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link IMPParser#bracketAExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitBracketAExpr(IMPParser.BracketAExprContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link IMPParser#bracketBExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitBracketBExpr(IMPParser.BracketBExprContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link IMPParser#and}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitAnd(IMPParser.AndContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link IMPParser#greater}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitGreater(IMPParser.GreaterContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link IMPParser#not}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitNot(IMPParser.NotContext ctx) {
        return null;
    }
}
