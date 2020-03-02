package zzz.interview_coding;

import java.util.Arrays;

public class Coding_2_String_Same_letters {

	/* Write a return method that check if a string is build out of the same letters
	 * as another string. Ex: same("abc", "cab"); -> true 
	 * 						  same("abc", "abb"); -> false
	 */
	public static boolean same(String str, String str2) {
		if (str.length() == str2.length()) {
			for (int i = 0; i < str.length(); i++) {
				if (str.contains(str2.charAt(i) + "")) {
					continue;
				} else {
					return false;
				}
			}
		}
		return true;
	}
	
	// Second Approach
	public static boolean same2(String str, String str2) {
		char ch [] = str.toCharArray();
		char ch2 [] = str2.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch2);
		String s = "", s2 = "";
		for (char c : ch2) {
			s+=c;
		}
		for (char c : ch) {
			s2+=c;
		}
		return (s.equals(s2));
	}
	
	
	public static void main(String[] args) {
		System.out.println(same("cab","abc"));
		System.out.println(same("abb","abc"));
		System.out.println(same2("cab","abc"));
		System.out.println(same2("abb","abc"));
	}
}
