package day25_ArraysContinue;

import java.util.Arrays;

public class Practice_2DArray {

	public static void main(String[] args) {
		/*
		 * n dimensional array contains (n-1) dimensional array.
		 */

		//          2d   multiple single dim arrays 
		int arr2D [][] = {{1,2},{3,4,5,6,7}, {8,9}};
		int length = arr2D.length;	//3
		
		for (int i = 0; i < arr2D.length; i++) {
			System.out.print(Arrays.toString(arr2D[i]));
		}
		System.out.println();
		
		for (int i = 0; i < arr2D.length; i++) {
			for (int j = 0; j < arr2D[i].length; j++) {
				System.out.print(arr2D[i][j]);
			}
			System.out.print("\t");
		}
		System.out.println("----------------------------");
		
		char [][] ch2D = {{'A','B','G'}, {'C', 'D','H','F'}};
		for (int i = 0; i < ch2D.length; i++) {
			for (int j = 0; j < ch2D[i].length; j++) {
				System.out.print(ch2D[i][j]);
			}
			System.out.print("\t");
		}
		
		

	}
}
