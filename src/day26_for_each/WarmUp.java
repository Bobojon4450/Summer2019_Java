package day26_for_each;

import java.util.Arrays;

public class WarmUp {
	/*
	 * 1. write a program that can check if two Strings are build out of same letters
    	Ex: 
	        if str1 = "aabbbc";  str2 ="cab";
	        output: true
	        
	        if str1 ="abcd";  str2 ="abc";
	        output: false
	 */
	public static void main(String[] args) {
		
		String a ="aabbbc", b = "caaaabbbbccccb";
		String str1 = "";//store all non duplicated values of str.
		
		for (int j = 0; j < a.length(); j++) {
			for (int i = 0; i < a.length(); i++) {
				if (!str1.contains(a.substring(j, j+1))) {
					str1 += a.substring(j,j+1);
				}
			}
		}
		System.out.println(str1);//abc
		
		
		//same as above with one for loop.
		String str2 ="";
		for (int i = 0; i < b.length(); i++) {
			if (!str2.contains(b.substring(i, i+1))) {
				str2 += b.substring(i, i+1);
			}
		}
		System.out.println(str2);
		System.out.println("----------------------");
		
		char [] ch = str1.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		char [] ch2 = str2.toCharArray();
		System.out.println(Arrays.toString(ch2));
		
		Arrays.sort(ch);
		Arrays.sort(ch2);
		System.out.println("----------------------");
		
		System.out.println(Arrays.toString(ch));
		System.out.println(Arrays.toString(ch2));
		
		String sorted1 = Arrays.toString(ch);
		String sorted2 = Arrays.toString(ch2);
		System.out.println("----------------------");
		
		if (sorted1.equals(sorted2)) {
			System.out.println("True, they are build out of same letetrs");
		} else {
			System.out.println("False, different letters");
		}
		
//same as above with one for loop and charAt().
		String str3 ="";
		for (int i = 0; i < a.length(); i++) {
			if (!str3.contains(""+a.charAt(i))) {
				str3 += a.charAt(i);
			}
		}
		System.out.println(str3);
		System.out.println("----------------------");

/*****************************************************************************/
		next3(3);
		
		
	}
	public static void next3(int x) {
		if (x > 2) {
			for (int i = 1; i <= x; i++) {
				System.out.print((x+i)+" ");
			}
		}else {
			System.out.print((x+1)+" "+(x+2)+" "+(x+3));
		}
	}
}
