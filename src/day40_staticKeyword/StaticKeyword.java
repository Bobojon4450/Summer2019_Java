package day40_staticKeyword;

public class StaticKeyword {
	int a;
	static int b = 101;
	
	public static void printHello(){
		System.out.println("Hello");
		new StaticKeyword().instanceMethod();
	}
	
	public void instanceMethod() {
		System.out.println("Instance method");
	}
	
	public static void main(String[] args) {
		StaticKeyword st = new StaticKeyword();
		st.a = 100;
		StaticKeyword st2 = new StaticKeyword();
		st2.a = 200;
		System.out.println(st.a);
		System.out.println(st2.a);
		
		System.out.println(StaticKeyword.b);
		System.out.println(st.b);
		System.out.println(st2.b);
		st.instanceMethod();
	}
}
