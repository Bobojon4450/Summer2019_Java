package practice_oldstuff;

import java.util.Scanner;

public class CalculatorV2 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		int num1, num2;
		String operator;
		
		System.out.println("Enter first number: ");
		num1 = in.nextInt();
		
		System.out.println("Enter second number: ");
		num2 = in.nextInt();
	
		System.out.println("Enter an operator: ");
		operator = in.next();	

		switch (operator) {
			case "+": System.out.println(num1 + num2);break;
			case "-": System.out.println(num1 - num2);break;
			case "*": System.out.println(num1 * num2);break;
			case "/": if (num2 != 0) {
						System.out.println(num1 / num2);
					 }else
						 System.out.println("Division by Zero!!!");break;
			case "%": if (num2 != 0) {
						System.out.println(num1 / num2);
					}else
						System.out.println("Division by Zero in modulus!!!");break;
		default:
			System.out.println("Illigal operator input!!!");
		}
		
		
	}

}
