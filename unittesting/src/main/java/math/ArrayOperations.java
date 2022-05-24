/**
 * 
 */
package math;

import io.FileIO;
import math.MyMath;
import java.util.List;
import java.util.ArrayList;
/**
 * @author dimitrispapakyriakopoulos
 *
 */
public class ArrayOperations {
	
	
	 public int[] findPrimesInFile(FileIO fileIo, String filepath, MyMath myMath) {
		 
		    int[] data = fileIo.readFile(filepath);
		    List<Integer> primeNumbers = new ArrayList<>();
		    for (int number:data) {
		      try {
		    	  
		        if (myMath.isPrime(number))  {
		        	 primeNumbers.add(number);
		        }
		        
		      } catch (IllegalArgumentException e) {
		        continue;
		      }
		    }
		    return primeNumbers.stream().mapToInt(x -> x).toArray(); /* Makes the list data into ints and put them in Array and returns it*/
		  }
}
