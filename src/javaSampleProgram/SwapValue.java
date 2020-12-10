package javaSampleProgram;

public class SwapValue {

	public static void main(String[] args) {

		int var1 = 10, temp;
		int var2 = 20;

		System.out.println("Before Swap");
		System.out.println(var1);
		System.out.println(var2);

		temp = var1;
		var1 = var2;
		var2 = temp;
		System.out.println("After Swap");
		System.out.println(var1);
		System.out.println(var2);
	}

}
