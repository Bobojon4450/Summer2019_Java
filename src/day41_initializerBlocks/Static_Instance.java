package day41_initializerBlocks;

public class Static_Instance {
	

	/*	static block needs no object creation	*/
	static {
		System.out.println("Static needs no object creation to run"); //1
		new Static_Instance().instanceMethod();// here it executes last.
	}
	
	
	/*	Instance blocks need object creation	*/
	{	System.out.println("Instance 1");		}    //2
	
	{	System.out.println("Instance 2");	}	//3
	
	{	System.out.println("Instance 3");	}	//4
	
	
	public void instanceMethod() {System.out.println("Instance Method");}//6, even though it was
																		//called in static block.
	
	/*	constructors need object creation	*/
	public Static_Instance() {	System.out.println("Constructor \n");	}	//5
	
	public static void main(String[] args) {
		Static_Instance si = new Static_Instance();
		Static_Instance si2 = new Static_Instance();
	}
	
}
