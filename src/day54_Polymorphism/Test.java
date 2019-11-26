package day54_Polymorphism;

abstract class AbstractionClass{
	
	public abstract void method1();
	
	public static void method2() {
		System.out.println("Abstract static method");
	}
}

public class Test extends AbstractionClass{
	
	public static void method2() {
		System.out.println("Test static method");
	}
	
	@Override
	public void method1() {
		System.out.println("Overridden Test method1");	
	}
	
	public static void main(String[] args) {
		AbstractionClass abs = new Test();
		abs.method1(); // Overridden Test method1
		abs.method2();// Abstract static method, because only overridden methods will be called from object type;
	}
}

/* In polymorphism the reference type decides which members are accessed, 
 * but if the method being called is overridden then the overridden one will be called	*/
 