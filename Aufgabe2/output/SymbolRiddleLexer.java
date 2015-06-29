// $ANTLR 3.4 C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe2\\SymbolRiddle.g 2015-06-28 11:11:30

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SymbolRiddleLexer extends Lexer {
    public static final int EOF=-1;
    public static final int ADDSUB=4;
    public static final int EQL=5;
    public static final int LETTER=6;
    public static final int NEWLINE=7;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public SymbolRiddleLexer() {} 
    public SymbolRiddleLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SymbolRiddleLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe2\\SymbolRiddle.g"; }

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            int _type = LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe2\\SymbolRiddle.g:21:8: ( ( 'A' .. 'Z' )+ )
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe2\\SymbolRiddle.g:21:10: ( 'A' .. 'Z' )+
            {
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe2\\SymbolRiddle.g:21:10: ( 'A' .. 'Z' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe2\\SymbolRiddle.g:
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "ADDSUB"
    public final void mADDSUB() throws RecognitionException {
        try {
            int _type = ADDSUB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe2\\SymbolRiddle.g:22:8: ( ( '+' | '-' ) )
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe2\\SymbolRiddle.g:
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
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
    // $ANTLR end "ADDSUB"

    // $ANTLR start "EQL"
    public final void mEQL() throws RecognitionException {
        try {
            int _type = EQL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe2\\SymbolRiddle.g:23:5: ( '=' )
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe2\\SymbolRiddle.g:23:7: '='
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
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe2\\SymbolRiddle.g:24:8: ( ( '\\r' )? '\\n' )
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe2\\SymbolRiddle.g:24:10: ( '\\r' )? '\\n'
            {
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe2\\SymbolRiddle.g:24:10: ( '\\r' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\r') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe2\\SymbolRiddle.g:24:10: '\\r'
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
        // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe2\\SymbolRiddle.g:1:8: ( LETTER | ADDSUB | EQL | NEWLINE )
        int alt3=4;
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
            alt3=1;
            }
            break;
        case '+':
        case '-':
            {
            alt3=2;
            }
            break;
        case '=':
            {
            alt3=3;
            }
            break;
        case '\n':
        case '\r':
            {
            alt3=4;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 3, 0, input);

            throw nvae;

        }

        switch (alt3) {
            case 1 :
                // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe2\\SymbolRiddle.g:1:10: LETTER
                {
                mLETTER(); 


                }
                break;
            case 2 :
                // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe2\\SymbolRiddle.g:1:17: ADDSUB
                {
                mADDSUB(); 


                }
                break;
            case 3 :
                // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe2\\SymbolRiddle.g:1:24: EQL
                {
                mEQL(); 


                }
                break;
            case 4 :
                // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe2\\SymbolRiddle.g:1:28: NEWLINE
                {
                mNEWLINE(); 


                }
                break;

        }

    }


 

}