package repl.it;

import java.util.Scanner;

public class VehicleRecall042 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int vehicleYear;
		System.out.println("Enter vehicle's year:");
		vehicleYear = in.nextInt();

		/*
		 * if (vehicleYear >= 1995 && vehicleYear <= 2017) { if (vehicleYear >= 1995 &&
		 * vehicleYear <= 1998) {
		 * System.out.println("Your vehicle needs to be recalled!"); } else if
		 * (vehicleYear >= 2001 && vehicleYear <= 2002) {
		 * System.out.println("Your vehicle needs to be recalled!"); } else if
		 * (vehicleYear >= 2004 && vehicleYear <= 2006) {
		 * System.out.println("Your vehicle needs to be recalled!"); } else if
		 * (vehicleYear >= 2015 && vehicleYear <= 2017) {
		 * System.out.println("Your vehicle needs to be recalled!"); } else {
		 * System.out.println("Your vehicle is fine, enjoy!"); } } else {
		 * System.out.println("Your vehicle is fine, enjoy!"); }
		 */
		
		/**Different version of same code snippet**/
		
		if (vehicleYear >= 1995 && vehicleYear <= 2017) {
			if ((vehicleYear >= 1995 && vehicleYear <= 1998) || (vehicleYear >= 2001 && vehicleYear <= 2002)
			|| (vehicleYear >= 2004 && vehicleYear <= 2006) || (vehicleYear >= 2015 && vehicleYear <= 2017)) {
				System.out.println("Your vehicle needs to be recalled!");
			} else {
				System.out.println("Your vehicle is fine, enjoy!");
			}
		} else {
			System.out.println("Your vehicle is fine, enjoy!");
		}
		
		
	}
}
