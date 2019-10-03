package repl.it_099;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_ReverseArray_118 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
				input.nextInt(), input.nextInt() };
		
//		for (int i = 0; i < nums.length/2; i++) {
//			for (int j = nums.length-1; j >= 0; j--) {
//				int temp = nums[i];
//				nums[i] = nums[j];
//				nums[j] = temp;
//			}
//		}
		for (int i = 0; i < nums.length/2; i++) {
			int temp = nums[i];
			nums[i] = nums[(nums.length-1)-i];
			nums[(nums.length-1)-i] = temp;
		}
		System.out.println(Arrays.toString(nums));
	}

}
