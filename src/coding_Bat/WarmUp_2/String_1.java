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
	
	/*	twoChar("java", 0) → "ja"
		twoChar("java", 2) → "va"
		twoChar("java", 3) → "ja"
	*/	
	public String twoChar(String str, int index) {
		if (str.length() > 2 && index >= 0) {
			if (str.length() <= index) {
				return str.substring(0, 2);
			} else if ((str.length() - index) >= 2) {
				return str.substring(index, index + 2);
			} else {
				return str.substring(0, 2);
			}
		} else {
			return str.substring(0, 2);
		}
	}
		
	/*Given a string of odd length, return the string length 3 from its middle, 
	  so "Candy" yields "and". The string length will be at least 3.
	  middleThree("Candy") → "and"
	  middleThree("and") → "and"
	  middleThree("solving") → "lvi" 	*/
	public String middleThree(String str) {
		if (str.length() <= 3) {
			return str;
		} else {
			if (str.length() % 2 != 0) {
				return str.substring((str.length() / 2) - 1, (str.length() / 2) + 2);
			} else {
				return str;
			}
		}
	}
		
	/*Given a string, return true if "bad" appears starting at index 0 or 1 
	  in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". 
	  The string may be any length, including 0. Note: use .equals() to compare 2 strings.
	  	hasBad("badxx") → true
	    hasBad("xbadxx") → true
	    hasBad("xxbadxx") → false	 */
	public boolean hasBad(String str) {
		if (str.length() == 3) {
			if (str.substring(0, str.length()).equals("bad")) {
				return true;
			} else {
				return false;
			}
		} else if (str.length() > 3) {
			if (str.substring(((str.length() - str.length())), (str.length() - str.length() + 3)).equals("bad") || str
					.substring(((str.length() - str.length()) + 1), (str.length() - str.length() + 4)).equals("bad")) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	/*Given a string, return a string length 2 made of its first 2 chars. 
		If the string length is less than 2, use '@' for the missing chars.
		atFirst("hello") → "he"
		atFirst("hi") → "hi"
		atFirst("h") → "h@"		 */
	public String atFirst(String str) {
		if (str.length() >= 1 && str.length() < 2) {
			return str += "@";
		} else if (str.length() == 2) {
			return str;
		} else if (str.length() == 0) {
			return str += "@@";
		} else {
			return str.substring((str.length() - str.length()), (str.length() - str.length() + 2));
		}
	}
	
  /*Given 2 strings, a and b, return a new string made of the first char of a 
	and the last char of b, so "yo" and "java" yields "ya". If either string 
	is length 0, use '@' for its missing char.
	lastChars("last", "chars") → "ls"
	lastChars("yo", "java") → "ya"
	lastChars("hi", "") → "h@"		 */
	public String lastChars(String a, String b) {
		if (a.length() == 0 && b.length() == 0) {
			return "@@";
		} else if (a.length() == 0 && b.length() > 0) {
			return "@" + b.charAt(b.length() - 1);
		} else if (a.length() > 0 && b.length() == 0) {
			return a.charAt(a.length() - a.length()) + "@";
		} else {
			return a.charAt(a.length() - a.length()) + "" + b.charAt(b.length() - 1);
		}
	}
	
	/*Given two strings, append them together (known as "concatenation") and 
	  return the result. However, if the concatenation creates a double-char, 
	  then omit one of the chars, so "abc" and "cat" yields "abcat".
		conCat("abc", "cat") → "abcat"
		conCat("dog", "cat") → "dogcat"
		conCat("abc", "") → "abc"	 */
	public String conCat(String a, String b) {
		if (a.length() == 0 && b.length() > 0) {
			return b;
		} else if (a.length() > 0 && b.length() == 0) {
			return a;
		} else if (a.length() == 0 && b.length() == 0) {
			return a + b;
		} else {
			if (a.charAt(a.length() - 1) == b.charAt(b.length() - b.length())) {
				return a.substring((a.length() - a.length()), (a.length() - 1)) + b;
			} else {
				return a + b;
			}
		}
	}

	
	/*Given a string of any length, return a new string where the last 2 chars, 
	  if present, are swapped, so "coding" yields "codign".
		lastTwo("coding") → "codign"
		lastTwo("cat") → "cta"
		lastTwo("ab") → "ba"				 */
	public String lastTwo(String str) {
		if (str.length() < 2) {
			return str;
		} else if (str.length() == 2) {
			return str.charAt(str.length() - 1) + "" + str.charAt(str.length() - str.length());
		} else {
			return str.substring((str.length() - str.length()), (str.length() - 2)) + str.charAt(str.length() - 1) + ""
					+ str.charAt(str.length() - 2);
		}
	}

	
	/*Given a string, if the string begins with "red" or "blue" return 
	  that color string, otherwise return the empty string.
		seeColor("redxx") → "red"
		seeColor("xxred") → ""
		seeColor("blueTimes") → "blue"	 */
	public String seeColor(String str) {
		if (str.startsWith("red")) {
			return str.substring((str.length() - str.length()), "red".length());
		} else if (str.startsWith("blue")) {
			return str.substring((str.length() - str.length()), "blue".length());
		} else {
			return "";
		}
	}


	/*Given a string, return true if the first 2 chars in the string 
	  also appear at the end of the string, such as with "edited".
		frontAgain("edited") → true
		frontAgain("edit") → false
		frontAgain("ed") → true		 */
	public boolean frontAgain(String str) {
		if (str.length() == 2) {
			return true;
		} else if (str.length() >= 3) {
			if (str.substring((str.length() - str.length()), (str.length() - str.length()) + 2)
					.equals(str.substring((str.length() - 2)))) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

		
	/*	Given two strings, append them together (known as "concatenation") and
		return the result. However, if the strings are different lengths, omit 
		chars from the longer string so it is the same length as the shorter string. 
		So "Hello" and "Hi" yield "loHi". The strings may be any length.
		minCat("Hello", "Hi") → "loHi"
		minCat("Hello", "java") → "ellojava"
		minCat("java", "Hello") → "javaello"	 */
	public String minCat(String a, String b) {
		if (a.length() == 0 && b.length() == 0) {
			return a + b;
		} else if (a.length() > 0 && b.length() > 0 && a.length() == b.length()) {
			return a + b;
		} else if (a.length() > 0 && b.length() > 0 && a.length() != b.length()) {
			if (a.length() > b.length()) {
				return a.substring((a.length() - b.length())) + b.substring(b.length() - b.length());
			} else {
				return a.substring((a.length() - a.length())) + b.substring(b.length() - a.length());
			}
		} else {
			return "";
		}
	}
			
	/*Given a string, return a new string made of 3 copies of the first 2 chars
	  of the original string. The string may be any length. If there are fewer 
	  than 2 chars, use whatever is there.
	  extraFront("Hello") → "HeHeHe"
	  extraFront("ab") → "ababab"
	  extraFront("H") → "HHH"	 */
	public String extraFront(String str) {
		if (str.length() == 0) {
			return "";
		} else if (str.length() == 1) {
			return str + str + str;
		} else if (str.length() == 2) {
			return str + str + str;
		} else {
			return str.substring((str.length() - str.length()), (str.length() - str.length()) + 2)
					+ str.substring((str.length() - str.length()), (str.length() - str.length()) + 2)
					+ str.substring((str.length() - str.length()), (str.length() - str.length()) + 2);
		}
	}
			
	/*Given a string, if a length 2 substring appears at both its beginning 
	  and end, return a string without the substring at the beginning, so 
	  "HelloHe" yields "lloHe". The substring may overlap with itself, so
	  "Hi" yields "". Otherwise, return the original string unchanged.
	  without2("HelloHe") → "lloHe"
	  without2("HelloHi") → "HelloHi"
	  without2("Hi") → ""	 */
	public String without2(String str) {
		if (str.length() < 2) {
			return str;
		} else if (str.length() == 2) {
			return "";
		} else {
			if (str.substring((str.length() - str.length()), (str.length() - str.length()) + 2)
					.equals(str.substring(str.length() - 2))) {
				return str.substring(str.length() - str.length() + 2);
			} else {
				return str;
			}
		}
	}


	/*Given a string, return a version without the first 2 chars. 
		Except keep the first char if it is 'a' and keep the second 
		char if it is 'b'. The string may be any length. Harder than it looks.
		deFront("Hello") → "llo"
		deFront("java") → "va"
		deFront("away") → "aay"	 */
	public String deFront(String str) {
		if (str.length() < 2) {
			return str;
		} else if (str.length() == 2) {
			if (str.charAt(str.length() - str.length()) == 'a'
					&& str.charAt((str.length() - str.length()) + 1) == 'b') {
				return str;
			} else if (str.charAt(str.length() - str.length()) == 'a'
					&& str.charAt((str.length() - str.length()) + 1) != 'b') {
				return "" + str.charAt(str.length() - str.length());
			} else if (str.charAt(str.length() - str.length()) != 'a'
					&& str.charAt((str.length() - str.length()) + 1) == 'b') {
				return "" + str.charAt(str.length() - str.length() + 1);
			} else {
				return "";
			}
		} else {
			if (str.charAt(str.length() - str.length()) == 'a'
					&& str.charAt((str.length() - str.length()) + 1) == 'b') {
				return str;
			} else if (str.charAt(str.length() - str.length()) == 'a'
					&& str.charAt((str.length() - str.length()) + 1) != 'b') {
				return "" + str.charAt(str.length() - str.length()) + str.substring(str.length() - str.length() + 2);
			} else if (str.charAt(str.length() - str.length()) != 'a'
					&& str.charAt((str.length() - str.length()) + 1) == 'b') {
				return str.substring(str.length() - str.length() + 1);
			} else {
				return str.substring(str.length() - str.length() + 2);
			}
		}
	}
	
	/*Given a string and a second "word" string, we'll say that the
		word matches the string if it appears at the front of the string, 
		except its first char does not need to match exactly. On a match, 
		return the front of the string, or otherwise return the empty string. 
		So, so with the string "hippo" the word "hi" returns "hi" and "xip" 
		returns "hip". The word will be at least length 1.
		startWord("hippo", "hi") → "hi"
		startWord("hippo", "xip") → "hip"
		startWord("hippo", "i") → "h"	 */
	public String startWord(String str, String word) {
		if (str.length() > word.length()) {
			if (str.substring((str.length() - str.length()), word.length()).contains(word)
					|| str.substring((str.length() - str.length()), word.length())
							.contains(word.substring(word.length() - word.length() + 1))) {
				return str.substring((str.length() - str.length()), word.length());
			} else if (str.substring((str.length() - str.length()), word.length() + 1).contains(word)) {
				return "" + str.charAt(str.length() - str.length());
			} else if (str.substring((str.length() - str.length()), word.length()).contains(word.substring(1))) {
				return str.substring((str.length() - str.length()), word.length());
			} else {
				return "";
			}
		} else if (str.length() == word.length()) {
			if (str.substring((str.length() - str.length()), word.length()).contains(word)
					|| str.substring((str.length() - str.length()), word.length())
							.contains(word.substring(word.length() - word.length() + 1))) {
				return str;
			} else {
				return "";
			}
		} else {
			return "";
		}
	}
	

	/*Given a string, if the first or last chars are 'x', return the string 
		without those 'x' chars, and otherwise return the string unchanged.
		withoutX("xHix") → "Hi"
		withoutX("xHi") → "Hi"
		withoutX("Hxix") → "Hxi"	 */
//	public String withoutX(String str) {
//		
//	}
	
	
	/*
	 * 
	 */
	/*
	 * 
	 */
	/*
	 * 
	 */
	/*
	 * 
	 */
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
