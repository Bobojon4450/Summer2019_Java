package day24_JavaRecap;

public class WarmUp {

	public static void main(String[] args) {
		
		/*
		   	1. write a program that can return the maximum value from an int array
    		2. write a program that can return the second maximum value from an int array
    		3. write a program that return the minimum value from an int array
    		4. write a program that return the second minimum valye from an int array 
		 */
		int[] arr = { 10, 20, 200, 30, 34, 78, 809 };
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);

		int secondMax = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr [i] > secondMax && arr[i] != max) {
				secondMax = arr[i];
			}
		}
		System.out.println(secondMax);
		
		
		
	}
}
