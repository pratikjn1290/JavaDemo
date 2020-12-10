package DailyPractice28112020;

public class Fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 10;
		int t1 = 0;
		int t2 = 1;
		int sum = 0;
		
		for(int i = 0; i<=number; i++)
		{
			sum = t1+t2;
			t1 = t2;
			t2 = sum;
		
			System.out.println(sum);
		}
		
		
	}

}
