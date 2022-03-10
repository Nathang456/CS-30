import java.util.ArrayList;

/*

Program: Eclipse.java          Last Date of this Revision: March 7, 2022
Purpose: The Staff class should include members for storing and returning
the job title.
Author: Nathaniel Gatus
School: CHHS
Course: Computer Programming 30
 
*/

public class Staff extends UEmployee{

	public Staff(String name, String salary) {
		
		super(name, salary);
	}

	public static void main (String[] args) {
		
		Faculty prof = new Faculty ("Chemistry Professor", "");
		Faculty jan = new Faculty ("University Janitor", "");
		Faculty assistant = new Faculty ("Staff Assistant", "");
		
		ArrayList<UEmployee> arr = new ArrayList<UEmployee>();
		arr.add(prof);
		arr.add(jan);
		arr.add(assistant);
		
		System.out.println(prof);
		System.out.println("");
		System.out.println(jan);
		System.out.println("");
		System.out.println(assistant);
		System.out.println("");
	}
	
	public String toString() {
		
		return(name);
	}
}

/* Screen Dump

Chemistry Professor

University Janitor

Staff Assistant

*/