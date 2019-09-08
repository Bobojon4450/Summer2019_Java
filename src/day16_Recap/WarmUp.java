package day16_Recap;
import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your first name: ");
		String fName = in.nextLine();
		System.out.println("Please enter your last name: ");
		String lName = in.nextLine();
		
		String fullName = fName.toUpperCase().concat(" "+lName.toUpperCase());
		String fullName2 = fName.concat(" "+lName).toUpperCase();
		String fullName3 = fName.toUpperCase()+" "+(lName.toUpperCase());
		System.out.println(fullName);

		
	}
}
