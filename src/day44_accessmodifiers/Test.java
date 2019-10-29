package day44_accessmodifiers;
import static day44_accessmodifiers.TestData.*;
//import static			packageName.className.staticName


public class Test {

	public static void main(String[] args) {
		System.out.println(name);
		staticMethod();
		String name[] = {"Azimjon", "Aminjon", "Ahmadjon"};
		System.out.println(age);
		
		
		DefaultAccessModifier df = new DefaultAccessModifier();
		System.out.println(df.nameDefault = "Initialized");
		System.out.println(df.namePublic = "Also intialized");
//		System.out.println(df.namePrivate);
		
		DefaultAccessModifier df2 = new DefaultAccessModifier();
		System.out.println(df2.nameDefault);
		System.out.println(df2.namePublic);
	}
}
