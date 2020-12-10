package string;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListOfString {
	
	public static void main(String args[])
	{
		
		
		List<String> str = new LinkedList<String>();
		
		Iterator<String> str1 =  str.iterator();
		System.out.println(str1.hasNext());
		System.out.println(str1.next());
		
		
	}

}
