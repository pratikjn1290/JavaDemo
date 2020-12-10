package functionsConcepts;

import java.util.Scanner;

/*Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail
*/

public class MarksCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarksCalculator mca = new MarksCalculator();
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		mca.resultCalculator(number);

	}

	public int resultCalculator(int marks) {
		if (marks > 90 && marks<=100) {
			System.out.println("AA Grade Scored: " +marks);
		}
		else if (marks >= 81 && marks <= 90)
		{
			System.out.println("AB Grade Scored: " +marks);
		}
		else if (marks >= 71 && marks <= 80)
		{
			System.out.println("BB Grade Scored: " +marks);
		}
		else if (marks >= 61 && marks <= 70)
		{
			System.out.println("BC Grade Scored: " +marks);
		}
		else if (marks >= 51 && marks <= 60)

		{
			System.out.println("CC Grade Scored: " +marks);
		}
		else if (marks >= 51 && marks <= 60)

		{
			System.out.println("CC Grade Scored: " +marks);
		}
		else if (marks >= 41 && marks <= 50)

		{
			System.out.println("CD Grade Scored: " +marks);
		}
		else if (marks >=0 && marks <= 40)
		{
			System.out.println("Fail: " +marks);
		}
		
		else
		{
			System.out.println("Enter Valid Value: " +marks);
		}
	
		return marks;
	
	}
	

}
