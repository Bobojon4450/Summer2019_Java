package day43_Recap_Static;
import day44_accessmodifiers.TestData;
public class Test {

	int c;
	static String str;
	
	public void test() {
		str = "testMethod";
		c = 10;
	}
	
	static double num = 10.2d;
	static float num2 = 10.1f;
	
	public static void main(String[] args) {
		System.out.println(str);
		//System.out.println(TestData.age); //won't compile since it is a default access modifier.
		System.out.println(num);
		System.out.println(num2);
	}
}
