package day54_Polymorphism;

interface Interface{
	
	public abstract void get();
	
	public static void add() {
		System.out.println("Add method");
	}
}

interface Interface2 extends Interface{
	
	public abstract void frame();
}

abstract class AbsClass{
	
}

public class Test2 extends AbsClass implements Interface, Interface2{

	
	public static void main(String[] args) {
		Interface inter = new Test2();
		inter.get();
		
		Interface2 inter2 = new Test2();
		inter2.frame();
	}
	
	
	@Override
	public void get() {
		System.out.println("Chrome Browser");	
	}
	
	@Override
	public void frame() {
		System.out.println("frame");	
	}
}

	/*
	@DataProvider(name="ss")        Zuhal's approach
	public static Object[][] ss(){
	    return new Object[][]{{"200"},{"301"},{"404"},{"500"}};
	}
	@Test(dataProvider = "ss")
	public void Test10(String code){
	    driver.findElement(By.xpath("//a[text()='Status Codes']")).click();
	    BrowserUtils.wait(1);
	    WebElement statusCode= driver.findElement(By.xpath("//a[text()='"+code+"']"));
	    statusCode.click();
	    WebElement message= driver.findElement(By.xpath("//p[contains(text(), " +code+")]"));
	    String messageActual = message.getText().trim();
	    String[] messageAct = messageActual.split("\\n");
	    messageActual = messageAct[0];
	    String messageExpected = "This page returned a " + code + " status code.";
	    Assert.assertEquals(messageActual, messageExpected, " Incorrect message");
	}	*/
	
	
	//p[contains(text(), "200")]
	//By.xpath("//input[@id = \"inlineCheckbox"+ i +"\"" + "]" ))