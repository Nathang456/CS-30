/*

Program: Eclipse.java          Last Date of this Revision: March 14, 2022
Purpose: Create a MyFile application that prompts the user for the name of a file 
and then displays a message that indicates whether the file exists or not.
Author: Nathaniel Gatus
School: CHHS
Course: Computer Programming 30
 
*/

import java.io.*;
import java.util.Scanner;

public class MyFile1 {
	
	public static void main(String[] args) {
	
	@SuppressWarnings("resource")
	Scanner file = new Scanner(System.in); 
	System.out.println("File name: ");
	String text = file.nextLine();
	
	File textFile = new File(text);{
		
		if (textFile.exists()) {
		
			System.out.println("File exists.");
		
			} else {
			
			System.out.println("File does not exist.");
		
			}
		}
	}
}

/* Screen Dump

File name: 
zzz.txt
File exists.

*/
