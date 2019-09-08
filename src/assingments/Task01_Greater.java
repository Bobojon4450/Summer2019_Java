package assingments;

import java.util.Scanner;

public class Task01_Greater {

	public static void main(String[] args) {
		
		int num1, num2, max;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter first integer value: ");
		num1 = in.nextInt();
		
		System.out.println("Enter second integer value: ");
		num2 = in.nextInt();
		
		if (num1 > num2) {
			max = num1;
			System.out.println("max = "+ max);
		}else if (num2 > num1) {
			max = num2;
			System.out.println("max = "+ max);
		}else if (num1 == num2) {
			max = num1;
			System.out.println("max = "+ max);
		}else
			System.out.println("Invalid input.");

	}

}
