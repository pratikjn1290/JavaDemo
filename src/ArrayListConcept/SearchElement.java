package ArrayListConcept;

import java.util.ArrayList;

public class SearchElement {
	
	public static void main(String []args)
	{
		
		//Write a Java program to search an element in a array list.

		
		ArrayList <String> search = new ArrayList<String>();
		search.add("Orange");
		search.add("Yellow");
		search.add("Green");
		search.add("Black");
		search.add("Grey");
		search.add("Maroon");
		
		boolean result = search.contains("Orange");
		
		if(result == true)
		{
			System.out.println("Value is Available in Arraylist");
		}
			
		else
		{
			System.out.println("Value is not Available in Arraylist");
		}
				
	}

}
