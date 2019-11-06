package day47_JavaReview;

class Cinty{
	public Cinty(int a) {
		System.out.println("Cinty");
	}
}

public class Constructor_2 extends Cinty{
	public Constructor_2() {
		super(2);
		System.out.println("Constructor_2");
	}
	
	
	public static void main(String[] args) {
		Zabi zb = new Zabi();
		Constructor_2 cs2 = new Constructor_2();	
	}	
}

class Zabi extends Constructor_2 {
	public Zabi() {
		System.out.println("Zabi \n");
	}
}