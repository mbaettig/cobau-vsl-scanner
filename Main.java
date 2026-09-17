import java.util.List;
import java.io.IOException;
import org.antlr.v4.runtime.*;

public class Main {
    // parses and prints all tokens
    public static void main(String[] args) throws IOException {
        CharStream charStream = CharStreams.fromFileName(args[0]);
        VslLexer vslJLexer = new VslLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(vslJLexer);
        commonTokenStream.fill();
        List<Token> tokens = commonTokenStream.getTokens();
        System.out.println("Recognized the following tokens:");
        for(Token token : tokens) {
            System.out.println(">> "
                + VslLexer.VOCABULARY.getSymbolicName(token.getType())
                + " (" + token.getText() + ")");
        }
    }
}
