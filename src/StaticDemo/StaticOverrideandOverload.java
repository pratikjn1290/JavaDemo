package StaticDemo;

public class StaticOverrideandOverload {

	public static void main(String[] args) {

		BMWCar b = new BMWCar();
		b.stop();
		b.safety();

		
		Car c = new Car();
		c.Refuel();
		c.stop();
	}

}
