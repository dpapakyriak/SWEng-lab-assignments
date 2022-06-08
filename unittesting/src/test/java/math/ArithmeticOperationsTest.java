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
	    Assert.assertEquals(2.0, ao.divide(10.0, 5.0), 0.0001);
	    Assert.assertEquals(-2.0, ao.divide(-10.0, 5.0), 0.0001);
	    Assert.assertEquals(-2.0, ao.divide(10.0, -5.0), 0.0001);
	    Assert.assertEquals(2.0, ao.divide(-10.0, -5.0), 0.0001);
	    Assert.assertEquals(0.0, ao.divide(0.0, 5.0), 0.0001);
	    Assert.assertEquals(0.0, ao.divide(-0.0, 5.0), 0.0001);
	    Assert.assertEquals(0.0, ao.divide(0.0, -5.0), 0.0001);
	    Assert.assertEquals(0.0, ao.divide(-0.0, -5.0), 0.0001);
	    Assert.assertEquals(3.3333, ao.divide(10.0, 3.0), 0.0001);
	    Assert.assertEquals(-3.3333, ao.divide(-10.0, 3.0), 0.0001);
	    Assert.assertEquals(-3.3333, ao.divide(10.0, -3.0), 0.0001);
	    Assert.assertEquals(3.3333, ao.divide(-10.0, -3.0), 0.0001);
	  }
	  
	  
	  @Test (expected = ArithmeticException.class)
	  public void testDivide_divisionWithZero() {
		  ao.divide(10.0, 0.0);
	  }
	  

	  @Test
	  public void testMultiply_correctOutput() {
		  Assert.assertEquals(1, ao.multiply(1, 1));
		  Assert.assertEquals(98, ao.multiply(1, 98));
		  Assert.assertEquals(1376515, ao.multiply(587, 2345));
		  Assert.assertEquals(0, ao.multiply(0, 91));
		  Assert.assertEquals(0, ao.multiply(85, 0));
		  Assert.assertEquals(0, ao.multiply(0, 0));
	  }
	  

	  @Test
	  public void testMultiply_wrongInput_NegativeFirst() {
		  thrown.expect(IllegalArgumentException.class);
		  thrown.expectMessage("X and Y should be >= 0");
		  ao.multiply(-1, 5);
	  }
	  

	  @Test
	  public void testMultiply_wrongInput_NegativeSecond() {
		  thrown.expect(IllegalArgumentException.class);
		  thrown.expectMessage("X and Y should be >= 0");
		  ao.multiply(1, -5);
	  }
	  

	  @Test
	  public void testMultiply_wrongInput_BothNegative() {
		  thrown.expect(IllegalArgumentException.class);
		  thrown.expectMessage("X and Y should be >= 0");
		  ao.multiply(-1, -5);
	  }
	  

	  @Test
	  public void testMultiply_wrongInput_TooBigNumber() {
		  thrown.expect(IllegalArgumentException.class);
		  thrown.expectMessage("The product is too big to fit in an Integer variable");
		  ao.multiply(Integer.MAX_VALUE/5, 10);
	  }
	  
	
}
