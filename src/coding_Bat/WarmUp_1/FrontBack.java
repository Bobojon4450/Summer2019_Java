package coding_Bat.WarmUp_1;

public class FrontBack {

	public static void main(String[] args) {
		System.out.println(frontBack("code"));
		System.out.println(frontBack("abc"));
		System.out.println(frontBack("ab"));
	}

	
	/* Given a string, return a new string where the first and last chars have been
	 * exchanged.			 */
	public static String frontBack(String str) {
		String last = "";
		String first = "";
		if (str.length() == 2) {
			first = str.substring(str.length() - str.length(), 1);
			last = str.substring(str.length() - 1);
			return last + first;
		} else if (str.length() > 2) {
			first = str.substring(str.length() - str.length(), 1);
			last = str.substring(str.length() - 1);
			str = str.substring(1, str.length() - 1);
			return last + str + first;
		} else {
			return str;
		}
	}
	

	
}
