package replit_064_087;
import java.util.Scanner;

public class EqualsJavaPython_097 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the word:");
		String word = in.nextLine();
		String jaResult = "";
		String pyResult = "";
		int javaCount = 0;
		int pythonCount = 0;

		if (word.length() < 10) {
			System.out.println(false);
		} else if (word.length() >= 10) {
			for (int i = 0; i < word.length() - 3; i++) {
				jaResult = word.substring(i, i + 4);
				if (jaResult.equals("java")) {
					javaCount++;
				}
			}

			for (int i = 0; i < word.length() - 5; i++) {
				pyResult = word.substring(i, i + 6);
				if (pyResult.equals("python")) {
					pythonCount++;
				}
			}

			if (javaCount == pythonCount) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		} else {
			System.out.println(false);
		}
		
		
	}
}