package day41_initializerBlocks;

public class Static_Instance {
	

	/*	static block needs no object creation	*/
	static {	System.out.println("Static needs no object creation to run");	}
	
	
	/*	Instance blocks need object creation	*/
	{	System.out.println("Instance 1");		}
	
	{	System.out.println("Instance 2");	}
	
	{	System.out.println("Instance 3");	}
	
	
	/*	constructors need object creation	*/
	public Static_Instance() {	System.out.println("Constructor \n");	}
	
	public static void main(String[] args) {
		Static_Instance si = new Static_Instance();
		Static_Instance si2 = new Static_Instance();
	}
	
}
