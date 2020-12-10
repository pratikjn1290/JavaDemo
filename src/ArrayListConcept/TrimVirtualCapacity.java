/**
 * 
 */
package ArrayListConcept;

import java.util.ArrayList;

/**
 * @author Pratik
 *
 */
public class TrimVirtualCapacity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> arr = new ArrayList<String>();
		arr.add("ABC");
		arr.add("DEF");
		arr.add("GHI");
		arr.add("JKL");
		arr.add("MNO");

		arr.trimToSize();

		arr.stream().forEach(elem -> System.out.println(elem));

	}

}
