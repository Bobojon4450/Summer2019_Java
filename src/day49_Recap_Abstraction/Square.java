package day49_Recap_Abstraction;

public class Square extends Shape{

	double side;
	
	public Square(double side) {
		this.side = side;
	}
	
	@Override
	protected void area() {
		System.out.println("Area of square: " + (side * side));
	}
	
	@Override
	protected void perimeter() {
		System.out.println("Perimeter of square: "+4 * side);
	}
	
}
