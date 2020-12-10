/**
 * 
 */
package ArrayListConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Pratik
 *
 */
public class SwapOfTwoElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.add(12);
		arr.add(89);
		arr.add(76);
		arr.add(65);
		arr.add(34);
		arr.add(13);

		System.out.println("---------------Before Swap---------------");
		arr.stream().forEach(element -> System.out.println(element));
		System.out.println("---------------After Swap---------------");
		Collections.swap(arr, 4, 5);
		arr.stream().forEach(element -> System.out.println(element));
		

		
		
		
	}
}