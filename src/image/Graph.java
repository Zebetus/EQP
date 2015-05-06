/*
*this code is for the creationg of my graph to model the relationships involved in BCS theory.
 *this is created to be called by the main application
*all as part of my EQP project
* MADE BY HARRY SMITH
 */
package image;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


public class Graph extends JFrame {

	public Graph() {
		super("Simplified BCS Theory Graph");

		JPanel chartPanel = createChartPanel();
		add(chartPanel, BorderLayout.CENTER);

		setSize(640, 480);
		setLocationRelativeTo(null);
	}

	private JPanel createChartPanel() {
		String chartTitle = "Simplified BCS Theory Graph";
		String xAxisLabel = "T/Tc";
		String yAxisLabel = "Eg(T)/Eg(0K)";

		XYDataset dataset = createDataset();

		JFreeChart chart = ChartFactory.createXYLineChart(chartTitle, 
				xAxisLabel, yAxisLabel, dataset);

		return new ChartPanel(chart);
	}

	private XYDataset createDataset() {
		XYSeriesCollection dataset = new XYSeriesCollection();
		XYSeries series1 = new XYSeries("");
		double y = 10.0d;
		double x = 0.0d;

		
		while (y > 0.0d ) {
			y = 1.74 * Math.sqrt(1-x);
			series1.add(x , y);
			x = x + 0.0001d;
		}


		dataset.addSeries(series1);


		return dataset;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Graph().setVisible(true);
			}
		});
	}
}