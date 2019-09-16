package replit_064_087;
import java.util.Scanner;

public class VerifyContains_060 {

	public static void main(String[] args) {
		/*
		 *Write a program that will verify if word contains in the sentence. Print out the result as boolean value.  
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word:");
	    String word = scan.nextLine();
	    System.out.println("Enter sentence:");
	    String sentence = scan.nextLine();
	    if (sentence.contains(word)) {
			System.out.println(sentence.contains(word));
		}else {
			System.out.println(sentence.contains(word));
		}
	    
	    
	}
}
