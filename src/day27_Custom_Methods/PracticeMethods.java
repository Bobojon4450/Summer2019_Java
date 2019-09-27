package day27_Custom_Methods;

import java.util.Arrays;

public class PracticeMethods {

	public static void main(String[] args) {
		
		//Turn it into method.
		
		String str = "aabbccjajgopcccddddaaa";
		String result ="";
		
		for (int i = 0; i < str.length(); i++) {
			if (!result.contains(str.substring(i, i+1))) {
				result += str.substring(i, i+1);
			}
		}
		char ch [] = result.toCharArray();
		Arrays.sort(ch);
		for (char c : ch) {
			System.out.print(c+" ");
		}
		System.out.println();

		
		int num1[] = new int[3];
		int num2[] = { 1, 2, 3, 4, 5 };
		num1 = num2;
		for (int i = 0; i < num1.length; i++) {
			System.out.print(num1[i]);
		}
		
		System.out.println("---------------------");
		int wd = 0;
		String[] days = {"sun","mon","wed","sat"};
		for (int i = 0; i < days.length; i++) {
			switch (days[i]) {
			case "sat":
			case "sun":
				wd -= 1;
				break;
			case "mon":
				wd++;
			case "wed":
				wd += 2;
			}
		}
		System.out.println(wd);
	}

}
