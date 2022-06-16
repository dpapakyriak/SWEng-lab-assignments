/**
 * 
 */
package codeanalyzer.reader_folder;

/**
 * @author dimitrispapakyriakopoulos
 *
 */
public class FactorySrcFileReader {
	
	  
	  public SrcFileReader initializeSrcFileReader(String srcFileLocation) {
		  
		SrcFileReader reader = null;
		// check type
	    if(srcFileLocation.equals("local")) {
	    	reader = new LocalFileReader();
	    } else if(srcFileLocation.equals("web")) {
	    	reader = new WebFileReader();
	    } else {
	      throw new IllegalArgumentException("Unknown reader type has been detected: " + srcFileLocation); // error message
	    }
	    //return reader type object
	    return reader;
	  }

}
