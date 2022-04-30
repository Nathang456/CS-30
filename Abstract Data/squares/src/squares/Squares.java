package squares;

/*

Program: Eclipse.java          Last Date of this Revision: April 26, 2022
Purpose: Create a Squares application that stores the number corresponding
to the element's index in an integer array of 5 elements. 
Author: Nathaniel Gatus
School: CHHS
Course: Computer Programming 30
 
*/

public class Squares {

	public static void main(String[] args) {
		
		int[] squaresarray;
		int length = 5;
		squaresarray = new int[length];
		
		for(int i=0;i<length;i++){
			
			squaresarray[i]=i * i;
			System.out.println(squaresarray[i]);
			
		}
	}
}

/* Screen Dump

0
1
4
9
16

*/
