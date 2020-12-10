package oopsConcepts;

import java.time.Instant;

public class FactAboutNull {

	static Object obj;
	static String s1;

	public static void main(String[] args) {

		// 1). Null is data type so write like

		Object obj = null;

		// 2). For Any class reference default value is null
		System.out.println(obj);
		System.out.println(s1);

		
		//3 null can not be assigned to primitive data type
	
	
		Integer i = null;
		int j = i;
		
		 //4 Instance of
	
	
	Integer k = null;
	Integer l = 10;
	
	System.out.println(k instanceof Integer); //false
	System.out.println(l instanceof Integer); //true
	
	
// 5). Static vs no static (User can not call non static method for null reference)
	
// 6). == and != operator can be workes,
	
// 7). Type casting can be done, but any operation can not be performed,
	
// 8). 	Type casting can be done, for wrapper class also
	}

}