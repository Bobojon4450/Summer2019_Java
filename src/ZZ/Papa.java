package ZZ;

public class Papa {

	int var = 10;
	
	public static void add() {
		System.out.println("Adding");
	}
	
	Papa() {
		System.out.println("Papa constractor!");
	}
	
	//private is never inherited. private means belongs to class
	private void doStuff() {
		System.out.println("just do stuff");
	}
}
