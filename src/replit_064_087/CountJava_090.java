package replit_064_087;
import java.util.Scanner;

public class CountJava_090 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter word: ");
		String word = in.next();
	    
		String str = "";
		int count = 0;
		if (word.length() < 4) {
			System.out.println(count);
		} else if (word.length() == 4) {
			if (word.equalsIgnoreCase("java")) {
				count++;
				System.out.println(count);
			}
		} else if (word.length() > 4) {
			for (int i = 0; i < word.length()-3; i++) {
				str = word.substring(i, i + 4);
				if (str.equalsIgnoreCase("java")) {
					count++;
				}
			}
			System.out.println(count);
		} else {
			System.out.println(count);
		}

		
	}

}
