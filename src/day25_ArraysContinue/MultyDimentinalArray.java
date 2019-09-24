package day25_ArraysContinue;

import java.util.Arrays;

public class MultyDimentinalArray {
	/*
	 * n dimensional array contains (n-1) dimensional array.
	 */

	public static void main(String[] args) {

		int[] arr1D = { 1, 2, 3 };

		// 2D array
		int[][] arr2D = { { 4, 56, 6 }, { 7, 89, 9 } };

		String[][] str = { { "Abba", "Kabba", "Rabba" }, { "Sabba", "Nappa" } };
		// [represents index of one D array][represents index of values]
		System.out.println(str[0][1]);
		String str2 = Arrays.toString(str[0]);
		System.out.println(str2);
		System.out.println("--------------------------");

		// Arrays.deepToString(): converts multidimensional array to string
		// [ "Abba", "Kabba", "Rabba" ], [ "Sabba", "Nappa" ]
		// Arrays.toString() converts single dimensional array only.
		System.out.println(Arrays.toString(str));
		System.out.println(Arrays.deepToString(str));
		System.out.println("--------------------------\n");

		int[][] nums = { { 1, 2 }, { 3, 4 }, { 5, 6, 7, 8, 9, 10 } };
		System.out.println(nums[2][5]);// 10

		System.out.println(Arrays.toString(nums[2]));
		System.out.println(Arrays.deepToString(nums));
		System.out.println("--------------------------\n");

		int[][] array2D = { { 1, 2 }, { 3, 4, 5, 6 } };
		int[][][] nums3D = { { {1, 2},{3, 4} }, { {5, 6}, {7, 8} } };

//							   0  1      0  1  2  3
		int[][] array2D2 = { { 1, 2 }, { 3, 4, 5, 6 } };
//								0			1
		for (int i = 0; i < array2D2.length; i++) {
			for (int j = 0; j < array2D2[i].length; j++) {
				System.out.print(array2D2[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("--------------------------\n");
		System.out.println(nums3D[1]);
		System.out.println(Arrays.toString(nums3D[1]));
		System.out.println(Arrays.deepToString(nums3D[1]));
		System.out.println("--------------------------\n");
		
//		int[][][]  Array3D =  {    { {1,2}, {3,4} }  ,   { {5, 6}, {7, 8} }    };
//		 	System.out.println( Array3D[1] );
//	        System.out.println( Arrays.toString( Array3D[1] ) );
//	        System.out.println( Arrays.deepToString( Array3D[1] ));

		int[][][][] numbers4D = { { { { 1, 2 }, { 3, 4 } } } };

	}
}
