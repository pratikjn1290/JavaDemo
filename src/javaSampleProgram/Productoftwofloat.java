package javaSampleProgram;

public class Productoftwofloat {

	public static void main(String[] args) {

		float x = 23.43f;
		float y = 32.56f;

		Productoftwofloat p = new Productoftwofloat();
		p.product(x, y);
	}

	public float product(float a, float b) {
		float prod = a * b;
		System.out.println(prod);
		return prod;
	}

}
