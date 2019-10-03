package repl.it_099;

import java.util.Scanner;

public class GetSandwich_095 {

	/*
	 * A sandwich is two pieces of bread with something in between. Print the string
	 * that is between the first and last appearance of "bread" in the given string,
	 * or return string "nothing" if there are not two pieces of bread.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String str = scan.next();
		String sandwich = "";
		int count = 0;

		if (str.contains("bread")) {
			count++;
			for (int i = 0; i < str.length() - 4; i++) {
				if (str.substring(i, i + 5).equalsIgnoreCase("bread")) {
					if (str.substring(i + 5).contains("bread")) {
						sandwich = str.substring((i + 5), str.lastIndexOf("bread"));count++;break;
					} else {
						System.out.println("nothing");
						break;
					}
				}
			}
			System.out.println(count);
			System.out.println(sandwich);
		}else {
			System.out.println("nothing");
		}
		
	}
}

//int indexOfb = 0;
//int indexOfd = 0;

//indexOfb = str.indexOf(i);
//indexOfd = str.indexOf(str.substring(i+4));

/*
 * for (int j = (i + 5); j < str.substring(i + 5).length() - 4; j++) {
					if (str.substring(j).contains("bread")) {
						count++;
						sandwich = str.substring(j, str.indexOf("bread")+1);
					}
				}
 */