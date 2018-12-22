import java.util.*;
 
%%
 
%class IMPParser
%line
%int

%{
    /**
     * Pair between a token and its line in the source file
     */
    private class TokenWithLine {
        String str;
        int line;

        public TokenWithLine(String str, int line) {
            this.str = str;
            this.line = line;
        }
    }

    private Stack<TokenWithLine> operators;
    private Stack<ASTNode> nodes;
    public AST syntaxTree;

    /**
     * Detects the type of the block ((if)then block, else block, while block or standalone block)
     * and creates the corresponding node into the nodes stack.
     */
    private void pushBlockNode(BlockNode block) {
        if (!operators.empty() && operators.peek().str.equals("else")) {
            // this was an else block
            // build the if node
            operators.pop(); // pop else
            TokenWithLine token = operators.pop(); // pop if
            nodes.push(block);
            nodes.push(ASTNode.buildNode(token.line, "if", nodes));
        } else if (!operators.empty() && operators.peek().str.equals("while")) {
            // this was a (while) do block
            // build the while node
            TokenWithLine token = operators.pop(); // pop while
            nodes.push(block);
            nodes.push(ASTNode.buildNode(token.line, "while", nodes));
        } else {
            // simple block node
            nodes.push(block);
        }
    }

    /**
     * Creates a new operator node together with its line in the source file and pushes it
     * into the nodes stack.
     */
    private void makeOperatorNode() {
        TokenWithLine op = operators.pop();
        nodes.push(ASTNode.buildNode(op.line, op.str, nodes));
    }
%}

%init{
    operators = new Stack<>();
    nodes = new Stack<>();
    syntaxTree = new AST();
%init}

%eof{
    // compress stmt nodes using Sequence Nodes
    while (nodes.size() > 1) {
        ASTNode top = nodes.pop();
        ASTNode top2 = nodes.pop();

        nodes.push(new SequenceNode(top2, top));
    }

    syntaxTree.root.setSon(0, nodes.peek());
%eof}

AVal = [1-9][0-9]*|0
BVal = true|false
Var = [a-z]+

%%

{BVal} { nodes.push(new BoolNode(yyline + 1, Boolean.parseBoolean(yytext()))); }

if { operators.push(new TokenWithLine("if", yyline + 1)); }

while { operators.push(new TokenWithLine("while", yyline + 1)); }

else { operators.push(new TokenWithLine("else", yyline + 1)); }

int
{
    // the beginning of the variables list
    operators.push(new TokenWithLine("int", yyline + 1));
}

{Var} { nodes.push(new VarNode(yyline + 1, yytext())); }

{AVal} { nodes.push(new IntNode(yyline + 1, Integer.parseInt(yytext()))); }

\+
{
    // pop all operators with greater or equal priority
    while (!operators.empty() && (operators.peek().str.equals("/") || operators.peek().str.equals("+")))
        makeOperatorNode();
    
    operators.push(new TokenWithLine("+", yyline + 1));
}

\/
{
    while (!operators.empty() && operators.peek().str.equals("/"))
        makeOperatorNode();
        
    operators.push(new TokenWithLine("/", yyline + 1));
}

\( { operators.push(new TokenWithLine("(", yyline + 1)); }

\)
{
    while (!operators.empty() && !operators.peek().str.equals("("))
        makeOperatorNode();

    operators.pop(); // pop the opening bracket '('
    nodes.push(new BracketNode(nodes.pop()));
}

&&
{
    // the && operator has the smallest priority between &&, ! and >
    while (!operators.empty() && (operators.peek().str.equals("!") ||
                                  operators.peek().str.equals("&&") ||
                                  operators.peek().str.equals(">")))
        makeOperatorNode();

    operators.push(new TokenWithLine("&&", yyline + 1));
}

>
{
    while (!operators.empty() && (operators.peek().str.equals("+") || operators.peek().str.equals("/")))
        makeOperatorNode();

    operators.push(new TokenWithLine(">", yyline + 1));
}

\!
{
    while (!operators.empty() && operators.peek().str.equals(">"))
        makeOperatorNode();

    operators.push(new TokenWithLine("!", yyline + 1));
}

\{\s*\}
{
    pushBlockNode(new BlockNode()); // create an empty block node
}

\{
{
    operators.push(new TokenWithLine("{", yyline + 1));
    nodes.push(new BlockBegin()); // mark the beginning of a block in the nodes stack
}

\}
{
    while (!operators.empty() && !operators.peek().str.equals("{"))
        makeOperatorNode();

    operators.pop(); // delete '{' from the stack
    ASTNode blockContent = nodes.pop();

    // compress stmt nodes using Sequence Nodes
    while (!(nodes.peek() instanceof BlockBegin)) {
        ASTNode top = nodes.pop();
        blockContent = new SequenceNode(top, blockContent);
    }
    nodes.pop(); // pop the BlockBegin node

    pushBlockNode(new BlockNode(blockContent));
}

= { operators.push(new TokenWithLine("=", yyline + 1)); }

;
{
    // the end of the variables list or of an assignment
    while (!operators.empty() && !operators.peek().str.equals("int") && !operators.peek().str.equals("="))
        makeOperatorNode();

    TokenWithLine op = operators.pop();
    if (op.str.equals("int")) {
        // insert the variables list into the main node
        syntaxTree.root = new MainNode();

        while (!nodes.empty())
            syntaxTree.root.declareVar(((VarNode) nodes.pop()).name);
    } else { // ';'
        // create the assignment node
        ASTNode assignmentNode = ASTNode.buildNode(op.line, "=", nodes);
        nodes.push(assignmentNode);
    }
}

\s+|, {} // separators - do nothing
