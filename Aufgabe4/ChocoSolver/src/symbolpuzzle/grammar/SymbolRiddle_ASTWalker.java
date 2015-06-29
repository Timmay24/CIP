// $ANTLR 3.4 C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_ASTWalker.g 2015-06-29 22:28:38
package symbolpuzzle.grammar;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SymbolRiddle_ASTWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "EQL", "LETTER", "NEWLINE", "NUMBER", "PUZZLE", "SUB", "WS"
    };

    public static final int EOF=-1;
    public static final int ADD=4;
    public static final int EQL=5;
    public static final int LETTER=6;
    public static final int NEWLINE=7;
    public static final int NUMBER=8;
    public static final int PUZZLE=9;
    public static final int SUB=10;
    public static final int WS=11;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public SymbolRiddle_ASTWalker(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public SymbolRiddle_ASTWalker(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return SymbolRiddle_ASTWalker.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_ASTWalker.g"; }


    public static class prog_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_ASTWalker.g:13:1: prog : symbolRiddle ;
    public final SymbolRiddle_ASTWalker.prog_return prog() throws RecognitionException {
        SymbolRiddle_ASTWalker.prog_return retval = new SymbolRiddle_ASTWalker.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SymbolRiddle_ASTWalker.symbolRiddle_return symbolRiddle1 =null;



        try {
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_ASTWalker.g:13:6: ( symbolRiddle )
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_ASTWalker.g:13:11: symbolRiddle
            {
            root_0 = (CommonTree)adaptor.nil();


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
        return retval;
    }
    // $ANTLR end "prog"


    public static class symbolRiddle_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "symbolRiddle"
    // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_ASTWalker.g:17:1: symbolRiddle : problem problem problem problem problem problem ;
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



        try {
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_ASTWalker.g:18:2: ( problem problem problem problem problem problem )
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_ASTWalker.g:18:4: problem problem problem problem problem problem
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_problem_in_symbolRiddle66);
            problem2=problem();

            state._fsp--;

            adaptor.addChild(root_0, problem2.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_problem_in_symbolRiddle68);
            problem3=problem();

            state._fsp--;

            adaptor.addChild(root_0, problem3.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_problem_in_symbolRiddle70);
            problem4=problem();

            state._fsp--;

            adaptor.addChild(root_0, problem4.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_problem_in_symbolRiddle72);
            problem5=problem();

            state._fsp--;

            adaptor.addChild(root_0, problem5.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_problem_in_symbolRiddle74);
            problem6=problem();

            state._fsp--;

            adaptor.addChild(root_0, problem6.getTree());


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
        return retval;
    }
    // $ANTLR end "symbolRiddle"


    public static class problem_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "problem"
    // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_ASTWalker.g:21:1: problem : ( ^( EQL ^( ADD number number ) number ) | ^( EQL ^( SUB t1= number t2= number ) t3= number ) -> ^( EQL ^( ADD[\"+\"] $t2 $t3) $t1) );
    public final SymbolRiddle_ASTWalker.problem_return problem() throws RecognitionException {
        SymbolRiddle_ASTWalker.problem_return retval = new SymbolRiddle_ASTWalker.problem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EQL8=null;
        CommonTree ADD9=null;
        CommonTree EQL13=null;
        CommonTree SUB14=null;
        SymbolRiddle_ASTWalker.number_return t1 =null;

        SymbolRiddle_ASTWalker.number_return t2 =null;

        SymbolRiddle_ASTWalker.number_return t3 =null;

        SymbolRiddle_ASTWalker.number_return number10 =null;

        SymbolRiddle_ASTWalker.number_return number11 =null;

        SymbolRiddle_ASTWalker.number_return number12 =null;


        CommonTree EQL8_tree=null;
        CommonTree ADD9_tree=null;
        CommonTree EQL13_tree=null;
        CommonTree SUB14_tree=null;
        RewriteRuleNodeStream stream_EQL=new RewriteRuleNodeStream(adaptor,"token EQL");
        RewriteRuleNodeStream stream_SUB=new RewriteRuleNodeStream(adaptor,"token SUB");
        RewriteRuleSubtreeStream stream_number=new RewriteRuleSubtreeStream(adaptor,"rule number");
        try {
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_ASTWalker.g:22:2: ( ^( EQL ^( ADD number number ) number ) | ^( EQL ^( SUB t1= number t2= number ) t3= number ) -> ^( EQL ^( ADD[\"+\"] $t2 $t3) $t1) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==EQL) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==DOWN) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==ADD) ) {
                        alt1=1;
                    }
                    else if ( (LA1_2==SUB) ) {
                        alt1=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_ASTWalker.g:22:4: ^( EQL ^( ADD number number ) number )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EQL8=(CommonTree)match(input,EQL,FOLLOW_EQL_in_problem92); 
                    EQL8_tree = (CommonTree)adaptor.dupNode(EQL8);


                    root_1 = (CommonTree)adaptor.becomeRoot(EQL8_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ADD9=(CommonTree)match(input,ADD,FOLLOW_ADD_in_problem95); 
                    ADD9_tree = (CommonTree)adaptor.dupNode(ADD9);


                    root_2 = (CommonTree)adaptor.becomeRoot(ADD9_tree, root_2);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_number_in_problem97);
                    number10=number();

                    state._fsp--;

                    adaptor.addChild(root_2, number10.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_number_in_problem99);
                    number11=number();

                    state._fsp--;

                    adaptor.addChild(root_2, number11.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_number_in_problem102);
                    number12=number();

                    state._fsp--;

                    adaptor.addChild(root_1, number12.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_ASTWalker.g:23:3: ^( EQL ^( SUB t1= number t2= number ) t3= number )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EQL13=(CommonTree)match(input,EQL,FOLLOW_EQL_in_problem110);  
                    stream_EQL.add(EQL13);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SUB14=(CommonTree)match(input,SUB,FOLLOW_SUB_in_problem113);  
                    stream_SUB.add(SUB14);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_number_in_problem118);
                    t1=number();

                    state._fsp--;

                    stream_number.add(t1.getTree());

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_number_in_problem122);
                    t2=number();

                    state._fsp--;

                    stream_number.add(t2.getTree());

                    match(input, Token.UP, null); 
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_number_in_problem127);
                    t3=number();

                    state._fsp--;

                    stream_number.add(t3.getTree());

                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    // AST REWRITE
                    // elements: EQL, t2, t1, t3
                    // token labels: 
                    // rule labels: t1, t2, retval, t3
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_t1=new RewriteRuleSubtreeStream(adaptor,"rule t1",t1!=null?t1.tree:null);
                    RewriteRuleSubtreeStream stream_t2=new RewriteRuleSubtreeStream(adaptor,"rule t2",t2!=null?t2.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_t3=new RewriteRuleSubtreeStream(adaptor,"rule t3",t3!=null?t3.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 23:48: -> ^( EQL ^( ADD[\"+\"] $t2 $t3) $t1)
                    {
                        // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_ASTWalker.g:23:51: ^( EQL ^( ADD[\"+\"] $t2 $t3) $t1)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_EQL.nextNode()
                        , root_1);

                        // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_ASTWalker.g:23:57: ^( ADD[\"+\"] $t2 $t3)
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ADD, "+")
                        , root_2);

                        adaptor.addChild(root_2, stream_t2.nextTree());

                        adaptor.addChild(root_2, stream_t3.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

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
        return retval;
    }
    // $ANTLR end "problem"


    public static class number_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "number"
    // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_ASTWalker.g:25:1: number : ^( NUMBER ( LETTER )+ ) ;
    public final SymbolRiddle_ASTWalker.number_return number() throws RecognitionException {
        SymbolRiddle_ASTWalker.number_return retval = new SymbolRiddle_ASTWalker.number_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree NUMBER15=null;
        CommonTree LETTER16=null;

        CommonTree NUMBER15_tree=null;
        CommonTree LETTER16_tree=null;

        try {
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_ASTWalker.g:26:2: ( ^( NUMBER ( LETTER )+ ) )
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_ASTWalker.g:26:4: ^( NUMBER ( LETTER )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            NUMBER15=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_number159); 
            NUMBER15_tree = (CommonTree)adaptor.dupNode(NUMBER15);


            root_1 = (CommonTree)adaptor.becomeRoot(NUMBER15_tree, root_1);


            match(input, Token.DOWN, null); 
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_ASTWalker.g:26:13: ( LETTER )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==LETTER) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_ASTWalker.g:26:13: LETTER
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    LETTER16=(CommonTree)match(input,LETTER,FOLLOW_LETTER_in_number161); 
            	    LETTER16_tree = (CommonTree)adaptor.dupNode(LETTER16);


            	    adaptor.addChild(root_1, LETTER16_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


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
        return retval;
    }
    // $ANTLR end "number"

    // Delegated rules


 

    public static final BitSet FOLLOW_symbolRiddle_in_prog55 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_problem_in_symbolRiddle66 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_problem_in_symbolRiddle68 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_problem_in_symbolRiddle70 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_problem_in_symbolRiddle72 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_problem_in_symbolRiddle74 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_problem_in_symbolRiddle76 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQL_in_problem92 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ADD_in_problem95 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_number_in_problem97 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_number_in_problem99 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_number_in_problem102 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQL_in_problem110 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUB_in_problem113 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_number_in_problem118 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_number_in_problem122 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_number_in_problem127 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NUMBER_in_number159 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LETTER_in_number161 = new BitSet(new long[]{0x0000000000000048L});

}