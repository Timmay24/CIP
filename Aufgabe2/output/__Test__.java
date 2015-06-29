import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        SymbolRiddleLexer lex = new SymbolRiddleLexer(new ANTLRFileStream("C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe2\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        SymbolRiddleParser g = new SymbolRiddleParser(tokens, 49100, null);
        try {
            g.prog();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}