/*
Program: Eclipse.java          Last Date of this Revision: February 22, 2022
Purpose: Create a DivisibleBy3 application that prompts the user for an integer
and then displays a message when Check is clicked indicating whether the number 
is divisible by 3.
Author: Nathaniel Gatus, 
School: CHHS
Course: Computer Programming 30
 
*/

package defaultpackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Divisiblebythree extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Divisiblebythree frame = new Divisiblebythree();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Divisiblebythree() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 255, 115);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Enter an integer:");
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("Check");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String in = textField.getText();
				double button;
				button = (Double.parseDouble(in))/3;
				int answer = (int) button;
				double ret = button * 3;
				double val = answer * 3;
				int retval = Double.compare(val, ret);
				
				if(retval > 0) {
						Notdivisible anOne = new Notdivisible();
						anOne.setVisible(true);
				    } else if(retval < 0) {
				    	Notdivisible anOne = new Notdivisible();
						anOne.setVisible(true);
				    } else {
				    	Divisible anOne = new Divisible();
						anOne.setVisible(true);
				    }
			}		
	});
		
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.CENTER);
		textField.setColumns(10);
	}

}