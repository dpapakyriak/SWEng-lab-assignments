/**
 * 
 */
package gradeshistogram;

/**
 *imports of external libraries for the project
 */

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;

import java.util.Collections;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.data.xy.XYSeries;




/**
 * This class has the objective of receiving a file with grades of students (as a parameter) and
 * generating a histogram of the frequencies of grades. 
 * 
 * @author Dimitris Papakyriakopoulos
 *
 */


public class HistogramGenerator {
	
	
	
	public static ArrayList<Integer> readGrades(File file) {   // Reads the grades' file and stores their values in an Array
		
        ArrayList<Integer> grades = new ArrayList<Integer>();
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String gradeS;
            while((gradeS = reader.readLine()) != null) {
                grades.add(Integer.parseInt(gradeS));
            } 
            reader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return grades;
        
    }
	
	
	public static int[] frequencies(ArrayList<Integer> grades) { // calculate frequency for every grade by creating a big array starting from 1 to max(grade) and increasing it by 1 every time I find it
		
	        int[] frqnc = new int[Collections.max(grades)];
	        
	        for(int i = 0; i < grades.size(); i++) {
	        	frqnc[grades.get(i) - 1]++;
	        }
	        
	        return frqnc;
	}
	
	
	public static void generate(int[] frequencies) {    // generate the histogram
        XYSeriesCollection s = new XYSeriesCollection();
        XYSeries d = new XYSeries("frequencies");
        
        for (int i = 0; i < frequencies.length; i++) {
            d.add( (i+1), frequencies[i]);
        }
        s.addSeries(d);

        boolean legend = false;
        boolean tooltips = false;
        boolean urls = false;
        JFreeChart chart = ChartFactory.createXYLineChart(
            "Grades Histogram",             //title
            "Grade",              //x_axis
            "Frequency",             //y_axis
            s, PlotOrientation.VERTICAL, 
            legend, tooltips, urls
        );
        ChartFrame frame = new ChartFrame("Grade Histogram", chart);
        frame.pack();
        frame.setVisible(true);
    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generate(frequencies(readGrades(new File(args[0]))));
		
	}

}
