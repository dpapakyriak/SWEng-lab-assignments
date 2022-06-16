/**
 * 
 */
package codeanalyzer.metric_folder;

import java.util.List;

/**
 * @author dimitrispapakyriakopoulos
 *
 */

public interface Metric {
	
	  public int calculationWithRegex(String srcCodeString);
	  
	  public int calculationWithStrComp(List<String> srcCodeList);

}