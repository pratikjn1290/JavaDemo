package DailyPractice28112020;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Listen";
		String s2 = "Silent";

		char[] str1 = s1.toCharArray();
		char[] str2 = s2.toCharArray();

		Arrays.sort(str1);
		Arrays.sort(str2);
		boolean flag = false;

		if (s1.length() != s2.length()) {
			System.out.println("String is not anagram");
		}

		for (int i = 0; i < s1.length(); i++) {
			if (str1[i] != str2[i]) {
				flag = true;
			}

			else {

				flag = false;
				break;
			}
		}

		if (!flag) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not anagram");
		}
	}

}
