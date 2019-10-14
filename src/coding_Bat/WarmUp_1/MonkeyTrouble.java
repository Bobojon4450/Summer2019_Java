package coding_Bat.WarmUp_1;

public class MonkeyTrouble {

	public static void main(String[] args) {
		System.out.println(monkeyTrouble(true, true));
	}

	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		boolean trouble = false;
		if (aSmile == true && bSmile == true) {
			trouble = true;
		} else if (aSmile == false && bSmile == false) {
			trouble = true;
		}
		return trouble;
	}
}
