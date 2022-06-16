/**
 * 
 */
package codeanalyzer;

import java.io.IOException;
import java.util.Map;
import codeanalyzer.exporter_folder.*;
import codeanalyzer.analyzer_folder.*;


/**
 * @author dimitrispapakyriakopoulos
 * 
 * Purpose: Calculation and output via export of metrics
 *
 */
public class Facade {
	
	/**
	 * 
	 * src analysis
	 * 
	 * */
	
	public void analyze(String sourceFilepath, String srcFileLocation, String srcCodeAnalyzerType, String outputFilepath, String outputFileType) throws IOException {
		// Analyzer
		FactoryAnalyzer anlzrFactory = new FactoryAnalyzer();
		Analyzer anlzr = anlzrFactory.initializeAnalyzer(srcCodeAnalyzerType);
		Map<String, Integer> metrics = anlzr.calculateMetrics(sourceFilepath, srcFileLocation);
		// Exporter
		FactoryExporter exprtrFactory = new FactoryExporter();
		Exporter exprtr = exprtrFactory.initializeExporter(outputFileType);
		exprtr.write(outputFilepath, metrics);
	}

}
