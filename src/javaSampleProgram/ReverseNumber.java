package javaSampleProgram;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int number = 12345;
		int rev = 0;
		
		while(number !=  0)
		{
			int digit = number%10;
			rev = (rev * 10) + digit;
			number = number/10;
		}
		
		System.out.println("Reverse number: " +rev);

	}

}
