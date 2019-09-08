package day15_Scanner_String;
import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter firts number: ");
		int num1 = in.nextInt();
		
		System.out.println("Enter second number: ");
		int num2 = in.nextInt();
		
		System.out.println("The sum of two numbers = "+(num1+num2));
		
	}

}
