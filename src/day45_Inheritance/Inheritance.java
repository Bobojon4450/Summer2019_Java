package day45_Inheritance;

class TestBase{
	String chromeDriver;
	public String name = "public";
	private String age = "private";
	protected String pro = "protected";
	
	public void takeScreenShot() {System.out.println("Took shot");}
	
	/*	not inheritable	*/
	private void closeBrowser() {System.out.println("Browser closed");}
}

class Another extends TestBase{/*now Another has all members and properties of TestBase class	*/}

public class Inheritance extends TestBase {
	
	public void takeScreenShot(String str) {System.out.println("Overloaded method");}
	public static void main(String[] args) {
		Inheritance in = new Inheritance();
		System.out.println(in.chromeDriver);
		in.takeScreenShot();
		in.takeScreenShot("str");
	}
}
