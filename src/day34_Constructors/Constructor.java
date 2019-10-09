package day34_Constructors;

public class Constructor {
	int x;
	
	public Constructor(){
		System.out.println("Default constructor");
	}
	
	public Constructor(int x){
		this.x = x;
		System.out.println("I am a constructor with an argument: "+x);
	}
	
	public static void test() {
		Constructor cons = new Constructor(5);
	}
	
	public static void main(String[] args) {
		Constructor cons = new Constructor(1);
		Constructor cons2 = new Constructor();
		test();
	}
}
/*	Constructor created during Object creation	*/

