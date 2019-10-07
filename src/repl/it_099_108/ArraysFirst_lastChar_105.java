package repl.it_099_108;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysFirst_lastChar_105 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] words = { input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine() };
		String[] letters = new String[words.length];
		for (int i = 0; i < words.length; i++) {
			String temp = words[i].substring((words.length-words.length), (words.length-words.length)+1);
			temp += words[i].substring(words[i].length()-1);
			letters[i] = temp;
		}
		System.out.println(Arrays.toString(letters));
		
	}

}
