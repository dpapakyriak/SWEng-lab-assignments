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
		 if (n < 0) {
		      throw new IllegalArgumentException("Expected n >= 0");
		    } else if (n > 12) {
		      throw new IllegalArgumentException("Expected n <= 12");
		    } else {
			if (n == 0 || n == 1) {
				return 1;
			} else {
				return n * factorial(n-1);
			}
		}
	}
	
	
	public boolean isPrime(int n) {
		
		if (n < 2) {
			throw new IllegalArgumentException("Expected n >= 2");
		} else {
			if ( n % 2 == 0 && n > 2) {
				return false;
			} else {
				for (int i = 3; i <= Math.sqrt(n); i += 2)
		        {
		            if (n % i == 0)
		                return false;
		        }
		        return true;
			}
		}
	}
}
