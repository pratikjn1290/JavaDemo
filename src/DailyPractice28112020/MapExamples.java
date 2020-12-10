package DailyPractice28112020;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapExamples {

	public static void main(String args[]) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		hm.put("Java", 1);
		hm.put("QA", 2);
		hm.put("Testing", 3);
		hm.put("C", 4);
		hm.put("C++", 5);

		Set<Entry<String, Integer>> key = hm.entrySet();
		System.out.println(key);
		System.out.println(hm.entrySet());

		String s = null;
		Iterator<String> itr = hm.keySet().iterator();
		while (itr.hasNext()) {
			s = itr.next();
			System.out.println(s);
		}
		
		Iterator<Integer> itr1 = hm.values().iterator();
		while(itr1.hasNext())
		{
			Integer str = itr1.next();
			System.out.println(str);
		}
		
		for(Entry<String, Integer> entrys : hm.entrySet())
		{
			System.out.println(entrys);
		}
		
	}
}
