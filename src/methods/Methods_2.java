package methods;

import java.util.Arrays;

public class Methods_2 {

	public static void main(String[] args) {
		
	}

	/**/
	public static String clean (String text ,String badWord) {
        if(text.contains(badWord)){
          text = text.replace(badWord, "");
        }
        return text.trim();
	}

	/*Palindrome*/
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
	
	/*	Given an array nums with 7 integers every element is repeated twice - except one.
	 	Find that element and print it to console.	*/
	public static void findNonDuplicatedNumber(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			int unique = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					unique++;
				}
			}
			if (unique == 1) {
				System.out.println(nums[i]);
			}
		}
	}
}
