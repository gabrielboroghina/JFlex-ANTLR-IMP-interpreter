import java.util.*;
 
%%
 
%class IMPParser
%line
%int

%{
    private class TokenWithLine {
        String str;
        int line;

        public TokenWithLine(String str, int line) {
            this.str = str;
            this.line = line;
        }
    }

    private Stack<TokenWithLine> operatorStack;
    private Stack<ASTNode> nodesStack;
    public AST syntaxTree;

    private void pushBlockNode(BlockNode block) {
        if (!operatorStack.empty() && operatorStack.peek().str.equals("else")) {
            // this was an else block
            // build the if node
            operatorStack.pop(); // pop else
            TokenWithLine token = operatorStack.pop(); // pop if
            nodesStack.push(block);
            nodesStack.push(ASTNode.buildNode(token.line, "if", nodesStack));
        } else if (!operatorStack.empty() && operatorStack.peek().str.equals("while")) {
            // this was a (while) do block
            // build the while node
            TokenWithLine token = operatorStack.pop(); // pop while
            nodesStack.push(block);
            nodesStack.push(ASTNode.buildNode(token.line, "while", nodesStack));
        } else {
            // simple block node
            nodesStack.push(block);
        }
    }

    private void makeOperatorNode() {
        TokenWithLine op = operatorStack.pop();
        nodesStack.push(ASTNode.buildNode(op.line, op.str, nodesStack));
    }
%}

%init{
    operatorStack = new Stack<>();
    nodesStack = new Stack<>();
    syntaxTree = new AST();
%init}

%eof{
    // compress stmt nodes using Sequence Nodes
    while (nodesStack.size() > 1) {
        ASTNode top = nodesStack.pop();
        ASTNode top2 = nodesStack.pop();

        nodesStack.push(new SequenceNode(top2, top));
    }

    syntaxTree.root.setSon(0, nodesStack.peek());
%eof}

AVal = [1-9][0-9]*|0
BVal = true|false
Var = [a-z]+

%%

{BVal} { nodesStack.push(new BoolNode(yyline + 1, Boolean.parseBoolean(yytext()))); }

if { operatorStack.push(new TokenWithLine("if", yyline + 1)); }

while { operatorStack.push(new TokenWithLine("while", yyline + 1)); }

else { operatorStack.push(new TokenWithLine("else", yyline + 1)); }

int
{
    // the beginning of the variables list
    operatorStack.push(new TokenWithLine("int", yyline + 1));
}

{Var} { nodesStack.push(new VarNode(yyline + 1, yytext())); }

{AVal} { nodesStack.push(new IntNode(yyline + 1, Integer.parseInt(yytext()))); }

// arithmetic and boolean expressions
\+
{
    while (!operatorStack.empty() &&
          (operatorStack.peek().str.equals("/") || operatorStack.peek().str.equals("+")))
        makeOperatorNode();
    
    operatorStack.push(new TokenWithLine("+", yyline + 1));
}

\/
{
    while (!operatorStack.empty() && operatorStack.peek().str.equals("/"))
        makeOperatorNode();
        
    operatorStack.push(new TokenWithLine("/", yyline + 1));
}

\( { operatorStack.push(new TokenWithLine("(", yyline + 1)); }

\)
{
    while (!operatorStack.empty() && !operatorStack.peek().str.equals("("))
        makeOperatorNode();

    operatorStack.pop(); // pop the opening bracket '('
    nodesStack.push(new BracketNode(nodesStack.pop()));
}

&&
{
    while (!operatorStack.empty() && (operatorStack.peek().str.equals("!") ||
                                      operatorStack.peek().str.equals("&&") ||
                                      operatorStack.peek().str.equals(">")))
        makeOperatorNode();

    operatorStack.push(new TokenWithLine("&&", yyline + 1));
}

>
{
    while (!operatorStack.empty() &&
          (operatorStack.peek().str.equals("+") || operatorStack.peek().str.equals("/")))
        makeOperatorNode();

    operatorStack.push(new TokenWithLine(">", yyline + 1));
}

\!
{
    while (!operatorStack.empty() && operatorStack.peek().str.equals(">"))
        makeOperatorNode();

    operatorStack.push(new TokenWithLine("!", yyline + 1));
}

\{\}
{
    pushBlockNode(new BlockNode());
}

\{
{
    operatorStack.push(new TokenWithLine("{", yyline + 1));
    nodesStack.push(new BlockBegin()); // mark the beginning of a block
}

\}
{
    while (!operatorStack.empty() && !operatorStack.peek().str.equals("{"))
        makeOperatorNode();

    operatorStack.pop(); // delete '{' from the stack

    ASTNode blockContent = nodesStack.pop();
    // compress stmt nodes using Sequence Nodes
    while (!(nodesStack.peek() instanceof BlockBegin)) {
        ASTNode top = nodesStack.pop();
        blockContent = new SequenceNode(top, blockContent);
    }
    nodesStack.pop(); // pop BlockBegin node

    pushBlockNode(new BlockNode(blockContent));
}

= { operatorStack.push(new TokenWithLine("=", yyline + 1)); }

;
{
    // the end of the variables list or of an assignment
    while (!operatorStack.empty() &&
           !operatorStack.peek().str.equals("int") && !operatorStack.peek().str.equals("="))
        makeOperatorNode();

    TokenWithLine op = operatorStack.pop();
    if (op.str.equals("int")) {
        syntaxTree.root = new MainNode();

        while (!nodesStack.empty())
            syntaxTree.root.declareVar(((VarNode) nodesStack.pop()).name);
    } else { // ;
        ASTNode assignmentNode = ASTNode.buildNode(op.line, "=", nodesStack);
        nodesStack.push(assignmentNode);
    }
}

\s+|, {}
