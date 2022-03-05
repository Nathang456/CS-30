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

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Notdivisible extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Notdivisible frame = new Notdivisible();
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
	public Notdivisible() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 255, 115);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Integer is not divisible by three.");
		contentPane.add(lblNewLabel, BorderLayout.CENTER);
	}

}

