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
public class ArithmeticOperationsTest {
	
	ArithmeticOperations ao = new ArithmeticOperations();
	  @Rule
	  public ExpectedException thrown = ExpectedException.none();

	  
	  /* Test  methods for each method in ArithmeticOperations class. */
	  
	  @Test
	  public void testDivide_correctOutput() {
	    Assert.assertEquals(4.0, ao.divide(40.0, 10.0), 0.0001);
	    Assert.assertEquals(-4.0, ao.divide(-40.0, 10.0), 0.0001);
	    Assert.assertEquals(-4.0, ao.divide(40.0, -10.0), 0.0001);
	    Assert.assertEquals(4.0, ao.divide(-40.0, -10.0), 0.0001);
	    Assert.assertEquals(0.0, ao.divide(0.0, 10.0), 0.0001);
	    Assert.assertEquals(0.0, ao.divide(-0.0, 10.0), 0.0001);
	    Assert.assertEquals(0.0, ao.divide(0.0, -10.0), 0.0001);
	    Assert.assertEquals(0.0, ao.divide(-0.0, -10.0), 0.0001);
	    Assert.assertEquals(3.3333, ao.divide(100.0, 30.0), 0.0001);
	    Assert.assertEquals(-3.3333, ao.divide(-100.0, 30.0), 0.0001);
	    Assert.assertEquals(-3.3333, ao.divide(100.0, -30.0), 0.0001);
	    Assert.assertEquals(3.3333, ao.divide(-100.0, -30.0), 0.0001);
	  }
	  
	  
	  @Test (expected = ArithmeticException.class)
	  public void testDivide_divisionWithZero() {
		  ao.divide(2.0, 0.0);
	  }
	  

	  @Rule
	  public void testMultiply_correctOutput() {
	    Assert.assertEquals(2, ao.multiply(2, 1));
	    Assert.assertEquals(6, ao.multiply(2, 3));
	    Assert.assertEquals(45000, ao.multiply(100, 450));
	  }
	  

	  @Rule
	  public void testMultiply_wrongInput_NegativeFirst() {
	    thrown.expect(IllegalArgumentException.class);
	    thrown.expectMessage("X and Y must be bigger or equal to 0");
	    ao.multiply(-1, 2);
	  }
	  

	  @Rule
	  public void testMultiply_wrongInput_NegativeSecond() {
	    thrown.expect(IllegalArgumentException.class);
	    thrown.expectMessage("X and Y must be bigger or equal to 0");
	    ao.multiply(1, -2);
	  }
	  

	  @Rule
	  public void testMultiply_wrongInput_BothNegative() {
	    thrown.expect(IllegalArgumentException.class);
	    thrown.expectMessage("X and Y must be bigger or equal to 0");
	    ao.multiply(-1, -2);
	  }
	  

	  @Rule
	  public void testMultiply_wrongInput_TooBigNumber() {
	    thrown.expect(IllegalArgumentException.class);
	    thrown.expectMessage("The product of X and Y does not fit in an Integer variable");
	    ao.multiply(Integer.MAX_VALUE/2, 4);
	  }
	  
	
}
