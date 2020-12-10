package string;

import java.util.Arrays;

public class Anagram {
	public static void main(String args[]) {

		char[] str3 = { 'l', 'i', 's', 't', 'e', 'n' };
		char[] str4 = { 's', 'i', 'l', 'e', 'n', 't' };

		if (areAnagram(str3, str4)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}
	}

	public static boolean areAnagram(char[] s1, char[] s2) {

		Arrays.sort(s1);
		Arrays.sort(s2);

		if (s1.length != s2.length) {
			return false;
		}

		for (int i = 0; i < s1.length; i++) {
			if (s1[i] != s2[i]) {
				return false;
			}
		}
		return true;

	}
}