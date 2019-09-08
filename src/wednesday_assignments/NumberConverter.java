package wednesday_assignments;
import java.util.Scanner;

public class NumberConverter {

	static Scanner in;

	public static void numberConverter() {
		in = new Scanner(System.in);
		int num = 0;
		System.out.println("Enter number between 0 to 9 : ");
		num = in.nextInt();
		switch (num) {
		case 0 : System.out.println("You entered zero");break;
		case 1 : System.out.println("You entered one");break;
		case 2 : System.out.println("You entered two");break;
		case 3 : System.out.println("You entered three");break;
		case 4 : System.out.println("You entered four");break;
		case 5 : System.out.println("You entered five");break;
		case 6 : System.out.println("You entered six");break;
		case 7 : System.out.println("You entered seven");break;
		case 8 : System.out.println("You entered eight");break;
		case 9 : System.out.println("You entered nine");break;
		default:
			System.out.println("Input out of range, enter valid number 0 ~ 9");
		}
	}
	
	public static void numberConverterTernary() {
		in = new Scanner(System.in);
		int num;
		System.out.println("Enter number between 0 to 9 : ");
		num = in.nextInt();
		String convertedNumber;
		convertedNumber = (num == 0) ? "zero" : 
								(num == 1) ? "one" :
									(num == 2) ? "two" :
										(num == 3) ? "three" :
											(num == 4) ? "four" :
												(num == 5) ? "five" :
													(num == 6) ? "six" :
														(num == 7) ? "seven" :
															(num == 8) ? "eight" :
																(num == 9) ? "nine" :
																	"Input out of range, enter valid number 0 ~ 9";
		System.out.println("You have entered "+convertedNumber);
		
	}
	
	public static void main(String[] args) {
//		numberConverter();
		numberConverterTernary();
	}
	
	
}
