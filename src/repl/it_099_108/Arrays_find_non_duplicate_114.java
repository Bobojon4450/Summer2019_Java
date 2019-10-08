package repl.it_099_108;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_find_non_duplicate_114 {
	
	/* Given an array nums with 7 integers every element is repeated twice - except one. 
	 * Find that element and print it to console.
	   Example:
	   nums -> [1, 1, 2, 3, 4, 3, 4]
         2			*/
	 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
		input.nextInt(), input.nextInt() };
		findNonDuplicatedNumber(nums);
	}

	public static void findNonDuplicatedNumber(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			int unique = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					unique++;
				}
			}
			if (unique == 1) {
				System.out.println(nums[i]);
			}
		}
	}

}