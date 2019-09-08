package day15_Scanner_String;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter byte value");
		byte num = in.nextByte(); // returns the user input as byte value

		System.out.println("Enter short value");
		short num2 = in.nextShort(); // returns the user input as short value

		System.out.println("Enter int vlaue");
		int num3 = in.nextInt(); // returns the user input as int value

		System.out.println("Enter long value");
		long num4 = in.nextLong(); // returns the user input as long value

		System.out.println("Enter boolean value");
		boolean result = in.nextBoolean(); // returns the user input as boolean value

		System.out.println("Enter float value");
		float num5 = in.nextFloat(); // returns the user input as float value

		System.out.println("Enter double number");
		double num6 = in.nextDouble(); // returns the user input as double value

	}

}
