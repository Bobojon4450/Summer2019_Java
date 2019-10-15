package coding_Bat.WarmUp_1;

public class BackAround {

	public static void main(String[] args) {
		System.out.println(backAround("cat"));
	}

	/*Given a string, take the last char and return a new string with the last char 
	  added at the front and back, so "cat" yields "tcatt". 
	  The original string will be length 1 or more. 
	 */
	public static String backAround(String str) {
		char ch  = str.charAt(str.length()-1);
		return ch+str+ch;
	}

}
