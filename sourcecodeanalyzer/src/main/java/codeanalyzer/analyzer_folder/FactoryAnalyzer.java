/**
 * 
 */
package codeanalyzer.analyzer_folder;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author dimitrispapakyriakopoulos
 * 
 * Purpose: Initialise Analyzer via analyzer type
 *
 */
public class FactoryAnalyzer {
	/**
	 * Calculation of LOC, NOM, NOC with a unique analyzer
	 * 
	 */
	
	
	public Analyzer initializeAnalyzer(String srcCodeAnalyzerType) {
		
	    Analyzer anlzr; //initialise
	    // check type
	    if(srcCodeAnalyzerType.equals("regex")) {
	    	anlzr = new StringCompAnalyzer();
	    } else if (srcCodeAnalyzerType.equals("strcomp")) {
	    	anlzr = new RegexAnalyzer();
	    } else {
	      throw new IllegalArgumentException("Uknown analyzer type detected: " + srcCodeAnalyzerType); //error message
	    }
	    
	    return anlzr; //return instance of analyzer via correct type
	  }
	
	
}
