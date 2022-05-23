/**
 * 
 */
package math;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 * @author dimitrispapakyriakopoulos
 *
 */
public class MyMathTest {

	 MyMath mymath = new MyMath();

	  @Rule
	  public ExpectedException thrown = ExpectedException.none();

	  @Test
	  public void testFactorial_wrongInput_Negative() {
	    thrown.expect(IllegalArgumentException.class);
	    thrown.expectMessage("X must be >= 0");
	    mymath.factorial(-1);
	  }

	  @Test
	  public void testFactorial_wrongInput_BiggerThanTwelve() {
	    thrown.expect(IllegalArgumentException.class);
	    thrown.expectMessage("X must be <= 12");
	    mymath.factorial(15);
	  }

	
}
