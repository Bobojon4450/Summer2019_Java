package day18_StringMethods_Cont;
import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in); 
//		System.out.println("Enter your first name: ");
//		String fName = in.nextLine();
//		fName = fName.substring(0,1).toUpperCase() + fName.substring(1).toLowerCase();
//		
//		
//		System.out.println("Enter last name: ");
//		String lName = in.nextLine();
//		lName = lName.substring(0,1).toUpperCase()+lName.substring(1).toLowerCase();
//		
//		String fullName = fName+" "+lName;
//		System.out.println(fullName);
//		
//		in.close();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word:");
	    String word = scan.next();
	    //WRITE YOUR CODE HERE
	    String fLetter = (word.substring((word.length() - word.length()), (word.length() - word.length())+1));
	    String lastLetter = word.substring(word.length()-1).toUpperCase();
	    System.out.print(fLetter+"."+lastLetter);
	      
	}

}// + word.substring(word.length()-1));
