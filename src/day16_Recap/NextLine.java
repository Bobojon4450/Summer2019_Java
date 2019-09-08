package day16_Recap;
import java.util.Scanner;

public class NextLine {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter phone number and name: ");
		//12345678 Enter ==> enter is not accepted. it ignores Enter.
		int phNum = in.nextInt();
		
		in.hasNext();// it ignores the Enter
		
		in.nextLine();
		String name = in.nextLine();
		//nextLine will take everything in scanner's memory(including Enter up-to the new line)
		
		
		/*
		System.out.println("enter your phone number");
        int phonNum= scan.nextInt();
        
        scan.nextLine(); // this will take out the Enter
        System.out.println("enter your name");
        String name= scan.nextLine();
        */

	}

}
