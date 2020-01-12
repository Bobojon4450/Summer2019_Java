package day52_Interface;

public interface Interface_Intro {
	
	public abstract void methodA();
	
	/*All variables are -> public static final by default */
	int c = 10;
	static double num = 10; //public static final automatically assigned to variable.
	final static String str = "str";
}

interface Data{
	
	abstract void anotherMethod();
	
	public static void print() {
		System.out.println("print");
	}
}

class Test implements Interface_Intro, Data{
	
	@Override
	public void anotherMethod() {
		System.out.println("Implemented the anotherMethod");
	}	
	
	@Override
	public void methodA() {
		System.out.println("Overridden");
	}
	
}