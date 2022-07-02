/**
 * 
 */
package codeanalyzer.exporter_folder;

import java.util.Map;

/**
 * @author dimitrispapakyriakopoulos
 *
 */
public interface Exporter {
	
	
	  public void write(String outputFilepath, Map<String, Integer> metrics);

}
