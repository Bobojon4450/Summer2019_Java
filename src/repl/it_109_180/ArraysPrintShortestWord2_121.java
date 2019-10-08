package repl.it_109_180;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPrintShortestWord2_121 {
	/*
	 * Write a program that will find out shortest words in the given string str. If
	 * there are few words that are evenly short, print them all. Use split method
	 * in order to split str string variable and create an array of strings. Print
	 * array with Arrays.toString() method. Sort array before printing.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] sameLengthWords = shortestWord(str);
		System.out.println(Arrays.toString(sameLengthWords));
		scan.close();
	}

	public static String[] shortestWord(String words) {
		String arr[] = words.split(",");
		Arrays.sort(arr);
		String[] trimmedData = new String[arr.length];
		int shortCount = 0;
		int shortLength = 0;

		/* trim array data to get rid of spaces */
		for (int i = 0; i < arr.length; i++) {
			trimmedData[i] = arr[i].trim();
		}

		/* find the shortest word in the array */
		String shortWord = trimmedData[0];
		for (int i = 1; i < trimmedData.length; i++) {
			if (trimmedData[i].length() < shortWord.length()) {
				shortWord = trimmedData[i];
			}
		}

		/* find out how many occurrences of word with the minimum length */
		for (int i = 0; i < trimmedData.length; i++) {
			if (trimmedData[i].length() == shortWord.length()) {
				shortCount++;
			}
		}

		/* create new array with length based on shortWord and fill it with words */
		String[] array2 = new String[shortCount];
		int array2Count = 0;
		for (int i = 0; i < trimmedData.length; i++) {
			if (trimmedData[i].length() == shortWord.length()) {
				array2[array2Count] = trimmedData[i];
				array2Count++;
			}
		}
		Arrays.sort(array2);
		return array2;
	}
}
//volt, olive, fish, hot pursuit, warning, python, java, coffee, part