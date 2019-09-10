package repl.it;
import java.util.Scanner;

public class FindMidNumber_043 {

	public static void main(String[] args) {
		

		Scanner in = new Scanner(System.in);
	    int a, b, c;
	    System.out.println("Enter first number:");
	    a = in.nextInt();
	    System.out.println("Enter second number:");
	    b = in.nextInt();
	    System.out.println("Enter third number:");
	    c = in.nextInt();
	    
	    if((a < b && b < c) || (c < b && b < a)){
	    	System.out.println("Medium value is: "+b);
	    }else if ((b < a && a < c) || (c < a && a < c)) {
	    	System.out.println("Medium value is: "+a);
		}else {
			System.out.println("Medium value is: "+c);
		}
	}

}
