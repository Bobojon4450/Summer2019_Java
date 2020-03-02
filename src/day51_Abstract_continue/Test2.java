package day51_Abstract_continue;

/*	Abstract class can have all kinds of methods and variables	*/

public abstract class Test2 {

	public Test2() {
		System.out.println("Abstract class constructor");
	}
	
	/*	Abstract method can be overloaded and overridden	*/
	abstract void method();
	
	abstract void method(int x);
	
	abstract void method(String str);
	
	public static void method(String str, int x) {
		System.out.println("usuall static method");
	}
	
	int x;
	final String dtr = "123";
	final static int num = 10;
	static double dNum;
}


class Concrete extends Test2{
	
	@Override
	void method() {
		System.out.println("Overridden");
	}
	
	@Override
	void method(int x) {
		System.out.println("overridden 2");
	}
	
	@Override
	void method(String str) {
		System.out.println("Overridden 3");	
	}
	
	public static void add() {System.out.println("static of parent");}
}

