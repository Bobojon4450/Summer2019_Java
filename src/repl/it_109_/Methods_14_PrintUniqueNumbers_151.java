package repl.it_109_;

import java.util.Arrays;
import java.util.Scanner;

public class Methods_14_PrintUniqueNumbers_151 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(nums));
		printUniqueNumbers(nums);
	}

	public static void printUniqueNumbers(int[] arr) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int unik = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					break;
				} else {
					unik = arr[i];
					System.out.println(unik);
					break;
				}
			}
		}

	
	
	}
}
