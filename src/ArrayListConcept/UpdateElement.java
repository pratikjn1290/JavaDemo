/**
 * 
 */
package ArrayListConcept;

import java.util.ArrayList;

/**
 * @author Pratik
 *
 */
public class UpdateElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write a Java program to update specific array element by given element

		ArrayList<String> Al = new ArrayList<String>();
		Al.add("Hello");
		Al.add("Hello1");
		Al.add("Hello2");
		Al.add("Hello3");
		Al.add("Hello4");

		System.out.println("--------Before Update--------");
		for (String alist : Al) {
			System.out.println(alist);
		}

		Al.set(3, "Hello5");

		System.out.println("--------After Update--------");

		Al.stream().forEach(elem -> System.out.println(elem));
	}

}
