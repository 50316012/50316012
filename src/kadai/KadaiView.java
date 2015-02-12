package kadai;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class KadaiView extends Frame implements ActionListener,WindowListener {
	
	
	public KadaiView(KadaiController controller){
		addWindowListener(this);
		setTitle("Kadai");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		DefaultCategoryDataset data1 = new DefaultCategoryDataset();
		DefaultCategoryDataset data2= new DefaultCategoryDataset();
		
		int month1, month2;
		double temperature1, temperature2, precipitation1, precipitation2;
		ResultSet rs1, rs2;
		
		MySQL1 mysql1 = new MySQL1();
		MySQL2 mysql2 = new MySQL2();
		
		rs1 = mysql1.selectAll();
		rs2 = mysql2.selectAll();
		
		add(new Label("Hamamatsu"));
		
		try {
			while(rs1.next()){
				month1 = rs1.getInt("month");
				temperature1 = rs1.getDouble("temperature");
				precipitation1 = rs1.getDouble("precipitation");
				
				add(new Label("month: "+ month1));
				add(new Label("temperature: "+ temperature1));
				add(new Label("precipitation: "+ precipitation1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		add(new Label("Akita"));
		
		try {
			while(rs2.next()){
				month2 = rs2.getInt("month");
				temperature2 = rs2.getDouble("temperature");
				precipitation2 = rs2.getDouble("precipitation");
				
				add(new Label("month: "+ month2));
				add(new Label("temperature: "+ temperature2));
				add(new Label("precipitation: "+ precipitation2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		data1.addValue(6.3,"Hamamatsu","1");
		data1.addValue(7.0,"Hamamatsu","2");
		data1.addValue(10.4,"Hamamatsu","3");
		data1.addValue(14.4,"Hamamatsu","4");
		data1.addValue(19.2,"Hamamatsu","5");
		data1.addValue(23.1,"Hamamatsu","6");
		data1.addValue(26.5,"Hamamatsu","7");
		data1.addValue(26.6,"Hamamatsu","8");
		data1.addValue(23.4,"Hamamatsu","9");
		data1.addValue(19.3,"Hamamatsu","10");
		data1.addValue(14.5,"Hamamatsu","11");
		data1.addValue(6.9,"Hamamatsu","12");
		data1.addValue(0.0,"Akita","1");
		data1.addValue(-0.1,"Akita","2");
		data1.addValue(3.9,"Akita","3");
		data1.addValue(9.7,"Akita","4");
		data1.addValue(15.5,"Akita","5");
		data1.addValue(21.5,"Akita","6");
		data1.addValue(24.4,"Akita","7");
		data1.addValue(24.6,"Akita","8");
		data1.addValue(20.1,"Akita","9");
		data1.addValue(13.6,"Akita","10");
		data1.addValue(9.1,"Akita","11");
		data1.addValue(1.4,"Akita","12");
		
		JFreeChart chart1 = ChartFactory.createLineChart("temperature2014", "month", "temperature(degree)",data1,PlotOrientation.VERTICAL,true,false,false);
		ChartPanel cpanel1 = new ChartPanel(chart1);
		add(cpanel1,BorderLayout.CENTER);
		
		data2.addValue(53.5,"Hamamatsu","1");
		data2.addValue(175.5,"Hamamatsu","2");
		data2.addValue(261.5,"Hamamatsu","3");
		data2.addValue(149.5,"Hamamatsu","4");
		data2.addValue(166.0,"Hamamatsu","5");
		data2.addValue(41.5,"Hamamatsu","6");
		data2.addValue(124.5,"Hamamatsu","7");
		data2.addValue(89.5,"Hamamatsu","8");
		data2.addValue(171.0,"Hamamatsu","9");
		data2.addValue(399.0,"Hamamatsu","10");
		data2.addValue(119.5,"Hamamatsu","11");
		data2.addValue(79.5,"Hamamatsu","12");
		data2.addValue(143.0,"Akita","1");
		data2.addValue(93.5,"Akita","2");
		data2.addValue(150.0,"Akita","3");
		data2.addValue(20.0,"Akita","4");
		data2.addValue(120.0,"Akita","5");
		data2.addValue(120.5,"Akita","6");
		data2.addValue(126.0,"Akita","7");
		data2.addValue(342.0,"Akita","8");
		data2.addValue(108.0,"Akita","9");
		data2.addValue(220.5,"Akita","10");
		data2.addValue(99.0,"Akita","11");
		data2.addValue(195.0,"Akita","12");
		
		JFreeChart chart2 = ChartFactory.createLineChart("precipitation2014", "month", "precipitation(mm)",data2,PlotOrientation.VERTICAL,true,false,false);
		ChartPanel cpanel2 = new ChartPanel(chart2);
		add(cpanel2,BorderLayout.CENTER);
		
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

