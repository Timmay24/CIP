// $ANTLR 3.4 C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g 2015-06-28 19:06:32
package symbolpuzzle.grammar;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SymbolRiddle_ASTLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public SymbolRiddle_ASTLexer() {} 
    public SymbolRiddle_ASTLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SymbolRiddle_ASTLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g"; }

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:41:5: ( ( ' ' | '\\t' ) )
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:41:9: ( ' ' | '\\t' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            int _type = LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:47:8: ( ( 'A' .. 'Z' ) )
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "ADD"
    public final void mADD() throws RecognitionException {
        try {
            int _type = ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:48:5: ( '+' )
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:48:7: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ADD"

    // $ANTLR start "SUB"
    public final void mSUB() throws RecognitionException {
        try {
            int _type = SUB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:49:5: ( '-' )
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:49:7: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SUB"

    // $ANTLR start "EQL"
    public final void mEQL() throws RecognitionException {
        try {
            int _type = EQL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:50:5: ( '=' )
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:50:7: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQL"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:51:8: ( ( '\\r' )? '\\n' )
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:51:10: ( '\\r' )? '\\n'
            {
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:51:10: ( '\\r' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:51:10: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:1:8: ( WS | LETTER | ADD | SUB | EQL | NEWLINE )
        int alt2=6;
        switch ( input.LA(1) ) {
        case '\t':
        case ' ':
            {
            alt2=1;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
            {
            alt2=2;
            }
            break;
        case '+':
            {
            alt2=3;
            }
            break;
        case '-':
            {
            alt2=4;
            }
            break;
        case '=':
            {
            alt2=5;
            }
            break;
        case '\n':
        case '\r':
            {
            alt2=6;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 2, 0, input);

            throw nvae;

        }

        switch (alt2) {
            case 1 :
                // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:1:10: WS
                {
                mWS(); 


                }
                break;
            case 2 :
                // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:1:13: LETTER
                {
                mLETTER(); 


                }
                break;
            case 3 :
                // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:1:20: ADD
                {
                mADD(); 


                }
                break;
            case 4 :
                // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:1:24: SUB
                {
                mSUB(); 


                }
                break;
            case 5 :
                // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:1:28: EQL
                {
                mEQL(); 


                }
                break;
            case 6 :
                // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolRiddle_AST.g:1:32: NEWLINE
                {
                mNEWLINE(); 


                }
                break;

        }

    }


 

}