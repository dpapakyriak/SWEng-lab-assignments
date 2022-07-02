/**
 * 
 */
package codeanalyzer.analyzer_folder;

import java.io.IOException;
import java.util.Map;
import codeanalyzer.exporter_folder.*;

/**
 * @author dimitrispapakyriakopoulos
 *
 *
 *Purpose: Interface for 2 analyzer types (Regex and StrComp)
 */


public interface Analyzer {
	
	public Map<String, Integer> calculateMetrics(String srcFilepath, String srcFileLocation) throws IOException;

}