package day14_Scanner;

public class WarmUp {

	public static void main(String[] args) {
		
		String days2 = "Wednesday";
		
		switch (days2) {
		case "Thursday":
			System.out.println("Java class Day");
			break;
		case "Friday":
			System.out.println("Java class Day");
			break;
		case "Wednesday":
			System.out.println("SQL class Day");
			break;
		case "Saturday":
			System.out.println("SQL class Day");
			break;
		default:
			System.out.println("Day off");
		}
		
		System.out.println("-------------------------\n");
		
		/***
		 * boolean, double, float, long are not accepted in switch block.
		 * */

		//second version of above
		switch (days2) {
		case "Thursday":
			System.out.println("Java class Day");
		case "Friday":
			System.out.println("Java class Day");
			break;

		case "Wednesday":
			System.out.println("SQL class Day");
		case "Saturday":
			System.out.println("SQL class Day");
			break;
		default:
			System.out.println("Day off");
		}
		
		System.out.println("-------------------------\n");
	}

}
