import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class Interpreter {
    private static AST syntaxTree;

    /**
     * Hash table containing the mappings between a variable name and its value
     */
    private static HashMap<String, Integer> varTable;

    private static void printSyntaxTree() {
        PrintWriter writer;
        try {
            writer = new PrintWriter("arbore");
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        writer.print(syntaxTree.toString());
        writer.close();
    }

    /**
     * Depth first search for finding undeclared variables. Throws an UnassignedVarException
     * when finding the first undeclared variable.
     */
    private static void checkUndeclaredVars(ASTNode node) throws UnassignedVarException {
        if (node instanceof VarNode && !varTable.containsKey(((VarNode) node).name))
            throw new UnassignedVarException(node.line);

        if (node.sons != null)
            for (ASTNode son : node.sons)
                checkUndeclaredVars(son);
    }

    /**
     * Runs interpreter on the AST
     */
    private static void interpretProgram() throws UnassignedVarException, DivideByZeroException {
        // insert declared variables into the var table
        for (String varName : syntaxTree.root.varList)
            varTable.put(varName, null);

        checkUndeclaredVars(syntaxTree.root);

        // start interpreting from the MainNode
        syntaxTree.root.interpret(varTable);
    }

    private static void printVariablesValues(PrintWriter writer) {
        ArrayList<String> varList = syntaxTree.root.varList;
        for (int i = varList.size() - 1; i >= 0; i--)
            writer.println(varList.get(i) + "=" + varTable.get(varList.get(i)));
    }

    public static void main(String[] args) {
        FileReader fileReader;
        try {
            fileReader = new FileReader("input");
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        IMPParser parser = new IMPParser(fileReader);
        try {
            parser.yylex(); // parse the source file
        } catch (IOException e) {
            e.printStackTrace();
        }

        syntaxTree = parser.syntaxTree;
        printSyntaxTree();

        PrintWriter writer;
        try {
            writer = new PrintWriter("output");
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        varTable = new HashMap<>();
        try {
            interpretProgram();
            printVariablesValues(writer);
        } catch (UnassignedVarException | DivideByZeroException e) {
            // an exception had occurred; print only the exception's message
            writer.println(e.getMessage());
        } finally {
            writer.close();
        }
    }
}
