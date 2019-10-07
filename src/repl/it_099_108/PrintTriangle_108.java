package repl.it_099_108;

import java.util.Scanner;

public class PrintTriangle_108 {

	/*
	 * Assume that the int variables i and j have been declared, and that n has been
	 * declared and initialized. 
	 * Using for loops (you may need more than one), write code that will
	 * cause a triangle of asterisks of size n to be output to the screen.
	 */
	public static void main(String[] args) {

		int i = 1;
		int j = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = scan.nextInt();
		for (int k = 1; k <= n; k++) {
			for (int z = 1; z <= k; z++) {
				System.out.print("*");
			}System.out.println();
		}
	}

}
