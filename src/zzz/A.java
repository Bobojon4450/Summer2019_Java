package zzz;
import ZZ.Test;

class C{
	
	public static int mult(int x , int y) {
		return x * y;
	}
	
	public static int divide(int x , int y) {
		if (y != 0) {
			return x/y;
		}else {
			System.out.println("Illigal divident!--> "+y);
			return y;
		}
	}
}

public class A {


	public static void main(String[] args) {
		System.out.println(B.plus(1,2));
		System.out.println(B.minus(1,2));
		
		System.out.println(C.mult(2,5));
		System.out.println(C.divide(15,5));
		
		print();
		System.out.println(C.divide(2,5));
		
		System.out.println(B.plus(2,6));
		
		System.out.println(Test.isEven(3));
	}
	
	public static void print() {
		System.out.println("Print A class");
	}
}
