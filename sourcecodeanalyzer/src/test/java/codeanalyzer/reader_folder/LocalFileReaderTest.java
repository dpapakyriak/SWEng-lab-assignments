/**
 * 
 */
package codeanalyzer.reader_folder;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author dimitrispapakyriakopoulos
 *
 */
public class LocalFileReaderTest {

	
	private LocalFileReader lfr = null;
	private static List<String> expectedList;
	private static String expectedString;
	private final static String TEST_CLASS_LOCAL = "src/test/resources/TestClass.java";

	@BeforeClass
	public static void setUp() throws IOException {
		expectedList = Files.readAllLines(new File(TEST_CLASS_LOCAL).toPath(), Charset.defaultCharset());
		expectedString = String.join("\n", expectedList) + "\n"; // transforms  list to String 
	}
	
	@Test
	public void testReadFileIntoListLocal() throws IOException {
		lfr = new LocalFileReader();
		List<String> actualList = lfr.readFileIntoList(TEST_CLASS_LOCAL);
		
		String[] expected = expectedList.stream().toArray(String[]::new);
		String[] actual = actualList.stream().toArray(String[]::new);
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testReadFileIntoStringLocal() throws IOException {
		// reads a locally stored file into a String
		lfr = new LocalFileReader();
		String actualString = lfr.readFileIntoString(TEST_CLASS_LOCAL);
	    String expected = expectedString;
	    String actual = actualString;

	    assertEquals(expected, actual);
	 }
}
