package framework;

import framework.interfaces.GameState;
import framework.interfaces.Move;
import java.io.PrintStream;
import javax.naming.OperationNotSupportedException;

/**
 * Provides a template for writing tests for Roma.
 *
 * <h1>How to Write a Test for Roma</h1>
 *
 * <p>
 * Writing a test for Roma is as simple as implementing this class.
 * When the tester runs, it will call your test's run method. The
 * parameters of this method contain a GameState, and a Move. You can
 * manipulate these to be in any legal state, and check it changes
 * correctly when you make a move.
 * </p>
 *
 * <p>
 * While running your tests, you can print relevant information for the
 * user. Don't print to System.out. Tests which do print to System.out
 * will not be accepted. Instead, print to this.out. The tester will
 * handle that output as appropriate.
 * </p>
 *
 * <p>
 * When you have written your test, either add it to the git repository
 * with a pull request, or email your tutorial acceptance
 * representative.
 *
 * @author Benjamin James Wright (ben.wright)
 * @author Damon Stacey (damon.stacey)
 * @author Matthew Moss (matthew.moss)
 * @author Lasath Fernando (lasath.fernando)
 */
public abstract class Test {

    PrintStream out;

    Test(PrintStream out) {
        this.out = out;
    }

    /**
     * Returns a single line description of this test.
     *
     * @return a one-line string of no more than 60 characters
     */
    public abstract String getShortDescription();

    /**
     * Runs this test against the given gameState and Move.
     *
     * <p>
     * Information about the current test should be written to this.out.
     * It is the responsibility of the test author to ensure all moves
     * made by their tester are valid for the current gameState.
     * </p>
     *
     * <p>
     * This test should check conditions in the gameState using
     * assertions. The testing framework will handle the generated
     * AssertionError exceptions. A test is considered successful if
     * no exceptions are thrown when this method is called.
     * </p>
     *
     * @param gameState an initial GameState to change and check
     * @param move a Move interface for you to call
     * @throws AssertionError on test failure
     * @throws OperationNotSupportedException on unimplemented features
     * @throws IllegalArgumentException on invalid tests
     */
    public abstract void run (GameState gameState, Move move)
                                                  throws AssertionError,
                                         OperationNotSupportedException,
                                               IllegalArgumentException;
}
