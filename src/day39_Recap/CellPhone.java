package day39_Recap;

public class CellPhone {

	String brand;
	double screenSize;
	String color;
	double price;
	static String str;
	static int i;
	int j;
	
	public CellPhone() {System.out.println(i++);} 
	
	public CellPhone(String brand, double screenSize, String color,	double price) {
		this.brand = brand;
		this.screenSize = screenSize;
		this.color = color;
		this.price = price;
		this.str = "static";
	}
	
	void call(){System.out.println("Calling");}
	
	void message() {System.out.println("Messaging");}
	
	void takePic() {System.out.println("SnapShoting");}
	
	static void print() {int k;	System.out.println("printing");} 
}
