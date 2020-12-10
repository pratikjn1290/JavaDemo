/**
 * 
 */
package functionsConcepts;

import java.util.Scanner;

/**
 * @author Pratik
 *
 */
public class ProductOfTwoNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		ProductOfTwoNumbers potn = new ProductOfTwoNumbers();
		int result = potn.product(x, y);
		System.out.println("Product of Two no: " +result);
	}

	public int product(int a, int b)

	{
		int prod = a * b;
		return prod;
	}
}
