package replit_064_087;
import java.util.Scanner;

public class MiddleThree_065 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word:");
		String word = scan.next();
		
		String middle = "";
		if (word.length() >= 5 && word.length() % 2 != 0) {
			if (word.length() == 5) {
				int start = (word.length() / 2) - (word.length() % 2);
				int end = (word.length() / 2) + (word.length() % 2);
				for (int i = start; i <= end; i++) {
					middle += word.charAt(i);
				}
			} else if (word.length() > 5) {
				int start = (word.length() / 2) - (word.length() % 2);
				int end = (word.length() / 2) + (word.length() % 2);
				for (int i = start; i <= end; i++) {
					middle +=  word.charAt(i);
				}
			}
			System.out.println(middle);
		} else {
			System.out.println("invalid");
		}

		
		
	}
}
