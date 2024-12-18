/**
 * 
 */
package codeanalyzer.exporter_folder;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author dimitrispapakyriakopoulos
 *
 */
public class CSVExporterTest {

	  private String outputFilepath = "src/test/resources/output_metrics";
	  private CSVExporter csve = new CSVExporter();
	  	
		@Test
		public void testWriteCsv() {
			// create the metrics' content
			Map<String, Integer> metrics = new HashMap<>();
			metrics.put("loc",30);
			metrics.put("nom",5);
			metrics.put("noc",2);
			
			// generate and write the output file
			csve.write(outputFilepath, metrics);
			
			// evaluate that the file exists
			File outputFile = new File(outputFilepath + ".csv");
			Assert.assertTrue(outputFile.exists());
			
			// delete the generated file
			outputFile.delete();
		}
}
