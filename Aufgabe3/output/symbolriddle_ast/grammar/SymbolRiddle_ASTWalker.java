// $ANTLR 3.4 C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_ASTWalker.g 2015-06-10 14:56:27
package symbolriddle_ast.grammar;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SymbolRiddle_ASTWalker extends DebugTreeParser {
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
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "t2", "t3", "problem", "t1", "number", "symbolRiddle", 
    "prog"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public SymbolRiddle_ASTWalker(TreeNodeStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public SymbolRiddle_ASTWalker(TreeNodeStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this,port,input.getTreeAdaptor());
        setDebugListener(proxy);
        setTreeNodeStream(new DebugTreeNodeStream(input,proxy));
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

public SymbolRiddle_ASTWalker(TreeNodeStream input, DebugEventListener dbg) {
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

    public String[] getTokenNames() { return SymbolRiddle_ASTWalker.tokenNames; }
    public String getGrammarFileName() { return "C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_ASTWalker.g"; }


    public static class prog_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_ASTWalker.g:13:1: prog : symbolRiddle ;
    public final SymbolRiddle_ASTWalker.prog_return prog() throws RecognitionException {
        SymbolRiddle_ASTWalker.prog_return retval = new SymbolRiddle_ASTWalker.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SymbolRiddle_ASTWalker.symbolRiddle_return symbolRiddle1 =null;



        try { dbg.enterRule(getGrammarFileName(), "prog");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(13, 0);

        try {
            // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_ASTWalker.g:13:6: ( symbolRiddle )
            dbg.enterAlt(1);

            // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_ASTWalker.g:13:11: symbolRiddle
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(13,11);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_symbolRiddle_in_prog55);
            symbolRiddle1=symbolRiddle();

            state._fsp--;

            adaptor.addChild(root_0, symbolRiddle1.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(13, 22);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prog");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "prog"


    public static class symbolRiddle_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "symbolRiddle"
    // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_ASTWalker.g:17:1: symbolRiddle : problem problem problem problem problem problem ;
    public final SymbolRiddle_ASTWalker.symbolRiddle_return symbolRiddle() throws RecognitionException {
        SymbolRiddle_ASTWalker.symbolRiddle_return retval = new SymbolRiddle_ASTWalker.symbolRiddle_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SymbolRiddle_ASTWalker.problem_return problem2 =null;

        SymbolRiddle_ASTWalker.problem_return problem3 =null;

        SymbolRiddle_ASTWalker.problem_return problem4 =null;

        SymbolRiddle_ASTWalker.problem_return problem5 =null;

        SymbolRiddle_ASTWalker.problem_return problem6 =null;

        SymbolRiddle_ASTWalker.problem_return problem7 =null;



        try { dbg.enterRule(getGrammarFileName(), "symbolRiddle");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(17, 0);

        try {
            // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_ASTWalker.g:18:2: ( problem problem problem problem problem problem )
            dbg.enterAlt(1);

            // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_ASTWalker.g:18:4: problem problem problem problem problem problem
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(18,4);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_problem_in_symbolRiddle66);
            problem2=problem();

            state._fsp--;

            adaptor.addChild(root_0, problem2.getTree());

            dbg.location(18,12);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_problem_in_symbolRiddle68);
            problem3=problem();

            state._fsp--;

            adaptor.addChild(root_0, problem3.getTree());

            dbg.location(18,20);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_problem_in_symbolRiddle70);
            problem4=problem();

            state._fsp--;

            adaptor.addChild(root_0, problem4.getTree());

            dbg.location(18,28);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_problem_in_symbolRiddle72);
            problem5=problem();

            state._fsp--;

            adaptor.addChild(root_0, problem5.getTree());

            dbg.location(18,36);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_problem_in_symbolRiddle74);
            problem6=problem();

            state._fsp--;

            adaptor.addChild(root_0, problem6.getTree());

            dbg.location(18,44);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_problem_in_symbolRiddle76);
            problem7=problem();

            state._fsp--;

            adaptor.addChild(root_0, problem7.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(18, 50);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "symbolRiddle");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "symbolRiddle"


    public static class number_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "number"
    // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_ASTWalker.g:20:1: number : ^( NUMBER ( LETTER )+ ) ;
    public final SymbolRiddle_ASTWalker.number_return number() throws RecognitionException {
        SymbolRiddle_ASTWalker.number_return retval = new SymbolRiddle_ASTWalker.number_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree NUMBER8=null;
        CommonTree LETTER9=null;

        CommonTree NUMBER8_tree=null;
        CommonTree LETTER9_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "number");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(20, 0);

        try {
            // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_ASTWalker.g:21:2: ( ^( NUMBER ( LETTER )+ ) )
            dbg.enterAlt(1);

            // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_ASTWalker.g:21:4: ^( NUMBER ( LETTER )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(21,4);
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            dbg.location(21,6);
            _last = (CommonTree)input.LT(1);
            NUMBER8=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_number91); 
            NUMBER8_tree = (CommonTree)adaptor.dupNode(NUMBER8);


            root_1 = (CommonTree)adaptor.becomeRoot(NUMBER8_tree, root_1);


            match(input, Token.DOWN, null); 
            dbg.location(21,13);
            // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_ASTWalker.g:21:13: ( LETTER )+
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

            	    // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_ASTWalker.g:21:13: LETTER
            	    {
            	    dbg.location(21,13);
            	    _last = (CommonTree)input.LT(1);
            	    LETTER9=(CommonTree)match(input,LETTER,FOLLOW_LETTER_in_number93); 
            	    LETTER9_tree = (CommonTree)adaptor.dupNode(LETTER9);


            	    adaptor.addChild(root_1, LETTER9_tree);


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


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(21, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "number");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "number"


    public static class problem_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "problem"
    // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_ASTWalker.g:22:1: problem : ( ^( EQL ^( ADD t1 t2 ) t3 ) | ^( EQL ^( SUB t1 t2 ) t3 ) -> ^( EQL ^( ADD[\"+\"] t2 t3 ) t1 ) );
    public final SymbolRiddle_ASTWalker.problem_return problem() throws RecognitionException {
        SymbolRiddle_ASTWalker.problem_return retval = new SymbolRiddle_ASTWalker.problem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EQL10=null;
        CommonTree ADD11=null;
        CommonTree EQL15=null;
        CommonTree SUB16=null;
        SymbolRiddle_ASTWalker.t1_return t112 =null;

        SymbolRiddle_ASTWalker.t2_return t213 =null;

        SymbolRiddle_ASTWalker.t3_return t314 =null;

        SymbolRiddle_ASTWalker.t1_return t117 =null;

        SymbolRiddle_ASTWalker.t2_return t218 =null;

        SymbolRiddle_ASTWalker.t3_return t319 =null;


        CommonTree EQL10_tree=null;
        CommonTree ADD11_tree=null;
        CommonTree EQL15_tree=null;
        CommonTree SUB16_tree=null;
        RewriteRuleNodeStream stream_EQL=new RewriteRuleNodeStream(adaptor,"token EQL");
        RewriteRuleNodeStream stream_SUB=new RewriteRuleNodeStream(adaptor,"token SUB");
        RewriteRuleSubtreeStream stream_t1=new RewriteRuleSubtreeStream(adaptor,"rule t1");
        RewriteRuleSubtreeStream stream_t2=new RewriteRuleSubtreeStream(adaptor,"rule t2");
        RewriteRuleSubtreeStream stream_t3=new RewriteRuleSubtreeStream(adaptor,"rule t3");
        try { dbg.enterRule(getGrammarFileName(), "problem");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(22, 0);

        try {
            // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_ASTWalker.g:23:2: ( ^( EQL ^( ADD t1 t2 ) t3 ) | ^( EQL ^( SUB t1 t2 ) t3 ) -> ^( EQL ^( ADD[\"+\"] t2 t3 ) t1 ) )
            int alt2=2;
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==EQL) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==DOWN) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==ADD) ) {
                        alt2=1;
                    }
                    else if ( (LA2_2==SUB) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_ASTWalker.g:23:4: ^( EQL ^( ADD t1 t2 ) t3 )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(23,4);
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    dbg.location(23,6);
                    _last = (CommonTree)input.LT(1);
                    EQL10=(CommonTree)match(input,EQL,FOLLOW_EQL_in_problem105); 
                    EQL10_tree = (CommonTree)adaptor.dupNode(EQL10);


                    root_1 = (CommonTree)adaptor.becomeRoot(EQL10_tree, root_1);


                    match(input, Token.DOWN, null); 
                    dbg.location(23,10);
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    dbg.location(23,12);
                    _last = (CommonTree)input.LT(1);
                    ADD11=(CommonTree)match(input,ADD,FOLLOW_ADD_in_problem108); 
                    ADD11_tree = (CommonTree)adaptor.dupNode(ADD11);


                    root_2 = (CommonTree)adaptor.becomeRoot(ADD11_tree, root_2);


                    match(input, Token.DOWN, null); 
                    dbg.location(23,16);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_t1_in_problem110);
                    t112=t1();

                    state._fsp--;

                    adaptor.addChild(root_2, t112.getTree());

                    dbg.location(23,19);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_t2_in_problem112);
                    t213=t2();

                    state._fsp--;

                    adaptor.addChild(root_2, t213.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }

                    dbg.location(23,23);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_t3_in_problem115);
                    t314=t3();

                    state._fsp--;

                    adaptor.addChild(root_1, t314.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_ASTWalker.g:24:3: ^( EQL ^( SUB t1 t2 ) t3 )
                    {
                    dbg.location(24,3);
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    dbg.location(24,5);
                    _last = (CommonTree)input.LT(1);
                    EQL15=(CommonTree)match(input,EQL,FOLLOW_EQL_in_problem123);  
                    stream_EQL.add(EQL15);


                    match(input, Token.DOWN, null); 
                    dbg.location(24,9);
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    dbg.location(24,11);
                    _last = (CommonTree)input.LT(1);
                    SUB16=(CommonTree)match(input,SUB,FOLLOW_SUB_in_problem126);  
                    stream_SUB.add(SUB16);


                    match(input, Token.DOWN, null); 
                    dbg.location(24,15);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_t1_in_problem128);
                    t117=t1();

                    state._fsp--;

                    stream_t1.add(t117.getTree());
                    dbg.location(24,18);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_t2_in_problem130);
                    t218=t2();

                    state._fsp--;

                    stream_t2.add(t218.getTree());

                    match(input, Token.UP, null); 
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }

                    dbg.location(24,22);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_t3_in_problem133);
                    t319=t3();

                    state._fsp--;

                    stream_t3.add(t319.getTree());

                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    // AST REWRITE
                    // elements: t3, t1, EQL, t2
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 24:26: -> ^( EQL ^( ADD[\"+\"] t2 t3 ) t1 )
                    {
                        dbg.location(24,29);
                        // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_ASTWalker.g:24:29: ^( EQL ^( ADD[\"+\"] t2 t3 ) t1 )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(24,31);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_EQL.nextNode()
                        , root_1);

                        dbg.location(24,35);
                        // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_ASTWalker.g:24:35: ^( ADD[\"+\"] t2 t3 )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        dbg.location(24,37);
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ADD, "+")
                        , root_2);

                        dbg.location(24,46);
                        adaptor.addChild(root_2, stream_t2.nextTree());
                        dbg.location(24,49);
                        adaptor.addChild(root_2, stream_t3.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(24,53);
                        adaptor.addChild(root_1, stream_t1.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(24, 55);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "problem");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "problem"


    public static class t1_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "t1"
    // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_ASTWalker.g:26:1: t1 : number ;
    public final SymbolRiddle_ASTWalker.t1_return t1() throws RecognitionException {
        SymbolRiddle_ASTWalker.t1_return retval = new SymbolRiddle_ASTWalker.t1_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SymbolRiddle_ASTWalker.number_return number20 =null;



        try { dbg.enterRule(getGrammarFileName(), "t1");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(26, 0);

        try {
            // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_ASTWalker.g:26:4: ( number )
            dbg.enterAlt(1);

            // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_ASTWalker.g:26:6: number
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(26,6);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_number_in_t1160);
            number20=number();

            state._fsp--;

            adaptor.addChild(root_0, number20.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(26, 11);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "t1");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "t1"


    public static class t2_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "t2"
    // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_ASTWalker.g:27:1: t2 : number ;
    public final SymbolRiddle_ASTWalker.t2_return t2() throws RecognitionException {
        SymbolRiddle_ASTWalker.t2_return retval = new SymbolRiddle_ASTWalker.t2_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SymbolRiddle_ASTWalker.number_return number21 =null;



        try { dbg.enterRule(getGrammarFileName(), "t2");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(27, 0);

        try {
            // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_ASTWalker.g:27:4: ( number )
            dbg.enterAlt(1);

            // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_ASTWalker.g:27:6: number
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(27,6);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_number_in_t2167);
            number21=number();

            state._fsp--;

            adaptor.addChild(root_0, number21.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(27, 11);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "t2");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "t2"


    public static class t3_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "t3"
    // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_ASTWalker.g:28:1: t3 : number ;
    public final SymbolRiddle_ASTWalker.t3_return t3() throws RecognitionException {
        SymbolRiddle_ASTWalker.t3_return retval = new SymbolRiddle_ASTWalker.t3_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SymbolRiddle_ASTWalker.number_return number22 =null;



        try { dbg.enterRule(getGrammarFileName(), "t3");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(28, 0);

        try {
            // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_ASTWalker.g:28:4: ( number )
            dbg.enterAlt(1);

            // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_ASTWalker.g:28:6: number
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(28,6);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_number_in_t3174);
            number22=number();

            state._fsp--;

            adaptor.addChild(root_0, number22.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(28, 11);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "t3");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "t3"

    // Delegated rules


 

    public static final BitSet FOLLOW_symbolRiddle_in_prog55 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_problem_in_symbolRiddle66 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_problem_in_symbolRiddle68 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_problem_in_symbolRiddle70 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_problem_in_symbolRiddle72 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_problem_in_symbolRiddle74 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_problem_in_symbolRiddle76 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_number91 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LETTER_in_number93 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_EQL_in_problem105 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ADD_in_problem108 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_t1_in_problem110 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_t2_in_problem112 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_t3_in_problem115 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQL_in_problem123 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUB_in_problem126 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_t1_in_problem128 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_t2_in_problem130 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_t3_in_problem133 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_number_in_t1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_t2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_t3174 = new BitSet(new long[]{0x0000000000000002L});

}