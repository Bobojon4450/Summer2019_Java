package day49_Recap_Abstraction;

public class Practice {
	
}

abstract class Shapes{
	public abstract void area();
}

abstract class T extends Shapes{
	//here an abstract method area inherited implicitly.
}

class Triangle extends Shapes{
	public void area() {
		System.out.println("Overridden");
	}
}

