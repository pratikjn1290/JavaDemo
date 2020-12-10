package javaSampleProgram;

public class FactorialOfNumber {

	public static void main(String[] args) {
//Factorial Of Problem

		int number = 5;
		int fact = 1;

		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}

		System.out.println(fact);
	}

}
