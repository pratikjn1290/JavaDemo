/**
 * 
 */
package collectionConcepts;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Pratik
 *
 */
public class LinkedListConcepts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> li = new LinkedList<String>();
		li.add("C++");
		li.add("Jython");
		li.add("Python");
		li.add("Java");
		li.add("RPA");

		System.out.println("-----------Before Add Element-----------");
		li.addFirst("Cobol");
		li.addLast("Pascal");

		li.stream().forEach(element -> System.out.println(element));

		System.out.println("-----------After Add Element-----------");

		li.stream().forEach(element -> System.out.println(element));

		li.get(0);
		li.getFirst();
		li.getLast();
		li.get(li.size() - 1);
		li.set(0, "Maya");

		System.out.println("-----------After Add Element-----------");

		li.stream().forEach(element -> System.out.println(element));

		li.remove(0);
		li.remove("Java");

		System.out.println("-----------After Remove Element Stream-----------");
		li.stream().forEach(elem -> System.out.println(elem));

		// Using Iterator
		System.out.println("-------------Iterator-------------");
		Iterator<String> itr = li.iterator();
		while (itr.hasNext()) {
			String i1 = itr.next();
			System.out.println(i1);
		}

		// Using For Each loop
		System.out.println("-------------For Each-------------");
		for (String s1 : li) {
			System.out.println(s1);
		}

	}

}
