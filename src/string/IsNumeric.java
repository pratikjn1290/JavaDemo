package string;

public class IsNumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Hello";
		
		String regex = "[*.d.*]";
		
		if(s1.matches(regex))
		{
			System.out.println("Have Digits");
		}
		
		else
		{
			System.out.println("No digits");
		}
		

	}

}
