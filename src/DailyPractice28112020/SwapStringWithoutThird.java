package DailyPractice28112020;

public class SwapStringWithoutThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "hello";
		String s2 = "How";

		System.out.println("-------------Before Swap---------------");
		System.out.println(s1);
		System.out.println(s2);

		s1 = s1 + s2; // HelloHow
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());

		System.out.println("--------------After Swap-------------=---");

		System.out.println(s1);
		System.out.println(s2);

	}

}
