package oopsConcepts;

public class CallByValueandReference {

	int p;
	int q;

	public static void main(String[] args) {
		CallByValueandReference obj = new CallByValueandReference();
		int x = 10;
		int y = 20;
		obj.sum(x, y); // call by value/Pass by value

		obj.p = 100;
		obj.q = 200;

		obj.product(obj);

	}

	public int sum(int a, int b) {

		int c = a + b;

		System.out.println(c);
		return c;

	}

	public int product(CallByValueandReference tobj) {  //Call by Reference using objectproduct
		int z = tobj.p * tobj.q;
		System.out.println(z);
		return z;

	}

}
