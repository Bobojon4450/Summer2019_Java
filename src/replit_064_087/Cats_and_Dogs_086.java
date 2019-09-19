package replit_064_087;
import java.util.Scanner;

public class Cats_and_Dogs_086 {

	public static void main(String[] args) {	
		/*
		 * Print true if the string "cat" and "dog" appear the same number of times in the given string word. 
		 * test-data: catdog, catcat, cat-cheetah-dog-cat.
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the word:");
		String word = in.next();
		
		int catCount= 0;
		int dogCount= 0;
		
		for (int i = 0; i < word.length()- 2; i++) {
			if (word.substring(i, i+3).equalsIgnoreCase("cat")) {
				catCount++;
			}
			if (word.substring(i, i+3).equalsIgnoreCase("dog")) {
				dogCount++;
			}
		}
		
		if (catCount == dogCount) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
	
}
