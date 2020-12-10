/**
 * 
 */
package ArrayListConcept;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @author Pratik
 *
 */
public class InsertFirstandlastLocation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Object> al = new ArrayList<Object>();
		al.add("Pratik");
		al.add("23");
		al.add("Komal");
		al.add("25");
		al.add(0, "QA");

		System.out.println(al.get(al.size() - 1));

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
	}

}
