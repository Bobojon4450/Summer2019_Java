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
		
		boolean B = 9>=9 || 10<=10, C ='A'>=128 && 'B' < 128;
		
		if (B) {
			if (C) {
				System.out.println("Cyb");
			}else {
				System.out.println("Bat");
			}
		}
		
		boolean result = true;
		int n = 100;
		if (result) {
			n /= 10;
			result = !result;
		}if (result) {
			n *= 2;
		}else {
			n -= 5;
		}
		
		System.out.println(n);
		System.out.println("---------------------");
		
		int[] array = { 70, 500, 150, 90, 40, 300 };

		int temp;
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j] < array[j - 1]) {
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
		
		for (int i : array) {
			System.out.print(i+" ");
		}
		
		System.out.println("\n---------------------");
		int [] arr = {1,4,2,5,34,8,0,556,24,-1,-6};
		
		int placeh = 0;
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] > arr[j - 1]) {
					placeh = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = placeh;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
	}
}
