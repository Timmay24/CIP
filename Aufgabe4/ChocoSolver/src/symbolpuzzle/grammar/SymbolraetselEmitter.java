

package symbolpuzzle.grammar;

import java.util.Set;
import java.util.HashSet;
import java.lang.Character;

import symbolpuzzle.implementation.Constraint;
import symbolpuzzle.implementation.Number;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class SymbolraetselEmitter extends TreeParser {
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


    public SymbolraetselEmitter(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public SymbolraetselEmitter(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected StringTemplateGroup templateLib =
  new StringTemplateGroup("SymbolraetselEmitterTemplates", AngleBracketTemplateLexer.class);

public void setTemplateLib(StringTemplateGroup templateLib) {
  this.templateLib = templateLib;
}
public StringTemplateGroup getTemplateLib() {
  return templateLib;
}
/** allows convenient multi-value initialization:
 *  "new STAttrMap().put(...).put(...)"
 */
public static class STAttrMap extends HashMap {
  public STAttrMap put(String attrName, Object value) {
    super.put(attrName, value);
    return this;
  }
  public STAttrMap put(String attrName, int value) {
    super.put(attrName, new Integer(value));
    return this;
  }
}
    public String[] getTokenNames() { return SymbolraetselEmitter.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolraetselEmitter.g"; }


    Set<Character> symbols = new HashSet<Character>();


    public static class prog_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "prog"
    // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolraetselEmitter.g:25:1: prog : (constraints+= constraint )* -> prog(symbols=symbolsconstraints=$constraints);
    public final SymbolraetselEmitter.prog_return prog() throws RecognitionException {
        SymbolraetselEmitter.prog_return retval = new SymbolraetselEmitter.prog_return();
        retval.start = input.LT(1);


        List list_constraints=null;
        RuleReturnScope constraints = null;
        try {
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolraetselEmitter.g:26:3: ( (constraints+= constraint )* -> prog(symbols=symbolsconstraints=$constraints))
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolraetselEmitter.g:26:7: (constraints+= constraint )*
            {
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolraetselEmitter.g:26:18: (constraints+= constraint )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==EQL) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolraetselEmitter.g:26:18: constraints+= constraint
            	    {
            	    pushFollow(FOLLOW_constraint_in_prog77);
            	    constraints=constraint();

            	    state._fsp--;

            	    if (list_constraints==null) list_constraints=new ArrayList();
            	    list_constraints.add(constraints.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // TEMPLATE REWRITE
            // 27:6: -> prog(symbols=symbolsconstraints=$constraints)
            {
                retval.st = templateLib.getInstanceOf("prog",new STAttrMap().put("symbols", symbols).put("constraints", list_constraints));
            }



            }

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


    public static class constraint_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "constraint"
    // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolraetselEmitter.g:29:1: constraint : ^( EQL ^( ADD n1= number n2= number ) n3= number ) -> constraint(number1=$n1.numbernumber2=$n2.numbernumber3=$n3.number);
    public final SymbolraetselEmitter.constraint_return constraint() throws RecognitionException {
        SymbolraetselEmitter.constraint_return retval = new SymbolraetselEmitter.constraint_return();
        retval.start = input.LT(1);


        SymbolraetselEmitter.number_return n1 =null;

        SymbolraetselEmitter.number_return n2 =null;

        SymbolraetselEmitter.number_return n3 =null;


        try {
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolraetselEmitter.g:37:2: ( ^( EQL ^( ADD n1= number n2= number ) n3= number ) -> constraint(number1=$n1.numbernumber2=$n2.numbernumber3=$n3.number))
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolraetselEmitter.g:37:4: ^( EQL ^( ADD n1= number n2= number ) n3= number )
            {
            match(input,EQL,FOLLOW_EQL_in_constraint114); 

            match(input, Token.DOWN, null); 
            match(input,ADD,FOLLOW_ADD_in_constraint117); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_number_in_constraint121);
            n1=number();

            state._fsp--;


            pushFollow(FOLLOW_number_in_constraint125);
            n2=number();

            state._fsp--;


            match(input, Token.UP, null); 


            pushFollow(FOLLOW_number_in_constraint130);
            n3=number();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 38:4: -> constraint(number1=$n1.numbernumber2=$n2.numbernumber3=$n3.number)
            {
                retval.st = templateLib.getInstanceOf("constraint",new STAttrMap().put("number1", (n1!=null?n1.number:null)).put("number2", (n2!=null?n2.number:null)).put("number3", (n3!=null?n3.number:null)));
            }



            }


            		Constraint constraint = new Constraint();
            		constraint.getNumbers().add((n1!=null?n1.number:null));
            		constraint.getNumbers().add((n2!=null?n2.number:null));
            		constraint.getNumbers().add((n3!=null?n3.number:null));
            		constraint.prepare();
            	
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
    // $ANTLR end "constraint"


    public static class number_return extends TreeRuleReturnScope {
        public Number number;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "number"
    // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolraetselEmitter.g:41:1: number returns [Number number] : ^( NUMBER (letters+= LETTER )+ ) ;
    public final SymbolraetselEmitter.number_return number() throws RecognitionException {
        SymbolraetselEmitter.number_return retval = new SymbolraetselEmitter.number_return();
        retval.start = input.LT(1);


        CommonTree letters=null;
        List list_letters=null;

        try {
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolraetselEmitter.g:47:2: ( ^( NUMBER (letters+= LETTER )+ ) )
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolraetselEmitter.g:47:6: ^( NUMBER (letters+= LETTER )+ )
            {
            match(input,NUMBER,FOLLOW_NUMBER_in_number177); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolraetselEmitter.g:47:22: (letters+= LETTER )+
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
            	    // C:\\Users\\Louisa\\Documents\\GitHub\\CIP\\Aufgabe4\\ChocoSolver\\src\\symbolpuzzle\\grammar\\SymbolraetselEmitter.g:47:22: letters+= LETTER
            	    {
            	    letters=(CommonTree)match(input,LETTER,FOLLOW_LETTER_in_number181); 
            	    if (list_letters==null) list_letters=new ArrayList();
            	    list_letters.add(letters);


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


            }


            		retval.number = new Number();
            		retval.number.setDigits(list_letters);
            		symbols.addAll(retval.number.getCharacters());
            	
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


 

    public static final BitSet FOLLOW_constraint_in_prog77 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_EQL_in_constraint114 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ADD_in_constraint117 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_number_in_constraint121 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_number_in_constraint125 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_number_in_constraint130 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NUMBER_in_number177 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LETTER_in_number181 = new BitSet(new long[]{0x0000000000000048L});

}