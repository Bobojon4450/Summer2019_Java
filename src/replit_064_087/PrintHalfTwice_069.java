package replit_064_087;
import java.util.Scanner;

public class PrintHalfTwice_069 {

	/*
	 * Write a program that will print out first half of the word twice. Example:
	 * 
	 * input: java 
	 * output: jaja
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word:");
		String word = scan.next();
		String result = "";
		
		if (word.length() % 2 == 0) {
			int firstHalf = word.length() / 2;
			for (int i = 0; i < firstHalf; i++) {
				result = result + word.charAt(i);
			}
			System.out.print(result + result);
		} else if (word.length() % 2 != 0) {
			int firstHalf2 = 0;
			if (word.length() % 3 == 0) {
				firstHalf2 = word.length() / 2;
				for (int i = 0; i < firstHalf2; i++) {
					result = result + word.charAt(i);
				}
			} else if (word.length() % 3 == 2) {
				firstHalf2 = word.length() / 2;
				for (int i = 0; i < firstHalf2; i++) {
					result = result + word.charAt(i);
				}
			} else if (word.length() % 3 == 1) {
				if (word.length() == 1) {
					result = result + word;
				} else {
					firstHalf2 = word.length() / 2;
					for (int i = 0; i < firstHalf2; i++) {
						result = result + word.charAt(i);
					}
				}
			}
			System.out.print(result + result);
		}

	}
}
