/*

Program: Eclipse.java          Last Date of this Revision: March 9, 2022
Purpose: Create a Vehicle class that is an abstract class defining the 
general details and actions associated with a vehicle.
Author: Nathaniel Gatus
School: CHHS
Course: Computer Programming 30
 
*/

abstract class Vehicle {
	
	String licensePlate;
	String brand;
	double weight;
	String uniqueTrait;

	public Vehicle (String licensePlate, String brand, double weight) {
		
		this.licensePlate = licensePlate;
		this.brand = brand;
		this.weight = weight;
		
	}
	
	public double getWeight() {
		
		return(weight);
		
	}
	
	public String toString() {

		return "License plate: " + licensePlate + System.lineSeparator()
		+ "Brand of vehicle: " + brand + System.lineSeparator() +
		"Weight in kilograms: " + weight;
		
	}
}
