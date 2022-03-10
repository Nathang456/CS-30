
/*

Program: Eclipse.java          Last Date of this Revision: March 9, 2022
Purpose: Create Car, Truck, and Minivan classes that inherit the vehicle class.
Author: Nathaniel Gatus
School: CHHS
Course: Computer Programming 30
 
*/

public class Car extends Vehicle{

	public Car(String licensePlate, String brand, double weight) {
		super(licensePlate, brand, weight);
	}
	
	public static void main (String[] args) {
		
		Car car = new Car ("FRJ-5231", "Tesla", 1500);
		System.out.println(car);
		System.out.println("A new car with a white paint job.");
		
	}
}

/*

License plate: FRJ-5231
Brand of vehicle: Tesla
Weight in kilograms: 1500.0
A new car with a white paint job.
 
*/