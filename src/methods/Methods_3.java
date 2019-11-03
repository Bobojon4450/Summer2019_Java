package methods;

public class Methods_3 {

	/* Assignment: 1. write a return method that can remove duplicates from a string
	   Ex: RemoveDup("AABBBCCCDD") ==> ABCD*/
	public static String removeDuplicates(String str) {
		String nonDuplicate = "";
		for (int i = 0; i < str.length(); i++) {
			if (!nonDuplicate.contains("" + str.charAt(i))) {
				nonDuplicate += "" + str.charAt(i);
			}
		}
		return nonDuplicate;
	}
	

	/* 2. write a return method that passes two string parameters a and b, return
		  the number appearances of b in a Ex: occurred("ABAB" , "A") ==> 2 */
	public static String charOccurrence(String str, String nonDuplicated) { 
		String result = "";
		/* this loop iterates for each char of the str2 */
		for (int j = 0; j < nonDuplicated.length(); j++) {
			/* this loop iterates for each char of the str */
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (nonDuplicated.charAt(j) == str.charAt(i)) {
					count++;
				}
			}result += ""+nonDuplicated.charAt(j)+count;
		}
		return result;
	}
	

	/*  3. combine method 1 and method 2 to write a method that can find the
 			frequency of characters Ex: frequency("AAABBBCCCDD") ==> A3B3C3D2 */
	public static String frequencyOfChars(String str) {
		return charOccurrence(str, removeDuplicates(str));
	}
}
