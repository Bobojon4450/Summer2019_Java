package day28_Recap;

import java.util.Arrays;

public class WarmUp {
	/*
	 * 1. Write a method that can convert km to miles 1km = 0.612 miles
	 * 
	 * 2. write a method that can convert gallons to litters 1 Gallon = 3.75L
	 */
	public static void main(String[] args) {
		kmToMiles(10);
		gallonToLitters(1);
		int[] arr = { 100, 45, 97 };
		int[] arra = { -1, -27, 90, 84, 200, 209 };
		sortDescendOrder(arr);
		sortDescendOrder(arra);
	}
	

	public static void kmToMiles(double km) {
		double miles = km * 0.612;
		System.out.println(km + " kilometers equal to " + miles + " miles");
	}

	public static void gallonToLitters(double gallon) {
		if (gallon < 1) {
			System.out.println("Invalid input!");
		} else {
			double litters = gallon * 3.75;
			System.out.println(gallon + " gallons equal to " + litters + " litters");
		}
	}

	public static void sortDescendOrder(int[] arr) {
		Arrays.sort(arr);
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}System.out.println();
	}




}
