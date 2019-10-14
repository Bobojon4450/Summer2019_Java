package coding_Bat.WarmUp_1;

public class PosNeg {

	public static void main(String[] args) {
		System.out.println(posNeg(1, -1, true));
		System.out.println(posNeg(-1, 1, false));
		System.out.println(posNeg(-4, -5, true));
	}

	public static boolean posNeg(int a, int b, boolean negative) {
		if ((a >= 0 && b < 0 || b >= 0 && a < 0) && negative == false) {
			return true;
		}else if(negative == true && (a < 0 && b < 0)) {
			return true;
		}else {
			return false;
		}
	}
}
