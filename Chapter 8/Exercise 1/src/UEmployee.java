import java.util.ArrayList;

/*

Program: Eclipse.java          Last Date of this Revision: March 7, 2022
Purpose: Create a UEmployee class that contains member variables for the 
university employee name and salary.
Author: Nathaniel Gatus
School: CHHS
Course: Computer Programming 30
 
*/

public class UEmployee{

	String name;
	String salary;

	public UEmployee(String name, String salary) {
		
		this.name = name;
		this.salary = salary;
	}

	public static void main (String[] args) {
		
		UEmployee Zeke = new UEmployee ("Zeke Rodriguez", "40 dollars per hour");
		UEmployee Amanda = new UEmployee ("Amanda Smith", "40 dollars per hour");
		UEmployee Joshua = new UEmployee ("Joshua Khamzat", "40 dollars per hour");
		
		ArrayList<UEmployee> arr = new ArrayList<UEmployee>();
		arr.add(Zeke);
		arr.add(Amanda);
		arr.add(Joshua);
		
		System.out.println(Zeke);
		System.out.println("");
		System.out.println(Amanda);
		System.out.println("");
		System.out.println(Joshua);
		System.out.println("");
	}
	
	public String toString() {
		
		return(name + ", " + salary);
	}
}

/* Screen Dump

Zeke Rodriguez, 40 dollars per hour

Amanda Smith, 40 dollars per hour

Joshua Khamzat, 40 dollars per hour

*/

