package day25_ArraysMultyDimentinal;

public class WarmUp2 {

	public static void main(String[] args) {
	
		/*
		 * 1. Write a program that can print out the unique values from an String Array
		 */
		String arr[] = { "A", "A", "C", "J", "C", "A" };
		
		for (int i = 0; i < arr.length; i++) {
			int count = 0;//we have it here because it should be reset to zero again after loop condition.
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(arr[i]);
			}
		}
		
		
	
	}
}
