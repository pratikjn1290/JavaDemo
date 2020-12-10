package DailyPractice28112020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateFromList {

	public static void main(String args[])

	{
		List<String> data = new ArrayList<String>();
		data.add("Java");
		data.add("C");
		data.add("Java");
		data.add("c++");
		data.add("maven");

		System.out.println(data);

		System.out.println("------------Distinct----------------");
		
		data.stream().distinct().collect(Collectors.toList());
		
		
		System.out.println("----------------Using Hashset--------------");
		HashSet<String>hs = new HashSet<String>();
		for(String dataList : data)
		{
			if(hs.add(dataList) != true)
			{
				System.out.println(dataList);
			}
		}
		
		System.out.println("----------------Using HashMap--------------------------");
		HashMap<String, Integer> noofdwords = new HashMap<String, Integer>();
		for (String word : data) {
			if (noofdwords.containsKey(word)) {
				noofdwords.put(word, noofdwords.get(word) + 1);
			} else {
				noofdwords.put(word, 1);
			}
		}
		
		Set<String> wordcount = noofdwords.keySet();
		for (String Totalword : wordcount) {
			if (noofdwords.get(Totalword) > 1)
				System.out.println(
						"Duplicate word: " + Totalword + " Appears" + " " + +noofdwords.get(Totalword) + " times");
		}

	}
}
