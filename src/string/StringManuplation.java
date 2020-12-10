package string;

public class StringManuplation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1 = "Hello How Are you How?";
String s2 = "Hello How are you?";

System.out.println(s1.compareTo(s2));
System.out.println(s1.compareToIgnoreCase(s2));
	
	System.out.println(s1.indexOf('H'));
	System.out.println(s1.indexOf("Are"));
	System.out.println(s1.indexOf("H", s1.indexOf('H')+1));
	
	int s = s1.indexOf("H", s1.indexOf('H')+1);
	
	System.out.println(s1.indexOf("H", s1.indexOf("H", s+1)));
	
	}
	

}
