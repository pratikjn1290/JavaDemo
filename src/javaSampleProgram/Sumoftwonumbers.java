package javaSampleProgram;

import java.util.Scanner;

public class Sumoftwonumbers {

	public static void main(String[] args)

	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first No");
		int a = scan.nextInt();
		System.out.println("Enter two No");
		int b = scan.nextInt();
		int sum = a + b;

		System.out.println("Sum of two no is: " + sum);
	}
}
