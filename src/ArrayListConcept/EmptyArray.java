/**
 * 
 */
package ArrayListConcept;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pratik
 *
 */
public class EmptyArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> alist = new ArrayList<>();
		alist.add("Orange");
		alist.add("Mild");
		alist.add("Black");
		alist.add("Green");
		alist.add("Yellow");

		System.out.println("---------------Before Delete Array value---------------");
		alist.stream().forEach(elem -> System.out.println(elem));

		alist.removeAll(alist);
		System.out.println("---------------After Delete Remove Array value---------------");
		alist.stream().forEach(eleme -> System.out.println(eleme));
	}

}
