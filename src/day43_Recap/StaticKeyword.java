package day43_Recap;

public class StaticKeyword {
	
	static String str = "Adam";
	String name = "Instance";
	
	
	
	public static void printNameStatic() {
		System.out.println(str);
	}
	
	public void printNameInstance() {
		System.out.println(name);	
		System.out.println(str);  	
	}
	

}
