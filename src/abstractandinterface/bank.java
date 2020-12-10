package abstractandinterface;

public abstract class bank {

	// Abstract class should have at least one abstract method,
	//Hiding the implementation from other class,
	//abstraction can have both methods non abstract and abstract
	//partial extraction
	// can not create and object of abstract class
//can have constructor

	public abstract void loan();

	public void credit() {
		System.out.println("Credit Card Department");
	}

	public void debit() {
		System.out.println("Debit Card Department");
	}

}