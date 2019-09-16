package day21_while_loop;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
	
		int a = 1;
		while (9 > a) {
			System.out.print("Hi  ");
			a++;
		}
		System.out.println();
		
		for (int b = 1; b < 9; b++) {
			System.out.print("Hey ");
		}
		System.out.println();
		
/******************************************************************/
		String sentence = "I like book, I read book, book";
		int count =0;
		while (sentence.contains("book")) {
			count++;
			sentence = sentence.replaceFirst("book","");
		}
		System.out.println(count);

		
/******************************************************************/
		//break; forcefully exits the loop
		while (true) {
			System.out.println("Hello");
			break;//forcefully exits the loop
		}
		
		
/******************************************************************/
//		int i = 1;
//		int max = 100;
//		while (max >= i) {
//			if (i % 2 == 0) {
//				System.out.print(" "+i);
//			}
//			i++;
//		}
		
/******************************************************************/
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int start =in.nextInt();
		System.out.print("Enter second number: ");
		int end =in.nextInt();
		
		if (end > start) {
			while (end >= start) {
				if(start % 2 == 0) {
					System.out.print(" "+start);
				}
				start++;	
			}
		}else {
			System.out.println("Starting number should not exceed the end number!");
		}
		
		
	}
}
