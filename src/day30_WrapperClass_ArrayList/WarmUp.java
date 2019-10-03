package day30_WrapperClass_ArrayList;

public class WarmUp {

	public static void main(String[] args) {
		String str = "asddfffkkkkflf";
		System.out.println(removeDuplicate(str));
		System.out.println(uniqueValues(str));
	}
	
	
	//accepts a String and removes duplicate values from the String: ("aaabbbccc") ==> "abc"
	public static String removeDuplicate(String str) {
		String result ="";
		for (int i = 0; i < str.length(); i++) {
			if (!result.contains(str.substring(i, i+1))) {
				result += str.substring(i, i+1);
			}
		}
		return result;
	}
	
	/* method that accepts String and returns the unique values from the String
    	Ex: Unique("AABBCDEEE")  ==> "CD"									*/
	public static String uniqueValues(String str) {
		String result = "";
		for (int j = 0; j < str.length(); j++) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(j) == str.charAt(i)) {
					count++;
				}
			}
			if (count == 1) {
				result += str.charAt(j);
			}
		}
		return result;
	}
	
	




}
