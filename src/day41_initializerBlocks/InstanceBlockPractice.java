package day41_initializerBlocks;

public class InstanceBlockPractice {

	String name = "Shirin";
	
	{name = "Mihray";}
	
	public InstanceBlockPractice() {	name = "Dinara";	}
	
	public static void main(String[] args) {
		InstanceBlockPractice inp = new InstanceBlockPractice();
		System.out.println(inp.name);
	}
	
}
