/**
 * 
 */
package codeanalyzer.reader_folder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author dimitrispapakyriakopoulos
 *
 */
public class LocalFileReader implements SrcFileReader {

	public String readFileIntoString(String srcFilePath) throws IOException {
		
	    StringBuilder builder = new StringBuilder();
	    File file = new File(srcFilePath);
	    BufferedReader reader = new BufferedReader(new FileReader(file));
	    String line = null;
	    while ((line = reader.readLine()) != null) {
	    	builder.append(line + "\n");
	    }
	    reader.close();
	    return builder.toString();
	  }

	  public List<String> readFileIntoList(String srcFilePath) throws IOException {
	    List<String> lines = new ArrayList<>();
	    File file = new File(srcFilePath);
	    BufferedReader reader = new BufferedReader(new FileReader(file));
	    String line = null;
	    while ((line = reader.readLine()) != null) {
	      lines.add(line);
	    }
	    reader.close();
	    return lines;
	  }
}
