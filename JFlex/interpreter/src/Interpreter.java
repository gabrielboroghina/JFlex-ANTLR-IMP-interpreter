import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Interpreter {
    private static void printSyntaxTree(AST syntaxTree) {
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

    private static void interpretProgram() {

    }

    private static void printVariablesValues() {
        PrintWriter writer;
        try {
            writer = new PrintWriter("output");
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        writer.close();
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
            parser.yylex();
        } catch (IOException e) {
        }

        AST syntaxTree = parser.syntaxTree;

        printSyntaxTree(syntaxTree);
        interpretProgram();
        printVariablesValues();
    }
}
