package day40_staticKeyword;

public class StaticVariables {
	
	static String str;
	static double sharedDouble;
	int instanceNum;
	
	public static void main(String[] args) {
		StaticVariables st = new StaticVariables();
		st.str = "Umar";
		System.out.println(st.str);
		System.out.println(st.instanceNum);
		
		StaticVariables st2 = new StaticVariables();
		st2.str = "Anvar";
		System.out.println(st2.str);
		System.out.println(st.str+"\n");
		
		StaticVariables st3 = new StaticVariables();
		st3.sharedDouble = 10.2;
		System.out.println(st3.sharedDouble);
		System.out.println(st.sharedDouble);
		System.out.println(st2.sharedDouble);
		System.out.println(st3.sharedDouble);
		
		StaticKeyword.printHello();
		
		
	}
}
