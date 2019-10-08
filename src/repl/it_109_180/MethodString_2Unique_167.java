package repl.it_109_180;

public class MethodString_2Unique_167 {

	public static void main(String[] args) {
		System.out.println(uniqueChars("wooden-spoon"));
	}

	public static String uniqueChars(String str) {
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			if (!temp.contains("" + str.charAt(i))) {
				temp += "" + str.charAt(i);
			}
		}return temp;
	}
}
