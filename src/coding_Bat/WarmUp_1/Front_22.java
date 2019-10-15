package coding_Bat.WarmUp_1;

public class Front_22 {

	public static void main(String[] args) {
		System.out.println(front22("kitten"));
		System.out.println(front22("Ha"));
		System.out.println(front22("abc"));
	}

	/*Given a string, take the first 2 chars and return the string with the 2 
	 *chars added at both the front and back, so "kitten" yields"kikittenki". 
	 *If the string length is less than 2, use whatever chars are there.	 */
	public static String front22(String str) {
		if (str.length() >= 2) {
			String temp = str.substring((str.length() - str.length()), 2);
			return temp + str + temp;
		} else if (str.length() == 1) {
			return str + str + str;
		} else {
			return "";
		}	
	}


}
