package string;

import java.util.Scanner;

public class RevereseString {

	//Reverse String
	//Difference between String and StringBuffer class
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();

		int len = s1.length();
		String rev = "";
		System.out.println(len);

		for (int i = len-1; i >= 0; i--) {
			rev = rev + s1.charAt(i);

		}

		System.out.println(rev);

		StringBuffer sb = new StringBuffer(s1);
		System.out.println(sb.reverse());
		
		StringBuilder sbb = new StringBuilder(s1);
		System.out.println(sbb.reverse());
		
	}
}