package day29_MethodOverloading_ReturnMethods;

import java.util.Arrays;

public class ReturnMethods {

	public static void main(String[] args) {
		// return --> exits method immediately. it also return a value from the method.
		// brake --> exits loop immediately.
		int i = sum(10, 20);
		System.out.println(i);
		int[] x = { 12, 34, 567, 897, 543, 234 };
		String[] arr = { "Amin", "Azim", "Ahmad", "Muyasar" };
		int[] z = { 1, 4, 2, 6, 3, -1, 7, 5, 9, 24, 789, 101 };

		System.out.println(maxNum(2, 1, -9));
		System.out.println(max2(1, 1, 9));
		System.out.println(maxArrayNum(x));
		System.out.println(longestString(arr));
		System.out.println(Arrays.toString(decsendingOrder(z)));

	}

	public static int maxNum(int i, int j, int k) {
		int[] arr = { i, j, k };
		Arrays.sort(arr);
		return arr[arr.length - 1];
	}

	public static int sum(int i, int j) {
		return i + j;
	}

	public static int max2(int a, int b, int c) {
		int max = 0;
		if (a > b && a > c) {
			max = a;
		} else if (b > a && b > c) {
			max = b;
		} else if (a == b && a > c) {
			max = a;
		} else {
			max = c;
		}
		return max;
	}

	public static int maxArrayNum(int[] x) {
		Arrays.sort(x);
		return x[x.length - 1];
	}

	public static int longestString(String str[]) {
		String arr[] = str;
		String longest = "";
		int longestStr = 0;
		for (String x : arr) {
			if (x.length() > longest.length()) {
				longest = x;
				longestStr = longest.length();
			}
		}
		return longestStr;
	}

	public static int[] decsendingOrder(int[] x) {
		Arrays.sort(x);
		int z[] = new int[x.length];
		for (int i = x.length - 1; i >= 0; i--) {
			z[x.length - (i + 1)] = x[i];
		}
		return z;
	}
	
	
	
	
}

/**/