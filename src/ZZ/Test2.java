package ZZ;

import java.util.ArrayList;
import java.util.Arrays;

public class Test2 {
	
	public static void main(String[] args) {
		
		int[] x = { 1, 34, 5, 7889, 0, 98 };
		System.out.println(Arrays.toString(sort(x)));
		int c = Integer.MIN_VALUE;
		System.out.println(c);
		
	}
	
	
	/* Write a return method that can sort an int array in descending order without 
	 * using the sort method of the Arrays class	*/
	
	public static int[] sort(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int each : arr) {
			list.add(each);
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = findMax(list);
			list.remove(Integer.valueOf(arr[i]));
		}
		return arr;
	}

	/* accepts arrayList*/
	public static int findMax(ArrayList<Integer> list) {
		int max = Integer.MIN_VALUE;
		for (int each : list) {
			max = Math.max(max, each);
		}
		return max;
	}

}
