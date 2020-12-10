package DailyPractice28112020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class DuplicateValueArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> languages = new ArrayList<String>(Arrays.asList("java", "java", "QA", "Testing"));
		System.out.println(languages);

		HashMap<String, Integer> noOfWords = new HashMap<String, Integer>();
		for (String language : languages) {
			if (noOfWords.containsKey(language)) {
				noOfWords.put(language, noOfWords.get(language) + 1);
			} else {
				noOfWords.put(language, 1);
			}
		}
		
		Set<String>hs = noOfWords.keySet();
		for(String word : hs)
		{
			if(noOfWords.get(word) > 1)
			{
				System.out.println(
						"Duplicate word: " + word + " Appears" + " " + +noOfWords.get(word) + " times");
			}
		}
	}

}
