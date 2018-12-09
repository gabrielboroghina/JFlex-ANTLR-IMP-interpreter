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

else {}

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
{ // TODO

}

&&
{
    while (!operatorStack.empty() && (operatorStack.peek().equals("!") || operatorStack.peek().equals("&&"))) {
        operatorStack.pop();
        nodesStack.push(ASTNode.buildNode("&&", nodesStack));
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

\{\} { nodesStack.push(new BlockNode()); }

\{ { operatorStack.push("{"); }

\}
{
    while (!operatorStack.empty() && !operatorStack.peek().equals("{")) {
        String op = operatorStack.pop();
        nodesStack.push(ASTNode.buildNode(op, nodesStack));
    }
    operatorStack.pop(); // delete '{' from the stack
}

= { operatorStack.push("="); }

if\s*\( { operatorStack.push("if"); }

while\s*\( { operatorStack.push("while"); }

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
            syntaxTree.root.varList.put(((VarNode) nodesStack.pop()).name, null);
    } else { // ;
        ASTNode assignmentNode = ASTNode.buildNode("=", nodesStack);
        if (!nodesStack.empty() && (nodesStack.peek() instanceof SequenceNode ||
                                    nodesStack.peek() instanceof IfNode ||
                                    nodesStack.peek() instanceof WhileNode ||
                                    nodesStack.peek() instanceof AssignmentNode ||
                                    nodesStack.peek() instanceof BlockNode)) {
            // compress successive stmt nodes
            ASTNode top = nodesStack.pop();
            nodesStack.push(new SequenceNode(top, assignmentNode));
        }
        else nodesStack.push(assignmentNode);
    }
}


