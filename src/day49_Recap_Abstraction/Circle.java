package day49_Recap_Abstraction;

public class Circle extends Shape{

	final double num = 3.14;
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	
	@Override
	protected void area() {
		System.out.println("Area of the circle: " + (num * (radius * radius)));
	}
	
	@Override
	public void perimeter() {
		System.out.println("Perimeter of circle: " + (num * (2 * radius)));
	}
}
