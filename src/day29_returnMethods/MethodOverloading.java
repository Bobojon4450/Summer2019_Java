package day29_returnMethods;

public class MethodOverloading {

	// overloading: same method name with different parameters.

	public static int sum(int a, int b) {
		return a + b;
	}

	public static int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	public static double sum(double a, double b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		System.out.println(sum(12.4, 12));
	}

}

