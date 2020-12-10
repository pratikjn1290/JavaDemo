/**
 * 
 */
package ArrayDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @author Pratik
 *
 */
public class ArrayListIteration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> moviesname = new ArrayList<String>();
		moviesname.add("Gayal");
		moviesname.add("Ghatak");
		moviesname.add("Arjun Pandit");
		moviesname.add("Jiddi");
		moviesname.add("Damini");
		moviesname.add("Jeet");
		moviesname.add("Salakhen");

		// Approach1 Using Iterator
		System.out.println("---------Using Iterator---------");
		Iterator<String> itr = moviesname.iterator();

		while (itr.hasNext()) {
			String itrdata = itr.next();
			System.out.println(itrdata);
		}

		// Approach 2 using for each loop

		System.out.println("---------Using for each loop---------");
		for (String str : moviesname) {
			System.out.println(str);
		}
		// Using lambda expression
		System.out.println("---------Using lambda---------");
		moviesname.forEach(show -> {
			System.out.println(show);
		});

		// using normal for loop

		System.out.println("---------Using For Loop---------");
		for (int i = 0; i < moviesname.size(); i++) {
			System.out.println(moviesname.get(i));

		}

		// Using list iterator

		System.out.println("---------Using list iterator---------");

		ListIterator<String> data = moviesname.listIterator(moviesname.size());
		while (data.hasPrevious()) {
			String mydata = data.previous();
			System.out.println(mydata);
		}
	}

}
