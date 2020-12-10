/**
 * 
 */
package abstractandinterface;

/**
 * @author Pratik
 *
 */
public class classConcept {

	public String name;
	public int age;
	public char Gender;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		classConcept c1 = new classConcept();
		c1.name = "Pratik";
		c1.age = 23;
		c1.Gender = 'M';
		
		classConcept c2 = new classConcept();
		c2.name = "Komal";
		c2.age = 24;
		c2.Gender = 'F';
		
		classConcept c3 = new classConcept();
		c3.name = "Praavi";
		c3.age = 27;
		c3.Gender = 'F';

	System.out.println(c1.name +" " + c1.age + " " + c1.Gender);
	System.out.println(c2.name +" " + c2.age + " " + c2.Gender);
	System.out.println(c3.name +" " + c3.age + " " + c3.Gender);
	System.out.println("-----------------Before Reference Change-----------------");
	c1 = c2;
	c2 = c3;
	
	System.out.println(c1.name +" " + c1.age + " " + c1.Gender);
	System.out.println(c2.name +" " + c2.age + " " + c2.Gender);
	System.out.println(c3.name +" " + c3.age + " " + c3.Gender);
	System.out.println("-----------------After Reference Change-----------------");
	c3 = c1;
	
	System.out.println(c1.name +" " + c1.age + " " + c1.Gender);
	System.out.println(c2.name +" " + c2.age + " " + c2.Gender);
	System.out.println(c3.name +" " + c3.age + " " + c3.Gender);
	System.out.println("-----------------Again After Reference Change-----------------");
	}
}
