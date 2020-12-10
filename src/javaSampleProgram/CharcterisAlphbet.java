package javaSampleProgram;

public class CharcterisAlphbet {

	public static void main(String[] args) {

		char ch = 'Z';

		{

			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

				System.out.println("Enter value is alphabet:-" +ch);
			}

			else
			{
				System.out.println("Value is not alphabet:-" +ch);
			}
		}
	}
}