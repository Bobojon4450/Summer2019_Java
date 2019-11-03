package day46_superKeyword;

class A{
	String name = "Madina";
	
	public void B() {
		System.out.println("B");
	}
	
	public A(int x) {
	}
}

public class SuperKeyword extends A{
	/*	super. : is used for calling instance variables and methods of superclass. */
	/*	super(): is used for calling constructors of the superclass.	*/
	
	public SuperKeyword(int y) {
		super(10);
	}
	
	public static void main(String[] args) {
		SuperKeyword sk = new SuperKeyword(3);
		sk.method();
	}
	
	public void method() {
		super.name = "Adam";
		this.name = "Azim";
		super.B();
		this.B();
	}
	
}
