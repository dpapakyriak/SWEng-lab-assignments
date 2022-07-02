/**
 * 
 */
package codeanalyzer.reader_folder;

import java.io.IOException;
import java.util.List;

/**
 * @author dimitrispapakyriakopoulos
 *
 */

public interface SrcFileReader {
	
	public String readFileIntoString(String srcFilepath) throws IOException;
	
	public List<String> readFileIntoList(String srcFilepath) throws IOException;

}
