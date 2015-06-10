// $ANTLR 3.4 C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g 2015-06-10 14:56:17
package symbolriddle_ast.grammar;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SymbolRiddle_ASTParser extends Parser {
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
    public String getGrammarFileName() { return "C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:18:1: prog : symbolRiddle ;
    public final SymbolRiddle_ASTParser.prog_return prog() throws RecognitionException {
        SymbolRiddle_ASTParser.prog_return retval = new SymbolRiddle_ASTParser.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SymbolRiddle_ASTParser.symbolRiddle_return symbolRiddle1 =null;



        try {
            // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:18:5: ( symbolRiddle )
            // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:18:9: symbolRiddle
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_symbolRiddle_in_prog62);
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
    // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:22:1: symbolRiddle : L1= number AS1= operator L2= number EQL L3= number NEWLINE AS2= operator AS3= operator AS4= operator NEWLINE L4= number AS5= operator L5= number EQL L6= number NEWLINE EQL EQL EQL NEWLINE L7= number AS6= operator L8= number EQL L9= number -> ^( EQL ^( $AS1 ^( NUMBER $L1) ^( NUMBER $L2) ) ^( NUMBER $L3) ) ^( EQL ^( $AS5 ^( NUMBER $L4) ^( NUMBER $L5) ) ^( NUMBER $L6) ) ^( EQL ^( $AS6 ^( NUMBER $L7) ^( NUMBER $L8) ) ^( NUMBER $L9) ) ^( EQL ^( $AS2 ^( NUMBER $L1) ^( NUMBER $L4) ) ^( NUMBER $L7) ) ^( EQL ^( $AS3 ^( NUMBER $L2) ^( NUMBER $L5) ) ^( NUMBER $L8) ) ^( EQL ^( $AS4 ^( NUMBER $L3) ^( NUMBER $L6) ) ^( NUMBER $L9) ) ;
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
            // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:23:2: (L1= number AS1= operator L2= number EQL L3= number NEWLINE AS2= operator AS3= operator AS4= operator NEWLINE L4= number AS5= operator L5= number EQL L6= number NEWLINE EQL EQL EQL NEWLINE L7= number AS6= operator L8= number EQL L9= number -> ^( EQL ^( $AS1 ^( NUMBER $L1) ^( NUMBER $L2) ) ^( NUMBER $L3) ) ^( EQL ^( $AS5 ^( NUMBER $L4) ^( NUMBER $L5) ) ^( NUMBER $L6) ) ^( EQL ^( $AS6 ^( NUMBER $L7) ^( NUMBER $L8) ) ^( NUMBER $L9) ) ^( EQL ^( $AS2 ^( NUMBER $L1) ^( NUMBER $L4) ) ^( NUMBER $L7) ) ^( EQL ^( $AS3 ^( NUMBER $L2) ^( NUMBER $L5) ) ^( NUMBER $L8) ) ^( EQL ^( $AS4 ^( NUMBER $L3) ^( NUMBER $L6) ) ^( NUMBER $L9) ) )
            // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:23:4: L1= number AS1= operator L2= number EQL L3= number NEWLINE AS2= operator AS3= operator AS4= operator NEWLINE L4= number AS5= operator L5= number EQL L6= number NEWLINE EQL EQL EQL NEWLINE L7= number AS6= operator L8= number EQL L9= number
            {
            pushFollow(FOLLOW_number_in_symbolRiddle75);
            L1=number();

            state._fsp--;

            stream_number.add(L1.getTree());

            pushFollow(FOLLOW_operator_in_symbolRiddle80);
            AS1=operator();

            state._fsp--;

            stream_operator.add(AS1.getTree());

            pushFollow(FOLLOW_number_in_symbolRiddle84);
            L2=number();

            state._fsp--;

            stream_number.add(L2.getTree());

            EQL2=(Token)match(input,EQL,FOLLOW_EQL_in_symbolRiddle87);  
            stream_EQL.add(EQL2);


            pushFollow(FOLLOW_number_in_symbolRiddle91);
            L3=number();

            state._fsp--;

            stream_number.add(L3.getTree());

            NEWLINE3=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_symbolRiddle93);  
            stream_NEWLINE.add(NEWLINE3);


            pushFollow(FOLLOW_operator_in_symbolRiddle99);
            AS2=operator();

            state._fsp--;

            stream_operator.add(AS2.getTree());

            pushFollow(FOLLOW_operator_in_symbolRiddle110);
            AS3=operator();

            state._fsp--;

            stream_operator.add(AS3.getTree());

            pushFollow(FOLLOW_operator_in_symbolRiddle117);
            AS4=operator();

            state._fsp--;

            stream_operator.add(AS4.getTree());

            NEWLINE4=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_symbolRiddle119);  
            stream_NEWLINE.add(NEWLINE4);


            pushFollow(FOLLOW_number_in_symbolRiddle125);
            L4=number();

            state._fsp--;

            stream_number.add(L4.getTree());

            pushFollow(FOLLOW_operator_in_symbolRiddle130);
            AS5=operator();

            state._fsp--;

            stream_operator.add(AS5.getTree());

            pushFollow(FOLLOW_number_in_symbolRiddle134);
            L5=number();

            state._fsp--;

            stream_number.add(L5.getTree());

            EQL5=(Token)match(input,EQL,FOLLOW_EQL_in_symbolRiddle137);  
            stream_EQL.add(EQL5);


            pushFollow(FOLLOW_number_in_symbolRiddle141);
            L6=number();

            state._fsp--;

            stream_number.add(L6.getTree());

            NEWLINE6=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_symbolRiddle143);  
            stream_NEWLINE.add(NEWLINE6);


            EQL7=(Token)match(input,EQL,FOLLOW_EQL_in_symbolRiddle152);  
            stream_EQL.add(EQL7);


            EQL8=(Token)match(input,EQL,FOLLOW_EQL_in_symbolRiddle171);  
            stream_EQL.add(EQL8);


            EQL9=(Token)match(input,EQL,FOLLOW_EQL_in_symbolRiddle184);  
            stream_EQL.add(EQL9);


            NEWLINE10=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_symbolRiddle188);  
            stream_NEWLINE.add(NEWLINE10);


            pushFollow(FOLLOW_number_in_symbolRiddle194);
            L7=number();

            state._fsp--;

            stream_number.add(L7.getTree());

            pushFollow(FOLLOW_operator_in_symbolRiddle198);
            AS6=operator();

            state._fsp--;

            stream_operator.add(AS6.getTree());

            pushFollow(FOLLOW_number_in_symbolRiddle202);
            L8=number();

            state._fsp--;

            stream_number.add(L8.getTree());

            EQL11=(Token)match(input,EQL,FOLLOW_EQL_in_symbolRiddle204);  
            stream_EQL.add(EQL11);


            pushFollow(FOLLOW_number_in_symbolRiddle208);
            L9=number();

            state._fsp--;

            stream_number.add(L9.getTree());

            // AST REWRITE
            // elements: L3, L9, L1, EQL, L2, L9, L6, EQL, AS1, EQL, L4, EQL, L7, L2, EQL, L8, L7, L5, L5, L8, AS2, L3, L6, AS6, EQL, AS4, AS5, L4, L1, AS3
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
            // 28:3: -> ^( EQL ^( $AS1 ^( NUMBER $L1) ^( NUMBER $L2) ) ^( NUMBER $L3) ) ^( EQL ^( $AS5 ^( NUMBER $L4) ^( NUMBER $L5) ) ^( NUMBER $L6) ) ^( EQL ^( $AS6 ^( NUMBER $L7) ^( NUMBER $L8) ) ^( NUMBER $L9) ) ^( EQL ^( $AS2 ^( NUMBER $L1) ^( NUMBER $L4) ) ^( NUMBER $L7) ) ^( EQL ^( $AS3 ^( NUMBER $L2) ^( NUMBER $L5) ) ^( NUMBER $L8) ) ^( EQL ^( $AS4 ^( NUMBER $L3) ^( NUMBER $L6) ) ^( NUMBER $L9) )
            {
                // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:28:6: ^( EQL ^( $AS1 ^( NUMBER $L1) ^( NUMBER $L2) ) ^( NUMBER $L3) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQL.nextNode()
                , root_1);

                // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:28:12: ^( $AS1 ^( NUMBER $L1) ^( NUMBER $L2) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_AS1.nextNode(), root_2);

                // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:28:19: ^( NUMBER $L1)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(NUMBER, "NUMBER")
                , root_3);

                adaptor.addChild(root_3, stream_L1.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:28:33: ^( NUMBER $L2)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(NUMBER, "NUMBER")
                , root_3);

                adaptor.addChild(root_3, stream_L2.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_1, root_2);
                }

                // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:28:48: ^( NUMBER $L3)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(NUMBER, "NUMBER")
                , root_2);

                adaptor.addChild(root_2, stream_L3.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:29:6: ^( EQL ^( $AS5 ^( NUMBER $L4) ^( NUMBER $L5) ) ^( NUMBER $L6) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQL.nextNode()
                , root_1);

                // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:29:12: ^( $AS5 ^( NUMBER $L4) ^( NUMBER $L5) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_AS5.nextNode(), root_2);

                // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:29:19: ^( NUMBER $L4)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(NUMBER, "NUMBER")
                , root_3);

                adaptor.addChild(root_3, stream_L4.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:29:33: ^( NUMBER $L5)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(NUMBER, "NUMBER")
                , root_3);

                adaptor.addChild(root_3, stream_L5.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_1, root_2);
                }

                // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:29:48: ^( NUMBER $L6)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(NUMBER, "NUMBER")
                , root_2);

                adaptor.addChild(root_2, stream_L6.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:30:6: ^( EQL ^( $AS6 ^( NUMBER $L7) ^( NUMBER $L8) ) ^( NUMBER $L9) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQL.nextNode()
                , root_1);

                // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:30:12: ^( $AS6 ^( NUMBER $L7) ^( NUMBER $L8) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_AS6.nextNode(), root_2);

                // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:30:19: ^( NUMBER $L7)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(NUMBER, "NUMBER")
                , root_3);

                adaptor.addChild(root_3, stream_L7.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:30:33: ^( NUMBER $L8)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(NUMBER, "NUMBER")
                , root_3);

                adaptor.addChild(root_3, stream_L8.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_1, root_2);
                }

                // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:30:48: ^( NUMBER $L9)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(NUMBER, "NUMBER")
                , root_2);

                adaptor.addChild(root_2, stream_L9.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:31:6: ^( EQL ^( $AS2 ^( NUMBER $L1) ^( NUMBER $L4) ) ^( NUMBER $L7) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQL.nextNode()
                , root_1);

                // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:31:12: ^( $AS2 ^( NUMBER $L1) ^( NUMBER $L4) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_AS2.nextNode(), root_2);

                // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:31:19: ^( NUMBER $L1)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(NUMBER, "NUMBER")
                , root_3);

                adaptor.addChild(root_3, stream_L1.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:31:33: ^( NUMBER $L4)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(NUMBER, "NUMBER")
                , root_3);

                adaptor.addChild(root_3, stream_L4.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_1, root_2);
                }

                // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:31:48: ^( NUMBER $L7)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(NUMBER, "NUMBER")
                , root_2);

                adaptor.addChild(root_2, stream_L7.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:32:6: ^( EQL ^( $AS3 ^( NUMBER $L2) ^( NUMBER $L5) ) ^( NUMBER $L8) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQL.nextNode()
                , root_1);

                // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:32:12: ^( $AS3 ^( NUMBER $L2) ^( NUMBER $L5) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_AS3.nextNode(), root_2);

                // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:32:19: ^( NUMBER $L2)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(NUMBER, "NUMBER")
                , root_3);

                adaptor.addChild(root_3, stream_L2.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:32:33: ^( NUMBER $L5)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(NUMBER, "NUMBER")
                , root_3);

                adaptor.addChild(root_3, stream_L5.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_1, root_2);
                }

                // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:32:48: ^( NUMBER $L8)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(NUMBER, "NUMBER")
                , root_2);

                adaptor.addChild(root_2, stream_L8.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

                // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:33:6: ^( EQL ^( $AS4 ^( NUMBER $L3) ^( NUMBER $L6) ) ^( NUMBER $L9) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQL.nextNode()
                , root_1);

                // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:33:12: ^( $AS4 ^( NUMBER $L3) ^( NUMBER $L6) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_AS4.nextNode(), root_2);

                // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:33:19: ^( NUMBER $L3)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(NUMBER, "NUMBER")
                , root_3);

                adaptor.addChild(root_3, stream_L3.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:33:33: ^( NUMBER $L6)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(NUMBER, "NUMBER")
                , root_3);

                adaptor.addChild(root_3, stream_L6.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_1, root_2);
                }

                // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:33:48: ^( NUMBER $L9)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(NUMBER, "NUMBER")
                , root_2);

                adaptor.addChild(root_2, stream_L9.nextTree());

                adaptor.addChild(root_1, root_2);
                }

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
    // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:35:1: number : ( LETTER )+ ;
    public final SymbolRiddle_ASTParser.number_return number() throws RecognitionException {
        SymbolRiddle_ASTParser.number_return retval = new SymbolRiddle_ASTParser.number_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LETTER12=null;

        CommonTree LETTER12_tree=null;

        try {
            // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:35:7: ( ( LETTER )+ )
            // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:35:9: ( LETTER )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:35:9: ( LETTER )+
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
            	    // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:35:9: LETTER
            	    {
            	    LETTER12=(Token)match(input,LETTER,FOLLOW_LETTER_in_number430); 
            	    LETTER12_tree = 
            	    (CommonTree)adaptor.create(LETTER12)
            	    ;
            	    adaptor.addChild(root_0, LETTER12_tree);


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
    // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:36:1: operator : ( ADD | SUB );
    public final SymbolRiddle_ASTParser.operator_return operator() throws RecognitionException {
        SymbolRiddle_ASTParser.operator_return retval = new SymbolRiddle_ASTParser.operator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set13=null;

        CommonTree set13_tree=null;

        try {
            // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:36:9: ( ADD | SUB )
            // C:\\Projects\\CIP\\Aufgabe3\\SymbolRiddle_AST.g:
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


 

    public static final BitSet FOLLOW_symbolRiddle_in_prog62 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_symbolRiddle75 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_operator_in_symbolRiddle80 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_number_in_symbolRiddle84 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQL_in_symbolRiddle87 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_number_in_symbolRiddle91 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NEWLINE_in_symbolRiddle93 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_operator_in_symbolRiddle99 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_operator_in_symbolRiddle110 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_operator_in_symbolRiddle117 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NEWLINE_in_symbolRiddle119 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_number_in_symbolRiddle125 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_operator_in_symbolRiddle130 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_number_in_symbolRiddle134 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQL_in_symbolRiddle137 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_number_in_symbolRiddle141 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NEWLINE_in_symbolRiddle143 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQL_in_symbolRiddle152 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQL_in_symbolRiddle171 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQL_in_symbolRiddle184 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NEWLINE_in_symbolRiddle188 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_number_in_symbolRiddle194 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_operator_in_symbolRiddle198 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_number_in_symbolRiddle202 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQL_in_symbolRiddle204 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_number_in_symbolRiddle208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_number430 = new BitSet(new long[]{0x0000000000000042L});

}