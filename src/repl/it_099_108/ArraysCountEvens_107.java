package repl.it_099_108;

import java.util.Scanner;

public class ArraysCountEvens_107 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() };
		int count = 0;
		for (int i : nums) {
			if (i % 2 == 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
