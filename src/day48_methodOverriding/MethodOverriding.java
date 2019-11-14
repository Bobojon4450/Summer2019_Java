package day48_methodOverriding;


class Student{
	public void printName() {
		System.out.println("Adam");
	}
}

public class MethodOverriding extends Student{
	
	@Override
	public void printName() {
		super.printName();
		System.out.println("sho");
	}

	public void method_1(String str) {
		System.out.println(str);
	}
	
	/*	Overloaded	*/
	public void method_1(double d) {
		System.out.println(d);
	}
	
	final public void method_2() {
		System.out.println("final method_2");
	}
	
	final public void method_2(String str) {
		System.out.println("overloaded final method_2 "+str);
	}
	
	public static void main(String[] args) {
		
		Student st = new Student();
		MethodOverriding mo = new MethodOverriding();
		mo.printName();
		st.printName();
		
		mo.method_2();
		mo.method_2("!!!");
	}
	
	
	
	
	/*Can't be overridden in the same class.
	 * 
	 * public void method_1(String str) { 
	 * 	System.out.println(str);
	 * }
	 */
}
