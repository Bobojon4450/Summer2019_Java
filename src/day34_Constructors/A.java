package day34_Constructors;

public class A {

	public static void main(String[] args) {
		   
	    B c  = new B();
	    System.out.println(c.totalPrice);
	    
	    B b = new B(20, 20, 2, true);
	    System.out.println(b.totalPrice);
	  }
}
