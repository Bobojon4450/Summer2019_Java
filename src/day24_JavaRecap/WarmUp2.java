package day24_JavaRecap;

public class WarmUp2 {

	public static void main(String[] args) {
		/*
		 	1. write a program that return the minimum value from an int array
    		2. write a program that return the second minimum valye from an int array 
		 */

		int arr[] = { 12, 3, 45, 6, 24, 2, 8, 9, -1, -2 }; 
		int min = 999999999;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("first minimum: "+min);
		
		int secondMin = 999999999;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < secondMin && arr[i] > min) {
				secondMin = arr[i];
			}
		}
		System.out.println("second minimum: "+secondMin);
		
		
		
	}
}
