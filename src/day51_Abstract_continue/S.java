package day51_Abstract_continue;

public class S {

	public S() {
		System.out.println("S");
	}
	
	public static void main(String[] args) {
		Q q = new Q();
	}
}

class Q extends S{
	public Q(){
		System.out.println("Q");//here we have implicit call to super() in the first line
	}
	public static void main(String[] args) {
		S s = new S();
		Q q = new Q();
	}
}

class W extends Q{
	public W() {
		System.out.println("W");
	}
	
	public static void main(String[] args) {
		Q q = new Q(); //S Q
		W w = new W(); // S Q W
	}
}


