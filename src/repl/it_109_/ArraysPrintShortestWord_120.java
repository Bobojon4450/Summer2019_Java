package repl.it_109_;

import java.util.Scanner;

public class ArraysPrintShortestWord_120 {
	/* Write a program that will print the shortest word in the given array str. */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] str = { scan.next(), scan.next(), scan.next(), scan.next(), scan.next(), scan.next() };
		printShortest(str);
	}

	public static void printShortest(String[] arr) {
		if (arr == null || arr.length < 1) {
			System.out.println("Array is empty!");
		} else {
			String shortest = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if (arr[i].length() < shortest.length()) {
					shortest = arr[i];
				}
			}
			System.out.print("output: " + shortest);

		}
	}

}
