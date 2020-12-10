package DailyPractice28112020;

public class CamelCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "hello";

		StringBuilder sb = new StringBuilder();

		for (char c : s.toCharArray()) {

			if (Character.isLowerCase(c)) {

				System.out.println();
			}

		}
	}
}