/*

Program: Eclipse.java          Last Date of this Revision: March 14, 2022
Purpose: Create a MyFile application that creates a file named zzzz.txt 
and then displays a message indicating that the file has been created.
Author: Nathaniel Gatus
School: CHHS
Course: Computer Programming 30
 
*/

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class MyFile2 {
	
	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner file = new Scanner(System.in); 
		File newFile = new File("zzz.txt");
		
		try {
			 
			if (newFile.createNewFile()){
				
			        System.out.println("The zzz.txt file has been created.");
			        System.out.println("Would you like to keep this file? (y/n)");
			    	String text = file.nextLine();
			    	
			    	if (text.equals("n")) {
			    		
			            try {
			                Files.deleteIfExists(
			                		
			                    Paths.get("zzz.txt"));
			                
			            } catch (IOException e) {

			    			e.printStackTrace();
			    		}  
			    		
			    		System.out.println("File has been deleted.");
			    		
			    	}else{
			    		
			    		System.out.println("The zzz.txt file is now in your pc.");
			    	}
			        
				}else{
					
			        System.out.println("The zzz.txt file already exists.");
			        System.out.println("Would you like to delete this file? (y/n)");
			    	String text = file.nextLine();
			    	
			    	if (text.equals("y")) {
			    		
			            try {
			                Files.deleteIfExists(
			                		
			                    Paths.get("zzz.txt"));
			                
			            } catch (IOException e) {

			    			e.printStackTrace();
			    		}  
			            
			            System.out.println("File has been deleted.");
			            
			    	}else{
			    		
			    		System.out.println("The zzz.txt file is now in your pc.");
			    	}
			    } 
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}

/* Screen Dump

The zzz.txt file already exists.
Would you like to delete this file? (y/n)
y
File has been deleted.

*/
