/**
 * 
 */
package codeanalyzer.exporter_folder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * @author dimitrispapakyriakopoulos
 *
 */
public class CSVExporter implements Exporter {
	
	public void write(String outputFilepath, Map<String, Integer> metrics) {
		
    	File outputFile = new File(outputFilepath + ".csv");
		StringBuilder metricNames = new StringBuilder();
		StringBuilder metricValues = new StringBuilder();
		
		for (Map.Entry<String, Integer> entry : metrics.entrySet()) {
			metricNames.append(entry.getKey() + ",");
			metricValues.append(entry.getValue() + ",");
		}
		
		try {
			FileWriter writer = new FileWriter(outputFile);
			writer.append(metricNames + "\n");
			writer.append(metricValues + "\n");
			writer.close();
			System.out.println("The metrics have been saved at " + outputFile.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
