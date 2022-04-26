/*

Program: Eclipse.java          Last Date of this Revision: March 14, 2022
Purpose: Create a Stats application that reads names and scores from a data
file named test1.dat, supplied with this text.
Author: Nathaniel Gatus
School: CHHS
Course: Computer Programming 30
 
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Stats implements Serializable {
	
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
			int [] myArray = new int[length];
			String[] myArray2 = new String[length]; 
			
			for(int i=0;i<length;i++){
		        
				System.out.println("enter the "+(i+1)+" student's name:");
		        myArray2[i]=s.next();
		        String name =myArray2[i];
				
				System.out.println("enter "+(name)+"'s grade:");
				myArray[i] = s.nextInt();
				
				ArrayList list = new ArrayList(Arrays.asList(myArray2));
				list.addAll(Arrays.asList(myArray));     
				Object[] myArray3 = list.toArray();
				oos.writeObject(myArray3[i]);
				
	      }
          
	      oos.close();
          s.close();
          
          Stats readStats = new Stats();
          readStats.reader(length, myArray, Name);
          
		} catch  (EOFException e) {
			
			e.printStackTrace();
        
        } catch (IOException e) {

        	e.printStackTrace();
        }
	}
	
	public void reader(int length, int[] input, String Name) {
		
	      FileInputStream fileStream;
	      
		try {
			
			fileStream = new FileInputStream(Name);
		    ObjectInputStream objStream = new ObjectInputStream(fileStream);
		    double total = 0;
		    
		    for(int i=0;i<length;i++){
		    	
			    System.out.println(objStream.readObject() + " " + input[i]);
			    total = total + input[i];

		    }

			Arrays.sort(input);
			int res = input[length-1];
			int ser = input[0];
			double average = total / length;
			
			System.out.println("Lowest test score is: " + ser);
			System.out.println("Highest test score is: " + res);
			System.out.println("Average test score is: " + average);
			
				
		} catch (FileNotFoundException e) {

			e.printStackTrace();
			
		}  catch (IOException e) {

			e.printStackTrace();
        	
        } catch (ClassNotFoundException e) {
        	
        	e.printStackTrace();
        	
        }
	}
}

/* Screen Dump

Name of file?
test1
Enter the number of students:
5
enter the 1 student's name:
Josh
enter Josh's grade:
67
enter the 2 student's name:
James
enter James's grade:
89
enter the 3 student's name:
Ann
enter Ann's grade:
90
enter the 4 student's name:
Tommy
enter Tommy's grade:
87
enter the 5 student's name:
Ally
enter Ally's grade:
88
Josh 67
James 89
Ann 90
Tommy 87
Ally 88
Lowest test score is: 67
Highest test score is: 90
Average test score is: 84.2 

*/
