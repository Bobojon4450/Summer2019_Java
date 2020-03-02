package day25_ArraysMultyDimentinal;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MultyDimentinalArray {
	
	/*
	 * n dimensional array contains (n-1) dimensional array.
	 */

	public static void main(String[] args) {

		int[] arr1D = { 100, 2, 3, 1, 0, 34, 9, 151, 976 };
		System.out.println(Arrays.toString(arr1D));
		Arrays.sort(arr1D);
		System.out.println(Arrays.toString(arr1D));

		// 2D array. There are 3 1D arrays declared
		int[][] arr2D = { {4, 56, 6, 11}, {7, 89, 9}, {23, 33, 43, 53, 63} };
		for (int i = 0; i < arr2D.length; i++) {
			for (int j = 0; j < arr2D[i].length; j++) {
				System.out.print(arr2D[i][j]);
			}System.out.print("\t");
		}System.out.println("-------------------------------------");
		
		
		String[][] str = { { "Abba", "Kappa", "Rabba" }, { "Sabba", "Nappa" } };
		// [represents index of one D array][represents index of values]
		System.out.println(str[0][1]);
		String str2 = Arrays.toString(str[0]);
		System.out.println(str2);
		System.out.println("-------------------------------------");
		
		
		// Arrays.deepToString(): converts multidimensional array to string
		// [ "Abba", "Kabba", "Rabba" ], [ "Sabba", "Nappa" ]
		// Arrays.toString() converts single dimensional array only.
		
		System.out.println(Arrays.toString(str));
		System.out.println("Arrays.deepToString(str): "+Arrays.deepToString(str));
		System.out.println("--------------------------\n");

		int[][] nums = { { 1, 2 }, { 3, 4 }, { 5, 6, 7, 8, 9, 10 } };
		System.out.println(nums[2][5]);// 10

		System.out.println(Arrays.toString(nums[2]));
		System.out.println(Arrays.deepToString(nums));
		System.out.println("--------------------------\n");
//								0			1	
		int[][] array2D = { { 1, 2 }, { 3, 4, 5, 6 } };
		
		int[][][] nums3D = { { {1, 2},{3, 4} }, { {5, 6}, {7, 8} } };
		System.out.println("nums3D[1][1][1]: "+nums3D[1][1][1]);//8

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

		// n dimension array has n-1 dimension array
		int[][][][] numbers4D = {  {  {  {1, 2}, {3, 4}  }  }  };
		System.out.println("numbers4D[0][0][1][0]: "+numbers4D[0][0][1][0]+"\n"); //
		
		System.out.println(Arrays.deepToString(numbers4D));
		
		String [][] arr = new String[5][45];
		System.out.println(arr.length);
		
	}
	public static void add() {System.out.println("static of parent");}
}

class Test extends MultyDimentinalArray{
	
	public static void add() {System.out.println("static of child");}
	
	public static void main(String[] args) {
		Test test = new Test();
		test.add();
	}
}

interface Q extends W, E, R, T, Y {}

interface W{}
interface E{}
interface R{}
interface T{}
interface Y{}

// no multiple extensions
abstract class A extends B{
	void print() {System.out.println("print");}
} 
abstract class B{
	abstract void print();
}
abstract class C{}
abstract class D{}


