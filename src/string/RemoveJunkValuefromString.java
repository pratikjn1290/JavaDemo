package string;

public class RemoveJunkValuefromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "#$@#$$#@ I #%#@% Love $%$#%#@ Testing #%#@#@";
		
		//ReplaceAll with Junk Value
		
		s1 = s1.replaceAll("[^A-Za-z0-9 ]", "");
		System.out.println(s1.trim());
		
	}

}
