/*

Program: Eclipse.java          Last Date of this Revision: February 22, 2022

Purpose: Modify the BreakAPlate application to display a picture of the prize 
won rather than text naming the prize.

Author: Nathaniel Gatus, 
School: CHHS
Course: Computer Programming 30
 

*/

package defaultpackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Answer1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Answer1 frame = new Answer1();
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
	public Answer1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Play Again");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame main = new MainFrame();
				main.setVisible(true);
			}
		});
		contentPane.add(btnNewButton, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/plates_all_broken.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(100, 100, 250, 250);
		contentPane.add(lblNewLabel, BorderLayout.CENTER);
		
		JLabel lblNewLabel1 = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/tiger_plush_1.png")).getImage();
		lblNewLabel1.setIcon(new ImageIcon(img1));
		lblNewLabel1.setBounds(100, 100, 250, 250);
		contentPane.add(lblNewLabel1, BorderLayout.SOUTH);
	}

}
