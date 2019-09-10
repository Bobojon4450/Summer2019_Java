package day18_StringMethods_Cont;
import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String fName = in.nextLine();
		fName = fName.substring(0,1).toUpperCase() + fName.substring(1).toLowerCase();
		
		
		System.out.println("Enter last name: ");
		String lName = in.nextLine();
		lName = lName.substring(0,1).toUpperCase()+lName.substring(1).toLowerCase();
		
		String fullName = fName+" "+lName;
		System.out.println(fullName);
		
		in.close();
	}

}
