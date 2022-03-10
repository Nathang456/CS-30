/*

Program: Eclipse.java          Last Date of this Revision: March 9, 2022
Purpose: Create Car, Truck, and Minivan classes that inherit the vehicle class.
Author: Nathaniel Gatus
School: CHHS
Course: Computer Programming 30
 
*/

public class Truck extends Vehicle{

	public Truck(String licensePlate, String brand, double weight) {
		super(licensePlate, brand, weight);
		
	}

	public static void main (String[] args) {
		
		Car truck = new Car ("AXT-8756", "Ford", 3000);
		System.out.println(truck);
		System.out.println("A red pickup truck with coffee stained seats.");
	}
}

/*

License plate: AXT-8756
Brand of vehicle: Ford
Weight in kilograms: 3000.0
A red pickup truck with coffee stained seats.

*/