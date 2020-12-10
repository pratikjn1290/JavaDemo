package DailyPractice28112020;

public class SwapNumberWithoutThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number1 = 200;
		int number2 = 100;
		
		if(number1>number2)
		{
		
		number1 = number1+number2; //300 number 1
		number2 = number1 - number2; // number 2 = 300-200 = 100
		number1 = number1-number2; // number 1 = 300 - 100 = 200
		
		System.out.println(number1);
		System.out.println(number2);
		
		}
		
		else
		{
			number2 = number1+number2;    //number 2 300
			number1 = number2 - number1; // number1  =300 - 200 100
			number2 = number2-number1; //number2 = 300-100 200
			
			System.out.println(number1);
			System.out.println(number2);
				
			
		}
		

	}

}
