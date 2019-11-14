package day49_Recap_Abstraction;

public abstract class Abstraction {
	public abstract void startTheCar();
}
 
abstract class XX extends Abstraction{
	// No need to implement the abstract methods.
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