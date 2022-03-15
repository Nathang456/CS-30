import java.util.ArrayList;

/*

Program: Eclipse.java          Last Date of this Revision: March 7, 2022
Purpose: The Faculty class should include members for storing and returning 
the department name.
Author: Nathaniel Gatus
School: CHHS
Course: Computer Programming 30
 
*/

public class Faculty extends UEmployee{

	public Faculty(String name, double salary) {
		
		super(name, salary);
	}

	public static void main (String[] args) {
		
		Faculty bio = new Faculty ("Biological Sciences Department", 0);
		Faculty chem = new Faculty ("Chemical Engineering Department", 0);
		Faculty comp = new Faculty ("Computer Science Department", 0);
		
		ArrayList<UEmployee> arr = new ArrayList<UEmployee>();
		arr.add(bio);
		arr.add(chem);
		arr.add(comp);
		
		System.out.println(bio);
		System.out.println("");
		System.out.println(chem);
		System.out.println("");
		System.out.println(comp);
		System.out.println("");
	}
	
	public String toString() {
		
		return(getName());
	}
}

/* Screen Dump

Biological Sciences Department

Chemical Engineering Department

Computer Science Department

*/
