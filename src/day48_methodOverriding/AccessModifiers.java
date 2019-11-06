package day48_methodOverriding;


class Mehribana{
	void method_A() {
		System.out.println("Method_A");
	}
	
	public String method_B() {
		return "B";
	}
	
	protected double salary(double bonus) {
		return bonus + 10000;
	}
}

public class AccessModifiers extends Mehribana{

	/*	overridden method's access modifier should be same or more visible	(public, protected and default)*/
	/*	return type should be same	*/
	@Override
	void method_A(){
		System.out.println("Overridden");
	}
	
	public String method_B() {
		System.out.println("Overridden");
		return "Overridden";
	}
	
	/*	This is overloaded method and not overridden	*/
	protected double salary(int bonus) {
		return bonus + 10000;
	}
	
	
	
}
