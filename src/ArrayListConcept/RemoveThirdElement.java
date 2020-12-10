/**
 * 
 */
package ArrayListConcept;

import java.util.ArrayList;

/**
 * @author Pratik
 *
 */
public class RemoveThirdElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> alist = new ArrayList<Object>();
		
		alist.add(1);
		alist.add("Hello");
		alist.add("Orange");
		alist.add(43);
		alist.add("myname");
		
		System.out.println("--------------Before Delete--------------");
		alist.stream().forEach(list ->System.out.println(list));
		alist.remove(2);

		System.out.println("--------------After Delete--------------");
		alist.stream().forEach(dlist ->System.out.println(dlist));
	}

}
