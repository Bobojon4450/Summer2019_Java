package day26_for_each;

public class ContinueStatement {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			if (i == 2) {
				continue;// it skips the print statement when true.
			}
			System.out.print(i + " ");
		}
		System.out.println("\n");

		int[] number = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < number.length; i++) {
			if (i < 3) {
				continue;
			}
			System.out.print(number[i]+" ");
		}
	}
}
