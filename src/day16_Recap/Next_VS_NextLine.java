package day16_Recap;
import java.util.Scanner;

public class Next_VS_NextLine {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
//		System.out.println("Enter your fName: ");
//		String fName = in.next();//this method takes one word at a time, ignoring "Enter"
//		
//		System.out.println("Enter your lName: ");
//		String lName = in.next();
//		
//		System.out.println("First name is "+fName);
//		System.out.println("Last name is "+lName);
		
		
		//Same thing with nextLine()
		
		/*Test data:
		 * name: Adam    Sho   Yu
		 * lastN: Sho    Mav   Yu
		 * */
		System.out.println("Enter your fName: ");
		String fName = in.nextLine();//this method everything, including "Enter".
		
		System.out.println("Enter your lName: ");
		String lName = in.nextLine();
		
		System.out.println("First name is "+fName);
		System.out.println("Last name is "+lName); 
		
	}

}
