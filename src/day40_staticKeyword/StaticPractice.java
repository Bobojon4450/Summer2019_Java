package day40_staticKeyword;

public class StaticPractice {
	
	static long num1;
	long num2;

	public static void main(String[] args) {
		System.out.println(num1);
		
		StaticPractice sp = new StaticPractice();
		sp.method2();
		method();
		sp.num2 = 404L; 	/*	instance vars invoked only on object reference.	*/
		System.out.println(sp.num2);
	}
	
	
	public static void method() {System.out.println("Static method"); method3();}
	
	public static void method3() {System.out.println("Static method3");} 
	
	public void method2() {System.out.println("Instance method");}
	
	
}
