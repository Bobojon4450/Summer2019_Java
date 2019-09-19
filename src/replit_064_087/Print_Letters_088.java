package replit_064_087;
import java.util.Scanner;

public class Print_Letters_088 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter char one: ");
		char ch1 = in.next().charAt(0);
		System.out.println("Enter char two: ");
		char ch2 = in.next().charAt(0);

//		System.out.println(ch1);
//		System.out.println(ch2); 
		
		for ( ; ch1 <= ch2; ch1++) {
			System.out.print(ch1+" ");
		}
		
		/*Different approach.
		 * 
		 * int value1 = Integer.valueOf(ch1); int value2 = Integer.valueOf(ch2); for
		 * (int i = value1; i <= value2; i++) { System.out.print(i+" "); }
		 * System.out.println();
		 * 
		 * 
		 * for (int i = ch1; i <= ch2; i++) { System.out.print(ch1+i+" "); }
		 * System.out.println(value1); System.out.println(value2);
		 */
	}

}
