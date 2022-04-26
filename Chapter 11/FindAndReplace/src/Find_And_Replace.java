import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*

Program: Eclipse.java          Last Date of this Revision: March 14, 2022
Purpose: Create a FindAndReplace application that prompts the user for a file 
name, a search word or phrase, and a replacement word or phrase.
Author: Nathaniel Gatus
School: CHHS
Course: Computer Programming 30
 
*/

public class Find_And_Replace {

	public static void main(String[] args) throws EOFException {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Name of file?");
		String File = s.nextLine();
		
		File file = new File(File);
		
		System.out.println("Search word or phrase?");
		String searchWord = s.nextLine();
		
		System.out.println("Replacement word or phrase?");
		String replacementWord = s.nextLine();
		
		s.close();
		
		Find_And_Replace replace = new Find_And_Replace();
		replace.reader(file, searchWord, replacementWord, File);
		
	}
	
	public void reader (File file, String searchWord, String replaceWord, String File) {
		
		try {
			
			FileReader reader = new FileReader(file);
			BufferedReader br = new BufferedReader(reader);
			
			Scanner scanner = new Scanner(br);
		    
			while (scanner.hasNextLine()) {
				
			   final String lineFromFile = scanner.nextLine();
			   
			   if(lineFromFile.contains(searchWord)) { 
			
				   String newText = lineFromFile.replaceAll(searchWord, replaceWord);
				   FileWriter writer = new FileWriter(File);
				   writer.write(newText);
				   writer.close();
				   
			   } else {
				   
				   System.out.println("File does not contain search word.");
				   
			   }
			       
			} 
			
			scanner.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {

			e.printStackTrace();
        	
        }
	}
}

/*

Name of file?
C:\Users\thanm\OneDrive\Documents\egg.txt
Search word or phrase?
egg
Replacement word or phrase?
toast

*/
