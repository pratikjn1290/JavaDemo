/**
 * 
 */
package collectionConcepts;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

/**
 * @author Pratik
 *
 */

public class HashTableConcept {

	/**
	 * @param args
	 */

	// Hash table is thread safe,
	// Hash tables is synchronized
	// hash table has no null value and key
	// hash table has unique values,
	// hash table stores value in in terms of key - objects - Hash code - value
	// what is hash code = hash code is 32 bit signed integer unique value
	// if two hash table are same then Hash codes are same
	// performance is poor,
	// multithreading is not used

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable ht = new Hashtable();
		ht.put(1, "James");
		ht.put(2, "James2");
		ht.put(3, "James3");
		ht.put(4, "James4");

		Hashtable h2 = new Hashtable();
		h2 = (Hashtable) ht.clone();

		System.out.println(h2);
		System.out.println(ht);

		// Search Contains

		boolean t1 = ht.contains("James");
		System.out.println(t1);

		// TO iterate Hashtable enumaration is used

		Enumeration e = ht.elements();
		while (e.hasMoreElements()) {
			Object str = e.nextElement();
			System.out.println(str);
		}

		Set s1 = ht.entrySet();

	}
}