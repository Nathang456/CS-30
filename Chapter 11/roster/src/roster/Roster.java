package roster;

/*

Program: Eclipse.java          Last Date of this Revision: April 19, 2022
Purpose: Create a Roster application that prompts the user for the name
of the file to store student names and then prompts the user for the number 
of students in a class.
Author: Nathaniel Gatus
School: CHHS
Course: Computer Programming 30
 
*/

	import java.io.*;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Scanner;

	public class Roster implements Serializable {
		
		public static void main(String[] args) throws EOFException {
			
			try {
			
				Scanner s = new Scanner(System.in);
				System.out.println("Name of file?");
				String Name = s.nextLine();
				
				FileOutputStream fos = new FileOutputStream(Name);
				BufferedOutputStream bos = new BufferedOutputStream(fos);				
				ObjectOutputStream oos = new ObjectOutputStream(bos);
				
				System.out.println("Enter the number of students:");
				int length = s.nextInt();
				String[] myArray = new String[length];
				String[] myArray2 = new String[length]; 
				
				for(int i=0;i<length;i++){
			        
					System.out.println("enter the "+(i+1)+" student's first name:");
			        myArray2[i]=s.next();
			        String name =myArray2[i];
					
					System.out.println("enter "+(name)+"'s last name:");
					myArray[i] = s.next();
					
					ArrayList list = new ArrayList(Arrays.asList(myArray2));
					list.addAll(Arrays.asList(myArray));     
					Object[] myArray3 = list.toArray();
					oos.writeObject(myArray3[i]);
					
		      }
	          
		      oos.close();
	          s.close();
	          
	          Roster readStats = new Roster();
	          readStats.StuName(length, myArray, Name);
	          
			} catch  (EOFException e) {
				
				e.printStackTrace();
	        
	        } catch (IOException e) {

	        	e.printStackTrace();
	        }
		}
		
		public void StuName(int length, String[] input, String Name) {
			
		      FileInputStream fileStream;
		      
			try {
				
				fileStream = new FileInputStream(Name);
			    ObjectInputStream objStream = new ObjectInputStream(fileStream);
			    double total = 0;
			    System.out.println("");
			    System.out.println(Name);
		    	System.out.println("");
			    
			    for(int i=0;i<length;i++){
			    	
			    	Object firstName = objStream.readObject();
			    	String lastName = input[i];
				    toString(firstName, lastName);

			    }
					
			} catch (FileNotFoundException e) {

				e.printStackTrace();
				
			}  catch (IOException e) {

				e.printStackTrace();
	        	
	        } catch (ClassNotFoundException e) {
	        	
	        	e.printStackTrace();
	        	
		}
	}
		
	public String toString(Object firstName, String lastName) {
			
		String stuString = firstName +" "+ lastName;
		System.out.println(stuString);
		return stuString;
	}
}

/* Screen Dump

Name of file?
Roster
Enter the number of students:
5
enter the 1 student's first name:
Tyson 
enter Tyson's last name:
Smith
enter the 2 student's first name:
Alice
enter Alice's last name:
Lee
enter the 3 student's first name:
Bob 
enter Bob's last name:
Jones
enter the 4 student's first name:
Sarah
enter Sarah's last name:
Williams
enter the 5 student's first name:
David
enter David's last name:
Kosh

Roster

Tyson Smith
Alice Lee
Bob Jones
Sarah Williams
David Kosh
	
*/

