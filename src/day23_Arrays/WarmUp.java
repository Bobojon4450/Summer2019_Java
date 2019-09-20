package day23_Arrays;

import java.util.Scanner;

public class WarmUp {
	public static void main(String[] args) {
		int a = 15;
		int b = 6;
		/*
		 * 15 - 6 = 9
		 * 9 - 6 = 3
		 * 	result = 2;
		 * 	remainder = 3
		 */
		
		int x = 20;
		int y = 6;
		int count=0;
		while (x>=y) {
			x -= y;
			count++;
		}
		System.out.println(count);//result after dividing two numbers
		System.out.println(20/6);
		System.out.println(x);//remainder
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int result =0;
		
		if (num2 != 0) {
			while (num1 >= num2) {
				num1 -= num2;
				result++;
			}
			System.out.println("result: "+result);
			System.out.println("remainder: "+num1);
		}else {
			System.out.println("Zero isn't allowed!");
		}
		
	}
}
