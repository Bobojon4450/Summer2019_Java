package assingments;

import java.util.Scanner;

public class Task03_biggerNumber {

	public static void main(String[] args) {
		
		int num1, num2, num3;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter first integer value: ");
		num1 = in.nextInt();
		
		System.out.println("Enter second integer value: ");
		num2 = in.nextInt();
		
		System.out.println("Enter third integer value: ");
		num3 = in.nextInt();
		
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("Number "+num1+" is the largest.");
		}else if (num2 > num1 && num2 > num3) {
			System.out.println("Number "+num2+" is the largest.");
		}else if (num3 > num1 && num3 > num2) {
			System.out.println("Number "+num3+" is the largest.");
		}else if (num1 == num2 && num1 > num3) {
			System.out.println("Two numbers,num1 = "+num1+" & num2 = "+num2+" "+" are equal.");
		}else if (num2 == num3 && num2 > num1) {
			System.out.println("Two numbers, num2 = "+num2+" and num3 = "+ num3+" are equal.");
		}else if (num3 == num1 && num3 > num2) {
			System.out.println("Two numbers, "+num3+" and "+ num1+" are equal.");
		}else if (num1 == num2 && num1 == num3) {
			System.out.println("All numbers,num1 = "+num1+" & num2 = "+num2+" & num3 = "+num3+ "  are equal.");
		}

	}

}
