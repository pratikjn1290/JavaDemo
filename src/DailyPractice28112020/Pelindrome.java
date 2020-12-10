package DailyPractice28112020;

public class Pelindrome {
	
	public static void main(String args [])
	{
		int number = 151;
		int rev = 0;
		int temp = number;
		
		while(number > 0)
		{
			
			int digit = number % 10;
			rev = digit + (rev * 10);
			number = number / 10;
		
		}
		System.out.println(rev);
	
		if(temp == rev)
		{
			System.out.println("No is Pelindrom");
		}
		else
		{
			System.out.println("No is not pelindrom");
		}
	}

}
