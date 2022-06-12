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
		  thrown.expectMessage("Expected n >= 0");
		  mymath.factorial(-5);
	  }

	  @Test
	  public void testFactorial_wrongInput_BiggerThanTwelve() {
		  thrown.expect(IllegalArgumentException.class);
		  thrown.expectMessage("Expected n <= 12");
		  mymath.factorial(13);
	  }

	  
	  @Test
	  public void testIsPrime_correctOutputs() {
		  
	    // Test of Prime numbers, should be true
		  
	    Assert.assertTrue(mymath.isPrime(2));
	    Assert.assertTrue(mymath.isPrime(3));
	    Assert.assertTrue(mymath.isPrime(5));
	    Assert.assertTrue(mymath.isPrime(7));
	    Assert.assertTrue(mymath.isPrime(13));
	    Assert.assertTrue(mymath.isPrime(1117));
	    Assert.assertTrue(mymath.isPrime(106703)); // source: http://compoasso.free.fr/primelistweb/page/prime/liste_online_en.php

	    // Test of NOT prime numbers, should be false
	    
	    Assert.assertFalse(mymath.isPrime(4));
	    Assert.assertFalse(mymath.isPrime(6));
	    Assert.assertFalse(mymath.isPrime(9));
	    Assert.assertFalse(mymath.isPrime(10));
	    Assert.assertFalse(mymath.isPrime(700));
	    Assert.assertFalse(mymath.isPrime(106704));
	  }

	  @Test
	  public void testIsPrime_notAcceptedInput() {
	    thrown.expect(IllegalArgumentException.class);
	    thrown.expectMessage("Expected n >= 2");
	    mymath.isPrime(0);
	  }

	  @Test
	  public void testIsPrime_TooBigInput() {
	    thrown.expect(IllegalArgumentException.class);
	    mymath.isPrime(Integer.MAX_VALUE + 2);
	  }
	
}
