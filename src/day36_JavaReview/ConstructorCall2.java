package day36_JavaReview;

public class ConstructorCall2 {

	public ConstructorCall2() {}
	
	public ConstructorCall2(double b) {this(); System.out.println(b);}
	
	public ConstructorCall2(int x) {this(11.0);}
	

	public static void main(String[] args) {
		ConstructorCall2 cc2 = new ConstructorCall2(22);
	}
}
