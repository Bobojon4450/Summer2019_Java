package day46_superKeyword;

class Parent {

	public Parent() {
		System.out.println("Default Papa");
	}
	
	public Parent(int x) {
		this("");
		System.out.println("Int Papa");
	}
	
	public Parent(String str) {
		System.out.println("Parametrized Papa");
	}
}

public class Practice extends Parent {
	public static void main(String[] args) {
		Practice pr = new Practice("");
	}
	
	/*	in this constructor the first line is implicit call to papa constructor	*/
	public Practice() {
		System.out.println("Default Practice child");
	}
	
	public Practice(String str) {
		super(2);
		//super("str");
		System.out.println("Parametrized Practice child");
	}
	
}
