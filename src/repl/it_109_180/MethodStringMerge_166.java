package repl.it_109_180;

public class MethodStringMerge_166 {
	
	/* When gears merge and work together, one teeth from each one goes in order.
	   Write a method mergeStrings hat will return the strings merged, one letter at a time, 
	   starting with one.   
	   Please note one and two can be of different lengths. Please look at below examples:
		
		s1 ==> "12345"
		s2 ==> "abcde"
		mergeStrings(s1,s2) ==> "1a2b3c4d5e"
		mergeStrings("wooden", "spoon") ==> "wsopoodoenn"
		mergeStrings("java", "selenium") ==> "jsaevlaenium"   */
	

	public static void main(String[] args) {
		System.out.println(mergeStrings("wooden", "spoon"));
		System.out.println(mergeStrings("java", "selenium"));
		System.out.println(mergeStrings("12345", "abcde"));
	}

	public static String mergeStrings(String one, String two) {
		String temp = "";
		if (one.length() > two.length()) {
			int limit = two.length();
			String leftOver = one.substring(limit);
			for (int i = 0; i < limit; i++) {
				for (int j = i; j <= i; j++) {
					temp += "" + one.charAt(i) + two.charAt(j);
				}
			}
			temp += leftOver;
			return temp;
		} else if (two.length() > one.length()) {
			int limit = one.length();
			String leftOver = two.substring(limit);
			for (int i = 0; i < limit; i++) {
				for (int j = i; j <= i; j++) {
					temp += "" + one.charAt(i) + two.charAt(j);
				}
			}
			temp += leftOver;
			return temp;
		} else {
			for (int i = 0; i < one.length(); i++) {
				for (int j = i; j <= i; j++) {
					temp += "" + two.charAt(i) + one.charAt(j);
				}
			}
			return temp;
		}
	}
}
