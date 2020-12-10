package javaSampleProgram;

public class NoofDigitsInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 34324325;
		int digit = 0;

		while (number != 0) {
			number = number / 10;
			digit++;

		}
	
		System.out.println("No of Digits: " +digit);
	}
}
