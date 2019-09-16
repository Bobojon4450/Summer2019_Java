package day20_Recap_Strings;

public class ASCII_task2 {

	public static void main(String[] args) {
		/*
		 * print all upper and lower case letters of ascii table
		 */
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch+" ");
		}
		System.out.println();
		
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch+" ");
		}
	}

}
