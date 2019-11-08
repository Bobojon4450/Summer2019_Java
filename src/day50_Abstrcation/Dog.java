package day50_Abstrcation;

public class Dog extends Animal{

	public Dog(char gender, byte age, String color, String name) {
		super(gender, age, color, name);
	}
	
	@Override
	public void drink(String drinks) {
		System.out.println("Drinks " + drinks);
	}

	@Override
	public void eat(String food) {
		System.out.println("Eats " + food);
	}

	@Override
	public void sleep(int hour) {
		System.out.println("Sleeps " + hour);
	}

	@Override
	public void voice(String languge) {
		System.out.println(languge + " language");
	}
	
}
