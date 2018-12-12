import java.util.*;

public class ASTNode implements Interpretable {
    int line;
    ASTNode[] sons;

    public ASTNode(int line, int nrSons) {
        this.line = line;
        if (nrSons == 0)
            this.sons = null;
        else
            this.sons = new ASTNode[nrSons];
    }

    /**
     * Build AST node with the given sons
     */
    public ASTNode(ASTNode... sons) {
        this.sons = new ASTNode[sons.length];

        int nr = 0;
        for (ASTNode son : sons)
            this.sons[nr++] = son;
    }

    public ASTNode(int line, ASTNode... sons) {
        this(sons);
        this.line = line;
    }

    protected void setSon(int index, ASTNode son) {
        sons[index] = son;
    }

    /**
     * AST node abstract factory
     */
    public static ASTNode buildNode(int line, String type, Stack<ASTNode> args) {
        switch (type) {
            case "+": {
                ASTNode right = args.pop();
                ASTNode left = args.pop();
                return new PlusNode(line, left, right);
            }
            case "/": {
                ASTNode right = args.pop();
                ASTNode left = args.pop();
                return new DivNode(line, left, right);
            }
            case "=": {
                ASTNode right = args.pop();
                ASTNode left = args.pop();
                return new AssignmentNode(line, left, right);
            }
            case "&&": {
                ASTNode right = args.pop();
                ASTNode left = args.pop();
                return new AndNode(line, left, right);
            }
            case ">": {
                ASTNode right = args.pop();
                ASTNode left = args.pop();
                return new GreaterNode(line, left, right);
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
                return new NotNode(line, args.pop());
        }
        return null;
    }

    /**
     * Default node interpreting function
     */
    public Object interpret(HashMap<String, Integer> varList) throws UnassignedVarException, DivideByZeroException {
        if (sons != null)
            for (ASTNode son : sons)
                son.interpret(varList);
        return null;
    }
}

class MainNode extends ASTNode {
    /**
     * the ordered variables list
     */
    ArrayList<String> varList;

    public MainNode() {
        super(0, 1);
        varList = new ArrayList<>();
    }

    public void declareVar(String varName) {
        varList.add(varName);
    }

    @Override
    public String toString() {
        return "<MainNode>";
    }
}

class IntNode extends ASTNode {
    private int val;

    public IntNode(int line, int val) {
        super(line, 0);
        this.val = val;
    }

    @Override
    public String toString() {
        return "<IntNode> " + val;
    }

    @Override
    public Object interpret(HashMap<String, Integer> varList) {
        return val;
    }
}

class BoolNode extends ASTNode {
    private boolean val;

    public BoolNode(int line, boolean val) {
        super(line, 0);
        this.val = val;
    }

    @Override
    public String toString() {
        return "<BoolNode> " + (val ? "true" : "false");
    }

    @Override
    public Object interpret(HashMap<String, Integer> varList) {
        return val;
    }
}

class VarNode extends ASTNode {
    String name;

    public VarNode(int line, String name) {
        super(line, 0);
        this.name = name;
    }

    @Override
    public String toString() {
        return "<VariableNode> " + name;
    }

    @Override
    public Object interpret(HashMap<String, Integer> varList) throws UnassignedVarException {
        if (varList.containsKey(name) && varList.get(name) != null)
            return varList.get(name);

        throw new UnassignedVarException(line);
    }
}

class PlusNode extends ASTNode {
    public PlusNode(int line, ASTNode left, ASTNode right) {
        super(line, left, right);
    }

    @Override
    public String toString() {
        return "<PlusNode> +";
    }

    @Override
    public Object interpret(HashMap<String, Integer> varList) throws UnassignedVarException, DivideByZeroException {
        return (Integer) sons[0].interpret(varList) + (Integer) sons[1].interpret(varList);
    }
}

class DivNode extends ASTNode {
    public DivNode(int line, ASTNode left, ASTNode right) {
        super(line, left, right);
    }

    @Override
    public String toString() {
        return "<DivNode> /";
    }

    @Override
    public Object interpret(HashMap<String, Integer> varList) throws UnassignedVarException, DivideByZeroException {
        Integer right = (Integer) sons[1].interpret(varList);
        if (right == 0)
            throw new DivideByZeroException(line);

        return (Integer) sons[0].interpret(varList) / right;
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

    @Override
    public Object interpret(HashMap<String, Integer> varList) throws UnassignedVarException, DivideByZeroException {
        return sons[0].interpret(varList);
    }
}

class AndNode extends ASTNode {
    public AndNode(int line, ASTNode left, ASTNode right) {
        super(line, left, right);
    }

    @Override
    public String toString() {
        return "<AndNode> &&";
    }

    @Override
    public Object interpret(HashMap<String, Integer> varList) throws UnassignedVarException, DivideByZeroException {
        return (Boolean) sons[0].interpret(varList) && (Boolean) sons[1].interpret(varList);
    }
}

class GreaterNode extends ASTNode {
    public GreaterNode(int line, ASTNode left, ASTNode right) {
        super(line, left, right);
    }

    @Override
    public String toString() {
        return "<GreaterNode> >";
    }

    @Override
    public Object interpret(HashMap<String, Integer> varList) throws UnassignedVarException, DivideByZeroException {
        return (Integer) sons[0].interpret(varList) > (Integer) sons[1].interpret(varList);
    }
}

class NotNode extends ASTNode {
    public NotNode(int line, ASTNode bExpr) {
        super(line, bExpr);
    }

    @Override
    public String toString() {
        return "<NotNode> !";
    }

    @Override
    public Object interpret(HashMap<String, Integer> varList) throws UnassignedVarException, DivideByZeroException {
        return !(Boolean) sons[0].interpret(varList);
    }
}

class AssignmentNode extends ASTNode {
    public AssignmentNode(int line, ASTNode left, ASTNode right) {
        super(line, left, right);
    }

    @Override
    public String toString() {
        return "<AssignmentNode> =";
    }

    @Override
    public Object interpret(HashMap<String, Integer> varList) throws UnassignedVarException, DivideByZeroException {
        varList.put(((VarNode) sons[0]).name, (Integer) sons[1].interpret(varList));
        return null;
    }
}

class BlockNode extends ASTNode {
    public BlockNode() {
        super(0, 0);
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

    @Override
    public Object interpret(HashMap<String, Integer> varList) throws UnassignedVarException, DivideByZeroException {
        if ((Boolean) sons[0].interpret(varList))
            sons[1].interpret(varList);
        else
            sons[2].interpret(varList);
        return null;
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

    @Override
    public Object interpret(HashMap<String, Integer> varList) throws UnassignedVarException, DivideByZeroException {
        while ((Boolean) sons[0].interpret(varList))
            sons[1].interpret(varList);
        return null;
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

/**
 * Helper node used in blocks parsing (marks the beginning of a block in the nodes stack).
 */
class BlockBegin extends ASTNode {
}