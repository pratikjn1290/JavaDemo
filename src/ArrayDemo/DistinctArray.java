package ArrayDemo;

import java.util.Arrays;
import java.util.HashSet;

public class DistinctArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 12, 23, 45, 65, 12, 23 };
		Arrays.sort(arr);
	
		System.out.println(arr.length);
		System.out.println("----------------First Try-----------------");
		
		for (int i = 0; i < arr.length; i++) {
			int j;
			for (j = 0; j < i; j++)
				if (arr[i] == arr[j])
					break;
			if (i == j)
				System.out.println(arr[i] + " ");
		}
		
		
		System.out.println("----------------Second Try-----------------");	
	
	HashSet<Integer> hs = new HashSet<Integer>();
	
	for(Integer elem : arr)
	{
		if(hs.add(elem) != false)
		{
			System.out.println("Duplicate value:- " + elem);
		}
	}
	

	System.out.println("----------------Third Try-----------------");
	
	for(int k = 0; k<arr.length-1; k++)
	{
		while(k < ((arr.length)-1) && arr[k] != arr[k+1])
		{
			
			System.out.println(arr[k]);
			k++;
		}
	}
	
}


	
}