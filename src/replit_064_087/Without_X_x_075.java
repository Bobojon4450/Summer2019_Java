package replit_064_087;

import java.util.Scanner;

public class Without_X_x_075 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word:");
		
		String word = scan.next();
		if (word.contains("x") || word.contains("X")) {
			word = word.trim();
			String newStr = "";
			if (word.substring(0, 1).equalsIgnoreCase("x") && word.substring(word.length() - 1).equalsIgnoreCase("x")) {
				newStr += word.substring(1, word.length() - 1);
				System.out.println(newStr);
			} else if (word.substring(0, 1).equalsIgnoreCase("x")
					&& !word.substring(word.length() - 1).equalsIgnoreCase("x")) {
				newStr += word.substring(1);
				System.out.println(newStr);
			} else if (!word.substring(0, 1).equalsIgnoreCase("x")
					&& word.substring(word.length() - 1).equalsIgnoreCase("x")) {
				newStr += word.substring(0, word.length() - 1);
				System.out.println(newStr);
			}
		} else {
			System.out.println(word);
		}

	}
}
