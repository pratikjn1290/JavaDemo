package javaSampleProgram;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 29;
		boolean flag = false;
		
	for (int i = 2; i<= number/2; i++)
	{
		if (number % i == 0)
		{
			flag = true;
			break;
		}
	}	

		if (!flag)
		{
			System.out.println("No is prime number");
		}
	
		else
		{
			System.out.println("No is not Prime");
		}
	}

}
