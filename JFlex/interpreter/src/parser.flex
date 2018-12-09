import java.util.*;
 
%%
 
%class IMPParser
%line
%int
%standalone

%{
    private Stack<String> operatorStack;
    private Stack<ASTNode> nodesStack;
    public AST syntaxTree;

    private void pushStmtNode(ASTNode node) {
        if (!nodesStack.empty() && (nodesStack.peek() instanceof SequenceNode ||
                                    nodesStack.peek() instanceof IfNode ||
                                    nodesStack.peek() instanceof WhileNode ||
                                    nodesStack.peek() instanceof AssignmentNode ||
                                    nodesStack.peek() instanceof BlockNode)) {
            // compress successive Stmt nodes
            ASTNode top = nodesStack.pop();
            nodesStack.push(new SequenceNode(top, node));
        }
        else nodesStack.push(node);
    }

    private void pushBlockNode(BlockNode block) {
        if (!operatorStack.empty() && operatorStack.peek().equals("else")) {
            // this was an else block
            // build the if node
            operatorStack.pop(); // pop else
            operatorStack.pop(); // pop if
            nodesStack.push(block);
            pushStmtNode(ASTNode.buildNode("if", nodesStack));
        } else if (!operatorStack.empty() && operatorStack.peek().equals("while")) {
            // this was a (while) do block
            // build the while node
            operatorStack.pop(); // pop while
            nodesStack.push(block);
            pushStmtNode(ASTNode.buildNode("while", nodesStack));
        } else {
            // simple block node
            pushStmtNode(block);
        }
    }
%}

%init{
    operatorStack = new Stack<>();
    nodesStack = new Stack<>();
    syntaxTree = new AST();
%init}

%eof{
    syntaxTree.root.setSon(0, nodesStack.peek());
%eof}

Number = [1-9][0-9]*|0
AVal = {Number}
BVal = true|false
Var = [a-z]+

%%

{BVal} { nodesStack.push(new BoolNode(Boolean.parseBoolean(yytext()))); }

if { operatorStack.push("if"); }

while { operatorStack.push("while"); }

else { operatorStack.push("else"); }

int
{
    // the beginning of the variables list
    operatorStack.push("int");
}

{Var} { nodesStack.push(new VarNode(yytext())); }

{AVal} { nodesStack.push(new IntNode(Integer.parseInt(yytext()))); }

// arithmetic and boolean expressions
\+
{
    while (!operatorStack.empty() && (operatorStack.peek().equals("/") || operatorStack.peek().equals("+"))) {
        String op = operatorStack.pop();
        nodesStack.push(ASTNode.buildNode(op, nodesStack));
    }
    operatorStack.push("+");
}

\/
{
    while (!operatorStack.empty() && operatorStack.peek().equals("/")) {
        String op = operatorStack.pop();
        nodesStack.push(ASTNode.buildNode(op, nodesStack));
    }
    operatorStack.push("/");
}

\( { operatorStack.push("("); }

\)
{
    while (!operatorStack.empty() && !operatorStack.peek().equals("(")) {
        String op = operatorStack.pop();
        nodesStack.push(ASTNode.buildNode(op, nodesStack));
    }

    operatorStack.pop(); // pop the opening bracket '('
    nodesStack.push(new BracketNode(nodesStack.pop()));
}

&&
{
    while (!operatorStack.empty() && (operatorStack.peek().equals("!") || operatorStack.peek().equals("&&"))) {
        String op = operatorStack.pop();
        nodesStack.push(ASTNode.buildNode(op, nodesStack));
    }
    operatorStack.push("&&");
}

>
{
    operatorStack.push(">");
}

\!
{
    operatorStack.push("!");
}

\{\}
{
    pushBlockNode(new BlockNode());
}

\{ { operatorStack.push("{"); }

\}
{
    while (!operatorStack.empty() && !operatorStack.peek().equals("{")) {
        String op = operatorStack.pop();
        nodesStack.push(ASTNode.buildNode(op, nodesStack));
    }

    operatorStack.pop(); // delete '{' from the stack
    pushBlockNode(new BlockNode(nodesStack.pop()));
}

= { operatorStack.push("="); }

;
{
    // the end of the variables list or of an assignment
    while (!operatorStack.empty() && !operatorStack.peek().equals("int") && !operatorStack.peek().equals("=")) {
        String op = operatorStack.pop();
        nodesStack.push(ASTNode.buildNode(op, nodesStack));
    }

    String op = operatorStack.pop();
    if (op.equals("int")) {
        syntaxTree.root = new MainNode();

        while (!nodesStack.empty())
            syntaxTree.root.declareVar(((VarNode) nodesStack.pop()).name);
    } else { // ;
        ASTNode assignmentNode = ASTNode.buildNode("=", nodesStack);
        pushStmtNode(assignmentNode);
    }
}

\s+|, {}
