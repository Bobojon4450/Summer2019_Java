package methods;

public class Methods {

	public static void main(String[] args) {
		String arr[] = { "A", "A", "C", "J", "C", "A" };
		
		unique(arr);
	}

	/*
	 * 1. Write a program that can print out the unique values from an String Array
	 */
	public static void unique(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int count = 0;//we have it here because it should be reset to zero again after loop condition.
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(arr[i]);
			}
		}
	}
	
	//accepts a String and removes duplicate values from the String
	public static String revDupl(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (!result.contains(str.substring(i, i + 1))) {
				result += str.substring(i, i + 1);
			}
		}
		return result;
	}

	/* method that accepts String and returns the unique values from the String Ex:
	 * Unique("AABBCDEEE") ==> "CD"	 */
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
