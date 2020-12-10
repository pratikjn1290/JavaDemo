/**
 * 
 */
package ArrayListConcept;

import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Pratik
 *
 */
public class ReverseElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(23);
		alist.add(24);
		alist.add(25);
		alist.add(26);
		alist.add(27);
		
		Collections.reverse(alist);

			for (int j = 0; j < alist.size(); j++) {
	            System.out.print(alist.get(j) + " ");
			
		}

	}
}