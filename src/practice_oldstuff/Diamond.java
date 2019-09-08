package practice_oldstuff;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n, i, j, space = 1;
		
		
        System.out.print("Enter the number of rows: ");
        n = in.nextInt();
        
        space = n - 1;
		for (j = 1; j <= n; j++) {

			for (i = 1; i <= space; i++) {
				System.out.print(" ");
			}
			space--;// 0//-1

			for (i = 1; i <= 2 * j - 1; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
        space = 1;
		for (j = 1; j <= n - 1; j++) {
			
			for (i = 1; i <= space; i++) {
				System.out.print(" ");
			}
			space++;//2
			for (i = 1; i <= 2 * (n - j) - 1; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
