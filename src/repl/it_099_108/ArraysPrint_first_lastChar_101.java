package repl.it_099_108;
import java.util.Scanner;

public class ArraysPrint_first_lastChar_101 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = { input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine() };
		for (int i = 0; i < words.length; i++) {
			String temp = words[i];
			System.out.println(""+temp.charAt(temp.length()-temp.length()) + temp.charAt(temp.length()-1));
		}
	
	}
}
