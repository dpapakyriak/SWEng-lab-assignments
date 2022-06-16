/**
 * 
 */
package codeanalyzer.reader_folder;

import org.junit.Test;

/**
 * @author dimitrispapakyriakopoulos
 *
 */
public class SrcFileReaderTest {
	
	 private FactorySrcFileReader reader = new FactorySrcFileReader();
	 private String TEST_FILE = "whatever-path";
	 private String TEST_WRONG_FILETYPE = "wrong-file-type";

	 @Test (expected = IllegalArgumentException.class)
	 public void testInitializeSourceFileReader_WrongType() {
		 reader.initializeSrcFileReader(TEST_WRONG_FILETYPE);
	 }

}
