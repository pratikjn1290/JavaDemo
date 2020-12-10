/**
 * 
 */
package collectionConcepts;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * @author Pratik
 *
 */
public class HashmapwithClass {

	/**
	 * @param args
	 */

	// In this example pass class as an parameter.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, Employee> hm = new HashMap<Integer, Employee>();
		
		//Hash map is class extends map interface,
		//Hash map has key value pair,
		//Hash map has single null key but multiple null values,
		//Hash map has unique elements,
		//Hash map does not maintain order,
		//hash map is not synchronized :- not thread safe,
		// Concurrent Modification exception Fail fast,
		//To avoid above problem fail fast there is one concept called as Concurrent Hash map JDK 1.6
		//To improve performance we use hash map.
		
		Employee emp = new Employee("Pratik", "QA", 26);
		Employee emp1 = new Employee("Jain", "DEV", 25);
		Employee emp2 = new Employee("Mahesh", "Infra", 24);

		hm.put(1, emp);
		hm.put(2, emp1);
		hm.put(3, emp2);
		
		for(Entry<Integer, Employee> mm : hm.entrySet() )
		{
			
			int key = mm.getKey();
			System.out.println(key);
			Employee em = mm.getValue();
			System.out.println(em.Name + " " + em.age + " " + em.dept);
		}

	}

}
