// $ANTLR 3.4 C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g 2015-06-07 18:19:50

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SymbolRiddle_TreeParserLexer extends Lexer {
    public static final int EOF=-1;
    public static final int ADD=4;
    public static final int EQL=5;
    public static final int LETTER=6;
    public static final int NEWLINE=7;
    public static final int NUMBER=8;
    public static final int SUB=9;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public SymbolRiddle_TreeParserLexer() {} 
    public SymbolRiddle_TreeParserLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SymbolRiddle_TreeParserLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g"; }

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            int _type = LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g:25:8: ( ( 'A' .. 'Z' ) )
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g:
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
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g:26:5: ( '+' )
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g:26:7: '+'
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
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g:27:5: ( '-' )
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g:27:7: '-'
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
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g:28:5: ( '=' )
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g:28:7: '='
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
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g:29:8: ( ( '\\r' )? '\\n' )
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g:29:10: ( '\\r' )? '\\n'
            {
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g:29:10: ( '\\r' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g:29:10: '\\r'
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
        // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g:1:8: ( LETTER | ADD | SUB | EQL | NEWLINE )
        int alt2=5;
        switch ( input.LA(1) ) {
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
            alt2=1;
            }
            break;
        case '+':
            {
            alt2=2;
            }
            break;
        case '-':
            {
            alt2=3;
            }
            break;
        case '=':
            {
            alt2=4;
            }
            break;
        case '\n':
        case '\r':
            {
            alt2=5;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 2, 0, input);

            throw nvae;

        }

        switch (alt2) {
            case 1 :
                // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g:1:10: LETTER
                {
                mLETTER(); 


                }
                break;
            case 2 :
                // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g:1:17: ADD
                {
                mADD(); 


                }
                break;
            case 3 :
                // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g:1:21: SUB
                {
                mSUB(); 


                }
                break;
            case 4 :
                // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g:1:25: EQL
                {
                mEQL(); 


                }
                break;
            case 5 :
                // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe3\\SymbolRiddle_TreeParser.g:1:29: NEWLINE
                {
                mNEWLINE(); 


                }
                break;

        }

    }


 

}