package day49_Recap_Abstraction;

public class Shape {

	protected void area() {
		System.out.println("Area is 0");
	}

	protected void perimeter() {
		System.out.println("Perimeter is 0");
	}

	protected void capacity() {
		System.out.println("Capacity is 0");
	}

	
	
	public static void main(String[] args) {
		Rectangle rec = new Rectangle(10, 15);
		rec.area();
		System.out.println("---------------------------------\n");
		
		Rectangle rec2 = new Rectangle(10, 10);
		rec2.perimeter();
		System.out.println("---------------------------------\n");
		
		Square sq = new Square(10);
		sq.area();
		sq.perimeter();
		System.out.println("---------------------------------\n");
		
		Circle cr = new Circle(5);
		cr.area();
		cr.perimeter();
		System.out.println("---------------------------------\n");
		
		Cylinder cl = new Cylinder(12, 5);
		cl.perimeter();
		cl.area();
		cl.capacity();
		
		
		
		
	}
	
}



	 /*  1. create a class called Shape
	            Actions: Area(), perimeter(), capacity()
	    2. create sub classes of Shape:
	                        Circle
	                        rectangle
	                        square
	                        cylinder
	       and give the instance variables that are needed to calculate the Area, perimeter, and Volume of those shapes
	    
	    3. override super class' Area(), perimeter(), capacity() methods to the sub classes
	Formulas:
	    Area of the circle:     3.14 * radius * radius
	    Area of the rectangle:  width * length
	    Area of the square:     side * side
	    Area of the cylinder: (2 * 3.14 * radius * radius) + height(2*3.14*radius)
	    Perimeter of circle:    3.14 * 2 * radius
	    Perimeter of rectangle: (width + length) * 2
	    Perimeter of Square: 4 * side
	    volume of cylinder: 3.14 * radius * radius * height .
	 */