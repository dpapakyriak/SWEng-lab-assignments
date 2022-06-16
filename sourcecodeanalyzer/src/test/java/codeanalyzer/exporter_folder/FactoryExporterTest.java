/**
 * 
 */
package codeanalyzer.exporter_folder;

import org.junit.Test;

/**
 * @author dimitrispapakyriakopoulos
 *
 */
public class FactoryExporterTest {
	
	  private FactoryExporter ef = new FactoryExporter();
	  private final String TEST_WRONG_FILETYPE = "whatever-type";

	  @Test (expected = IllegalArgumentException.class)
	  public void testInitializeExporter_WrongType() {
	    ef.initializeExporter(TEST_WRONG_FILETYPE);
	  }

	  @Test
	  public void testInitializeExporter_CSVType() {
	    // TODO
	  }

	  @Test
	  public void testInitializeExporter_JSONType() {
	    // TODO
	  }

}
