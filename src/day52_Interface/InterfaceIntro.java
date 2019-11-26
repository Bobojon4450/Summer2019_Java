package day52_Interface;

public interface InterfaceIntro {
	
	
	
	public abstract void methodA();
	
	int c = 10;
	static double num = 10; //public static final automatically assigned to variable.
	final static String str = "str";
}

interface Data{
	 abstract void anotherMethod();
}

class Test implements InterfaceIntro, Data{
	
	public void anotherMethod() {
		System.out.println("Implemented the anotherMethod");
	}
	
		
	@Override
	public void methodA() {
		System.out.println("Overridden");
	}

}