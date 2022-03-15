/*

Program: Eclipse.java          Last Date of this Revision: March 7, 2022
Purpose: The Faculty class should include members for storing and returning 
the department name.
Author: Nathaniel Gatus
School: CHHS
Course: Computer Programming 30
 
*/

public class Faculty extends UEmployee{

	static String department;
	
	public Faculty(String name, double salary) {
		
		super(name, salary);
	}

	public static void main (String[] args) {
		
		String name = "Zeke Rodriguez";
		double salary = 40;
		
		UEmployee Zeke = new UEmployee (name, salary);
		
		department = "Chemistry Department";
		System.out.println(Zeke + ", " + department);
	}
	
	public String toString() {
		
		return(getName() + ", " + getSalary() + " dollars per hour");
	}
}

/* Screen Dump

Zeke Rodriguez, 40.0 dollars per hour, Chemistry Department

*/
