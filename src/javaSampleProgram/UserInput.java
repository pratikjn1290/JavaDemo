package javaSampleProgram;

import java.util.Scanner;

//This program is related to user input
public class UserInput {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number");
		int number = scan.nextInt();

		if (number % 2 == 0) {
			System.out.println("User has entered no");
		}

		else {
			System.out.println("User has entered Invalid number");
		}

	}

}
