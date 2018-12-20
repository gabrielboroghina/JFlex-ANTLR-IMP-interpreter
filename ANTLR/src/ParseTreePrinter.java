import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.PrintWriter;
import java.util.List;

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

    public void visitSons(List<ParseTree> list) {
        indent.append('\t');
        for (ParseTree node : list)
            node.accept(this);
        indent.deleteCharAt(indent.length() - 1);
    }

    /**
     * Visit a parse tree produced by {@link IMPParser#integer}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitInteger(IMPParser.IntegerContext ctx) {
        writer.println(indent.toString() + "<IntNode> " + ctx.AVAL().getText());
        return null;
    }

    /**
     * Visit a parse tree produced by {@link IMPParser#bool}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitBool(IMPParser.BoolContext ctx) {
        writer.println(indent.toString() + "<BoolNode> " + ctx.BVAL().getText());
        return null;
    }

    /**
     * Visit a parse tree produced by {@link IMPParser#var}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitVar(IMPParser.VarContext ctx) {
        writer.println(indent.toString() + "<VariableNode> " + ctx.getText());
        return null;
    }

    /**
     * Visit a parse tree produced by {@link IMPParser#block}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitBlock(IMPParser.BlockContext ctx) {
        writer.println(indent.toString() + "<BlockNode> {}");
        visitSons(ctx.children);
        return null;
    }

    /**
     * Visit a parse tree produced by {@link IMPParser#assignment}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitAssignment(IMPParser.AssignmentContext ctx) {
        writer.println(indent.toString() + "<AssignmentNode> =");
        visitSons(ctx.children);
        return null;
    }

    /**
     * Visit a parse tree produced by {@link IMPParser#ifStmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitIfStmt(IMPParser.IfStmtContext ctx) {
        writer.println(indent.toString() + "<IfNode> if");
        visitSons(ctx.children);
        return null;
    }

    /**
     * Visit a parse tree produced by {@link IMPParser#whileStmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitWhileStmt(IMPParser.WhileStmtContext ctx) {
        writer.println(indent.toString() + "<WhileNode> while");
        visitSons(ctx.children);
        return null;
    }

    /**
     * Visit a parse tree produced by {@link IMPParser#sequence}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitSequence(IMPParser.SequenceContext ctx) {
        writer.println(indent.toString() + "<SequenceNode>");
        visitSons(ctx.children);
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
        visitSons(ctx.children);
        return null;
    }

    /**
     * Visit a parse tree produced by {@link IMPParser#plus}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitPlus(IMPParser.PlusContext ctx) {
        writer.println(indent.toString() + "<PlusNode> +");
        visitSons(ctx.children);
        return null;
    }

    /**
     * Visit a parse tree produced by {@link IMPParser#div}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitDiv(IMPParser.DivContext ctx) {
        writer.println(indent.toString() + "<DivNode> /");
        visitSons(ctx.children);
        return null;
    }

    /**
     * Visit a parse tree produced by {@link IMPParser#bracketAExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitBracketAExpr(IMPParser.BracketAExprContext ctx) {
        writer.println(indent.toString() + "<BracketNode> ()");
        visitSons(ctx.children);
        return null;
    }

    /**
     * Visit a parse tree produced by {@link IMPParser#bracketBExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitBracketBExpr(IMPParser.BracketBExprContext ctx) {
        writer.println(indent.toString() + "<BracketNode> ()");
        visitSons(ctx.children);
        return null;
    }

    /**
     * Visit a parse tree produced by {@link IMPParser#and}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitAnd(IMPParser.AndContext ctx) {
        writer.println(indent.toString() + "<AndNode> &&");
        visitSons(ctx.children);
        return null;
    }

    /**
     * Visit a parse tree produced by {@link IMPParser#greater}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitGreater(IMPParser.GreaterContext ctx) {
        writer.println(indent.toString() + "<GreaterNode> >");
        visitSons(ctx.children);
        return null;
    }

    /**
     * Visit a parse tree produced by {@link IMPParser#not}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitNot(IMPParser.NotContext ctx) {
        writer.println(indent.toString() + "<NotNode> !");
        visitSons(ctx.children);
        return null;
    }
}
