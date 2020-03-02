package zzz.interview_coding;

import java.util.HashSet;
import java.util.Set;

public class Coding_1 {

	// Write a return method that can find the frequency of characters
	// Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
	public static String frequencyOccur(String str) {
		String occurred = "";
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			if (!occurred.contains(str.charAt(i) + "")) {
				for (int j = 0; j < str.length(); j++) {
					if (str.substring(j, (j + 1)).equals(str.charAt(i) + "")) {
						count++;
					}
				}
			} else {
				continue;
			}
			occurred += str.substring(i, (i + 1)) + (count);
		}
		return occurred;
	}

	// Write a return method that can find the frequency of characters
	// Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
	public static String charFrequency(String str) {
		String expectedResult = "";
		int count = 0;
		while (count < str.length()) {
			int i = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(count)) {
					i++;
				}
			}
			expectedResult += str.charAt(count) + "" + i;
			str = str.replace("" + str.charAt(count), "");
		}
		return expectedResult;
	}

	//Remove duplicates
	public static String removeDuplicates(String str) {
		Set<Character> set = new HashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		String result = "";
		for (Character character : set) {
			result += character;
		}
		return result;
	}
		
	public static void main(String[] args) {
		System.out.println(frequencyOccur("AAABBCDD"));
		System.out.println(charFrequency("AAABBCDD"));
		System.out.println(removeDuplicates("AAABBCDD"));
	}

}
