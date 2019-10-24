package day42_OOP_Encupsulation;

public class Test {

	/*
	 * Name
	 * ID
	 */
	public static void main(String[] args) {
		TestData td = new TestData();
		TestData td2 = new TestData();
		td.setName("Aziza");
		td.setID(201);
		System.out.println("td: " + td.getName());
		System.out.println("td: " + td.getID());
		System.out.println("td2: " + td2.getName());
		System.out.println("td2: " + td2.getID());
	}
	
	
}//The methods/variables names should be self-explanatory and self-documenting
