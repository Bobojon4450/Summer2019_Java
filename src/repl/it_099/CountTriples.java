package repl.it_099;

import java.util.Scanner;

public class CountTriples {

	public static void main(String[] args) {
		/*
		 * We'll say that a "triple" in a string is a char appearing three times in a
		 * row. Print out the number of triples in the given string. The triples may
		 * overlap. Example: input: abcXXXabc output: 1
		 */

		// XXXXXabc
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String str = scan.next();
		
		int count = 0;
		if (str.length()> 2) {
			if (str.length() == 3) {
				if (str.charAt(str.length()-str.length()) == str.charAt(str.length()-2) && str.charAt(str.length()-2) == str.charAt(str.length()-1)) {
					count++;
					System.out.println(str);
					System.out.println("count: "+count);
				}
			}else {
				for (int i = 0; i < str.length() - 2; i++) {
					String temp = "";
					if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i + 1) == str.charAt(i + 2)) {
						temp = ""+ str.charAt(i) + str.charAt(i + 1) + str.charAt(i + 2);
						System.out.println(temp);
						count++;
					}
				}
				System.out.println(count);
			}	
		}else {
			System.out.println("The word should have three letters at least!");
		}
		
		
		

	}
}
