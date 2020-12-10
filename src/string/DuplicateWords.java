/**
 * 
 */
package string;

/**
 * @author Pratik
 *
 */
public class DuplicateWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Hello I Love Java Java Is loved By Me";
		
		String[] Alldata = s1.split("");
		
		for(int i = 0; i<Alldata.length; i++)
		{
			System.out.print(Alldata[i]);
		}

	}

}
