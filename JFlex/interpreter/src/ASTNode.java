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
        }
        return null;
    }
}

class MainNode extends ASTNode {
    HashMap<String, Integer> varList;

    public MainNode() {
        super(1);
        varList = new HashMap<>();
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
        return "<BoolNode> " + (val ? "True" : "False");
    }
}

class VarNode extends ASTNode {
    String name;
    Integer val;

    public VarNode(String name) {
        super(0);
        this.name = name;
        val = null;
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
    public BracketNode() {
        super(1);
    }

    @Override
    public String toString() {
        return "<BracketNode> ()";
    }
}

class AndNode extends ASTNode {
    public AndNode() {
        super(2);
    }

    @Override
    public String toString() {
        return "<AndNode> &&";
    }
}

class GreaterNode extends ASTNode {
    public GreaterNode() {
        super(2);
    }

    @Override
    public String toString() {
        return "<GreaterNode> >";
    }
}

class NotNode extends ASTNode {
    public NotNode() {
        super(1);
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

    @Override
    public String toString() {
        return "<BlockNode> {}";
    }
}

class IfNode extends ASTNode {
    public IfNode() {
        super(3);
    }

    @Override
    public String toString() {
        return "<IfNode> if";
    }
}

class WhileNode extends ASTNode {
    public WhileNode() {
        super(2);
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