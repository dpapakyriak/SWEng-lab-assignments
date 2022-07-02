/**
 * 
 */
package codeanalyzer.metric_folder;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author dimitrispapakyriakopoulos
 *
 */
public class NOCMetric implements Metric {

	
	  public int calculationWithRegex(String srcCodeString) {
		  
		    Pattern pattern = Pattern.compile(".*\\s*class\\s+.*"); 
		    Matcher classSgntrs = pattern.matcher(srcCodeString);
		    int noc = 0;
		    while (classSgntrs.find()) {
		      noc++;
		    }
		    return noc;
	  }

	  
	public int calculationWithStrComp(List<String> srcCodeList) {
		
		int noc = 0;
		for (String line : srcCodeList) {
			line = line.trim(); // removes the white spaces before and after
			if ((line.startsWith("class ") || line.contains(" class ")) && line.contains("{")) {
				noc++;
			}
		}
		return noc;
	}
	
}
