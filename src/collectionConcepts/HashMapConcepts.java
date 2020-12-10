/**
 * 
 */
package collectionConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Pratik
 *
 */
public class HashMapConcepts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "JAVA");
		hm.put(2, "Maya");
		hm.put(3, "C");
		hm.put(4, "C++");

		// Iterate Map

		System.out.println("Print Using Entry Set");
		Set<Entry<Integer, String>> s = hm.entrySet();
		System.out.println(s);
		
		// Iterate Map
		System.out.println("Print Using MAP");
		for (Entry<Integer, String> mm : hm.entrySet()) {
			System.out.println(mm);
			System.out.println(mm.getKey());
			System.out.println(mm.getValue());
		}

		ArrayList<String> al = new ArrayList<String>();
		al.add("I");
		al.add("Love");
		al.add("India");
		HashMap<Integer, ArrayList<String>> hm1 = new HashMap<Integer, ArrayList<String>>();
		hm1.put(1, al);
		hm1.put(2, al);
		hm1.put(3, al);

		for (Entry<Integer, ArrayList<String>> mm1 : hm1.entrySet()) {
			System.out.println(mm1);
		}

	}

}
