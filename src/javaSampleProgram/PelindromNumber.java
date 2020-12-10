package javaSampleProgram;

public class PelindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 1331;
		int rev = 0;
		int temp;
		boolean flag = false;
		temp = number;
		while(number >0)
		{
			int digit = number%10;
			rev = (rev * 10) + digit;
			number = number / 10;
		}

		if(rev == temp)
		{
			System.out.println("No is Pelindrome");
			flag = true;
		}
		else
		{
			System.out.println("No is not pelindrome");
			flag = false;
		}
	}

}
