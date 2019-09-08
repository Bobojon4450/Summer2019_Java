package day6_arithmeticaloperations;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		double num = 10/3;
		System.out.println(num);//3.0
		
		double num1 = 10.0/3;
		System.out.println(num1);//3.3333333333333335
		
		int num2 = 12 + 6 / 3;
		System.out.println(num2);
		
		System.out.println(2.0 * 17 / 100);
		
		System.out.println(8 / 2 * ( 2 + 2));
		
		/*modulus*/
		int num3 = 10 % 3;
		System.out.println(num3);//remainder 1
		System.out.println("-------------------------------------");
		
		int num4 = 20 % 2;//even
		int num5 = 45 % 2;//odd
		int num6 = 65 % 2;//odd
		int num7 = 45 % 3;
		
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num6);
		System.out.println("-------------------------------------");
		
		System.out.println( 4 + 17 % 2 - 1);
		System.out.println(6 - 3 * 2 + 7 - 1);
		
	}

}
