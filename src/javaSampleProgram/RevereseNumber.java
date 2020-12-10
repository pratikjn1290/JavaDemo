package javaSampleProgram;

public class RevereseNumber {
	
	public static void main(String [] agrs)
	{
		
		int number = 123456789;
		int rev = 0;
		
		while(number!= 0)
		{
			int digit = number % 10;
			rev = (rev*10) + digit;
			number = number/10;			
		}
		
		System.out.println(rev);
		
	}

}
