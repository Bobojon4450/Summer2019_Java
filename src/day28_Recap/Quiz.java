package day28_Recap;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {

		char[] ch = { 'a', 'b', 'c' };
		int z = ch.length;
		int count = 0;

		while (count < z - 1) {
			count++;
		}
		System.out.println(count);
		System.out.println("-----------------------");

		String[] arr = { "Mamr", "Nur" };
		arr[0] = arr[1];
		arr[1] = arr[0];
		System.out.println(Arrays.toString(arr));
		System.out.println("-----------------------");
		
		
		int[] nums = { 5, 4, 3, 2, 1 };
		for (int i : nums) {
			if (i == 3) {
				continue;
			}
			System.out.print(i);
			break;
		}
		System.out.println();
		System.out.println("-----------------------");
		

		char[] charac = { 'a', 'b', 'c' };
		for (char c : charac) {
			System.out.print(c + " ");// because it prints first and then checks the condition.
			if (c == 'b') {
				continue;
			}
		}
		System.out.println("-----------------------");
//		Please cover when we nested to use nested loops instead of single loop 
		
		
		
		
		

	}
}
