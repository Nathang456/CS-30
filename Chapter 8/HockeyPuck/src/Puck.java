/*

Program: Eclipse.java          Last Date of this Revision: March 1, 2022
Purpose: Create a Puck class that inherits the Disk class. 
Author: Nathaniel Gatus
School: CHHS
Course: Computer Programming 30
 
*/

import java.util.ArrayList;


public class Puck extends Disk implements Comparable<Puck>{
	
	private double weight;
	static boolean standard;
	static boolean youth;

	public Puck(double r, double t, double weight, boolean standard, boolean youth) {
		
		super(r, t);
		this.weight = weight;
	}

	public static void main(String[] args) {	
		
		double first = 5;
		double second = 5.4;
		
		getWeight(first, second);
		
		Puck p1 = new Puck(1.5, 1, first, standard, youth);
		Puck p2 = new Puck(1.5, 1, second, standard, youth);
		
		getDivision(first, second);
		
		System.out.println(p1);
		System.out.println("");
		
		int I = p1.compareTo(p2);
		
		if (I < 0) {
			
			System.out.println("These pucks are not the same weight.");
			
		} else if (I == 0) {
			
			System.out.println("Both pucks are the same weight.");
			
		} else if (I > 0) {
			
			System.out.println("These pucks are not the same weight.");
			
		}
	}
	
	public static void getWeight(double first, double second) {

		Puck p1 = new Puck(1.5, 1, first, standard, youth);
		Puck p2 = new Puck(1.5, 1, second, standard, youth);
		
		ArrayList<Puck> arr = new ArrayList<Puck>();
		arr.add(p1);
		arr.add(p2);
		
		for (Puck p: arr) {
			System.out.println("This hockey puck weighs " + p.weight + " ounces");
			System.out.println("");
		}
	}
	
	public static void getDivision(double first, double second) {
		
		Puck p1 = new Puck(1.5, 1, first, standard, youth);
		
		Puck minimumStandard = new Puck(1.5, 1, 5, standard, youth);
		Puck maximumStandard = new Puck(1.5, 1, 5.5, standard, youth);
		Puck minimumYouth = new Puck(1.5, 1, 4, standard, youth);
		Puck maximumYouth = new Puck(1.5, 1, 4.5, standard, youth);
		
		int I1 = p1.compareTo(minimumStandard);
		int I2 = p1.compareTo(maximumStandard);
		int I3 = p1.compareTo(minimumYouth);
		int I4 = p1.compareTo(maximumYouth);
		
		if (I1 >= 0) {
			
			if (I2 < 0) {
				
				standard = true;
				youth = false;

			} 
			
		} else { 
			
			standard = false;
			
			if (I3 >= 0) {
				
				if (I4 < 0) {

					youth = true;
				} 
			}
		}
 	}
	
	public double equals() {
		
		return this.weight;
	}
	
	@Override
	public String toString() {
		
		String message;
		message = "Is the first puck standard weight? " + "(" + standard + ")" +
				" Is the first puck youth weight? " + "(" + youth + ")";
		return(message);
		
	}

	public int compareTo(Puck o) {
		
	if(this.equals() == o.equals()) return 0;
	
	else if(this.equals() > o.equals()) return 1;
		
	else return -1;
	
	}
}


/* Screen Dump
 
	This hockey puck weighs 5.0 ounces

	This hockey puck weighs 5.4 ounces

	Is the first puck standard weight? (true) Is the first puck youth weight? (false)

	These pucks are not the same weight.
	
 */
