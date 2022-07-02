/**
 * 
 */
package codeanalyzer.analyzer_folder;

import org.junit.Test;

/**
 * @author dimitrispapakyriakopoulos
 *
 */
public class FactoryAnalyzerTest {
	
	private FactoryAnalyzer af = new FactoryAnalyzer();
	  private String TEST_WRONG_ANALYZER_TYPE = "wrong-analyzer-type";

	  @Test (expected = IllegalArgumentException.class)
	  public void testInitializeAnalyzer_WrongType() {
	    af.initializeAnalyzer(TEST_WRONG_ANALYZER_TYPE);
	  }
	  
	  @Test
	  public void testInitializeAnalyzer_RegexType() {
	    // TODO
	  }

	  @Test 
	  public void testInitializeAnalyzer_StringComparisonType() {
	    // TODO
	  }


}
