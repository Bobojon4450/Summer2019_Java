package day50_Abstrcation;

public class Cat extends Animal{

	public Cat(char gender, byte age, String color, String name) {
		super(gender, age, color, name);
	}
	
	@Override
	public void drink(String str) {
		System.out.println("Drinks hot chocolate");
	}
	
	@Override
	public void eat(String str) {
		System.out.println("Eats m&m");
	}
	
	@Override
	public void sleep(int x) {
		System.out.println("Sleeps " + x + " hours");
	}
	
	@Override
	public void voice(String voice) {
		System.out.println("Meows a lot. Annoing!");
	}
	
}
