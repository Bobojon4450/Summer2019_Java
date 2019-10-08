package day33_ArrayList;

public class MethodCalls {

	public static void method1() {
		System.out.println("A");
	}

	public static void method2() {
		method1();
		System.out.println("B");
	}

	public static void method3() {
		method2();
		System.out.println("C");
	}

	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	public static int max(int a, int b, int c) {
//		int largest = max(a, b);
		return (max(a, b) > c) ? max(a, b) : c;
	}

	public static int max(int a, int b, int c, int d) {
		int maxNum = max(max(a, b), max(c, d));
		return maxNum;
	}

	public static int max(int a, int b, int c, int d, int e) {
		return max(max(a, b, c, d), e);
	}

	public static String print(int a, int b, int c) {
		max(a, b, c);
		return "";
	}
 
	
	/* Assignment: 1. write a return method that can remove duplicates from a string
	   Ex: RemoveDup("AABBBCCCDD") ==> ABCD*/
	public static String removeDuplicates(String str) {
		String nonDuplicate = "";
		for (int i = 0; i < str.length(); i++) {
			if (!nonDuplicate.contains("" + str.charAt(i))) {
				nonDuplicate += "" + str.charAt(i);
			}
		}
		return nonDuplicate;
	}
	

	/* 2. write a return method that passes two string parameters a and b, return
		  the number appearances of b in a Ex: occurred("ABAB" , "A") ==> 2 */
	public static String charOccurrence(String str, String nonDuplicated) { 
		String result = "";
		/* this loop iterates for each char of the str2 */
		for (int j = 0; j < nonDuplicated.length(); j++) {
			/* this loop iterates for each char of the str */
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (nonDuplicated.charAt(j) == str.charAt(i)) {
					count++;
				}
			}result += ""+nonDuplicated.charAt(j)+count;
		}
		return result;
	}
	

	/*  3. combine method 1 and method 2 to write a method that can find the
    frequency of characters Ex: frequency("AAABBBCCCDD") ==> A3B3C3D2 */
	public static String frequencyOfChars(String str) {
		return charOccurrence(str, removeDuplicates(str));
	}
	
	
	public static void main(String[] args) {
		method1();
		int max = max(10, 23, 33);
		System.out.println(max);
		System.out.println(max(12, 23, 34, 45));
		System.out.println(removeDuplicates("AABBIIDD"));
		System.out.println(charOccurrence("AABBCD", "A"));
		System.out.println(frequencyOfChars("AAABBBCCCDDiJ"));
	}
	
}
