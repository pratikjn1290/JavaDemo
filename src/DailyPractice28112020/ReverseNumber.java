package DailyPractice28112020;

public class ReverseNumber {

	public static void main(String args[]) {

		int number = 153;
		int rev = 0;

		while (number > 0) {
			int digit = number % 10;
			rev = digit + (rev * 10);
			number = number / 10;
		}

		System.out.println(rev);
	}

}
