package day41_initializerBlocks;

public class StaticBlock {

	String name ="ASA";
	static String str = "Static varaible";
	
	/*	static block runs only once when class loaded.	*/
	static {System.out.println("static block 1");}
	
	static {System.out.println("static block 2");}
	
	{System.out.println("Instance"); System.out.println(str); }

	public StaticBlock() {System.out.println("Constructor!");}
	
	public static void main(String[] args) {
		System.out.println("main method!");
		
//		new StaticBlock(); // in this case object created but has no reference variable.
//		new StaticBlock();
//		new StaticBlock();
//		new StaticBlock();
//		new StaticBlock();
	}
}

/* Whenever the class loaded, compiler checks for main method and then it runs the 
   static block first and then constructor and then main method	*/
 