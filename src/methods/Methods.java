package methods;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Methods {

	public static void main(String[] args) {
		String arr[] = { "A", "A", "C", "J", "C", "A" };

		unique(arr);
		System.out.println(frequencyOfCharsOccur("AABBCDEEE"));
		System.out.println(frequencyOfChars("ABCD"));
		System.out.println("============================");
		System.out.println(frequencyOfCharecters("AABBCDEEEGHIi"));
		System.out.println(FrequencyOfChars("AABBCDEEEGHIi"));
		System.out.println(cleanUp("AABBCDEEEGHIi"));
		System.out.println("removeDuplicates(): " + removeDuplicates("AABBCDEEEGHIi"));
		System.out.println(freqChars("AAANJYUTTT"));
	}

	/*
	 * 1. Write a program that can print out the unique values from an String Array
	 */
	public static void unique(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int count = 0;// we have it here because it should be reset to zero again after loop
							// condition.
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(arr[i]);
			}
		}
	}

	/* accepts a String and removes duplicate values from the String */
	public static String revDupl(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (!result.contains(str.substring(i, i + 1))) {
				result += str.substring(i, i + 1);
			}
		}
		return result;
	}

	/*
	 * method that accepts String and returns the unique values from the String Ex:
	 * Unique("AABBCDEEE") ==> "CD"
	 */
	public static String uniqueValues(String str) {
		String result = "";
		for (int j = 0; j < str.length(); j++) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(j) == str.charAt(i)) {
					count++;
				}
			}
			if (count == 1) {
				result += str.charAt(j);
			}
		}
		return result;
	}

	/* Version 1: Identifies the total number of times each character occurred. */
	public static String frequencyOfCharsOccur(String str) {
		/* Removing duplicates and assigning non-duplicates to string. */
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			if (!temp.contains("" + str.charAt(i))) {
				temp += "" + str.charAt(i);
			}
		}

		String expected = "";
		/* this loop iterates for each character of temp */
		for (int i = 0; i < temp.length(); i++) {
			int count = 0;
			/* this loop iterates for each character of passed parameter */
			for (int j = 0; j < str.length(); j++) {
				if (temp.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			expected += temp.charAt(i) + "" + count;
		}
		return expected;
	}

	/* Version 2: Identifies the total number of times each character occurred. */
	public static String frequencyOfChars(String str) {
		String expectedResult = "";
		int j = 0;
		while (j < str.length()) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(j) == str.charAt(i)) {
					count++;
				}
			}
			expectedResult += str.charAt(j) + "" + count;
			str = str.replace("" + str.charAt(j), "");
		}
		return expectedResult;
	}

	/* Version 3: Identifies the total number of times each character occurred. */
	public static String frequencyOfCharecters(String str) {
		String b = new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();
		b = b.replace(",", "").replace("[", "").replace("]", "");

		String result = "";
		for (int i = 0; i < b.length(); i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.substring(j, j + 1).equals("" + b.charAt(i))) {
					count++;
				}
			}
			result += b.substring(i, i + 1) + count;
		}
		return result;
	}

	/* Version 3: Original */
	public static String FrequencyOfChars(String str) {
		String b = new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();
		b = b.replace(", ", "").replace("[", "").replace("]", "");

		String result = "";
		for (int j = 0; j < b.length(); j++) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.substring(i, i + 1).equals("" + str.charAt(j)))
					count++;
			}
			result += b.substring(j, j + 1) + count;
		}
		return result;
	}

	public static String cleanUp(String str) { // AABBCDEEEGHIi -->ABCDEGHIi
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			if (!temp.contains("" + str.charAt(i))) {
				temp += "" + str.charAt(i);
			}
		}

		String result = "";
		for (int i = 0; i < temp.length(); i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (temp.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			result += "" + temp.charAt(i) + count + " ";
		}
		return result;
	}

	public static String removeDuplicates(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (!result.contains("" + str.charAt(i))) {
				result += "" + str.charAt(i);
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

	/* Returns frequency of chars occurred in the string */
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

	/* the palindrome method */
	public static boolean isPalindrome(String str) {
		String cleared = str.replaceAll(" ", "");
		String reverse = "";
		for (int i = cleared.length() - 1; i >= 0; i--) {
			reverse += "" + cleared.charAt(i);
		}
		if (reverse.equalsIgnoreCase(cleared)) {
			return true;
		} else {
			return false;
		}
	}

}
