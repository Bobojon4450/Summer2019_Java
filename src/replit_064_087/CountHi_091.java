package replit_064_087;
import java.util.Scanner;

public class CountHi_091 {
	
	/*
	 * Print out the number of times that the string "hi" appears anywhere in the given string.
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the word:");
		String str = in.nextLine();
		int occurrance = 0;
		String result = "";

		if (str.length() < 2) {
			System.out.println(occurrance);
		} else if (str.length() == 2) {
			if (str.equals("hi")) {
				occurrance++;
				System.out.println(occurrance);
			} else {
				System.out.println(occurrance);
			}
		} else if (str.length() > 2) {
			for (int i = 0; i < str.length() - 1; i++) {
				result = str.substring(i, i + 2);
				if (result.equals("hi")) {
					occurrance++;
				}
			}
			System.out.println(occurrance);
		} else {
			System.out.println(occurrance);
		}
	
	}
}
