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
public class LOCMetric implements Metric {
	
	public int calculationWithRegex(String srcCodeString) {
		
	    Pattern pattern = Pattern.compile("((//.*)|(/\\*.*)|(\\*+.*))");
	    Matcher noCodeLinesMatcher = pattern.matcher(srcCodeString);
	    int noCodeLinesCounter = 0;
	    while (noCodeLinesMatcher.find()) {
	      noCodeLinesCounter++;
	    }
	    int srcFileLength = srcCodeString.split("\n").length;
	    int loc = srcFileLength - noCodeLinesCounter;
	    return loc;
	  }

	  /**
	   * Calculates lines of code using string comparison.
	   * @param sourceCodeString, the input file as a List
	   * @return LOC, lines of code
	   */
	public int calculationWithStrComp(List<String> srcCodeList) {
		
	    int noCodeLinesCounter = 0;
	    for (String line : srcCodeList) {
	      line = line.trim(); // removes the white spaces before and after
	      if (line.startsWith("//") || line.startsWith("/*") || line.startsWith("*") || line.equals("{") || line.equals("}") || line.equals("")) {
	    	  noCodeLinesCounter++;
	      }
	    }
	    int loc = srcCodeList.size() - noCodeLinesCounter;
	    return loc;
	}
	
}
