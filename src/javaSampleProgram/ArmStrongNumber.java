package javaSampleProgram;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//sum of all the powers

		int number = 371;
		int rev = 0;
		int sum = 0;
		int temp;
		temp = number;
		while (number != 0)

		{
			rev = number % 10;
			sum = sum + (rev * rev * rev);
			number = number / 10;
		}

		if (sum == temp) {

			System.out.println("Number is Armstrong no:- " + sum);

		} else {
			
			System.out.println("Number is not Armstrong no:- " + sum);
		}

	}

}
