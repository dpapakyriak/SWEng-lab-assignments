/**
 * 
 */
package codeanalyzer.metric_folder;

import java.io.IOException;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import codeanalyzer.reader_folder.LocalFileReader;

/**
 * @author dimitrispapakyriakopoulos
 *
 */
public class LOCMetricTest {
	
	  private String sourceFilepath = "src/test/resources/TestClass.java";
	  private LOCMetric locm = new LOCMetric();
	  private LocalFileReader lfr = new LocalFileReader(); 

	  @Test
		public void testCalculateRegex() throws IOException {
	    String testSrcCodeString = lfr.readFileIntoString(sourceFilepath);
			assertEquals(21, locm.calculationWithRegex(testSrcCodeString));
	  }
	  
	  @Test
		public void testCalculateStrcomp() throws IOException {
	    List<String> testSrcCodeList = lfr.readFileIntoList(sourceFilepath);
			assertEquals(7, locm.calculationWithStrComp(testSrcCodeList));
		}
	  
}
