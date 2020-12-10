package string;

public class MutableImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Immutable

		String s = "Pratik";

		s.concat(" Jain");

		System.out.println(s);

		// mutable

		StringBuffer sb = new StringBuffer("Pratik ");
		sb.append("Jain");
		System.out.println(sb);

		// EquallOperator and equals.

		String s1 = new String("durga");
		String s2 = new String ("durga");

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		StringBuffer sb1 = new StringBuffer("durga");
		StringBuffer sb2 = new StringBuffer("durga");
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
	}

}