package day51_Abstract_continue;

final public class LK {

	int num;
	String st;
	protected double dNum;
	
	void dNum() {System.out.println("Same name like a member.");}
	
	public static void run() {System.out.println("Running");}
	
	public static String run(String str) {System.out.println("Running @Overloded");return str;}
	
	public static void getDriver(long a) {
		switch (1) { //byte , short , char , and int primitive data types only.
		case 1:System.out.println("1");break;
		default:
			System.out.println("default");
		}
	}
	
	public static void main(String[] args) {
		int arr [] = {3,2,1};
		for (int i : arr) {
			System.out.print(i +" ");
		}
	}
}

/*cannot be subclass of a final class.
 * 
 * class H extends LK{
 * 
 * }
 */
