package day41_initializerBlocks;

public class InstanceBlock {

	{System.out.println("Instance block");}	/*	executed second, needs object creation	*/  
	
	static {System.out.println("Static block");} /*	executed first	*/
	
	public InstanceBlock() {System.out.println("Constructor\n");}/*	executed last.	*/
	
	public static void main(String[] args) {
		
		InstanceBlock ib = new InstanceBlock(); //static, instance and constructor
		InstanceBlock ib2 = new InstanceBlock();//instance and constructor
		InstanceBlock ib3 = new InstanceBlock();//instance and constructor
		
	}
}
