package day46_superKeyword;

import day45_Inheritance.ProtectedVariable;

class Data{
	public int num1 = 10;
	protected int num2 = 20;
	private int num3 = 30;
	int num4 = 40;
}


public class InheritanceReview extends Data{
	public static void main(String[] args) {
//		System.out.println(num1);
//		System.out.println(num2);
//		System.out.println(num3);
//		System.out.println(num4);
		
		InheritanceReview in = new InheritanceReview();
		System.out.println(in.num1);
		System.out.println(in.num2);
		System.out.println(in.num4);
		
		
		Data dt = new Data();
		System.out.println(dt.num1);
		System.out.println(dt.num2);
		System.out.println(dt.num4);
		
		
		ProtectedVariable pr = new ProtectedVariable();
//		System.out.println(pr.name); // can't be visible.
		System.out.println(pr.x); // only public visible. Globally
//		pr.str;
		
		
	}
}
