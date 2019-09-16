package day21_while_loop;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("Enter first number");
			int a = in.nextInt();
			System.out.println("Enter second number");
			int b = in.nextInt();
			System.out.println("addition is: " + (a + b));
			System.out.println("Do you wanna continiue?\nEnter Y/N");
			String answer = in.next();
			if (answer.equalsIgnoreCase("no")||answer.equalsIgnoreCase("n")||answer.equalsIgnoreCase("nope")||answer.equalsIgnoreCase("none")||answer.equalsIgnoreCase("nea")) {
				System.out.println("Bye");
				break;
			}else if (answer.equalsIgnoreCase("y")||answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("yeap")||answer.equalsIgnoreCase("ye")||answer.equalsIgnoreCase("yep")||answer.equalsIgnoreCase("yeep")) {
				continue;
			}else {
				System.out.println("Incorrect Input!\nRestart the proccess");
			}
		} while (true);
		
		
		
		
		
	}
}
