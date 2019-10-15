package coding_Bat.WarmUp_1;
public class Or_35 {

	public static void main(String[] args) {
		System.out.println(or35(3));
		System.out.println(or35(10));
		System.out.println(or35(8));
	}
	
	/*Return true if the given non-negative number is a multiple of 3 or a multiple of 5. 
	 *Use the % "mod" operator -- see Introduction to Mod */
	public static boolean or35(int n) {
		if (n > 0) {
			if (n % 3 == 0 || n % 5 == 0) {
				return true;
			}
			else {
				return false;
			}
		}else {
			return false;
		}
	}


}
