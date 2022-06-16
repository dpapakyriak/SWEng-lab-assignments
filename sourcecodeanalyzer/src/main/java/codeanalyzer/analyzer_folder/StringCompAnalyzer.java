/**
 * 
 */
package codeanalyzer.analyzer_folder;

import java.io.IOException;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import codeanalyzer.metric_folder.*;
import codeanalyzer.reader_folder.*;


/**
 * @author dimitrispapakyriakopoulos
 *
 *
 *Purpose: Calculate metrics by reading file as a List
 */
public class StringCompAnalyzer implements Analyzer {
	
	@Override
	public Map<String, Integer> calculateMetrics(String srcFilepath, String srcFileLocation) throws IOException {
		//initialise
		FactorySrcFileReader reader = new FactorySrcFileReader();
		SrcFileReader sfr = reader.initializeSrcFileReader(srcFileLocation);
		Metric locMetric = new LOCMetric();
		Metric nocMetric = new NOCMetric();
		Metric nomMetric = new NOMMetric();
		//initialise metrics
		int loc, noc, nom;
		loc = noc = nom = -1;
		Map<String, Integer> metrics = new HashMap<String, Integer>();
		//calculations
		List<String> srcCodeList = sfr.readFileIntoList(srcFilepath);
		loc = locMetric.calculationWithStrComp(srcCodeList);
		noc = nocMetric.calculationWithStrComp(srcCodeList);
		nom = nomMetric.calculationWithStrComp(srcCodeList);	
		//insert metrics object
		metrics.put("LOC", loc);
		metrics.put("NOC", noc);
		metrics.put("NOM", nom);
		//return metrics
		return metrics;
	}

}
