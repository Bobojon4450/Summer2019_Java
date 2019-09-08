package day15_Scanner_String;
import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter fName: ");
		String fName = in.nextLine();
		
		System.out.println("Enter lName: ");
		String lName = in.nextLine();

		System.out.println("Full name is: " + fName + " " + lName);
		in.close();		
	}
}
