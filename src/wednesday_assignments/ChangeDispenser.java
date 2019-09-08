package wednesday_assignments;
import java.util.Scanner;

public class ChangeDispenser {

	static Scanner in;
	
	public static void changeDeterminor() {
		in = new Scanner(System.in);
		int dollarBill;
		int change;
		System.out.println("Enter price in cents: ");
		
	}
	
	public static void main(String[] args) {

	    Scanner in = new Scanner(System.in);
        System.out.print("Enter seconds: ");
		int inputSeconds = in.nextInt(); 
		
        int second = inputSeconds % 60; //returns seconds left
        int hour = inputSeconds / 60;	//returns solid hours without remainders
        int minute = hour % 60;			//returns remainders as a minutes
        hour = hour / 60;				//returns exact hours
        
        System.out.println( hour + " hours, " + minute + " minutes, and " + second+" seconds");
	    
	    
	}
	
}
/*
 *      Scanner scanner = new Scanner(System.in);
        System.out.println("Enter price in cents: ");
        int change = scanner.nextInt();
        int quarter = change / 25;
        int dime = (change % 25) / 10;
        int nickel = (change % 25) % 10 / 5;
        int penny = (change % 25) % 10 % 5;
        System.out.println("You change is " + quarter + " quarters, " + dime + " dimes,  " + nickel + " nickels, and " + penny+ " pennies.");
        scanner.close();
 * */


