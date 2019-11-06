package day48_methodOverriding;

class WebDriver {
	protected void get() {
		System.out.println("Opens browser");
	}

}

class ChromeDriver extends WebDriver {

	@Override
	protected void get() {
		System.out.println("Opens chrome browser");
	}

}

class FireFoxDriver extends WebDriver {

	@Override
	public void get() {
		System.out.println("Opens firefox browser");
	}

}

public class Practice {

	public static void main(String[] args) {
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get(); // chrome browser

		FireFoxDriver driver2 = new FireFoxDriver();
		driver2.get(); // fire fox

	}
}
