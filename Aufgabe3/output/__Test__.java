import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        SymbolRiddle_TreeParserLexer lex = new SymbolRiddle_TreeParserLexer(new ANTLRFileStream("C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        SymbolRiddle_TreeParserParser g = new SymbolRiddle_TreeParserParser(tokens, 49100, null);
        try {
            g.prog();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}