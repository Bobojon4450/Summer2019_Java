package coding_Bat.WarmUp_1;

public class SumDouble {

	public static void main(String[] args) {
		System.out.println(sumDouble(5, 5));
		System.out.println(sumDouble(2, 3));
	}

	public static int sumDouble(int a, int b) {
		if (a == b) {
			return (a + b) * 2;
		} else {
			return a + b;
		}
	}

	
}
