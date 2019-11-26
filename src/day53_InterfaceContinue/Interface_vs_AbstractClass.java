package day53_InterfaceContinue;

public interface Interface_vs_AbstractClass {
	
	// interface is pure abstraction, thus all members should have public access modifier.

	public abstract void method1();
	
	public abstract int method2();
	
	public void method3();// abstract is embedded automatically.
	
	public void method4();
	
//	public void add() {} can't have instance methods
	
	public default void mm() {
		//predicate
	}
	
	int a = 10; // equals to public static final int a = 10;
	
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(Interface_vs_AbstractClass.a);
	}
	
}

class Test implements Interface_vs_AbstractClass{
	
	@Override
	public void method1() {
		
	}
	
	@Override
	public int method2() {
		return 0;
	}
	
	@Override
	public void method3() {
		
	}
	
	@Override
	public void method4() {
		
	}
}