package javaSampleProgram;

import java.util.Scanner;

public class LargestFromThreeNumberWithternary {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first number");
		int a = scan.nextInt();
		System.out.println("Enter second number");
		int b = scan.nextInt();
		System.out.println("Enter third number");
		int c = scan.nextInt();

		if (a > b && a > c) {
			System.out.println("a is larger number:- " + a);
		}

		else if (b > a && b > c) {
			System.out.println("b is larger number:- " + b);
		}

		else {
			System.out.println("c is larger number:- " + c);
		}
	}

}
