package day31_JavaReview;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysReview {

	public static void main(String[] args) {
		// WarmUp
		int[] num = new int[3];
		Scanner in = new Scanner(System.in);
		System.out.println("How many numbers would you like to add? ");
		int enterTimes = in.nextInt();

		for (int i = 0; i < enterTimes; i++) {
			System.out.println("Enter three numbers: ");
			num[i] = in.nextInt();
		}
		Arrays.sort(num);
		System.out.println("minimum value: " + num[num.length - num.length]);
		System.out.println("maximum value: " + num[num.length - 1]);
		System.out.println("\n");
		 

		

	}
}
