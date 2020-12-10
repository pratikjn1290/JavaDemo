/**
 * 
 */
package string;

/**
 * @author Pratik
 *
 */
public class HasDigit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1 = "Test";
		
		boolean flag = s1.matches(".*\\d.*");
		
		if(flag)
		{
			System.out.println("String has digits");
		}
		
		else
		{
			System.out.println("No digits");
		}
	}

}
