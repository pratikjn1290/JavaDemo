/**
 * 
 */
package functionsConcepts;

import java.util.Scanner;

/**
 * @author Pratik
 *
 */
public class VoteAge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();

		VoteAge va = new VoteAge();
		va.eligibleForVote(age);
	}

	public boolean eligibleForVote(int ageValue) {
		boolean flag = false;

		if (ageValue >= 18) {
			System.out.println("Person is eligible for vote:-");
			flag = true;
		} else {

			System.out.println("Person is not eligible for vote:-");
		}
		return flag;

	}
}
