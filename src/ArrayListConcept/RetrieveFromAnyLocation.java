/**
 * 
 */
package ArrayListConcept;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Pratik
 *
 */
public class RetrieveFromAnyLocation {

	/**
	 * @param args
	 */

	// Java program to retrieve an element (at a specified index) from a given array
	// list.
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();

		ArrayList<String> s1 = new ArrayList<String>();
		s1.add("A");
		s1.add("B");
		s1.add("C");
		s1.add("D");

		if (i < s1.size()) {
			System.out.println(s1.size());
			System.out.println(s1.get(i));
		}
		
		else
		{
			System.out.println("Invalid value of: " +i);
		}

	}
}