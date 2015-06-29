// $ANTLR 3.4 C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe2\\SymbolRiddle.g 2015-06-28 11:11:30

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class SymbolRiddleParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADDSUB", "EQL", "LETTER", "NEWLINE"
    };

    public static final int EOF=-1;
    public static final int ADDSUB=4;
    public static final int EQL=5;
    public static final int LETTER=6;
    public static final int NEWLINE=7;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "expr", "prog", "addsubline", "eqlline"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public SymbolRiddleParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public SymbolRiddleParser(TokenStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this, port, null);

        setDebugListener(proxy);
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
    }

public SymbolRiddleParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg, new RecognizerSharedState());
}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

    public String[] getTokenNames() { return SymbolRiddleParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe2\\SymbolRiddle.g"; }



    // $ANTLR start "prog"
    // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe2\\SymbolRiddle.g:4:1: prog : expr NEWLINE addsubline NEWLINE expr NEWLINE eqlline NEWLINE expr ;
    public final void prog() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "prog");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(4, 0);

        try {
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe2\\SymbolRiddle.g:4:5: ( expr NEWLINE addsubline NEWLINE expr NEWLINE eqlline NEWLINE expr )
            dbg.enterAlt(1);

            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe2\\SymbolRiddle.g:4:9: expr NEWLINE addsubline NEWLINE expr NEWLINE eqlline NEWLINE expr
            {
            dbg.location(4,9);
            pushFollow(FOLLOW_expr_in_prog12);
            expr();

            state._fsp--;

            dbg.location(4,14);
            match(input,NEWLINE,FOLLOW_NEWLINE_in_prog14); 
            dbg.location(5,2);
            pushFollow(FOLLOW_addsubline_in_prog17);
            addsubline();

            state._fsp--;

            dbg.location(5,13);
            match(input,NEWLINE,FOLLOW_NEWLINE_in_prog19); 
            dbg.location(6,2);
            pushFollow(FOLLOW_expr_in_prog22);
            expr();

            state._fsp--;

            dbg.location(6,7);
            match(input,NEWLINE,FOLLOW_NEWLINE_in_prog24); 
            dbg.location(7,2);
            pushFollow(FOLLOW_eqlline_in_prog27);
            eqlline();

            state._fsp--;

            dbg.location(7,10);
            match(input,NEWLINE,FOLLOW_NEWLINE_in_prog29); 
            dbg.location(8,2);
            pushFollow(FOLLOW_expr_in_prog32);
            expr();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(8, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prog");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "prog"



    // $ANTLR start "expr"
    // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe2\\SymbolRiddle.g:13:1: expr : LETTER ADDSUB LETTER EQL LETTER ;
    public final void expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(13, 0);

        try {
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe2\\SymbolRiddle.g:13:5: ( LETTER ADDSUB LETTER EQL LETTER )
            dbg.enterAlt(1);

            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe2\\SymbolRiddle.g:13:10: LETTER ADDSUB LETTER EQL LETTER
            {
            dbg.location(13,10);
            match(input,LETTER,FOLLOW_LETTER_in_expr45); 
            dbg.location(13,17);
            match(input,ADDSUB,FOLLOW_ADDSUB_in_expr47); 
            dbg.location(13,24);
            match(input,LETTER,FOLLOW_LETTER_in_expr49); 
            dbg.location(13,31);
            match(input,EQL,FOLLOW_EQL_in_expr51); 
            dbg.location(13,35);
            match(input,LETTER,FOLLOW_LETTER_in_expr53); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(13, 40);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "expr"



    // $ANTLR start "addsubline"
    // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe2\\SymbolRiddle.g:14:1: addsubline : ADDSUB ADDSUB ADDSUB ;
    public final void addsubline() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "addsubline");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(14, 0);

        try {
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe2\\SymbolRiddle.g:14:11: ( ADDSUB ADDSUB ADDSUB )
            dbg.enterAlt(1);

            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe2\\SymbolRiddle.g:14:13: ADDSUB ADDSUB ADDSUB
            {
            dbg.location(14,13);
            match(input,ADDSUB,FOLLOW_ADDSUB_in_addsubline59); 
            dbg.location(14,20);
            match(input,ADDSUB,FOLLOW_ADDSUB_in_addsubline61); 
            dbg.location(14,27);
            match(input,ADDSUB,FOLLOW_ADDSUB_in_addsubline63); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(14, 32);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "addsubline");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "addsubline"



    // $ANTLR start "eqlline"
    // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe2\\SymbolRiddle.g:15:1: eqlline : EQL EQL EQL ;
    public final void eqlline() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "eqlline");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(15, 0);

        try {
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe2\\SymbolRiddle.g:15:9: ( EQL EQL EQL )
            dbg.enterAlt(1);

            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe2\\SymbolRiddle.g:15:11: EQL EQL EQL
            {
            dbg.location(15,11);
            match(input,EQL,FOLLOW_EQL_in_eqlline71); 
            dbg.location(15,15);
            match(input,EQL,FOLLOW_EQL_in_eqlline73); 
            dbg.location(15,19);
            match(input,EQL,FOLLOW_EQL_in_eqlline75); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(15, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "eqlline");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "eqlline"

    // Delegated rules


 

    public static final BitSet FOLLOW_expr_in_prog12 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NEWLINE_in_prog14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_addsubline_in_prog17 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NEWLINE_in_prog19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_expr_in_prog22 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NEWLINE_in_prog24 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_eqlline_in_prog27 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NEWLINE_in_prog29 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_expr_in_prog32 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_expr45 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ADDSUB_in_expr47 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_LETTER_in_expr49 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQL_in_expr51 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_LETTER_in_expr53 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADDSUB_in_addsubline59 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ADDSUB_in_addsubline61 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ADDSUB_in_addsubline63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQL_in_eqlline71 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQL_in_eqlline73 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQL_in_eqlline75 = new BitSet(new long[]{0x0000000000000002L});

}