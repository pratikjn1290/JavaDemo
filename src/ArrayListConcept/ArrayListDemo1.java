/**
 * 
 */
package ArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @author Pratik
 *
 */

//Write a Java program to create a new array list, add some colors (string) and print out the collection

public class ArrayListDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> s1 = new ArrayList<String>();
		s1.add("Red");
		s1.add("Yellow");
		s1.add("Green");

		System.out.println("------------Using Index and ordered for loop------------");
		
		for (int i = 0; i < s1.size(); i++) {
			System.out.println(s1.get(i));
		}

		System.out.println("------------Using For Each loop------------");

		for (String s2 : s1) {
			System.out.println(s2);
		}

		System.out.println("------------Using Streams Java 8------------");

		s1.stream().forEach(ele -> System.out.println(ele));

		System.out.println("------------Using Iterator------------");
		Iterator<String> str = s1.iterator();
		while (str.hasNext()) {
			String data = str.next();
			System.out.println(data);
		}

		System.out.println("------------Using List Iterator------------");

		ListIterator<String> li = s1.listIterator(s1.size());
		while (li.hasPrevious()) {
			String d1 = li.previous();
			System.out.println(d1);
		}

		System.out.println("------------Using Lambda Expression------------");

		s1.forEach(elem ->
		System.out.println(elem));
				
	}
}