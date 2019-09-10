package repl.it;

import java.util.Scanner;

public class HappyValleySchoolSystem {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter age:");
		int age = scan.nextInt();

		if (age >= 2) {
			if (age == 2) {
				System.out.print("toddler");
			} else if (age >= 3 && age <= 5) {
				System.out.println("early childhood");
			} else if (age >= 6 && age <= 7) {
				System.out.print("young reader");
			} else if (age >= 8 && age <= 10) {
				System.out.print("elementary");
			} else if (age >= 11 && age <= 12) {
				System.out.print("middle");
			} else if (age == 13) {
				System.out.print("impossible");
			} else if (age >= 14 && age <= 16) {
				System.out.print("high school");
			} else if (age >= 17 && age <= 18) {
				System.out.print("scholar");
			} else {
				System.out.print("ineligible");
			}
		} else {
			System.out.print("ineligible");
		}

	}

}
