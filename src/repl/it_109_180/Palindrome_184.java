package repl.it_109_180;

public class Palindrome_184 {

	public static void main(String[] args) {
		String str3 = "Nurses Run";
		String str4 = "wooden";
		System.out.println(isPalindrome(str3));
		System.out.println(isPalindrome(str4));
	}

	/*		Palindrome method		*/
	public static boolean isPalindrome(String str) {
		String cleared = str.replaceAll(" ", "");
		String reverse = "";
		for (int i = cleared.length() - 1; i >= 0; i--) {
			reverse += "" + cleared.charAt(i);
		}
		if (reverse.equalsIgnoreCase(cleared)) {
			return true;
		} else {
			return false;
		}

	}
}
