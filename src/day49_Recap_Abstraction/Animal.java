package day49_Recap_Abstraction;

public abstract class Animal {

	public abstract void eat();

	public abstract void sleep();
	
	int x = 10;
	String str = "str";
	
	public static void main(String[] args) {
		Tiger t = new Tiger();
		t.eat();
	}
	
}

class Cat extends Animal{
	
	@Override
	public void eat() {
		System.out.println("Eating");
	}
	
	@Override
	public void sleep() {
		System.out.println("Sleeping");
	}	
}

class Tiger extends Animal{
	
	@Override
	public void eat() {
		System.out.println("Eating wildfowl");
	}

	@Override
	public void sleep() {
		System.out.println("Sleeping");
	}

}
