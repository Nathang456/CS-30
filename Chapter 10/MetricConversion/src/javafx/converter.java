package javafx;

/*

Program: MetricConversion.java          Last Date of this Revision: February 17, 2022

Purpose: Create a MetricConversion application that allows the user to select a type
of conversion from a combo box and then the corresponding formula is displayed in a label.

Author: Nathaniel Gatus, 
School: CHHS
Course: Computer Programming 30
 

*/

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;

public class converter implements ActionListener{
		final String LABEL_TEXT = "Select a conversion type: ";
		private JFrame frame;
		JPanel contentPane;
		JComboBox<?> conversionType;
		JLabel label, answer;
		
		public static void main (String[] args) {
			 
			EventQueue.invokeLater(new Runnable() {
			public void run() {
			try {
			converter window = new converter();
			window.frame.setVisible(true);
			} catch (Exception e) {
			e.printStackTrace();
				
					}
				}
			});
		}

		public converter( ) {
			initialize();
		}

		private void initialize() {
			
			frame = new JFrame("MetricConversion");
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    contentPane = new JPanel();
		    contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));
		    contentPane.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
		        
		    label = new JLabel(LABEL_TEXT);
		    contentPane.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		    label.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		    contentPane.add(label);
		    
		    String [] type = {"inches to centimeters", "feet to meters", "gallon to liters"
		    		, "pound to kilograms"};
		    
		    conversionType = new JComboBox(type);
		    conversionType.setAlignmentX(JComboBox.LEFT_ALIGNMENT);
		    conversionType.setSelectedIndex(0);
		    conversionType.addActionListener(this);
		    contentPane.add(conversionType);
		    
		    answer = new JLabel("1 inch = 2.54 centimeters");
		    answer.setBorder(BorderFactory.createEmptyBorder (20, 0, 0, 0));
		    
		    contentPane.add(answer);
		    
		    frame.setContentPane(contentPane);
		        
		    frame.pack();
		    frame.setVisible(true);  
		}


	@Override
	public void actionPerformed(ActionEvent event) {
		JComboBox comboBox = (JComboBox)event.getSource();
		String type = (String)comboBox.getSelectedItem();
		
		if (type == "inches to centimeters" ) {
			answer.setText("1 inch = 2.54 centimeters");
		}else if (type == "feet to meters"){
			answer.setText("1 foot = 0.3048 meters");
		}else if (type == "gallon to liters"){
			answer.setText("1 gallon = 4.5461 liters");
		}else if (type == "pound to kilograms"){
			answer.setText("1 pound = 0.4536 kilos");
		}
	}
}
