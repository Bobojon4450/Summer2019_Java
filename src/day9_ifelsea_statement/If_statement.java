package day9_ifelsea_statement;

public class If_statement {

	public static void main(String[] args) {
		
		int a = 1000;
		
		if (a++ == 1001) {
			a = 2000;
			System.out.println(" a is increased");
		}
		
		int b = 9887650;
		isEven(b, 5);
		
		String CEO = "Main Boss";
		String Kuzzat = "Main Boss";
		System.out.println(CEO == Kuzzat);
		
		if (Kuzzat == CEO) {
			System.out.println("Great Person at Cybertek");
		}
		
		if (Kuzzat != CEO) {
			
		}
		
	}
	
	public static boolean isEven(int number, int mod) {
		if (number % mod == 0) {
			System.out.println("The number is Even");
			return true;
		}
		else {
			System.out.println("The number is Odd");
			return false;
		}
	}
}
