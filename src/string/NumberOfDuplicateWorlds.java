package string;

import java.util.HashMap;
import java.util.Set;

public class NumberOfDuplicateWorlds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello How are you Hello";

		String[] words = str.split(" ");
		int len = words.length;

		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++)
				if (words[i].equals(words[j])) {
					System.out.println(words[i]);
				}

		}

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (String word : words) {
			if (hm.containsKey(word)) {
				hm.put(word, hm.get(word) + 1);
			}

			else {
				hm.put(word, 1);
			}

		}

		Set<String> hs = hm.keySet();
		for (String hsword : hs) {
			if (hm.get(hsword) > 1) {
				System.out.println("Duplicate words " +hsword + " " + " No of time duplicate " +hm.get(hsword));
			}

		}

	}

}
