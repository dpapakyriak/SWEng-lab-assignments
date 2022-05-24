/**
 * 
 */
package math;

import io.FileIO;
import math.MyMath;
import math.ArrayOperations;
import java.io.File;
import org.junit.Test;
import org.junit.Assert;
import static org.mockito.Mockito.*;
/**
 * @author dimitrispapakyriakopoulos
 *
 */
public class ArrayOperationsTest {

	
	ArrayOperations ao = new ArrayOperations();
	  String filepath;

	  @Test
	  public void testFindPrimesInFile_correctOutputs() {
	    int[] expectedValidSample = {2, 3, 5, 7};
	    filepath = new File("src/test/resources/correct.txt").getAbsolutePath();

	    FileIO fileIo = mock(FileIO.class);
	    when(fileIo.readFile(filepath)).thenReturn(new int[]
	      {1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
	    
	    MyMath mymath = mock(MyMath.class);
	    when(mymath.isPrime(2)).thenReturn(true);
	    when(mymath.isPrime(3)).thenReturn(true);
	    when(mymath.isPrime(4)).thenReturn(false);  
	    when(mymath.isPrime(5)).thenReturn(true);  
	    when(mymath.isPrime(7)).thenReturn(true);  
	    when(mymath.isPrime(8)).thenReturn(false);  
	    when(mymath.isPrime(9)).thenReturn(false);
	    when(mymath.isPrime(10)).thenReturn(false);

	    Assert.assertArrayEquals(expectedValidSample, ao.findPrimesInFile(fileIo, filepath, mymath));
	  }
	  
	  

	  @Test
	  public void testFindPrimesInFile_wrongInputs() { 
	    int[] expectedValidSample = {}; 
	    filepath = new File("src/test/resources/wrong.txt").getAbsolutePath();

	    FileIO fileIo = mock(FileIO.class);
	    when(fileIo.readFile(filepath)).thenReturn(new int[]
	      {-1000, -1, 0, 1, 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000});
	    
	    MyMath mymath = mock(MyMath.class);
	    when(mymath.isPrime(-1000)).thenThrow(new IllegalArgumentException());
	    when(mymath.isPrime(-2)).thenThrow(new IllegalArgumentException());
	    when(mymath.isPrime(0)).thenThrow(new IllegalArgumentException());
	    when(mymath.isPrime(1)).thenThrow(new IllegalArgumentException());

	    Assert.assertArrayEquals(expectedValidSample, ao.findPrimesInFile(fileIo, filepath, mymath));
	  }
}
