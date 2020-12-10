package DailyPractice28112020;

public class ArmstrongNumber {

	public static void main(String args[]) {

		isArmstrongNumber(153);

	}

	public static void isArmstrongNumber(int number) {
		int sum = 0;
		int temp = number;
		while (number != 0) {

			int digit = number % 10;
			sum = sum + (digit * digit * digit);
			number = number / 10;

		}
		
		System.out.println(sum);

		if(temp == sum)
		{
			System.out.println("Number is armstrong");
		}
		
		else
		{
			System.out.println("Number is normal");
		}
	}

}
