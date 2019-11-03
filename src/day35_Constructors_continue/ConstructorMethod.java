package day35_Constructors_continue;

public class ConstructorMethod {

	
	/* Constructors used for creating Objects */
	public ConstructorMethod() {System.out.println("default constructor");}
	
	/* Constructors can be overloaded */
	public ConstructorMethod(String str) {System.out.println(str);}
	
	public ConstructorMethod(int x) {System.out.println(x);}
	
	
	/* Only constructor can call another constructor and we must use this() keyword. */
	public ConstructorMethod(boolean b) {
		this("Hi");
	}
	/*	During the constructor call, the constructor has to be priority one. 
	  	it should be in the first statement		
	  It is illegal to call itself inside another constructor or call itself inside self	
	*/
	
	//Example:
	public ConstructorMethod(double z) {
	/*	this(10.6); compile error. */
		this.test();
	}
	
	public void test() {
		System.out.println("test method");
	}
	
	
	public static void main(String[] args) {
		ConstructorMethod obj = new ConstructorMethod();
		ConstructorMethod obj2 = new ConstructorMethod(100);
		ConstructorMethod obj3 = new ConstructorMethod("What's up fam");
	}
	
	
	
	

}
