package day10_if_statement;

public class Multi_Branch_Ifstatement {

	public static void main(String[] args) {
		
		if (false) {
			System.out.println("if statement");
		}
		else if (true) {
			System.out.println("else if statement");
		}
		else {
			System.out.println("else block");
		}
		
		
		/***
		 * 
		 * Task 1:
		 * 90 <= grade -> A 
		 * 80 <= grade < 90 -> B
		 * 70 <= grade < 80 -> C
		 * 60 <= grade < 70 -> D
		 * 	else F
		 * */
		
		int grade = 90;
		
		if (grade >= 90) {
			System.out.println("A");
		}else if (grade >= 80 && grade < 90) {
			System.out.println("B");
		}else if (grade >= 70 && grade < 80) {
			System.out.println("C");
		}else if (grade >= 60 && grade < 70) {
			System.out.println("D");
		} else {
			System.out.println("F, study more!");
		}
		
		
		
		
		
		int num1 = 300, num2 = 299, num3 = 299;
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("Greatest number is num1: "+num1);
		}else if (num2 > num1 && num2 > num3) {
			System.out.println("Greatest number is "+num2);
		}else if (num3 > num1 && num3 > num2) {
			System.out.println("Greatest number is "+num3);
		}else if (num1 == num2 && num1 > num3) {
			System.out.println("Num and Num2 are equal "+num1);
		}else if (num2 == num3 && num2 > num1) {
			System.out.println("num2 and num3 are equal: "+num2 +" "+num3);
		}else if(num3 == num1 && num3 >num2){
			System.out.println("Equal numbers are num1 & num3: "+num1+ " "+ num3);
		}
		else {
			System.out.println("All of the numbers are equal!!!");
		}
		
		
		/*********************************************/
		if (true)
			System.out.println("1st if()");
		else if(true)
			System.out.println("else if()");
		else
			System.out.println("else");
		
		
	}

}
