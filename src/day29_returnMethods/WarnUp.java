package day29_returnMethods;

public class WarnUp {

	public static void main(String[] args) {
		/*
		 * 1. write a method that can find the frequency of characters in String. Ex:
		 * FrequencyTest("XXXYYYZZZ") output: X3Y3Z3 FrequencyTest("AAABBBBBCCCC")
		 * output: A3B5C4
		 */
		String str = "jjaabbaaabbbcccccddk";
		String removed = "";

		for (int i = 0; i < str.length(); i++) {
			if (!removed.contains(str.substring(i, i + 1))) {// !removed.contains(""+str.charAt(i))
				removed += str.substring(i, i + 1);

			}
		}
		System.out.println(removed);

		String result = "";
		for (int j = 0; j < removed.length(); j++) {
			int count = 0;// count the number of time it appeared.
			for (int i = 0; i < str.length(); i++) {
				if (str.substring(i, i + 1).equals(removed.substring(j, j + 1))) {
					count++;
				}
			}
			result += removed.substring(j, j + 1) + count;
			System.out.println(result);
		}
		System.out.println("*****************************");
		/******************************************************************************/

		//step 1: remove duplicates.
		String input = "XXXYYYZZZZ";
		String nonDuplicate = "";// remove duplicates from input and store here.
		for (int i = 0; i < input.length(); i++) {
			if (!nonDuplicate.contains(input.substring(i, i + 1))) {
				nonDuplicate += input.substring(i, i + 1);
			}
		}
		System.out.println(nonDuplicate);

		// input = "XXXYYYZZZZ", nonDuplicate ="XYZ"
		//step 2: compare input with non-duplicated string and count the occurrence.
		
		String expectedResult = "";

		for (int j = 0; j < nonDuplicate.length(); j++) {
			int times = 0;
			for (int i = 0; i < input.length(); i++) {
				if (input.substring(i, i + 1).equals(nonDuplicate.substring(j, j + 1))) {
					times++;
				}
			}
			expectedResult += nonDuplicate.substring(j, j + 1) + times;
		}
		System.out.println(expectedResult);
		System.out.println("*****************************");
		
/***********	Same problem with charAt() method	***************************/

		String input2 = "AAABBBCCCDDDDv";
		String nonDuplicate2 = "";// remove duplicates from input and store here.
		
		for (int i = 0; i < input2.length(); i++) {
			if (!nonDuplicate2.contains(input2.substring(i, i + 1))) {
				nonDuplicate2 += input2.substring(i, i + 1);
			}
		}
		System.out.println(nonDuplicate2);

		// input2 = "AAABBBCCCDDDD", nonDuplicate ="ABCD"

		String expectedResult2 = "";

		for (int j = 0; j < nonDuplicate2.length(); j++) {
			int times = 0;
			for (int i = 0; i < input2.length(); i++) {
				if (input2.charAt(i) == nonDuplicate2.charAt(j)) {
					times++;
				}
			}
			expectedResult2 += "" + nonDuplicate2.charAt(j)+ times;
		}
		System.out.println(expectedResult2);

		
		
	}
}
