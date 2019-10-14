package day36_JavaReview;

public class ConstructorCall {

	

	public ConstructorCall() {System.out.println("Default");}
	
	public ConstructorCall(int x) {this();System.out.println(x);}
	
	public ConstructorCall(int x, int y) {this();System.out.println("x + y = "+(x+y));}
	
	public ConstructorCall(double a, double b, double c) {System.out.println("double x double x double");}
	
	
	public static void main(String[] args) {
		ConstructorCall cc = new ConstructorCall(5,5);
	}
	
	
	
}
