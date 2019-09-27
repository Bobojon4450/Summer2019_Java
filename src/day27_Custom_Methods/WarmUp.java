package day27_Custom_Methods;

import java.util.Arrays;

public class WarmUp {

    /*
    Warmup:
       1. create an int array called numbers that has length of 100
       2. assign 1~100 to the array' each indexes
       3. use for each loop to print out all the even numbers.
          Must use continue statement;
    */
	public static void main(String[] args) {

		int[] numbers;
		numbers = new int[100];
		for (int i = 1; i <= numbers.length; i++) {
			numbers[i-1] = i;
		}
		System.out.println(Arrays.toString(numbers));
		
		//same result.
		/*
		 * for (int i = 0; i < numbers.length; i++) { numbers[i] = i+1; }
		 * System.out.println(Arrays.toString(numbers));
		 */
		
		
		//prints odd numbers only.
		for (int i : numbers) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.print(i+" ");
		}
		
		
		
		
		
		
	}
}
