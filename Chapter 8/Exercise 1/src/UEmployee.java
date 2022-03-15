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

	private String name;
	private double salary;

	public UEmployee(String name, double salary) {
		
		this.setName(name);
		this.setSalary(salary);
	}

	public static void main (String[] args) {
		
		UEmployee Zeke = new UEmployee ("Zeke Rodriguez", 40);
		UEmployee Amanda = new UEmployee ("Amanda Smith", 40);
		UEmployee Joshua = new UEmployee ("Joshua Khamzat", 40);
		
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
		
		return(getName() + ", " + getSalary() + " dollars per hour");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}

/* Screen Dump

Zeke Rodriguez, 40.0 dollars per hour

Amanda Smith, 40.0 dollars per hour

Joshua Khamzat, 40.0 dollars per hour

*/
