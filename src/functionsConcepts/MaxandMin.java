/**
 * 
 */
package functionsConcepts;

import java.util.Scanner;

/**
 * @author Pratik
 *
 */
public class MaxandMin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		MaxandMin mandm= new MaxandMin();
		mandm.minimum(num1, num2, num3);
		mandm.maximum(num1, num2, num3);

	}

	public int maximum(int a, int b, int c) {

		int temp = a > b ? a : b;
		int max = c > temp ? c : temp;
		System.out.println("Maximum value: " +max);
		return max;
	}

	public int minimum(int x, int y, int z)
	{
		int temp1 = x<y ? x:y;
	    int min = z<temp1 ? z:temp1;
	    System.out.println("Minimum value: " +min);
		return min;
	}

}
