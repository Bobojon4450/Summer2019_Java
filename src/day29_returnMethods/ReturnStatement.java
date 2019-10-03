package day29_returnMethods;

public class ReturnStatement {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				break; // breaks loop only and goes to the next statement. However, return exits a method.
			}
		}
		System.out.println("Complete");
		
		if (true) {
			return;//once the return statement executed, exits the main method.
		}
		System.out.println("Hola");
		
	}
}
