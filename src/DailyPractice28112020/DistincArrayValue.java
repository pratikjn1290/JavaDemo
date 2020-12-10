package DailyPractice28112020;

import java.util.Arrays;
import java.util.HashSet;

public class DistincArrayValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 12, 23, 45, 65, 12, 23 };
		Arrays.sort(arr);

		System.out.println(arr.length);
		System.out.println("----------------First Try-----------------");

		for (int i = 0; i < arr.length; i++) {
			int j;
			for (j = 0; j < i; j++)
				if (arr[i] != arr[j])
					break;
			if (i == j)
				System.out.println(arr[i] + " ");
		}

		System.out.println("--------------Second Attempt--------------------");

		HashSet<Integer> hs = new HashSet<Integer>();
		for (Integer hm : arr) {
			if (hs.add(hm) != true)
							{
				System.out.println("Duplicate Value: " +hm);
			}
		}

	}

}