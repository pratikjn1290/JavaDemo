package ArrayDemo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> tm2 = new TreeMap<Integer, String>();

		tm2.put(2000, "QAA");
		tm2.put(3000, "QA");
		tm2.put(1000, "QAS");

		tm2.forEach((K, V) -> System.out.println("Key " + K + " " + " " + "Value: " + V));

		String str = "Hello 1234 How 12345 You";

		int count = 0;
		String[] str1 = str.split(" ");
		for (int i = 0; i < str1.length; i++) {

			if (str1[i].matches("[0-9]+")) {
				count++;
			}
		}
		System.out.println(count);

		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();

		tm.put("AB", 2000);
		tm.put("CD", 500);
		tm.put("ED", 1000);
		
		System.out.println(tm);
	
		
		Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
        String strDate = dateFormat.format(date);  
        System.out.println("Converted String: " + strDate);  
         
	}
	
	
	

}