package zzz.interview_coding;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Coding_1_String_Remove_Duplicates {
	
	/*
	 * Write a return method that can remove the duplicated values from String Ex:
	 * 	removeDup("AAABBBCCC") ==> ABC
	 */
	public static String removeDuplicates(String str) {
		String unique = "";
		for (int i = 0; i < str.length(); i++) {
			if (!unique.contains(str.charAt(i)+"")) {
				unique += str.charAt(i);
			}
		}
		return unique;
	}
	
	//Remove duplicates. Order is not preserved
		public static String removeDuplicates2(String str) {
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
		System.out.println(removeDuplicates("AANNAWWWKKL")); //ANWKL
		System.out.println(removeDuplicates2("AANNAWWWKKL"));//AWKLN
	}
}
