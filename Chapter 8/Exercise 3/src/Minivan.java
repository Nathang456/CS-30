
/*

Program: Eclipse.java          Last Date of this Revision: March 9, 2022
Purpose: Create Car, Truck, and Minivan classes that inherit the vehicle class.
Author: Nathaniel Gatus
School: CHHS
Course: Computer Programming 30
 
*/

public class Minivan extends Vehicle {

	public Minivan(String licensePlate, String brand, double weight) {
		super(licensePlate, brand, weight);
		
	}

	public static void main (String[] args) {
		
		Car mini = new Car ("JOT-5167", "Honda", 2000);
		System.out.println(mini);
		System.out.println("A grey van with dinosaurs traced onto the windows.");
	}
}

/*

License plate: AXT-8756
Brand of vehicle: Ford
Weight in kilograms: 3000.0
A red pickup truck with coffee stained seats.

*/