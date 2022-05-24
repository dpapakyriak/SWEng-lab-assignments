/**
 * 
 */
package io;

import java.io.File;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 * @author dimitrispapakyriakopoulos
 *
 */
public class FileIOTest {

	
	FileIO fileio = new FileIO();
	  String filepath;

	  @Rule
	  public ExpectedException thrown = ExpectedException.none();

	  @Test
	  public void testReadFile_correctInputs() {
	    int[] expectedValidSample = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	    filepath = new File("src/test/resources/correct.txt").getAbsolutePath();
	    Assert.assertArrayEquals(expectedValidSample, fileio.readFile(filepath));
	  }

	  
	  @Test
	  public void testReadFile_emptyFile() {
	    filepath = new File("src/test/resources/empty.txt").getAbsolutePath();
	    thrown.expect(IllegalArgumentException.class);
	    thrown.expectMessage("Given file is empty");
	    fileio.readFile(filepath);
	  }

	  @Test
	  public void testReadFile_noFileFound() {
	    filepath = new File("src/test/resources/notfound.txt").getAbsolutePath();
	    thrown.expect(IllegalArgumentException.class);
	    thrown.expectMessage("Input file does not exist");
	    fileio.readFile(filepath);
	  }
	  
	  @Test
	  public void testReadFileContainsInvalidEntries() {
	    int[] expectedInvalidSample = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
	    filepath = new File("src/test/resources/wrong.txt").getAbsolutePath();
	    Assert.assertArrayEquals(expectedInvalidSample, fileio.readFile(filepath));
	  }

}
