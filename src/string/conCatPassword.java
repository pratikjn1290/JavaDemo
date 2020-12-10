package string;

public class conCatPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "hackerrank";
		String s2 = "mountain";

		StringBuilder result = new StringBuilder();

		int len_s1 = s1.length();
		int len_s2 = s2.length();

		for (int i = 0; i < len_s1 || i < len_s2; i++) {
			if (i < len_s1)
				result.append(s1.charAt(i));
			if (i < len_s2)
				result.append(s2.charAt(i));
		}
		System.out.println(result.toString());
	}
}