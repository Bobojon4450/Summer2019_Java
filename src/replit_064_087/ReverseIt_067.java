package replit_064_087;
import java.util.Scanner;

public class ReverseIt_067 {
	/*
	 * Write a program that will reverse a string. Your program should reverse a string only 5 characters long.
	 * If word is shorter, display message: "Too short!". If word is longer, display message: "Too long!".
	 * Otherwise, reverse this word and print out result into the console. 
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the word:");
		String word = in.next();
		if (word.length() > 5) {
			System.out.println("Too long!");
		}else if (word.length() < 5) {
			System.out.println("Too short!");
		}else {
			String reverse ="";
			for (int i = word.length()-1; i >= 0; i--) {
				reverse += word.charAt(i);
			}
			System.out.println(reverse);
		}
	}
}
