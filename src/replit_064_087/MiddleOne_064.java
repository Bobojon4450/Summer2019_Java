package replit_064_087;
import java.util.Scanner;

public class MiddleOne_064 {
	
	/*
	 * You have a word, do the following:

1. When word has odd number of characters and:
            - 3 or more characters, print middle letter
      oak ==> a
      javav ==> v
             - Single character, print that character 3 times
      # ==> ###
      q ==> qqq

2. When word has even number of characters and:
           - 4 or more characters, print middle 2
     java ==> av
     apples ==> pl
     #$%^&* ==> %^
           - 2 characters, print those 2 characters twice
      @@ ==>@@@@
      $$ ==>$$$$
      hi ==> hihi
	 */

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the word: ");
		
		String word = in.next();
		if (word.length() % 2 != 0 && word.length() >= 3) {
			System.out.println(word.charAt(word.length() / 2));
		}
		if (word.length() % 2 != 0 && word.length() == 1) {
			System.out.println(word + word + word);
		}
		if (word.length() % 2 == 0 && word.length() >= 4) {
			int mid = word.length() / 2;
			System.out.println(word.charAt(mid - 1) + "" + word.charAt(mid));
		}
		if (word.length() % 2 == 0 && word.length() == 2) {
			System.out.println(word + word);
		}
	
	}
}
