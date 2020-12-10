package ArrayDemo;

public class LargestandSmallestNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers[] = {-11,13,-45,64,-84,46,74};
		System.out.println(numbers);
		
		int largenumber = numbers[0];
		int smallnumber = numbers[0];
		
		for(int i = 1; i< numbers.length; i++)
		{
			if (numbers[i]>largenumber)
				largenumber = numbers[i]; 
			else
			{
		if(numbers[i]<smallnumber)
		{
			smallnumber = numbers[i];
		}
			}
	}

		System.out.println("Largest Number: " +largenumber);
		System.out.println("Smallest Number: " +smallnumber);
		
}
}