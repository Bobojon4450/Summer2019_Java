package day31_JavaReview;

import java.util.Arrays;

public class ArrayReviews {

	public static void main(String[] args) {

		int[] numbers = { 200, 300, 20, 7890, 40, -8, -100 };
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));

		String result = "";
		for (int i = numbers.length - 1; i >= 0; i--) {
			result += numbers[i] + ", ";
		}
		result = result.trim();
		result = result.substring(0, result.lastIndexOf(","));
		System.out.println(result);
		System.out.println("--------------------------------\n");

		double[] dArray = { 1000, 900, 800, 700, 600 };
		System.out.println(Arrays.toString(dArray)); //[1000.0, 900.0, 800.0, 700.0, 600.0]
		
		Arrays.sort( dArray );   
	    System.out.println(Arrays.toString(dArray));//[600.0, 700.0, 800.0, 900.0, 1000.0]
	    

	}
}
