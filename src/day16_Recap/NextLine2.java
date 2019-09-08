package day16_Recap;
import java.util.Scanner;

public class NextLine2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the zip-code: ");
		int zipcode = in.nextInt();
		
		in.nextLine();// takes the Enter from scanner.
		
		System.out.println("Enter city name: ");
		String city = in.nextLine();
		
		System.out.println("Enter your phone number: ");
		int phone = in.nextInt();
		
		in.nextLine();// takes the Enter from scanner.
		System.out.println("Enter your state: ");
		String state = in.nextLine();

		System.out.println("zip-code: "+zipcode);
		System.out.println("city: "+city);
		System.out.println("state: "+state);
		System.out.println("phone number: "+phone);
		
	}

}
