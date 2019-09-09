package repl.it;

import java.util.Scanner;

public class Paitient_Information_024 {

	public static void main(String[] args) {

		String firstName, lastName, fullName, email, street, state, city, address, contacts;
		int age, zipcode;
		double height, weight;
		boolean isMarried;
		long workPhoneNumber, personalPhoneNumber;

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the patient portal!");
		System.out.println("Please enter your personal information");

		System.out.println("Enter your first name");
		firstName = scan.nextLine();

		System.out.println("Enter your last name");
		lastName = scan.nextLine();

		System.out.println("Enter your email");
		email = scan.nextLine();

		System.out.println("Enter your street");
		street = scan.nextLine();

		System.out.println("Enter your city");
		city = scan.nextLine();

		System.out.println("Enter your state");
		state = scan.nextLine();

		System.out.println("Enter your zip code");
		zipcode = scan.nextInt();

		System.out.println("Enter your work phone number");
		workPhoneNumber = scan.nextLong();

		System.out.println("Enter your personal phone number");
		personalPhoneNumber = scan.nextLong();

		System.out.println("Enter your age");
		age = scan.nextInt();

		System.out.println("Enter your height");
		height = scan.nextDouble();

		System.out.println("Enter your weight");
		weight = scan.nextDouble();

		System.out.println("Are you married?");
		isMarried = scan.nextBoolean();

		contacts = "Contacts: work number - " + workPhoneNumber + ", personal cell - " + personalPhoneNumber
				+ ", email: " + email;
		fullName = "Full name: " + firstName + ", " + lastName;
		address = "Address: " + street + ", " + city + ", " + state + " " + zipcode;

		System.out.println("Patient personal information");
		System.out.println(fullName);
		System.out.println(address);
		System.out.println(contacts);

	}
}
