package DailyPractice28112020;

public class AbstractNumericValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		extractNumber("Hello 123 Hello");
	}

	public static String extractNumber(String str) {
		if (str.isEmpty() || str == null) {
			return " ";
		}

		StringBuilder sb = new StringBuilder();
		boolean flag = false;

		for (char c : str.toCharArray()) {
			if (Character.isDigit(c)) {
				sb.append(c);
				flag = true;
			}

			else if (flag) {
				break;
			}

		}
		System.out.println(sb);
		return sb.toString();
	}

}
