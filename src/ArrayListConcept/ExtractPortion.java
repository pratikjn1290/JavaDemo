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
public class ExtractPortion {

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

		
		List <String> alist1 = alist.subList(3, 5);
		alist1.stream().forEach(elem -> System.out.println(elem));
		
		
	}

}
