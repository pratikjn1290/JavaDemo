package string;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello";
		String s1 = "World";

		System.out.println("-------------Before Swapping-------------");
		System.out.println(s);
		System.out.println(s1);

		// Logic to Swap

		s = s+s1; // HelloWorld

		s1 = s.substring(0, s.length() - s1.length());
		
		s = s.substring(s1.length());

		System.out.println("-------------After Swapping-------------");
		System.out.println(s);
		System.out.println(s1);
	}

}
