package coding_Bat.WarmUp_1;

public class NotString {
	public static void main(String[] args) {
		System.out.println(notString("candy"));
		System.out.println(notString("x"));
		System.out.println(notString("not"));
	}

	public static String notString(String str) {
		if (str.length() >= 3) {
			if (str.substring(0, 3).equals("not")) {
				return str;
			} else {
				return str = "not " + str;
			}
		} else {
			return str = "not " + str;
		}
	}


}
