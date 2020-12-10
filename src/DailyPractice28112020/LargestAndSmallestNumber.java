package DailyPractice28112020;

public class LargestAndSmallestNumber {

	public static void main(String args[]) {

		int arr[] = { 11, 35, 64, 2, 14, 54 };
		int len = arr.length;

		int largest_Number = arr[0];
		int smallest_Number = arr[0];

		for (int i = 0; i < len; i++)

		{
			if (arr[i] < smallest_Number) {
				smallest_Number = arr[i];
			}
			if (arr[i] > largest_Number) {
				largest_Number = arr[i];
			}
		}
		System.out.println(smallest_Number);
		System.out.println(largest_Number);
	}
}
