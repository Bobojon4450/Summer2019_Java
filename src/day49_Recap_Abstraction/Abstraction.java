package day49_Recap_Abstraction;

public abstract class Abstraction {
	public abstract void startTheCar();
}
 

class S extends Abstraction {

	@Override
	public void startTheCar() {
		System.out.println("Overridden and implemented");
	}
}

class Tesla extends Abstraction{
	
	@Override
	public void startTheCar() {
		System.out.println("Voice control");
		System.out.println("Drive");
	}
}