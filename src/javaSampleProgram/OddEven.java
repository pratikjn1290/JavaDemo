package javaSampleProgram;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number");
		int number = scan.nextInt();
 
		
		if(number % 2 ==0)
		{
			System.out.println("Entered number is even");

		}
		else
		{
			System.out.println("Entered number is odd");
		}
				
		

	}

}
