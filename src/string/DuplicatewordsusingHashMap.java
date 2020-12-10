package string;

import java.util.HashMap;
import java.util.Set;

public class DuplicatewordsusingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello All I love Java and Love to code in Java";

		String words[] = s.split(" ");

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		for (String word : words) {
			if (hm.containsKey(word)) {
				hm.put(word, hm.get(word) + 1);
			}

			else {
				hm.put(word, 1);
			}
		}

		Set<String> countofword = hm.keySet();
		for (String wordcount : countofword) {
			if (hm.get(wordcount) > 1) {

				System.out.println("Duplicate word: " + wordcount + " Appears" + " " + +hm.get(wordcount) + " times" );
			}

		}

	}

}
