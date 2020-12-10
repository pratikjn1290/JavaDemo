package ArrayDemo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateValueinArray {

	public static void main(String args[]) {

		// complexity level o(nXn)

		String names[] = { "Java", "C", "Python", "Ruby", "Java", "C" };

		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equals(names[j])) {
					System.out.println("Array Has duplicate value:- " + names[i]);
				}
			}
		}

		// complexity level o(n)
		Set<String> data = new HashSet<String>();
		for (String name : names)
			if (data.add(name) == false) {
				System.out.println("Duplicate value:- " + name);
			}

		//
		Map<String, Integer> alldata = new HashMap<String, Integer>();
		for (String name : names) {
			Integer count = alldata.get(name);
			if (count == null) {
				alldata.put(name, 1);
			}

			else {
				alldata.put(name, ++count);
			}

			Set<Entry<String, Integer>> finaldata = alldata.entrySet();


		for(Entry<String, Integer> ent : finaldata)
		{
			if(ent.getValue()>1)
			{
				System.out.println("Duplicate value Found " +ent.getKey());
			}
			
			else
			{
				System.out.println("No Duplication Found " +ent.getKey());
			}
		}
		
		}

	}
}