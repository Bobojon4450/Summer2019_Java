package day31_JavaReview;

import java.util.Arrays;

public class ArraysReview_MultiDimensional {

	public static void main(String[] args) {
		/*
		 * n dimensional array: contains (n - 1) dimensional arrays
		 */

		int[][] arr2D = { { 1, 2, 3 }, { 4, 5, 6 } };
		System.out.println(arr2D.length);
		System.out.println(Arrays.toString(arr2D[arr2D.length - arr2D.length]));
		System.out.println(Arrays.toString(arr2D[arr2D.length - 1]));
		System.out.println(Arrays.deepToString(arr2D));
		System.out.println("---------------------------\n");

		char ch[] = { 'A', 'B', 'C', 'D', 'E', 'F' };
		for (char x : ch) {
			if (x == 'E')
				continue;
			System.out.print(x + " ");
		}

		System.out.println("---------------------------\n");

		String[][] names = { { "Holy", "Moly", "Guacamole", "Tarzan" }, { "Irfan", "Kuzzat", "Bilginur" } };
		for (String[] str : names) {
			for(String name : str) {
				if(name.equals("Tarzan"))
					continue;
				System.out.print(name+" ");
			}System.out.println();
		}
		
		
		String str = FrequencyOfChars("AAABBCDDDEFFG");
		System.out.println("\n"+str);
			
}
	
	public static String FrequencyOfChars(String str) {

		/* Removing duplicates and assigning non-duplicates to string.	*/
		 
		String nonDup = "";
		for (int i = 0; i < str.length(); i++) {
			if (!nonDup.contains("" + str.charAt(i))) {
				nonDup += "" + str.charAt(i);
			}
		}
		
		/* Identifying the total number of times each character occurred.	*/
		String expectedResult = "";
		for (int j = 0; j < nonDup.length(); j++) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == nonDup.charAt(j))
					count++;
			}
			expectedResult += nonDup.charAt(j) + "" + count;
		}
		return expectedResult;
	}


}
