package DailyPractice28112020;

public class AbstractDigitFromString {

	public static void main(String[] args) {
		String s = "This is your transaction id: 12334213";

		String[] s1 = s.split(":");
		System.out.println(s1[1].trim());

		System.out.println(s.matches("^.*d.*"));
		
		extractNumber("This is your transaction id: 12334213");
		
	}

	public static String extractNumber(final String str) {

		if (str == "null" && str.isEmpty()) {
			return "";
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
