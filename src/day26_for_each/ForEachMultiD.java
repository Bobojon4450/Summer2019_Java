package day26_for_each;

import java.util.Arrays;

public class ForEachMultiD {

	public static void main(String[] args) {
// n dimensional array contains (n - 1) dimensional array

		int arr[] = { 1, 2, 3, 4 };
		int arr2D[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };

		for (int i = 0; i < arr2D.length; i++) {
			for (int j = 0; j < arr2D[i].length; j++) {
				System.out.print(arr2D[i][j] + " ");
			}
		}
		System.err.println("\n--------------------");

		// using for_each loop
		for (int[] i : arr2D) {
			for (int j : i) {
				System.out.print(j + " ");
			}
		}
		System.out.println("\n--------------------");
		
		
		String[][] str2D = { { "Bibish", "Sayfo" }, { "Syfooo", "Julia" } };
		for(String[] str : str2D) {
			System.out.println(Arrays.toString(str));
			for(String st : str) {
				System.out.print(st+" ");
			}
			System.out.println("\n");
		}
		
		System.out.println("\n--------------------");
		
		int[][] num2D = {{1,2},{3,4}};
		
		int[][][] num3D = { {{1,2},{3,4} }, { {5,6},{7,8,9}} };
		
		for(int[][] twoD : num3D) {
			for(int [] oneD : twoD) {
				for(int value : oneD) {
					System.out.print(value+" ");
				}System.out.print("\n");
			}
		}
		

	}
}
