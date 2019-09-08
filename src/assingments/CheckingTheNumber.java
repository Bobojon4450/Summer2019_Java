package assingments;

import java.util.Scanner;

public class CheckingTheNumber {

	public static void main(String[] args) {

		int num;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter an integer value: ");
		num = in.nextInt();
		
		if (num > 0) {
			System.out.println("The number is positive.");
		}else if (num == 0) {
			System.out.println("The number equals to zero.");
		}else if (num < 0) {
			System.out.println("The number is negative.");
		}else
			System.out.println("Invalid input.");

	}

}
