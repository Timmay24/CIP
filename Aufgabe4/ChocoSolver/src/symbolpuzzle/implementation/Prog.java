//Package
package symbolpuzzle.implementation;

//Choco Constraint Solver
import choco.Choco;
import choco.Options;
import choco.cp.model.CPModel;
import choco.cp.solver.CPSolver;
import choco.kernel.model.Model;
import choco.kernel.model.variables.integer.IntegerExpressionVariable;
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.kernel.solver.Solver;

public class Prog {

  private static final IntegerVariable ZERO = Choco.constant(0);


  public static void main(String[] args){
    solve();
  }

  /**
   * Loesen des Zahlenraetsels
   */
  public static void solve() {
    // Build model
    Model model = new CPModel();
    
    // Declare every letter as a variable
    IntegerVariable A = Choco.makeIntVar("A", 0, 9, Options.V_ENUM); 
    IntegerVariable B = Choco.makeIntVar("B", 0, 9, Options.V_ENUM); 
    IntegerVariable C = Choco.makeIntVar("C", 0, 9, Options.V_ENUM); 
    IntegerVariable E = Choco.makeIntVar("E", 0, 9, Options.V_ENUM); 
    IntegerVariable F = Choco.makeIntVar("F", 0, 9, Options.V_ENUM); 
    IntegerVariable G = Choco.makeIntVar("G", 0, 9, Options.V_ENUM); 
    IntegerVariable I = Choco.makeIntVar("I", 0, 9, Options.V_ENUM); 
    IntegerVariable K = Choco.makeIntVar("K", 0, 9, Options.V_ENUM); 
    
    // Add constraint by term
    IntegerExpressionVariable carry = ZERO;

    carry = Choco.sum(C, I, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(A, Choco.mod(carry, 10)));

    carry = Choco.sum(C, K, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(C, Choco.mod(carry, 10)));

    carry = Choco.sum(B, E, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(G, Choco.mod(carry, 10)));

    carry = ZERO;

    carry = Choco.sum(A, C, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(C, Choco.mod(carry, 10)));

    carry = Choco.sum(A, G, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(G, Choco.mod(carry, 10)));

    carry = Choco.sum(F, B, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(G, Choco.mod(carry, 10)));

    carry = ZERO;

    carry = Choco.sum(C, A, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(C, Choco.mod(carry, 10)));

    carry = Choco.sum(C, G, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(I, Choco.mod(carry, 10)));

    carry = Choco.sum(G, G, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(C, Choco.mod(carry, 10)));

    carry = Choco.sum(ZERO, ZERO, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(B, Choco.mod(carry, 10)));

    carry = ZERO;

    carry = Choco.sum(A, C, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(C, Choco.mod(carry, 10)));

    carry = Choco.sum(C, G, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(I, Choco.mod(carry, 10)));

    carry = Choco.sum(G, G, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(C, Choco.mod(carry, 10)));

    carry = Choco.sum(ZERO, ZERO, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(B, Choco.mod(carry, 10)));

    carry = ZERO;

    carry = Choco.sum(C, A, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(C, Choco.mod(carry, 10)));

    carry = Choco.sum(C, A, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(C, Choco.mod(carry, 10)));

    carry = Choco.sum(B, F, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(G, Choco.mod(carry, 10)));

    carry = ZERO;

    carry = Choco.sum(I, C, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(A, Choco.mod(carry, 10)));

    carry = Choco.sum(K, G, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(G, Choco.mod(carry, 10)));

    carry = Choco.sum(E, B, Choco.div(carry, 10));
    model.addConstraint(Choco.eq(G, Choco.mod(carry, 10)));

    carry = ZERO;
    
    // Add constraint of all different letters  
    model.addConstraint(Choco.allDifferent(A, B, C, E, F, G, I, K));    
    
    // Build a solver, read the model and solve it
    Solver s = new CPSolver();
    s.read(model);
    s.solve();
    
    // Print symbol values
    System.out.println("A = " + s.getVar(A).getVal() + ", " + "\n" + "B = " + s.getVar(B).getVal() + ", " + "\n" + "C = " + s.getVar(C).getVal() + ", " + "\n" + "E = " + s.getVar(E).getVal() + ", " + "\n" + "F = " + s.getVar(F).getVal() + ", " + "\n" + "G = " + s.getVar(G).getVal() + ", " + "\n" + "I = " + s.getVar(I).getVal() + ", " + "\n" + "K = " + s.getVar(K).getVal());
  }

}