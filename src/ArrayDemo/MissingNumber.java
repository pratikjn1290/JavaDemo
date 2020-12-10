package ArrayDemo;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 11, 12, 14, 15 };
		int sum = 0;
		int sum1 = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		System.out.println(sum);

		{
			for (int j = 11; j <= 15; j++) {
				sum1 = sum1 + j;
			}

			System.out.println(sum1);
		}

		int result = sum1 - sum;
		System.out.println("Missing Number :: " + result);
		
	}

}
