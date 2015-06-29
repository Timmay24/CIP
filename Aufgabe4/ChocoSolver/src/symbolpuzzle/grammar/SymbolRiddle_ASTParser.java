// $ANTLR 3.4 C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g 2015-06-28 19:06:32
package symbolpuzzle.grammar;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SymbolRiddle_ASTParser extends Parser {
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public SymbolRiddle_ASTParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public SymbolRiddle_ASTParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return SymbolRiddle_ASTParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:19:1: prog : symbolRiddle ;
    public final SymbolRiddle_ASTParser.prog_return prog() throws RecognitionException {
        SymbolRiddle_ASTParser.prog_return retval = new SymbolRiddle_ASTParser.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SymbolRiddle_ASTParser.symbolRiddle_return symbolRiddle1 =null;



        try {
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:19:5: ( symbolRiddle )
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:19:9: symbolRiddle
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_symbolRiddle_in_prog68);
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
        return retval;
    }
    // $ANTLR end "prog"


    public static class symbolRiddle_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "symbolRiddle"
    // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:23:1: symbolRiddle : L1= number AS1= operator L2= number EQL L3= number NEWLINE AS2= operator AS3= operator AS4= operator NEWLINE L4= number AS5= operator L5= number EQL L6= number NEWLINE EQL EQL EQL NEWLINE L7= number AS6= operator L8= number EQL L9= number -> ^( EQL ^( $AS1 $L1 $L2) $L3) ^( EQL ^( $AS5 $L4 $L5) $L6) ^( EQL ^( $AS6 $L7 $L8) $L9) ^( EQL ^( $AS2 $L1 $L4) $L7) ^( EQL ^( $AS3 $L2 $L5) $L8) ^( EQL ^( $AS4 $L3 $L6) $L9) ;
    public final SymbolRiddle_ASTParser.symbolRiddle_return symbolRiddle() throws RecognitionException {
        SymbolRiddle_ASTParser.symbolRiddle_return retval = new SymbolRiddle_ASTParser.symbolRiddle_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQL2=null;
        Token NEWLINE3=null;
        Token NEWLINE4=null;
        Token EQL5=null;
        Token NEWLINE6=null;
        Token EQL7=null;
        Token EQL8=null;
        Token EQL9=null;
        Token NEWLINE10=null;
        Token EQL11=null;
        SymbolRiddle_ASTParser.number_return L1 =null;

        SymbolRiddle_ASTParser.operator_return AS1 =null;

        SymbolRiddle_ASTParser.number_return L2 =null;

        SymbolRiddle_ASTParser.number_return L3 =null;

        SymbolRiddle_ASTParser.operator_return AS2 =null;

        SymbolRiddle_ASTParser.operator_return AS3 =null;

        SymbolRiddle_ASTParser.operator_return AS4 =null;

        SymbolRiddle_ASTParser.number_return L4 =null;

        SymbolRiddle_ASTParser.operator_return AS5 =null;

        SymbolRiddle_ASTParser.number_return L5 =null;

        SymbolRiddle_ASTParser.number_return L6 =null;

        SymbolRiddle_ASTParser.number_return L7 =null;

        SymbolRiddle_ASTParser.operator_return AS6 =null;

        SymbolRiddle_ASTParser.number_return L8 =null;

        SymbolRiddle_ASTParser.number_return L9 =null;


        CommonTree EQL2_tree=null;
        CommonTree NEWLINE3_tree=null;
        CommonTree NEWLINE4_tree=null;
        CommonTree EQL5_tree=null;
        CommonTree NEWLINE6_tree=null;
        CommonTree EQL7_tree=null;
        CommonTree EQL8_tree=null;
        CommonTree EQL9_tree=null;
        CommonTree NEWLINE10_tree=null;
        CommonTree EQL11_tree=null;
        RewriteRuleTokenStream stream_EQL=new RewriteRuleTokenStream(adaptor,"token EQL");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleSubtreeStream stream_number=new RewriteRuleSubtreeStream(adaptor,"rule number");
        RewriteRuleSubtreeStream stream_operator=new RewriteRuleSubtreeStream(adaptor,"rule operator");
        try {
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:24:2: (L1= number AS1= operator L2= number EQL L3= number NEWLINE AS2= operator AS3= operator AS4= operator NEWLINE L4= number AS5= operator L5= number EQL L6= number NEWLINE EQL EQL EQL NEWLINE L7= number AS6= operator L8= number EQL L9= number -> ^( EQL ^( $AS1 $L1 $L2) $L3) ^( EQL ^( $AS5 $L4 $L5) $L6) ^( EQL ^( $AS6 $L7 $L8) $L9) ^( EQL ^( $AS2 $L1 $L4) $L7) ^( EQL ^( $AS3 $L2 $L5) $L8) ^( EQL ^( $AS4 $L3 $L6) $L9) )
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:24:4: L1= number AS1= operator L2= number EQL L3= number NEWLINE AS2= operator AS3= operator AS4= operator NEWLINE L4= number AS5= operator L5= number EQL L6= number NEWLINE EQL EQL EQL NEWLINE L7= number AS6= operator L8= number EQL L9= number
            {
            pushFollow(FOLLOW_number_in_symbolRiddle81);
            L1=number();

            state._fsp--;

            stream_number.add(L1.getTree());

            pushFollow(FOLLOW_operator_in_symbolRiddle86);
            AS1=operator();

            state._fsp--;

            stream_operator.add(AS1.getTree());

            pushFollow(FOLLOW_number_in_symbolRiddle90);
            L2=number();

            state._fsp--;

            stream_number.add(L2.getTree());

            EQL2=(Token)match(input,EQL,FOLLOW_EQL_in_symbolRiddle93);  
            stream_EQL.add(EQL2);


            pushFollow(FOLLOW_number_in_symbolRiddle97);
            L3=number();

            state._fsp--;

            stream_number.add(L3.getTree());

            NEWLINE3=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_symbolRiddle99);  
            stream_NEWLINE.add(NEWLINE3);


            pushFollow(FOLLOW_operator_in_symbolRiddle105);
            AS2=operator();

            state._fsp--;

            stream_operator.add(AS2.getTree());

            pushFollow(FOLLOW_operator_in_symbolRiddle116);
            AS3=operator();

            state._fsp--;

            stream_operator.add(AS3.getTree());

            pushFollow(FOLLOW_operator_in_symbolRiddle123);
            AS4=operator();

            state._fsp--;

            stream_operator.add(AS4.getTree());

            NEWLINE4=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_symbolRiddle125);  
            stream_NEWLINE.add(NEWLINE4);


            pushFollow(FOLLOW_number_in_symbolRiddle131);
            L4=number();

            state._fsp--;

            stream_number.add(L4.getTree());

            pushFollow(FOLLOW_operator_in_symbolRiddle136);
            AS5=operator();

            state._fsp--;

            stream_operator.add(AS5.getTree());

            pushFollow(FOLLOW_number_in_symbolRiddle140);
            L5=number();

            state._fsp--;

            stream_number.add(L5.getTree());

            EQL5=(Token)match(input,EQL,FOLLOW_EQL_in_symbolRiddle143);  
            stream_EQL.add(EQL5);


            pushFollow(FOLLOW_number_in_symbolRiddle147);
            L6=number();

            state._fsp--;

            stream_number.add(L6.getTree());

            NEWLINE6=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_symbolRiddle149);  
            stream_NEWLINE.add(NEWLINE6);


            EQL7=(Token)match(input,EQL,FOLLOW_EQL_in_symbolRiddle158);  
            stream_EQL.add(EQL7);


            EQL8=(Token)match(input,EQL,FOLLOW_EQL_in_symbolRiddle177);  
            stream_EQL.add(EQL8);


            EQL9=(Token)match(input,EQL,FOLLOW_EQL_in_symbolRiddle190);  
            stream_EQL.add(EQL9);


            NEWLINE10=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_symbolRiddle194);  
            stream_NEWLINE.add(NEWLINE10);


            pushFollow(FOLLOW_number_in_symbolRiddle200);
            L7=number();

            state._fsp--;

            stream_number.add(L7.getTree());

            pushFollow(FOLLOW_operator_in_symbolRiddle204);
            AS6=operator();

            state._fsp--;

            stream_operator.add(AS6.getTree());

            pushFollow(FOLLOW_number_in_symbolRiddle208);
            L8=number();

            state._fsp--;

            stream_number.add(L8.getTree());

            EQL11=(Token)match(input,EQL,FOLLOW_EQL_in_symbolRiddle210);  
            stream_EQL.add(EQL11);


            pushFollow(FOLLOW_number_in_symbolRiddle214);
            L9=number();

            state._fsp--;

            stream_number.add(L9.getTree());

            // AST REWRITE
            // elements: L7, L1, EQL, L1, EQL, L3, L3, AS3, L9, AS6, L2, L4, AS4, L8, L9, L7, EQL, L4, AS5, L6, L5, AS1, EQL, EQL, L2, L5, EQL, L6, AS2, L8
            // token labels: 
            // rule labels: AS2, AS3, AS4, AS5, AS6, L1, L2, L3, L4, L5, L6, L7, L8, L9, retval, AS1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_AS2=new RewriteRuleSubtreeStream(adaptor,"rule AS2",AS2!=null?AS2.tree:null);
            RewriteRuleSubtreeStream stream_AS3=new RewriteRuleSubtreeStream(adaptor,"rule AS3",AS3!=null?AS3.tree:null);
            RewriteRuleSubtreeStream stream_AS4=new RewriteRuleSubtreeStream(adaptor,"rule AS4",AS4!=null?AS4.tree:null);
            RewriteRuleSubtreeStream stream_AS5=new RewriteRuleSubtreeStream(adaptor,"rule AS5",AS5!=null?AS5.tree:null);
            RewriteRuleSubtreeStream stream_AS6=new RewriteRuleSubtreeStream(adaptor,"rule AS6",AS6!=null?AS6.tree:null);
            RewriteRuleSubtreeStream stream_L1=new RewriteRuleSubtreeStream(adaptor,"rule L1",L1!=null?L1.tree:null);
            RewriteRuleSubtreeStream stream_L2=new RewriteRuleSubtreeStream(adaptor,"rule L2",L2!=null?L2.tree:null);
            RewriteRuleSubtreeStream stream_L3=new RewriteRuleSubtreeStream(adaptor,"rule L3",L3!=null?L3.tree:null);
            RewriteRuleSubtreeStream stream_L4=new RewriteRuleSubtreeStream(adaptor,"rule L4",L4!=null?L4.tree:null);
            RewriteRuleSubtreeStream stream_L5=new RewriteRuleSubtreeStream(adaptor,"rule L5",L5!=null?L5.tree:null);
            RewriteRuleSubtreeStream stream_L6=new RewriteRuleSubtreeStream(adaptor,"rule L6",L6!=null?L6.tree:null);
            RewriteRuleSubtreeStream stream_L7=new RewriteRuleSubtreeStream(adaptor,"rule L7",L7!=null?L7.tree:null);
            RewriteRuleSubtreeStream stream_L8=new RewriteRuleSubtreeStream(adaptor,"rule L8",L8!=null?L8.tree:null);
            RewriteRuleSubtreeStream stream_L9=new RewriteRuleSubtreeStream(adaptor,"rule L9",L9!=null?L9.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_AS1=new RewriteRuleSubtreeStream(adaptor,"rule AS1",AS1!=null?AS1.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 29:3: -> ^( EQL ^( $AS1 $L1 $L2) $L3) ^( EQL ^( $AS5 $L4 $L5) $L6) ^( EQL ^( $AS6 $L7 $L8) $L9) ^( EQL ^( $AS2 $L1 $L4) $L7) ^( EQL ^( $AS3 $L2 $L5) $L8) ^( EQL ^( $AS4 $L3 $L6) $L9)
            {
                // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:29:6: ^( EQL ^( $AS1 $L1 $L2) $L3)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQL.nextNode()
                , root_1);

                // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:29:12: ^( $AS1 $L1 $L2)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_AS1.nextNode(), root_2);

                adaptor.addChild(root_2, stream_L1.nextTree());

                adaptor.addChild(root_2, stream_L2.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_L3.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:30:6: ^( EQL ^( $AS5 $L4 $L5) $L6)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQL.nextNode()
                , root_1);

                // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:30:12: ^( $AS5 $L4 $L5)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_AS5.nextNode(), root_2);

                adaptor.addChild(root_2, stream_L4.nextTree());

                adaptor.addChild(root_2, stream_L5.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_L6.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:31:6: ^( EQL ^( $AS6 $L7 $L8) $L9)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQL.nextNode()
                , root_1);

                // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:31:12: ^( $AS6 $L7 $L8)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_AS6.nextNode(), root_2);

                adaptor.addChild(root_2, stream_L7.nextTree());

                adaptor.addChild(root_2, stream_L8.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_L9.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:32:6: ^( EQL ^( $AS2 $L1 $L4) $L7)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQL.nextNode()
                , root_1);

                // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:32:12: ^( $AS2 $L1 $L4)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_AS2.nextNode(), root_2);

                adaptor.addChild(root_2, stream_L1.nextTree());

                adaptor.addChild(root_2, stream_L4.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_L7.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:33:6: ^( EQL ^( $AS3 $L2 $L5) $L8)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQL.nextNode()
                , root_1);

                // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:33:12: ^( $AS3 $L2 $L5)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_AS3.nextNode(), root_2);

                adaptor.addChild(root_2, stream_L2.nextTree());

                adaptor.addChild(root_2, stream_L5.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_L8.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:34:6: ^( EQL ^( $AS4 $L3 $L6) $L9)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQL.nextNode()
                , root_1);

                // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:34:12: ^( $AS4 $L3 $L6)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_AS4.nextNode(), root_2);

                adaptor.addChild(root_2, stream_L3.nextTree());

                adaptor.addChild(root_2, stream_L6.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_L9.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

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
        return retval;
    }
    // $ANTLR end "symbolRiddle"


    public static class number_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "number"
    // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:36:1: number : ( LETTER )+ -> ^( NUMBER ( LETTER )+ ) ;
    public final SymbolRiddle_ASTParser.number_return number() throws RecognitionException {
        SymbolRiddle_ASTParser.number_return retval = new SymbolRiddle_ASTParser.number_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LETTER12=null;

        CommonTree LETTER12_tree=null;
        RewriteRuleTokenStream stream_LETTER=new RewriteRuleTokenStream(adaptor,"token LETTER");

        try {
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:36:7: ( ( LETTER )+ -> ^( NUMBER ( LETTER )+ ) )
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:36:9: ( LETTER )+
            {
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:36:9: ( LETTER )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==LETTER) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:36:9: LETTER
            	    {
            	    LETTER12=(Token)match(input,LETTER,FOLLOW_LETTER_in_number364);  
            	    stream_LETTER.add(LETTER12);


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            // AST REWRITE
            // elements: LETTER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 37:2: -> ^( NUMBER ( LETTER )+ )
            {
                // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:37:5: ^( NUMBER ( LETTER )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(NUMBER, "NUMBER")
                , root_1);

                if ( !(stream_LETTER.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_LETTER.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_LETTER.nextNode()
                    );

                }
                stream_LETTER.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

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
        return retval;
    }
    // $ANTLR end "number"


    public static class operator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "operator"
    // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:39:1: operator : ( ADD | SUB );
    public final SymbolRiddle_ASTParser.operator_return operator() throws RecognitionException {
        SymbolRiddle_ASTParser.operator_return retval = new SymbolRiddle_ASTParser.operator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set13=null;

        CommonTree set13_tree=null;

        try {
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:39:9: ( ADD | SUB )
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set13=(Token)input.LT(1);

            if ( input.LA(1)==ADD||input.LA(1)==SUB ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set13)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
        return retval;
    }
    // $ANTLR end "operator"

    // Delegated rules


 

    public static final BitSet FOLLOW_symbolRiddle_in_prog68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_symbolRiddle81 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_operator_in_symbolRiddle86 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_number_in_symbolRiddle90 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQL_in_symbolRiddle93 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_number_in_symbolRiddle97 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NEWLINE_in_symbolRiddle99 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_operator_in_symbolRiddle105 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_operator_in_symbolRiddle116 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_operator_in_symbolRiddle123 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NEWLINE_in_symbolRiddle125 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_number_in_symbolRiddle131 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_operator_in_symbolRiddle136 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_number_in_symbolRiddle140 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQL_in_symbolRiddle143 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_number_in_symbolRiddle147 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NEWLINE_in_symbolRiddle149 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQL_in_symbolRiddle158 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQL_in_symbolRiddle177 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQL_in_symbolRiddle190 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NEWLINE_in_symbolRiddle194 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_number_in_symbolRiddle200 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_operator_in_symbolRiddle204 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_number_in_symbolRiddle208 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQL_in_symbolRiddle210 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_number_in_symbolRiddle214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_number364 = new BitSet(new long[]{0x0000000000000042L});

}