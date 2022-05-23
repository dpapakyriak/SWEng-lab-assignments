/**
 * 
 */
package math;

/**
 * @author dimitrispapakyriakopoulos
 *
 */
public class MyMath {

	/* If n = 0 or 1 then return 1, else return n * (n-1)!. This method uses anadrome fundamentals.*/
	
	public int factorial(int n) { 
		if ( n < 0 || n > 12) {
			 throw new IllegalArgumentException("n must be between zero and 12: 0 <= n <= 12");
		} else {
			if (n == 0 || n == 1) {
				return 1;
			} else {
				return n * factorial(n-1);
			}
		}
	}	
}
