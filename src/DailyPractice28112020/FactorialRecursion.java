package DailyPractice28112020;

public class FactorialRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(fact(5));
	}
	
	public static int fact(int number)
	{
		if(number > 1)
		{
			int result = number * fact(number-1);
			return result;
		}
		
		else
		{
			return 1;
		}
	}

}
