package functionsConcepts;

public class PrimeNumber {

	//Define a method to find out if number is prime or not.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrimeNumber pn = new PrimeNumber();
		pn.isPrimeNumber(5);
	}


public boolean isPrimeNumber(int number)
{
boolean flag = false;

	if(number % 2 == 0)
	{
		System.out.println("Number is prime:- " +number);
		flag = true;
		
	}
	
	else
	{
		System.out.println("Number is not prime:- " +number);
	}
	return flag;
}


}
