package repl.it_099;
import java.util.Scanner;

public class Factorial_092 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    long temp = 1;
	   
//	    for(int i = 2; i <= n; i++){
//	      temp *= i;
//	      System.out.print(temp+" ");
//	    }
//	    System.out.print(temp);
	    
	    for(int i = 2; i <= n; i++){
		      temp *= i;
		      System.out.print(temp+" ");
		    }
		    System.out.print("\n"+temp);
	  }
	}
