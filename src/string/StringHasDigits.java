package string;

public class StringHasDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		extractNumber("Test@123");
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
