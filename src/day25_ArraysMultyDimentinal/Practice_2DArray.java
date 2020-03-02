package day25_ArraysMultyDimentinal;

import java.util.Arrays;

public class Practice_2DArray {

	public static void main(String[] args) {
		/*
		 * n dimensional array contains (n-1) dimensional array.
		 */

		//          2d   multiple single dim arrays 
		int arr2D[][] = { { 1, 2 }, { 3, 4, 5, 6, 7 }, { 8, 9, 11} };
		System.out.println(Arrays.deepToString(arr2D));
		int length = arr2D.length; // 3
		
		for (int i = 0; i < arr2D.length; i++) {
			System.out.println(Arrays.toString(arr2D[i]));
		}
		System.out.println("-----------------------------\n");
		
		for (int i = 0; i < arr2D.length; i++) {
			for (int j = 0; j < arr2D[i].length; j++) {
				System.out.print(arr2D[i][j]);
			}
			System.out.print("\t");
		}
		System.out.println("\n-----------------------------\n");
		
		char [][] ch2D = {{'A','B','G'}, {'C', 'D','H','F'}};
		for (int i = 0; i < ch2D.length; i++) {
			for (int j = 0; j < ch2D[i].length; j++) {
				System.out.print(ch2D[i][j]);
			}
			System.out.print("\t");
		}
		
		

	}
}
