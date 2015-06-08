// $ANTLR 3.4 C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g 2015-06-07 18:19:50

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SymbolRiddle_TreeParserParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "EQL", "LETTER", "NEWLINE", "NUMBER", "SUB"
    };

    public static final int EOF=-1;
    public static final int ADD=4;
    public static final int EQL=5;
    public static final int LETTER=6;
    public static final int NEWLINE=7;
    public static final int NUMBER=8;
    public static final int SUB=9;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "prog", "symbolRiddle", "number", "problem"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public SymbolRiddle_TreeParserParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public SymbolRiddle_TreeParserParser(TokenStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this,port,adaptor);
        setDebugListener(proxy);
        setTokenStream(new DebugTokenStream(input,proxy));
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);
        proxy.setTreeAdaptor(adap);
    }

public SymbolRiddle_TreeParserParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg);
     
    TreeAdaptor adap = new CommonTreeAdaptor();
    setTreeAdaptor(adap);


}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

protected DebugTreeAdaptor adaptor;
public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = new DebugTreeAdaptor(dbg,adaptor);


}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}

    public String[] getTokenNames() { return SymbolRiddle_TreeParserParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g:12:1: prog : symbolRiddle ;
    public final SymbolRiddle_TreeParserParser.prog_return prog() throws RecognitionException {
        SymbolRiddle_TreeParserParser.prog_return retval = new SymbolRiddle_TreeParserParser.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SymbolRiddle_TreeParserParser.symbolRiddle_return symbolRiddle1 =null;



        try { dbg.enterRule(getGrammarFileName(), "prog");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(12, 0);

        try {
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g:12:5: ( symbolRiddle )
            dbg.enterAlt(1);

            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g:12:9: symbolRiddle
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(12,9);
            pushFollow(FOLLOW_symbolRiddle_in_prog45);
            symbolRiddle1=symbolRiddle();

            state._fsp--;

            adaptor.addChild(root_0, symbolRiddle1.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(12, 20);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prog");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "prog"


    public static class symbolRiddle_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "symbolRiddle"
    // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g:15:1: symbolRiddle : ( problem problem problem problem problem problem ) ;
    public final SymbolRiddle_TreeParserParser.symbolRiddle_return symbolRiddle() throws RecognitionException {
        SymbolRiddle_TreeParserParser.symbolRiddle_return retval = new SymbolRiddle_TreeParserParser.symbolRiddle_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SymbolRiddle_TreeParserParser.problem_return problem2 =null;

        SymbolRiddle_TreeParserParser.problem_return problem3 =null;

        SymbolRiddle_TreeParserParser.problem_return problem4 =null;

        SymbolRiddle_TreeParserParser.problem_return problem5 =null;

        SymbolRiddle_TreeParserParser.problem_return problem6 =null;

        SymbolRiddle_TreeParserParser.problem_return problem7 =null;



        try { dbg.enterRule(getGrammarFileName(), "symbolRiddle");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(15, 0);

        try {
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g:16:2: ( ( problem problem problem problem problem problem ) )
            dbg.enterAlt(1);

            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g:16:4: ( problem problem problem problem problem problem )
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(16,4);
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g:16:4: ( problem problem problem problem problem problem )
            dbg.enterAlt(1);

            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g:16:5: problem problem problem problem problem problem
            {
            dbg.location(16,5);
            pushFollow(FOLLOW_problem_in_symbolRiddle56);
            problem2=problem();

            state._fsp--;

            adaptor.addChild(root_0, problem2.getTree());
            dbg.location(16,13);
            pushFollow(FOLLOW_problem_in_symbolRiddle58);
            problem3=problem();

            state._fsp--;

            adaptor.addChild(root_0, problem3.getTree());
            dbg.location(16,21);
            pushFollow(FOLLOW_problem_in_symbolRiddle60);
            problem4=problem();

            state._fsp--;

            adaptor.addChild(root_0, problem4.getTree());
            dbg.location(16,29);
            pushFollow(FOLLOW_problem_in_symbolRiddle62);
            problem5=problem();

            state._fsp--;

            adaptor.addChild(root_0, problem5.getTree());
            dbg.location(16,37);
            pushFollow(FOLLOW_problem_in_symbolRiddle64);
            problem6=problem();

            state._fsp--;

            adaptor.addChild(root_0, problem6.getTree());
            dbg.location(16,45);
            pushFollow(FOLLOW_problem_in_symbolRiddle66);
            problem7=problem();

            state._fsp--;

            adaptor.addChild(root_0, problem7.getTree());

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(16, 52);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "symbolRiddle");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "symbolRiddle"


    public static class problem_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "problem"
    // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g:18:1: problem : ( ^( EQL ^( ADD ^( NUMBER number ) ^( NUMBER number ) ) ^( NUMBER number ) ) ) ;
    public final SymbolRiddle_TreeParserParser.problem_return problem() throws RecognitionException {
        SymbolRiddle_TreeParserParser.problem_return retval = new SymbolRiddle_TreeParserParser.problem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQL8=null;
        Token ADD9=null;
        Token NUMBER10=null;
        Token NUMBER12=null;
        Token NUMBER14=null;
        SymbolRiddle_TreeParserParser.number_return number11 =null;

        SymbolRiddle_TreeParserParser.number_return number13 =null;

        SymbolRiddle_TreeParserParser.number_return number15 =null;


        CommonTree EQL8_tree=null;
        CommonTree ADD9_tree=null;
        CommonTree NUMBER10_tree=null;
        CommonTree NUMBER12_tree=null;
        CommonTree NUMBER14_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "problem");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(18, 0);

        try {
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g:18:9: ( ( ^( EQL ^( ADD ^( NUMBER number ) ^( NUMBER number ) ) ^( NUMBER number ) ) ) )
            dbg.enterAlt(1);

            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g:18:11: ( ^( EQL ^( ADD ^( NUMBER number ) ^( NUMBER number ) ) ^( NUMBER number ) ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(18,11);
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g:18:11: ( ^( EQL ^( ADD ^( NUMBER number ) ^( NUMBER number ) ) ^( NUMBER number ) ) )
            dbg.enterAlt(1);

            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g:18:12: ^( EQL ^( ADD ^( NUMBER number ) ^( NUMBER number ) ) ^( NUMBER number ) )
            {
            dbg.location(18,12);
            dbg.location(18,14);
            EQL8=(Token)match(input,EQL,FOLLOW_EQL_in_problem78); 
            EQL8_tree = 
            (CommonTree)adaptor.create(EQL8)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(EQL8_tree, root_0);


            match(input, Token.DOWN, null); 
            dbg.location(18,18);
            dbg.location(18,20);
            ADD9=(Token)match(input,ADD,FOLLOW_ADD_in_problem81); 
            ADD9_tree = 
            (CommonTree)adaptor.create(ADD9)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(ADD9_tree, root_0);


            match(input, Token.DOWN, null); 
            dbg.location(18,24);
            dbg.location(18,26);
            NUMBER10=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_problem84); 
            NUMBER10_tree = 
            (CommonTree)adaptor.create(NUMBER10)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(NUMBER10_tree, root_0);


            match(input, Token.DOWN, null); 
            dbg.location(18,33);
            pushFollow(FOLLOW_number_in_problem86);
            number11=number();

            state._fsp--;

            adaptor.addChild(root_0, number11.getTree());

            match(input, Token.UP, null); 

            dbg.location(18,41);
            dbg.location(18,43);
            NUMBER12=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_problem90); 
            NUMBER12_tree = 
            (CommonTree)adaptor.create(NUMBER12)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(NUMBER12_tree, root_0);


            match(input, Token.DOWN, null); 
            dbg.location(18,50);
            pushFollow(FOLLOW_number_in_problem92);
            number13=number();

            state._fsp--;

            adaptor.addChild(root_0, number13.getTree());

            match(input, Token.UP, null); 


            match(input, Token.UP, null); 

            dbg.location(18,59);
            dbg.location(18,61);
            NUMBER14=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_problem97); 
            NUMBER14_tree = 
            (CommonTree)adaptor.create(NUMBER14)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(NUMBER14_tree, root_0);


            match(input, Token.DOWN, null); 
            dbg.location(18,68);
            pushFollow(FOLLOW_number_in_problem99);
            number15=number();

            state._fsp--;

            adaptor.addChild(root_0, number15.getTree());

            match(input, Token.UP, null); 


            match(input, Token.UP, null); 


            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(18, 76);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "problem");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "problem"


    public static class number_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "number"
    // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g:21:1: number : ( LETTER )+ ;
    public final SymbolRiddle_TreeParserParser.number_return number() throws RecognitionException {
        SymbolRiddle_TreeParserParser.number_return retval = new SymbolRiddle_TreeParserParser.number_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LETTER16=null;

        CommonTree LETTER16_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "number");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(21, 0);

        try {
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g:21:7: ( ( LETTER )+ )
            dbg.enterAlt(1);

            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g:21:9: ( LETTER )+
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(21,9);
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g:21:9: ( LETTER )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==LETTER) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g:21:9: LETTER
            	    {
            	    dbg.location(21,9);
            	    LETTER16=(Token)match(input,LETTER,FOLLOW_LETTER_in_number115); 
            	    LETTER16_tree = 
            	    (CommonTree)adaptor.create(LETTER16)
            	    ;
            	    adaptor.addChild(root_0, LETTER16_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt1++;
            } while (true);
            } finally {dbg.exitSubRule(1);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(21, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "number");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "number"

    // Delegated rules


 

    public static final BitSet FOLLOW_symbolRiddle_in_prog45 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_problem_in_symbolRiddle56 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_problem_in_symbolRiddle58 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_problem_in_symbolRiddle60 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_problem_in_symbolRiddle62 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_problem_in_symbolRiddle64 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_problem_in_symbolRiddle66 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQL_in_problem78 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ADD_in_problem81 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NUMBER_in_problem84 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_number_in_problem86 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NUMBER_in_problem90 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_number_in_problem92 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NUMBER_in_problem97 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_number_in_problem99 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LETTER_in_number115 = new BitSet(new long[]{0x0000000000000042L});

}