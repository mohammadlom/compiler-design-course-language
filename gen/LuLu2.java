import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class LuLu2 {
    public static void main(String[] args) throws IOException {

        lulu2Lexer lexer = new lulu2Lexer(new ANTLRFileStream("src/test.txt"));

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        lulu2Parser parser = new lulu2Parser(tokens);
        ParseTree tree = parser.program();
        DefPhase defListner = new DefPhase();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(defListner, tree);

        InheritancePhase mainListener = new InheritancePhase(defListner.globalScope);
        walker.walk(mainListener, tree);


        ResolvePhase resolListener = new ResolvePhase(defListner.globalScope, defListner.scopes);
        walker.walk(resolListener, tree);

        System.out.println(resolListener.getErrors());
        System.out.println(resolListener.tables.toString());
    }
}
