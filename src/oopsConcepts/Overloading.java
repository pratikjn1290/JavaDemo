package oopsConcepts;

import java.util.Scanner;

public class Overloading {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter value of first number:- ");
		double d = scan.nextDouble();

		System.out.println("Enter value of second number:- ");
		double e = scan.nextDouble();

		Overloading obj = new Overloading();
		obj.sum(d, e);
		obj.sum(d, e);

	}

	public void sum() {
		System.out.println();
	}

	public int sum(int x, int y) {
		int z = x + y;
		System.out.println(z);
		return z;
	}

	public void sum(double i, double j) {

		double s = i + j;
		System.out.println(s);
	}

}
