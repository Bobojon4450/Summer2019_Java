package repl.it_082_108;
import java.util.Scanner;

public class ZombieAttack1_084 {

	/*
	 * A variable inhabitants represents a city and its respective populations. 
	 * City might have a population of 0 due to a pandemic zombie disease that is wiping away the human lives.
	 * After each day, a city will lose half of its population. 
	 * Write a program to loop the city population and make it lose half of its 
	 * population until no humans left. Print the each day like below for each day:
	 * 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter population: ");
		int inhabitants = scan.nextInt();

		int i = 0;
		while (inhabitants >= 0) {
			if(inhabitants == 0) {
				System.out.println("---- EXTINCT ----");
				break;
			}else {
				System.out.println("Day " + i + " [" + inhabitants + "]");
				inhabitants /= 2;
				i++;
			}
				
		}

	}
}
