package coding_Bat.WarmUp_1;

public class Front3 {

	public static void main(String[] args) {
		System.out.println(front3("str"));
		System.out.println(front3("st"));
		System.out.println(front3("giss"));
	}

	
	/* Given a string, we'll say that the front is the first 3 chars of the string.
	 * If the string length is less than 3, the front is whatever is there. Return a
	 * new string which is 3 copies of the front. 	*/
	public static String front3(String str) {
		if (str.length() >= 3) {
			String temp = "";
			temp = str.substring(str.length() - str.length(), 3);
			return temp+temp+temp;
		}else {
			return str+str+str;
		}
	}
}
