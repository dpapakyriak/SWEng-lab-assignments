/**
 * 
 */
package codeanalyzer.exporter_folder;

/**
 * @author dimitrispapakyriakopoulos
 *
 */
public class FactoryExporter {
	
	public Exporter initializeExporter(String outputFileType) {
		
	    Exporter exporter;
	    //check type
	    if(outputFileType.equals("csv")) {
	      exporter = new CSVExporter();
	    } else if (outputFileType.equals("json")) {
	      exporter = new JSONExporter();
	    } else {
	      throw new IllegalArgumentException("Uknown file type detected: " + outputFileType);
	    }
	    //return exporter type
	    return exporter;
	  }

}
