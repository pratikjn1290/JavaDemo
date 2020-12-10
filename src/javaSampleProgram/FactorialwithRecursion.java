package javaSampleProgram;

public class FactorialwithRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));

	}

	public static int fact(int num) {
		if (num >= 1) {
			int result = num * fact(num - 1);
			return result;

		} else {
			return 1;
		}
	}
}