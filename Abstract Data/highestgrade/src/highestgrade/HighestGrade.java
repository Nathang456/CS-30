package highestgrade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*

Program: Eclipse.java          Last Date of this Revision: March 14, 2022
Purpose: Create a HighestGrade application that prompts the user for five
grades between 0 and 100 points and stores the grades in an ArrayList.
Author: Nathaniel Gatus
School: CHHS
Course: Computer Programming 30
 
*/

public class HighestGrade {
	
	public static void main (String[] args) {
		
		try {
			
			Scanner s = new Scanner(System.in);
			System.out.println("Enter five grades between 0 and 100:");
			System.out.println("");
			
			ArrayList<Integer> myArray = new ArrayList<>();
			
			for(int i=0;i<5;i++){
				
				int grade = s.nextInt();
				
				if (grade <= 100) {
				
					if (0 < grade) 
						
					myArray.add(grade);
			
				}
			}
			
			s.close();
			
			HighestGrade readStats = new HighestGrade();
			readStats.reader(myArray);
			
		} finally {}
		
	}
	
	public void reader(ArrayList<Integer> myArray) {

		int res = Collections.max(myArray);	
		System.out.println("");
		System.out.println("Highest grade is: " + res);
			
	}
}

/* Screen Dump

Enter five grades between 0 and 100:

500
99
80
87
89

Highest grade is: 99

*/
