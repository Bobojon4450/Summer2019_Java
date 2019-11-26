package day45_Inheritance;

public class MultiClass {

	public static void main(String[] args) {
		System.out.println("This is a main class!");
	}
}

//this is always should be a default class
class A {
	public static void main(String[] args) {
		System.out.println("This is a inner class!");
	}
}

class B {
	public static void main(String[] args) {
		System.out.println("Third inner class!");
	}
}