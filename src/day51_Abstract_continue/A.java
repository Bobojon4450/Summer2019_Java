package day51_Abstract_continue;

public final class A extends C{
	
	final String str = "";
	static String staticStr;
	int num = 10;
	
	public A() {
		System.out.println("A");//implicit call to super().
	}
	
	public void method() {
		final String str;
	}
	
	public static void main(String[] args) {
//		B b = new B();	
		A a = new A();
//		a.num =20;
//		System.out.println(a.num);
	}
}

class C {
	public C() {
		System.out.println("C");
	}
}

class B extends C{
	public B() {
		System.out.println("B");
	}
}

