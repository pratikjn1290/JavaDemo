package oopsConcepts;

public class Overriding {

	public static void main(String[] args) {

		
	System.out.println("Child Class Object Compile Time Polymorphism");
		
	System.out.println("Child Class Object");
		BMWcar b = new BMWcar();
		b.start();
		b.stop();
		b.safety();
		System.out.println("Parent Class Object");
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
	
	System.out.println("Child Class Object Run Time Polymorphism ");
	Car c1 = new Car();
	c1.start();
	c1.stop();
	c1.refuel();
	
	System.out.println("Vehicle Added");
	
	Car C2 = new Car();
	C2.engine();
	C2.enginecompany();
	C2.engineType();
	C2.start();
	C2.stop();
	C2.refuel();
	
	}

}
