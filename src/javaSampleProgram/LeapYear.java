package javaSampleProgram;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter year value");
		int year = scan.nextInt();
		boolean flag = false;

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					flag = true;
				}
				else {
					flag = false;
				}
			}				

				else {
					flag = true;
				}
		}	
				else {
					flag = false;
				}
		
		if(flag = true)
		{
			System.out.println("Leap Year: " +year);
		}
		else
		{
			System.out.println("Not a Leap Year: " +year);
		}
			}
	
}