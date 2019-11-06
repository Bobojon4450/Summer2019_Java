package day49_Recap_Abstraction;

public class Rectangle extends Shape{
	
	double length;
	double width;
	
	public Rectangle(double length,	double width) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	protected void area() {
		System.out.println("Area is: "+(width * length));
	}
	
	@Override
	protected void perimeter() {
		System.out.println("Perimeter is: " + (length + width) * 2);
	}
}
