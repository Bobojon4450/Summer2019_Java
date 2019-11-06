package day48_methodOverriding;


class Student{
	public void printName() {
		System.out.print("Adam");
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
	
	public static void main(String[] args) {
		
		Student st = new Student();
		MethodOverriding mo = new MethodOverriding();
		mo.printName();
		st.printName();
	}
	
	
	
	
	/*Can't be overridden in the same class.
	 * 
	 * public void method_1(String str) { 
	 * 	System.out.println(str);
	 * }
	 */
}
