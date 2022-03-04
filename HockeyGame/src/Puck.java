/*

Program: Eclipse.java          Last Date of this Revision: February 28, 2022

Purpose: Create a Puck class that inherits the Disk class. 

Author: Nathaniel Gatus
School: CHHS
Course: Computer Programming 30
 

*/

import java.util.Scanner;

public class Puck extends Disk {
	
	public Puck(double r, double t) {
		super(r, t);
	}

	double weight;
	boolean youth;
	boolean standard;

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Weight of puck:");
			String weight1 = input.nextLine();
			double weight = Double.parseDouble(weight1);
			getWeight(weight);
			
		} catch (NumberFormatException e) {

			e.printStackTrace();
		}
		
	}
	
	public static void getWeight(double weight) {
		
		System.out.println(weight + " ounces.");
		if (weight < 5.5) {
			if (weight > 5) {
				getDivision(false, true);
			} else {
				if (weight < 4.5) {
					if (weight > 4) {
						getDivision(false, true);
					}getDivision(false, false);
				} getDivision(false, false);
			} getDivision(false, false);
		} else {getDivision(false, false);}
	}
	
	public static void getDivision(boolean youth, boolean standard) {
		
		System.out.println("Is the puck standard weight? " + standard);
		System.out.println("Is the puck youth weight? " + youth);
 	}
	
	public static void equals() {
		
	}
	
	public String toString() {
		
		Disk puck = new Disk(1.5, 1);
		String puckString;
		puckString = "Diameter: " + puck.getRadius()*2 + " inches." + 
				"Thickness: " + puck.getThickness() + " inches.";
		return puckString;
	}
}


/* Screen Dump
 
	Weight of puck:
	2
	2.0 ounces.
	Is the puck standard weight? false
	Is the puck youth weight? false
	Diameter: 3.0 inches.
	Thickness: 1.0 inches.

 */

