/**
 * 
 */
package functionsConcepts;

import java.util.Scanner;

/**
 * @author Pratik
 *
 */
public class OddEven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		OddEven oe = new OddEven();
		oe.oddEven(number);
	}

	public boolean oddEven(int num) {
		boolean flag = false;
		if (num % 2 == 0) {
			System.out.println("Number is Even: " + num);
			flag = true;
		} else {
			System.out.println("Number is Odd: " + num);
		}
		return flag;
	}
}
