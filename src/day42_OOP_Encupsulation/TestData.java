package day42_OOP_Encupsulation;

public class TestData {

	/*
	 * Name
	 * ID
	 */
	
	/*	instance variables belong to object	*/
	private String name ="Bekir";
	private int ID = 101;

	public String getName() {
		return name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
