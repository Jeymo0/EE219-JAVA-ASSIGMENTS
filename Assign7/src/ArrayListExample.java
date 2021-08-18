import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ArrayListExample {
public static void main(String args[]) {
		
		ArrayList<String> list = new ArrayList<String>(); // a list of Strings

		System.out.println("Enter some words, hitting return after each word. Enter blank line to end:");
		
		// Read in the list of word from the console (type into the console window)
		Scanner scn = new Scanner(System.in);
		String word;
		while (!(word = scn.nextLine()).equals("")) // read until blank line (empty string)
	        list.add(word); // add word to list (dynamically creates new space in the list)
		
		Collections.sort(list); // A Java library method accepts generic lists
		
		// Iterate through our array list, printing each word
		System.out.print("Your words in sorted order are: ");
		for (int i=0; i<list.size(); i++)
			System.out.print(list.get(i) + ",");
    
        scn.close();

}
}
