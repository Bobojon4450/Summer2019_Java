package day56_Polymorphism;

class Animal{
	public void methodA() {
		System.out.println("Animal");
	}
}


class Dog extends Animal implements Inter{
	public void methodD() {
		System.out.println("Dog");
	}
	 
	@Override
	public void name() {System.out.println("Doggy");}
	
	@Override
	public void methodA() {
		System.out.println("Dog Animal");
	}
	
}

public class Upcasting {

	public static void main(String[] args) {
		//Upcasting: casting subclass to superior type
		Dog dog = new Dog();
		dog.name();
		
		Animal animal = (Animal)dog;
		animal.methodA();
		
	}
}


interface Inter{
	void name();
//	private int num =25;
	public static void main(String[] args) {
//		Inter i = new Inter();
		
	}
}