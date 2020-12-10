package string;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DuplicateWordUsingHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Entered String by user

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		String words[] = s.split(" ");

		HashMap<String, Integer> noofdwords = new HashMap<String, Integer>();

		for (String word : words) {
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
