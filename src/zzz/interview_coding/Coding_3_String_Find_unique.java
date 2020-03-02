package zzz.interview_coding;

import java.util.Set;
import java.util.TreeSet;

public class Coding_3_String_Find_unique {

	/*
	 * Write a return method that can find the unique characters from the String Ex:
	 * unique("AAABBBCCCDEF") ==> "DEF";
	 */

	// sorted
	public static String removeDuplicates(String str) {
		Set<Character> set = new TreeSet<Character>();
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
		System.out.println(removeDuplicates("AANNBBYYTTFFP")); // ABFNPTY
		long arr[][] = new long[][] { { 1, 2 }, { 3, 4 } };
		double arr2[][] = new double[][] { { 1, 2 }, { 2, 3 } };
		long arr7[][] = new long[2][2];

		int arr4[] = new int[] { 1, 23, 4 };
		int arr5[] = { 1, 23, 4 };

		String[][] arr3 = { { "A", "B", "C" }, { "D", "E" } };
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				System.out.println(arr3[i][j]);
				if (arr3[i][j].equals("B")) {
					break;
				}
			}
		}
		
		int x = 100;
		int a = x++;//100
		int b = ++x;//102
		int c = x++;//102	
		System.out.println(c);
//		int d = (a < b)?(a < c) ? a :(b < c) ? b : c;
		
		String str1 = "Java";
		String str2[] = {"J","a","v","a"};
		String str3 = "";
		for (int i = 0; i < str1.length(); i++) {
			str3 += str2[i];
		}
		boolean b1 = str1 == str3;//false
		boolean b2 = str1.equals(str3);//true
		System.out.println(b1+" "+b2);
		System.out.println("----------------------------------");
		
		String str5 = "Java";
		String str4 = "Java";
		System.out.println(str5 == str4);// true, both str4,str5 was initialized as "Java"
		String str6 = "";
		for (int i = 0; i < str2.length; i++) {
			str6 = str6 + str2[i];
		}
		System.out.println(str5 == str6);//false, because str6 was initialized as "" first and then modified
		
		String str8 = "Batch 12";
		int z = str8.trim().length();
		System.out.println(z);
	}
	
//	public static void main(int[] args) {
//		System.out.println("int main");
//	}
//	
//	public static void main(double[] args) {
//		System.out.println("double main");
//	}
//	
//	public static void main(char[] args) {
//		System.out.println("char main");
//	}
//	
//	public static void main(String[] args) {
//		System.out.println("String main");
//	}
	
}
