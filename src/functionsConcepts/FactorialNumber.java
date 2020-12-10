package functionsConcepts;

import java.util.Scanner;

public class FactorialNumber {

	int fact = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		FactorialNumber fn = new FactorialNumber();
		System.out.println(fn.factorialCalc(num));

	}

	public int factorialCalc(int number) {

		if (number == 1 || number == 0) {
			return number;
		}

		else {
			for (int i = 1; i <= number; i++) {
				fact = fact * i;

			}
		}
		return fact;

	}

}
