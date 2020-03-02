package day25_ArraysMultyDimentinal;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		String arr[] = { "A", "C", "B" };

		String str = Arrays.toString(arr);
		System.out.println(str);

		System.out.println("-----------------");

		String[] names = { "Elvira", "Hakan", "Erkin", "Tural", "Davlat" };
		String prettyNames = Arrays.toString(names);
		System.out.println(prettyNames);

		/*
		 * Arrays.sort() method sorts the arrays in ascending number.
		 */
		int a[] = { 1, 33, 5, 68, 0, 64, 22, -1 };
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		System.out.println("Maximum number: " + a[a.length - 1]);
		System.out.println("Minimum number: " + a[(a.length - 1) - (a.length - 1)]);
		System.out.println("-------------------------");

		String[] listName = { "Elvira", "Hakan", "Erkin", "Tural", "Davlat", "Adamsho", "adam" };
		Arrays.sort(listName);// alphabetical order by ASCII table. lower-case matters
		System.out.println(Arrays.toString(listName));
		System.out.println("-------------------------\n");

		char ch[] = { '0', '6', '5', '7', '9', '1' };
		Arrays.sort(ch);
		System.out.println(Arrays.toString(ch));
		System.out.println("-------------------------\n");

		int[] nums = { 220, 2029, 87, 9, 67, 34, 1, 3, 90, -12 };
		Arrays.sort(nums); // sorts in ascending order
		System.out.println(Arrays.toString(nums));
		System.out.println("Minimum number: " + nums[(nums.length) - (nums.length)]);
		System.out.println("Second minimum: " + nums[(nums.length) - (nums.length - 1)]);
		System.out.println("Maximum number: " + nums[nums.length - 1]);
		System.out.println("Second max: " + nums[nums.length - 2]);
		System.out.println("-------------------------\n");

		String result = "[";
		int[] arr2 = { 1, 23, 45, 67, 89, 98, 75, -9, -67, 0 };
		Arrays.sort(arr2);
		for (int i = arr2.length - 1; i >= 0; i--) {
			result += arr2[i] + ", ";
		}
		result = result.substring(0, result.length() - 2) + "]";
		System.out.println(result);
		System.out.println("-------------------------\n");

		// Second approach
		int[] arr3 = { 99, 56, 789, 443, 234, 800, 7878 };
		Arrays.sort(arr3); // sorts in ascending order
		System.out.println(Arrays.toString(arr3));

		int arr4[] = new int[arr3.length];
//		int z = 0;
//		for (int i = arr3.length-1; i >= 0; i--) {
//			arr4[z] = arr3[i];
//			z++;
//		}
//		System.out.println(Arrays.toString(arr4));
		
		for (int i = arr3.length-1; i >= 0; i--) {
			arr4[arr3.length-1 - i] = arr3[i];
		}
		System.out.println(Arrays.toString(arr4));
		
		
	}
}
