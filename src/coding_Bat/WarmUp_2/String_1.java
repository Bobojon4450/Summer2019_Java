package coding_Bat.WarmUp_2;

public class String_1 {

	public static void main(String[] args) {
		
	}
	
	/*Given two strings, a and b, return the result of putting them together 
	  in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
		makeAbba("Hi", "Bye") → "HiByeByeHi"
		makeAbba("Yo", "Alice") → "YoAliceAliceYo"
		makeAbba("What", "Up") → "WhatUpUpWhat"	 */
	public static String makeAbba(String a , String b) {
		String temp = a+b;
		temp += b+a;
		return temp;
	}
	
	public static String makeTags(String tag, String word) {
		return "<" + tag + ">" + word + "</" + tag + ">";
	}
	
	
	/*Given an "out" string length 4, such as "<<>>", and a word, return a 
	  new string where the word is in the middle of the out string, e.g. "<<word>>". 
	  Note: use str.substring(i, j) to extract the String starting at index i 
	  and going up to but not including index j. */
	public static String makeOutWord(String out, String word) {
		String firstTwo = out.substring(0, 2);
		String secongTwo = out.substring(2);
		return firstTwo + word + secongTwo;
	}
	
	
	/* Given a string, return a new string made of 3 copies of the last 2 
	   chars of the original string. The string length will be at least 2.	 */
	public static String extraEnd(String str) {
		if (str.length() >= 2) {
			String temp = str.substring(str.length() - 2);
			return temp + temp + temp;
		}else {
			return str;
		}
	}

	
	/* Given a string, return the string made of its first two chars, 
	 * so the String "Hello" yields "He". If the string is shorter than length 2, 
	 * return whatever there is, so "X" yields "X", and the empty string "" yields 
	 * the empty string "". Note that str.length() returns the length of a string. */
	public static String firstTwo(String str) {
		if (str.length() >= 2) {
			String temp = str.substring(0, 2);
			return temp;
		} else {
			return str;
		}
	}
	
	/*Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".*/
	public String firstHalf(String str) {
		if (str.length() % 2 == 0) {
			return (str.substring(0, (str.length() / 2)));
		} else {
			return str;
		}
	}

	/*Given a string, return a version without the first and last char, so 
	  "Hello" yields "ell". The string length will be at least 2.	 */
	public String withoutEnd(String str) {
		if (str.length() >= 2) {
			return str.substring(1, str.length() - 1);
		} else {
			return str;
		}
	}
	
	
	/*Given 2 strings, a and b, return a string of the form short+long+short, 
	  with the shorter string on the outside and the longer string on the inside. 
	  The strings will not be the same length, but they may be empty (length 0). */
	public String comboString(String a, String b) {
		if (a.length() > 0) {
			if (b.length() > 0) {
				if (a.length() > b.length()) {
					return b + a + b;
				} else {
					return a + b + a;
				}
			} else {
				return a;
			}
		} else if (b.length() > 0) {
			return b;
		} else {
			return "";
		}
	}

	/*Given 2 strings, return their concatenation, except omit the first char of each. 
	  The strings will be at least length 1.	 */
	public String nonStart(String a, String b) {
		if (a.length() > 0) {
			if (b.length() > 0) {
				return a.substring(1) + b.substring(1);
			} else {
				return a.substring(1);
			}
		} else if (b.length() > 0) {
			return b.substring(1);
		} else {
			return "";
		}
	}

	
	/*Given a string, return a "rotated left 2" version where the first 2 chars are 
	  moved to the end. The string length will be at least 2.	 */
	public String left2(String str) {
		if (str.length() > 2) {
			return str.substring(2) + str.substring(0, 2);
		} else if (str.length() == 2) {
			return str;
		} else {
			return str;
		}
	}

	/*Given a string, return a "rotated right 2" version where the last 2 chars
	 *  are moved to the start. The string length will be at least 2. */
	public String right2(String str) {
		String temp = str.substring(0,str.length()-2);
		if (str.length() > 2) {
			return str.substring(str.length() - 2) + temp;
		} else if (str.length() == 2) {//java
			return str;
		} else {
			return str;
		}
	}
	
	/*Given a string, return a string length 1 from its front, unless front
	 *is false, in which case return a string length 1 from its back. 
	 *The string will be non-empty. */
	public String theEnd(String str, boolean front) {
		if (front) {
			return str.charAt(0) + "";
		} else {
			return str.charAt(str.length() - 1) + "";
		}
	}
	
	
	/*Given a string, return a version without both the first and last char of the string. 
	 * The string may be any length, including 0. */
	public String withouEnd2(String str) {
		if (str.length() >= 3) {
			return str.substring(1, str.length() - 1);
		} else if (str.length() < 3 && str.length() > 0) {
			return "";
		} else {
			return "";
		}
	}
	
	/*Given a string of even length, return a string made of the middle two chars, 
	 *so the string "string" yields "ri". The string length will be at least 2.	 */
	public String middleTwo(String str) {
		if (str.length() > 2) {
			return str.substring((str.length() / 2) - 1, str.length() / 2)
					+ str.substring((str.length() / 2), (str.length() / 2) + 1);
		} else {
			return str;
		}
	}
	
	/*	Given a string, return true if it ends in "ly".	*/
	public boolean endsLy(String str) {
		if (str.endsWith("ly")) {
			return true;
		} else
			return false;
	}
	
	
	/*Given a string and an int n, return a string made of the first and 
	 *last n chars from the string. The string length will be at least n.	 */
	public String nTwice(String str, int n) {
		if (str.length() >= n) {
			return str.substring(0, n) + str.substring(str.length() - n);
		} else {
			return str;
		}
	}
	
	
	/*Given a string and an index, return a string length 2 starting at 
	  the given index. If the index is too big or too small to define a 
	  string length 2, use the first 2 chars. The string length will be at least 2. */
	public String twoChar(String str, int index) {
		if (str.length() > 2) {
			if (str.length() <= index) {
				return str.substring(0, 2);
			} else if (str.length() + 2 > index) {
				return str.substring(index, index + 2);
			} else {
				return str;
			}
		} else {
			return str;
		}
	}
	
	
	/*
	 * 
	 */
	/*
	 * 
	 */
	/*
	 * 
	 */
} 
