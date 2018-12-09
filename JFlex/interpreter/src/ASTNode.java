import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class ASTNode {
    ASTNode[] sons;

    public ASTNode(int nrSons) {
        if (nrSons == 0)
            this.sons = null;
        else
            this.sons = new ASTNode[nrSons];
    }

    public ASTNode(ASTNode... sons) {
        this.sons = new ASTNode[sons.length];

        int nr = 0;
        for (ASTNode son : sons)
            this.sons[nr++] = son;
    }

    protected void setSon(int index, ASTNode son) {
        sons[index] = son;
    }

    public static ASTNode buildNode(String type, Stack<ASTNode> args) {
        switch (type) {
            case "+": {
                ASTNode right = args.pop();
                ASTNode left = args.pop();
                return new PlusNode(left, right);
            }
            case "/": {
                ASTNode right = args.pop();
                ASTNode left = args.pop();
                return new DivNode(left, right);
            }
            case "=": {
                ASTNode right = args.pop();
                ASTNode left = args.pop();
                return new AssignmentNode(left, right);
            }
            case "&&": {
                ASTNode right = args.pop();
                ASTNode left = args.pop();
                return new AndNode(left, right);
            }
            case ">": {
                ASTNode right = args.pop();
                ASTNode left = args.pop();
                return new GreaterNode(left, right);
            }
            case "if": {
                ASTNode elseBlock = args.pop();
                ASTNode thenBlock = args.pop();
                ASTNode condExpr = args.pop();
                return new IfNode(condExpr, thenBlock, elseBlock);
            }
            case "while": {
                ASTNode doBlock = args.pop();
                ASTNode condExpr = args.pop();
                return new WhileNode(condExpr, doBlock);
            }
            case "!":
                return new NotNode(args.pop());
        }
        return null;
    }
}

class MainNode extends ASTNode {
    /**
     * the ordered variables list
     */
    ArrayList<String> varList;
    /**
     * the mappings between a variable and its value
     */
    HashMap<String, Integer> vars;

    public MainNode() {
        super(1);
        varList = new ArrayList<>();
        vars = new HashMap<>();
    }

    public void declareVar(String varName) {
        varList.add(varName);
        vars.put(varName, null);
    }

    @Override
    public String toString() {
        return "<MainNode>";
    }
}

class IntNode extends ASTNode {
    int val;

    public IntNode(int val) {
        super(0);
        this.val = val;
    }

    @Override
    public String toString() {
        return "<IntNode> " + val;
    }
}

class BoolNode extends ASTNode {
    boolean val;

    public BoolNode(boolean val) {
        super(0);
        this.val = val;
    }

    @Override
    public String toString() {
        return "<BoolNode> " + (val ? "true" : "false");
    }
}

class VarNode extends ASTNode {
    String name;

    public VarNode(String name) {
        super(0);
        this.name = name;
    }

    @Override
    public String toString() {
        return "<VariableNode> " + name;
    }
}

class PlusNode extends ASTNode {
    public PlusNode(ASTNode left, ASTNode right) {
        super(left, right);
    }

    @Override
    public String toString() {
        return "<PlusNode> +";
    }
}

class DivNode extends ASTNode {
    public DivNode(ASTNode left, ASTNode right) {
        super(left, right);
    }

    @Override
    public String toString() {
        return "<DivNode> /";
    }
}

class BracketNode extends ASTNode {
    public BracketNode(ASTNode expr) {
        super(expr);
    }

    @Override
    public String toString() {
        return "<BracketNode> ()";
    }
}

class AndNode extends ASTNode {
    public AndNode(ASTNode left, ASTNode right) {
        super(left, right);
    }

    @Override
    public String toString() {
        return "<AndNode> &&";
    }
}

class GreaterNode extends ASTNode {
    public GreaterNode(ASTNode left, ASTNode right) {
        super(left, right);
    }

    @Override
    public String toString() {
        return "<GreaterNode> >";
    }
}

class NotNode extends ASTNode {
    public NotNode(ASTNode bExpr) {
        super(bExpr);
    }

    @Override
    public String toString() {
        return "<NotNode> !";
    }
}

class AssignmentNode extends ASTNode {
    public AssignmentNode(ASTNode left, ASTNode right) {
        super(left, right);
    }

    @Override
    public String toString() {
        return "<AssignmentNode> =";
    }
}

class BlockNode extends ASTNode {
    public BlockNode() {
        super(0);
    }

    public BlockNode(ASTNode stmt) {
        super(stmt);
    }

    @Override
    public String toString() {
        return "<BlockNode> {}";
    }
}

class IfNode extends ASTNode {
    public IfNode(ASTNode condExpr, ASTNode thenBlock, ASTNode elseBlock) {
        super(condExpr, thenBlock, elseBlock);
    }

    @Override
    public String toString() {
        return "<IfNode> if";
    }
}

class WhileNode extends ASTNode {
    public WhileNode(ASTNode condExpr, ASTNode doBlock) {
        super(condExpr, doBlock);
    }

    @Override
    public String toString() {
        return "<WhileNode> while";
    }
}

class SequenceNode extends ASTNode {
    public SequenceNode(ASTNode stmt1, ASTNode stmt2) {
        super(stmt1, stmt2);
    }

    @Override
    public String toString() {
        return "<SequenceNode>";
    }
}

class StmtSeq extends ASTNode {
    ArrayList<ASTNode> statements;

    public StmtSeq() {
        statements = new ArrayList<>();
    }

    public void add(ASTNode stmt) {
        statements.add(stmt);
    }
}

class BlockBegin extends ASTNode {

}