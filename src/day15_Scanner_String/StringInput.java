package day15_Scanner_String;
import java.util.Scanner;

public class StringInput {

	/*
	 * next() vs nextLine();
	 * */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter you name: ");
		String fName = in.next();//returns one word at a time, brakes before the space.
		
		System.out.println("Enter your lastName: ");
		String lName = in.nextLine();//returns entire user input as string

		System.out.println(fName);
		System.out.println(lName);
		
		
	}

}
