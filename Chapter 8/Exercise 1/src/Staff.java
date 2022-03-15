/*

Program: Eclipse.java          Last Date of this Revision: March 7, 2022
Purpose: The Staff class should include members for storing and returning
the job title.
Author: Nathaniel Gatus
School: CHHS
Course: Computer Programming 30
 
*/

public class Staff extends UEmployee{
	
	static String jobTitle;

	public Staff(String name, double salary) {
		
		super(name, salary);
	}
	
	public static void main (String[] args) {

		String name = "Zeke Rodriguez";
		double salary = 40;
		
		UEmployee Zeke = new UEmployee (name, salary);
		
		jobTitle = "Chemistry Professor";
		System.out.println(Zeke + ", " + jobTitle);
	}
	
	public String toString() {
		
		return(getName() + ", " + getSalary() + " dollars per hour");
	}
}

/* Screen Dump

Zeke Rodriguez, 40.0 dollars per hour, Chemistry Professor

*/
