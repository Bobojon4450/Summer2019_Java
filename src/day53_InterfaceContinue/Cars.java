package day53_InterfaceContinue;

public interface Cars {

	public abstract void start();
	
	//my creation
	default void carsMessage() {System.out.println("carsMessage");}
	
}
