/**
 * 
 */
package math;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.Assert;

/**
 * @author dimitrispapakyriakopoulos
 *
 */

@RunWith(Parameterized.class)
public class MyMathParameterizedTest {
	
	@Parameter (value = 0)
	  public int n;
	  @Parameter (value = 1)
	  public int factorial;

	  MyMath mymath = new MyMath();

	  @Parameters
	  public static Collection<Object[]> data() {
//		factorials[][] is of type = {n, factorial(n) }
	    Object[][] factorials = new Object[][]{{0, 1}, {1, 1}, {2, 2}, {12, 479001600}};  // 12! = 479001600
	    return Arrays.asList(factorials);
	  }

	  @Test
	  public void testFactorial_validTestingCases_expectedOutputs() {
	    Assert.assertEquals(factorial, mymath.factorial(n));
	  }
	
}
