package oopsConcepts;

public class ConceptOfNull {

	
	//static Object obj;
	//static ConceptOfNull cn;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//null is case sensitive and its keyword...
		
		
	/*	String s1 = null;
		System.out.println(s1);
		System.out.println(obj);
		System.out.println(cn);
		
		Integer i = null;
		
		//primitive data type default value is not null.....
		int j = i;
		System.out.println(i);
		
		//instance of operator
		
		Integer k = null;
		Integer l =10;
		
		System.out.println(k instanceof Integer);
		System.out.println(l instanceof Integer);
	****/
		
		
		ConceptOfNull obj = null;
		//obj.sum();
		//obj.send();

		
		//6). Operators
		
		System.out.println(null == null);
		System.out.println(null!=null);
		
		//Default value of String
		
		//String str = null;
		//System.out.println(str);
		
		//Type Casting of Null
		//String s1 = (String )null;
		//System.out.println(s1 + " Pratik");
		//System.out.println(s1.length());
		//System.out.println(s1.charAt(0));
		
		Integer i1 = (Integer)null;
		System.out.println(i1);
		
		
		
	}
	//static and non static

		
		public void send()
		{
			System.out.println("Message has been send........");
			
		}
		

		public static void sum()
		{
			System.out.println("Sum of two numbers");
		}
		
	}

