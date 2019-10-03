package repl.it_099;

import java.util.Scanner;

public class ArraysSplitSentence_106 {

	/*
	 * Given a String variable sentence, write code to type each word in separate lines.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the word:");
		String sentence = input.nextLine();
		
		String arr[] = sentence.split(" ");
		for (String str : arr) {
			System.out.println(str);
		}
	}

}
