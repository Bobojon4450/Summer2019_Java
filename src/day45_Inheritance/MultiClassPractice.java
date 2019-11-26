package day45_Inheritance;

class Data{
	public String name = "public";
	private String age = "private";
	String ID = "default";
	protected String pro = "protected";
	
	public void printHello() {
		System.out.println("Hello from inner class");
	}
	
	void printHelloDefault() {
		System.out.println("Hello from inner class");
	}
	
	protected void printHelloProtected() {
		System.out.println("Hello from inner class");
	}
}

public class MultiClassPractice {
	public static void main(String[] args) {
		Data dt = new Data();
		System.out.println(dt.name);
		System.out.println(dt.ID);
		System.out.println(dt.pro);
		dt.printHello();
		dt.printHelloDefault();
		dt.printHelloProtected();
	}
}
