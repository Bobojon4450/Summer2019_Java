package coding_Bat.WarmUp_1;

public class Warmup_1_3050 {

	public static void main(String[] args) {
		System.out.println(max1020(3,12));
		System.out.println(everyNth("Chocolate", 3));
	}

	public boolean in3050(int a, int b) {
		if ((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) {
			return true;
		} else if ((a >= 40 && a <= 50) && (b >= 40 && b <= 50)) {
			return true;
		} else {
			return false;
		}
	}
	
	/*	Warmup-1 > close10	*/
	public int close10(int a, int b) {
		int temp1 = Math.abs(a - 10);
		int temp2 = Math.abs(b - 10);

		if (temp1 > temp2) {
			return b;
		} else if (temp2 > temp1) {
			return a;
		} else {
			return 0;
		}
	}

	/* intMax	*/
	public int intMax(int a, int b, int c) {
		if (a > b && a > c) {
			return a;
		} else if (b > a && b > c) {
			return b;
		} else {
			return c;
		}
	}

	/*
	 * Given 2 int values, return whichever value is nearest to the value 10, 
	 * or return 0 in the event of a tie. Note that Math.abs(n) returns the 
	 * absolute value of a number.
	 */
	public int close10_(int a, int b) {
		int temp1 = Math.abs(a - 10);
		int temp2 = Math.abs(b - 10);

		if (temp1 > temp2) {
			return b;
		} else if (temp2 > temp1) {
			return a;
		} else {
			return 0;
		}
	}
	
	/*	Given a string, return a string made of the first 2 chars (if present), 
	 *  however include first char only if it is 'o' and include the second only 
	 *  if it is 'z', so "ozymandias" yields "oz".	*/
	public String startOz(String str) {
		if (str.length() >= 2) {
			String temp = str.substring(0, 2);
			if (temp.contains("oz") || temp.contains("o") || temp.contains("z")) {
				if (temp.startsWith("oz")) {
					return temp.substring(0, 2);
				} else if (temp.substring(0, 1).equals("o")) {
					return temp.substring(0, 1);
				} else if (temp.substring(1, 2).equals("z")) {
					return temp.substring(1);
				} else {
					return "";
				}
			} else {
				return "";
			}
		} else {
			return str;
		}
	}

	
	/*
	 * Return true if the given string begins with "mix", except the 'm' 
	 * can be anything, so "pix", "9ix" .. all count.
	 */
	public boolean mixStart(String str) {
		if (str.length() >= 3) {
			String temp = str.substring(0, 3);
			if (temp.contains("ix")) {
				if (temp.substring(1, 3).equals("ix")) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	
	/*Given a string, if the string "del" appears starting at index 1, 
	 * return a string where that "del" has been deleted. Otherwise, 
	 * return the string unchanged.
		delDel("adelbc") → "abc"
		delDel("adelHello") → "aHello"
		delDel("adedbc") → "adedbc"	 */
	public String delDel(String str) {
		String temp = "";
		if (str.length() > 3) {
			if (str.substring(1, 4).equals("del")) {
				temp = str.substring(0, 1) + str.substring(4);
				return temp;
			} else {
				return str;
			}
		} else {
			return str;
		}
	}

	/*
	We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
	Given 2 int values, return true if one or the other is teen, but not both.
		loneTeen(13, 99) → true
		loneTeen(21, 19) → true
		loneTeen(13, 13) → false	 */
	public boolean loneTeen(int a, int b) {
		if ((a >= 13 && a <= 19) && (b >= 13 && b <= 19)) {
			return false;
		} else if (((a >= 13 && a <= 19) && (b < 13 || b > 19)) || ((a < 13 || a > 19) && (b >= 13 && b <= 19))) {
			return true;
		} else {
			return false;
		}
	}

	/*We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
	  Given 3 int values, return true if 1 or more of them are teen.
		hasTeen(13, 20, 10) → true
		hasTeen(20, 19, 10) → true
		hasTeen(20, 10, 13) → true	 */
	public boolean hasTeen(int a, int b, int c) {
		if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
			return true;
		} else {
			return false;
		}
	}

	/*Given 2 positive int values, return the larger value that is in the range 
	  10..20 inclusive, or return 0 if neither is in that range.
		max1020(11, 19) → 19
		max1020(19, 11) → 19
		max1020(11, 9) → 11	 */
	public static int max1020(int a, int b) {
		if ((a >= 10 && a <= 20)) {
			if (b >= 10 && b <= 20) {
				if (a > b) {
					return a;
				} else {
					return b;
				}
			} else {
				return a;
			}
		} else if (b >= 10 && b <= 20) {
			return b;
		} else {
			return 0;
		}
	}

	
	/*Return true if the given string contains between 1 and 3 'e' chars.	 */
	public boolean stringE(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'e') {
				count++;
			}
		}
		return (count >= 1 && count <= 3);
	}

	
	/*Given two non-negative int values, return true if they have the same last digit, 
	  such as with 27 and 57. Note that the % "mod" operator computes remainders, 
	  so 17 % 10 is 7.
		lastDigit(7, 17) → true
		lastDigit(6, 17) → false
		lastDigit(3, 113) → true*/
	public boolean lastDigit(int a, int b) {
		int a1 = a % 2;
		int b1 = b % 2;
		if (a1 == b1) {
			return true;
		} else {
			return false;
		}
	}

	
	/*Given a string, return a new string where the last 3 chars are now in upper case. 
	  If the string has less than 3 chars, uppercase whatever is there. 
	  Note that str.toUpperCase() returns the uppercase version of a string.
		endUp("Hello") → "HeLLO"
		endUp("hi there") → "hi thERE"
		endUp("hi") → "HI"	 */
	public String endUp(String str) {
		String temp = "";
		if (str.length() >= 3) {
			temp = str.substring(str.length()-3);
			str = str.substring(0, str.length()-3);
			return str + temp.toUpperCase();
		} else {
			return str.toUpperCase();
		}
	}
	
	
	/*Given a non-empty string and an int N, return the string made starting with char 0, 
	  and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. 
	  N is 1 or more.
		everyNth("Miracle", 2) → "Mrce"
		everyNth("abcdefg", 2) → "aceg"
		everyNth("abcdefg", 3) → "adg"	 */
	public static String everyNth(String str, int n) {
		if (str.length() > n) {
			String temp = str.substring(0, 1);//Cca
			for (int i = n; i <= str.length()-1; i += n) {
				temp += str.charAt(i);  //Chocolate
			}
			return temp;
		} else {
			return str.charAt(0)+"";
		}
	}

	
	/*We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if 
	  each is smiling. We are in trouble if they are both smiling or if neither of 
	  them is smiling. Return true if we are in trouble.
		monkeyTrouble(true, true) → true
		monkeyTrouble(false, false) → true
		monkeyTrouble(true, false) → false	 */
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		if(aSmile && bSmile) {
			return true;
		}else if(!aSmile && !bSmile) {
			return true;
		}else {
			return false;
		}
	}
	
	
	/*The parameter weekday is true if it is a weekday, and the parameter vacation is true 
	  if we are on vacation. We sleep in if it is not a weekday or we're on vacation. 
	  Return true if we sleep in.
		sleepIn(false, false) → true
		sleepIn(true, false) → false
		sleepIn(false, true) → true	 */
	public boolean sleepIn(boolean weekday, boolean vacation) {
		if (weekday == false && vacation == false) {
			return true;
		} else if (weekday == true && vacation == false) {
			return false;
		} else if (weekday == false && vacation == true) {
			return true;
		} else if (weekday == true && vacation == true) {
			return true;
		} else {
			return false;
		}
	}


}
