
package findname;

import java.util.Scanner;

/*

Program: Eclipse.java          Last Date of this Revision: April 27, 2022
Purpose: Add a static method to the Search class that performs a linear 
search on a String array.
Author: Nathaniel Gatus
School: CHHS
Course: Computer Programming 30
 
*/

public class FindName extends Search{

	public static void main (String[] args) {
		
		try {
			
			Scanner s = new Scanner(System.in);
			
			System.out.println("Enter the number of names:");
			int length = s.nextInt();
			String[] array1 = new String[length]; 
			
			for(int i=0;i<length;i++){
		        
				System.out.println("enter the "+(i+1)+" student's name:");
		        array1[i]=s.next();
				
			} 
			
			Scanner d = new Scanner(System.in);
			System.out.println("Enter the name you want to find:");
			String nametoFind = d.nextLine();
			
			Search ans = new Search();
			int lo = ans.linear(array1, nametoFind);
			
			System.out.println("The location of " +nametoFind+ " within the array is " + lo);
			
			s.close();
			d.close();
			
		} finally {}
	}
}

/* Screen Dump

Enter the number of names:
3
enter the 1 student's name:
alex
enter the 2 student's name:
josh
enter the 3 student's name:
sarah
Enter the name you want to find:
alex
The location of alex within the array is 1

*/
