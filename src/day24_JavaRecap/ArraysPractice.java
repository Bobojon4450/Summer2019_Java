package day24_JavaRecap;
import java.util.Scanner;

public class ArraysPractice {

	public static void main(String[] args) {
		/*
		 * Scanner in = new Scanner(System.in);
		 * 
		 * int arr [] = new int [5]; for (int i = 0; i < arr.length; i++) {
		 * System.out.println("Enter number:"); arr[i] = in.nextInt(); }
		 * 
		 * int sum =0; for (int i : arr) { sum+=i; } System.out.print("Sum: "+sum+"\n");
		 */
		
		
		String str [] = {"Sayfo","Asiya","Myra","Katerina","Daulet","vladislav zakharovich skorobogotko"};
		String longest ="";
		int charNums=0;
		
		for (int i = 0; i < str.length; i++) {
			if (str[i].length() > longest.length()) {
				longest = str[i];
				charNums = str[i].length();
			}
		}
		System.out.println(longest+"\n"+charNums);
		
		
	}
}
