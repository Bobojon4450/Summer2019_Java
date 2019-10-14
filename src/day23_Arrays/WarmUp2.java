package day23_Arrays;

public class WarmUp2 {

	public static void main(String[] args) {

		String str = "AAABBCDEEF";
		String unique = "";

		for (int j = 0; j < str.length(); j++) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.substring(i, i + 1).equals("" + str.charAt(j))) {
					count++;
				}
			}
			if (count == 1) {
				unique += "" + str.charAt(j);
			}
		}
		System.out.println(unique);

		/********************************************************************/

		String str2 = "ALL THE LETTERS";
		String unique2 = "";
		int count2 = 0;

		for (int j = 0; j < str2.length(); j++) {
			for (int i = 0; i < str2.length(); i++) {
				if (str2.substring(i, i + 1).equals("A")) {
					count2++;
				}
			}

			if (count2 == 1) {
				unique2 += "A";
			}
		}
		System.out.println(unique2);

	}
}
// Fibonacci Sequence: 0, 1, 1, 2, 3, 5, 8, 13
//User story more than 8 points will be split into two.
