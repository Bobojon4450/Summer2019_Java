package coding_Bat.WarmUp_1;

public class NearHundred {

	public static void main(String[] args) {
		System.out.println(nearHundred(110));
		System.out.println(nearHundred(111));
		System.out.println(nearHundred(0));
	}

	public static boolean nearHundred(int n) {
		if ((n >= 90 && n <= 100 )|| (n >= 100 && n <= 110) || (n >= 190 && n <= 200) || (n >= 200 && n <= 210)) {
			return true;
		} else {
			return false;
		}
	}
}
