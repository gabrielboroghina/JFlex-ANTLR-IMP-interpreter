import org.antlr.v4.runtime.*;

import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    private static void printSyntaxTree(IMPParser parser) {
        PrintWriter writer;
        try {
            writer = new PrintWriter("arbore-b");
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        ParseTreePrinter parseTreePrinter = new ParseTreePrinter(writer);
        parser.mainNode().accept(parseTreePrinter);

        writer.close();
    }

    public static void main(String[] args) {
        CharStream charStream;
        try {
            charStream = CharStreams.fromFileName("input");
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // parse the source file using ANTLR-generated parser
        IMPLexer lexer = new IMPLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        IMPParser parser = new IMPParser(tokens);

        printSyntaxTree(parser);
    }
}
