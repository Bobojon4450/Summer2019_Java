package replit_064_087;

import java.util.Scanner;

public class HasJava_087 {

	public static void main(String[] args) {
		/*
		 * Given a string word, print true if "java" appears starting at index 0 or 1 in
		 * the string, such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The
		 * string may be any length, including 0word = .
		 */

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the word:");
		String word = in.next();
		String result = "";
		
		if (word.length() < 4) {
			System.out.println(false);
		} else if (word.length() == 4) {
			if (word.equalsIgnoreCase("java")) {
				System.out.println(true);
			}
		} else {
			for (int i = 0; i < 5; i++) {
				result += word.charAt(i);
			}
			if (result.substring(0, result.length() - 1).equalsIgnoreCase("java")) {
				System.out.println(true);
			} else if (result.substring(1, result.length()).equalsIgnoreCase("java")) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		}

	}
}
