package javaSampleProgram;

public class PowerOfTwoNumber {

	public static void main(String[] args) {
		// Power of number

		int base = 3;
		int exponent = 4;
		long result = 1;
		
		while(exponent != 0)
		{
			result = result * base;
			exponent = exponent - 1;
			
		}
		
		System.out.println(result);
	}

}
