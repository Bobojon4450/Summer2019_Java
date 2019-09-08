package practice_oldstuff;

import java.util.Scanner;

public class CalculatorV1 {

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
		
		if (operator.equals("+")) {
			System.out.println(num1 + num2);
		}else if (operator.equals("-")) {
			System.out.println(num1 - num2);
		}else if (operator.equals("*")) {
			System.out.println(num1 * num2);
		}else if (operator.equals("/")) {
			if (num2 != 0) {
				System.out.println(num1 / num2);
			}else {
				System.out.println("Division by Zero!!!");
			}
			
		}else if (operator.equals("%")) {
			if (num2 != 0) {
				System.out.println(num1 % num2);
			}else {
				System.out.println("Division by Zero in modulus!!!");
			}
		}else
			System.out.println("Invalid operator");
		
		
		
		
	}

}
