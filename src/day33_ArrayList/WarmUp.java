package day33_ArrayList;

import java.util.Arrays;

public class WarmUp {

	public static int[] sortArray(int[] arr) {
		Arrays.sort(arr);
		int arrayDescend[] = new int[arr.length];
		int j = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			/* arrayDescend[arr.length-i-1] = arr[i]; */
			arrayDescend[j] = arr[i];
			j++;
		}
		return arrayDescend;
	}

	public static double[] sortArray(double[] x) {
		Arrays.sort(x);
		double arr[] = new double[x.length];
		int j = 0;
		for (int i = x.length - 1; i >= 0; i--) {
			arr[j] = x[i];
			j++;
		}
		return arr;
	}

	public static String[] sortArray(String[] x) {
		Arrays.sort(x);
		String arr[] = new String[x.length];
		int j = 0;
		for (int i = x.length - 1; i >= 0; i--) {
			arr[j] = x[i];
			j++;
		}
		return arr;
	}

	public static char[] sortArray(char[] x) {
		Arrays.sort(x);
		char ch[] = new char[x.length];
		int j = 0;
		for (int i = x.length - 1; i >= 0; i--) {
			ch[j] = x[i];
			j++;
		}
		return ch;
	}

	public static Integer[] sortArray(Integer[] x) {
		Arrays.sort(x);
		Integer Int[] = new Integer[x.length];
		int j = 0;
		for (int i = x.length - 1; i >= 0; i--) {
			Int[j] = x[i];
			j++;
		}
		return Int;
	}
	
	/*gets string array and string and returns occurrence time of the string	*/
	public static int stringOccurrance(String[] str, String x) {
		int occurrance = 0;
		for (int i = 0; i < str.length; i++) {
			if (x.equals(str[i])) {
				occurrance++;
			}
		}
		return occurrance;
	}

	public static void main(String[] args) {
		int arr[] = { 23, 12, 1, 134, 56, 78, 53, 2, 42, 79, 0 };
		double array[] = { 2.3, 12.0, 1.0, 1.34, 5.6, 78.0, 53.0, 2.9, 4.2, 7.9, 0.0 };
		String str[] = { "b", "e", "d", "u", "k", "t", "y", "z", "p" };
		String names[] = { "Ada", "Masha", "Pasha", "Nurzat", "Ada", "Zamira", "White", "Viktoriya", "Ada" };
		char ch[] = { 'a', 'g', 'e', 'p', 'w', 'x', 'd', 'f' };
		Integer[] Int = { 12, 4, 5, 67, 89, 6, 90, 78, 578 };
		String str3 = "Nurses Run";
		String str4 = "wooden";

		System.out.println(Arrays.toString(sortArray(arr)));
		System.out.println(Arrays.toString(sortArray(array)));
		System.out.println(Arrays.toString(sortArray(str)));
		System.out.println(Arrays.toString(sortArray(ch)));
		System.out.println(Arrays.toString(sortArray(names)));
		System.out.println(Arrays.toString(sortArray(Int)));
		System.out.println(stringOccurrance(names, "Ada"));
		System.out.println(clean("string array and string", "string"));
		System.out.println(isPalindrome(str3));
		System.out.println(isPalindrome(str4));
		
	}

	public static String clean (String text ,String badWord) {
        if(text.contains(badWord)){
          text = text.replace(badWord, "");
        }
        return text.trim();
	}

	public static boolean isPalindrome(String str) {
		String cleared = str.replaceAll(" ", "");
		String reverse = "";
		for (int i = cleared.length()-1; i >= 0; i--) {
			reverse += ""+cleared.charAt(i);
		}
		if (reverse.equalsIgnoreCase(cleared)) {
			return true;
		}else {
			return false;
		}	
	}
	
	
	
	
}
