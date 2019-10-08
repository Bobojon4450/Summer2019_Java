package repl.it_109_180;
import java.util.ArrayList;
import java.util.Scanner;


public class Methods_15_PrintUniqueWords_153 {
	/*
	 *Complete a void method printUniqueWords() that will print only unique words from an 
	 *array of strings. Every single unique word should be printed from the new line.  
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    int size = scan.nextInt();
	    String[] words = new String[size];
	    for(int i=0; i < size; i++){
	      words[i] = scan.next();
	    }
	    printUniqueWords(words);
	  }

	public static void printUniqueWords(String[] words) {
		ArrayList<String>uniques = new ArrayList<String>();
		String temp= "";
		for (int i = 0; i < words.length; i++) {
			int uniqueCount = 0;
			for (int j = 0; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					uniqueCount++;
				}
			}
			if (uniqueCount == 1) {
				uniques.add(words[i]);
			}
		}
		for (String str : uniques) {
			System.out.println(str);
		}
	}
}
