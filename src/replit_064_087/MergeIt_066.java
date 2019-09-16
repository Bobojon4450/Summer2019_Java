package replit_064_087;
import java.util.Scanner;

public class MergeIt_066 {

	public static void main(String[] args) {	
		/*
		   	You have 2 words, both of them have 3 characters.
			If either of them does not have exactly 3 characters, print "cannot merge"
			Merge their characters one by one and print together like below:
		 */
		
		
		/*Version 1
		 * 	Scanner scan = new Scanner(System.in);
			System.out.println("Enter first word: ");
			System.out.println("Enter second word: ");
		    String word1 = scan.next();
		    String word2 = scan.next();
		    if( (word1.length() == 3) && (word2.length() == 3) ){
		      String merged = ""+word1.charAt(0)+""+word2.charAt(0)+""+word1.charAt(1)+""+word2.charAt(1)+""+word1.charAt(2)+""+word2.charAt(2);
		      System.out.println(merged);
	    }
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first word: ");
	    String word1 = scan.next();
	    System.out.println("Enter second word: ");
	    String word2 = scan.next();
	    int j = 0;
	    if ((word1.length() == 3) && (word2.length() == 3)) {
	    	String merge="";
		    for (int i = 0; i < word1.length(); i++) {
		    	merge = merge + word1.charAt(i);
		    	for (; j <= i; j++) {
					merge = merge + word2.charAt(j);
				}
			}
		 System.out.println(merge);
		}else {
			System.out.println("cannot merge");
		}
	}

}
