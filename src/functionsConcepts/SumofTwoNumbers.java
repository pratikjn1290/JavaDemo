/**
 * 
 */
package functionsConcepts;

import java.util.Scanner;

/**
 * @author Pratik
 *

 *
 */

//Write a program to print the sum of two numbers entered by user by defining your own method.

public class SumofTwoNumbers {

	int sum = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumofTwoNumbers stn = new SumofTwoNumbers();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		stn.sum(num1, num2);

	}

	public int sum(int a, int b) {
		sum = a + b;
		System.out.println(sum);
		return sum;
	}

}
