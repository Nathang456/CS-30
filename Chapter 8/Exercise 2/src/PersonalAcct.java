/*

Program: Eclipse.java          Last Date of this Revision: March 8, 2022
Purpose: Create PersonalAcct and BusinessAcct classes that inherit the 
Account class presented in Chapter 7.
Author: Nathaniel Gatus
School: CHHS
Course: Computer Programming 30
 
*/

public class PersonalAcct extends Account {
	
	double bal;

	public PersonalAcct(double bal, String fName, String lName, String str,
		String city, String st, String zip) {
		super( bal, fName, lName, str, city, st, zip);
		
	}

	public static void main(String[] args) {
		
		double balance = 99;
		
		PersonalAcct acc1 = new PersonalAcct(balance, "Eren", "Smith", "1st Street", "Calgary", "Alberta", "");
		
		System.out.println(acc1);
		
		if (balance < 100) {
			
			System.out.println("Your balance falls below the minimum balance of $100.");
			System.out.println("$2 will now be charged to your account.");
			balance = balance - 2;
			
		} else {
			
			System.out.println("Have a nice day.");
		}
	}
}

/*

Eren Smith
1st Street
Calgary, Alberta  
Current balance is $99.00
Your balance falls below the minimum balance of $100.
$2 will now be charged to your account.
 
*/
