package repl.it_109_;

import java.util.Scanner;

public class ArraysFindingMaxLengthStringArray_115 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = new String[5];

		for (int i = 0; i < 5; i++) {
			words[i] = input.nextLine();
		}

		String longest = "";
		for (int j = 0; j < words.length; j++) {
			if (longest.length() < words[j].length()) {
				longest = words[j];
			}
		}
		System.out.print(longest);

	}
}
