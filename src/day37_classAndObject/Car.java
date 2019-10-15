package day37_classAndObject;

public class Car {

	String model;
	int year;
	String brand;
	String color;
	double price;
	int millage;
	String VIN;

	public static void start() {
		System.out.println("Started");
	}

	public static void drive() {
		System.out.println("Drive");
	}

	public static void accelerate() {
		System.out.println("Accelerate");
	}

	public static void stop() {
		System.out.println("Stopped");
	}

	public static void drift() {
		System.out.println("drifting");
	}

	public void getInfo() {
		System.out.println(year + " " + brand + " " + model + ", " + color + ", " + millage + " miles" + ", $" + price);
	}

	

}
