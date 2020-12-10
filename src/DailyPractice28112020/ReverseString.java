package DailyPractice28112020;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello How Are you";
		String rev = "";
		int len = s.length();

		for (int i = len - 1; i >= 1; i--) {
			rev = rev + s.charAt(i);

		}
		System.out.println(rev);
	}

}
