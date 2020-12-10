package DailyPractice28112020;

public class SwapNumbers {

	public static void main(String args[]) {
		int number1 = 100;
		int number2 = 200;
		int temp;

		System.out.println("-------------Before Swap-------------");

		System.out.println(number1);
		System.out.println(number2);

		temp = number1;
		number1 = number2 ;
		number2 = temp;

		System.out.println("-------------After Swap-------------");

		System.out.println(number1);
		System.out.println(number2);

	}

}
