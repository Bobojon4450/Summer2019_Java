package day46_superKeyword;


class CC{
	
//	private void init() {
//		System.out.println("Initialized!");
//	}
//
//	private void start() {
//		init();
//		System.out.println("Started!");
//	}
//	
//	private void test() {}
	
	public static int num1 = 100;
	private static int num2 = 200;
	protected static int num3 = 300;
	static int num4 = 400;
}

public class Test extends CC{
	
	public static void main(String[] args) {

		CC cc = new CC();
		System.out.println(num1);
//		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
	}
	
	
}
