package javaSampleProgram;

public class StringManupulation {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

		
		String s1 = "Hello All I love Java and I love To Code";
		
		System.out.println(s1.charAt(8));
		System.out.println(s1.length());
		System.out.println(s1.substring(6));
		
		//Occurrence of an any character

		System.out.println(s1.indexOf('l'));
		System.out.println(s1.indexOf('l', s1.indexOf("l")+1));
		
		System.out.println(s1.indexOf("love"));
		System.out.println(s1.lastIndexOf("love"));
	}

}
