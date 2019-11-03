package day44_accessmodifiers;

public class TestData {

	public static String name = "Juline";
	public static String ID = "001";
	
	private static String password = "cybertek";
	
	/*	default is visible within the package only	*/
	static int age = 15;
	
	public static void staticMethod() {
		System.out.println("It is a static method");
	}
}
