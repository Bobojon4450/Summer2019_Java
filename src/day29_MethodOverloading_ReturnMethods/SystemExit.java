package day29_MethodOverloading_ReturnMethods;

public class SystemExit {
	public static void main(String[] args) {
		System.out.println(number());//it exits number method only.
		System.out.println("Done");
		
	}
	
	
	public static int number() {
		if (true) {
			System.exit(0);//it exits entire system.
		}
		return 5;// this line never gets executed.
	}
	
	public static void method1() {
		System.out.println("Hello Wold");
		System.exit(1);
	}
	
	
}
