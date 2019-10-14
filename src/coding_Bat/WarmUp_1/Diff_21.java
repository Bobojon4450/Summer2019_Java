package coding_Bat.WarmUp_1;

public class Diff_21 {

	public static void main(String[] args) {
		System.out.println(diff21(19));
		System.out.println(diff21(10));
		System.out.println(diff21(21));
	}

	
	/* Given an int n, return the absolute difference between n and 21, 
	   except return double the absolute difference if n is over 21.	*/
	public static int diff21(int n) {
		if (n < 21) {
			return 21 - n;
		} else if (n == 21) {
			return 0;
		} else {
			return (n - 21) * 2;
		}
	}

}
