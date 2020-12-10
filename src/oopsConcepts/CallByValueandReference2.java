package oopsConcepts;

public class CallByValueandReference2 {

	int w;
	int y;

	public static void main(String[] args) {

		CallByValueandReference2 obj = new CallByValueandReference2();
		int x = 20;
		int p = 40;

		obj.multipication(x, p);

		obj.w = 20;
		obj.y = 50;

		obj.mul(obj);
	}

	public int multipication(int a, int b) {

		//Call by value
		int c = a * b;
		System.out.println(c);
		return c;

	}

	public int mul(CallByValueandReference2 obj2) { 
		
		//Call by reference

		int z = w * y;
		System.out.println(z);
		return z;

	}

}
