package repl.it_109_180;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Methods_14_PrintUniqueNumbers_151 {
	
	/* Write a void method printUniqueNumbers that will print unique numbers from 
	 * an array of ints.
	 * Example: input:[2, 5, 5, 6, 3, 6, 9, 34, 3]
				output:		2 9	34	 				*/
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = scan.nextInt();
		}
		printUniqueNumbers(nums);
	}

	public static void printUniqueNumbers(int[] arr) {
		Arrays.sort(arr);
		ArrayList<Integer>uniques = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0 ; j < arr.length; j++) {
				if (arr[i] == arr[j]) { 				//[1, 1, 2]
					count++;
				}
			}
			if (count == 1) {
				uniques.add(arr[i]);
			}
		}
		System.out.println(uniques);
	}
		
}

 