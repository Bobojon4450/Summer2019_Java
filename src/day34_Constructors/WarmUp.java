package day34_Constructors;

import java.util.ArrayList;

public class WarmUp {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			list.add(i * i * i);
		}
		
		System.out.println(removeDuplicates("AAANJYUTTT"));
		System.out.println(count("abshstssaass", "h"));
		System.out.println(frequencyOfChars("AAANJYUTTT"));
		System.out.println(freqChars("AAANJYUTTT"));
		System.out.println(maximum(list));
		System.out.println(minimum(list));
	}

	/* remove duplicates from a given string */
	public static String removeDuplicates(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (!result.contains(str.substring(i, i + 1))) {
				result += str.substring(i, i + 1);
			}
		}
		return result;
	}

	/* returns occurrence of char in the string */
	public static int count(String str, String x) {
		int count = 0;
		while (str.contains(x)) {
			count++;
			str = str.replaceFirst(x, "");
		}
		return count;
	}

	/* returns frequency of chars occurred in the string */
	public static String frequencyOfChars(String str) {
		String result = "";
		for (int i = 0; i < str.length();) { // AAANJYUTTT
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			result += str.substring(i, i + 1) + count;
			str = str.replaceAll("" + str.charAt(i), "");
		}
		return result;
	}

	/* Version-2: returns frequency of chars occurred in the string */
	public static String freqChars(String str) {
		/* returns non-duplicated string */
		String nonDuplicate = removeDuplicates(str);
		String result = "";
		/* loops through the each char of the non-duplicated string */
		for (int i = 0; i < nonDuplicate.length(); i++) {
			/* returns the count of the char passed in the given array */
			int count = count(str, "" + nonDuplicate.charAt(i));
			/* the char and its total appearance concatenated */
			result += "" + nonDuplicate.charAt(i) + count;
		}
		return result;
	}

	
	public static int maximum(ArrayList<Integer> list) {
		int max = Integer.MIN_VALUE;
		for (int each : list) {
			if (each > max) {
				max = each;
			}
		}
		return max;
	}
	
	
	public static int minimum(ArrayList<Integer> list) {
		int min = Integer.MAX_VALUE;
		for (int each : list) {
			if (each < min) {
				min = each;
			}
		}
		return min;
	}
}
