package oopsConcepts;

public class StaticOverrideandOverload {

	public static void main(String[] arg) {

		BMWStatic Bs = new BMWStatic();
		Bs.safety();
		StaticCar.start();
		BMWStatic.start();
		StaticCar.stop();
		BMWStatic.fuel();

	}

	public static void sum() {
		System.out.println("Maethod without Argument");
	}

	public static void sum(int a, int b) {
		System.out.println("Methos With two Integer argument");
	}

	public static void sum(double a, double b) {
		System.out.println("Methos With two double argument");
	}

}
