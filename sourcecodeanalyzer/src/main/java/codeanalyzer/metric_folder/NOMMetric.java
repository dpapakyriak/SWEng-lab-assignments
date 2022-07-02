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
public class NOMMetric implements Metric {
	
	 public int calculationWithRegex(String srcCodeString) {
		 
		    Pattern pattern = Pattern.compile(".*(public |protected |private |static )?[\\w\\<\\>\\[\\]]+\\s+(\\w+) *\\([^\\)]*\\) *(\\{?|[^;]).*"); 
			Matcher methodSgntrs = pattern.matcher(srcCodeString);
		    int nom = 0;
		    
		    while (methodSgntrs.find()) {
		      nom++;
		    }
		    
		    return nom;
		  }

		  public int calculationWithStrComp(List<String> srcCodeList) {
			  
		    int nom = 0;
		    for (String line : srcCodeList) {
		      line = line.trim(); // removes the white spaces before and after
		      
		      if ( ((line.contains("public") || line.contains("private") || line.contains("protected"))
		          || line.contains("void") || line.contains("int") || line.contains("String"))
		        && line.contains("(") && line.contains(")") && line.contains("{") )
		        nom++;
		    }
		    
		    return nom; 
		  }
	
}
