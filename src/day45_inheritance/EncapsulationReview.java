package day45_inheritance;

import java.util.ArrayList;
import java.util.Arrays;

class credentials {

	private String userName;
	private String password;
	private int ID;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getID() {
		return ID;
	}

	public void setID(int x) {
		ID = x;
	}

	public void setcredentials(String userName, String passWord) {
		setUserName(userName);
		setPassword(passWord);
	}

	public void getInfo() {
		System.out.println("username: " + getUserName());
		System.out.println("password: " + getPassword());
	}

}

public class EncapsulationReview {
	public static void main(String[] args) {
		credentials cd = new credentials();
		cd.setUserName("user191");
		cd.setPassword("1234");
		System.out.println(cd.getUserName());
		cd.setID(101);
		System.out.println(cd.getID());

		credentials Nurzat = new credentials();
		Nurzat.setUserName("9876");
		Nurzat.setPassword("nuri345");

		System.out.println("username: " + Nurzat.getUserName());
		System.out.println("password: " + Nurzat.getPassword());

		credentials Seyfo = new credentials();
		Seyfo.setcredentials("Seyfo", "456");
		Seyfo.setPassword("789");
		Seyfo.getInfo();

		credentials Zlfy = new credentials();
		System.out.println("username: " + Zlfy.getUserName());
		System.out.println("password: " + Zlfy.getPassword());

		System.out.println("==============================================\n");

		credentials[] users = { Zlfy, Nurzat, Seyfo };
		users[0].getInfo();
		users[1].getInfo();
		users[2].getInfo();

		System.out.println("==============================================\n");

		ArrayList<credentials> CredentialsList = new ArrayList<>();
		CredentialsList.addAll(Arrays.asList(Zlfy, Nurzat, Seyfo));

		for (credentials each : CredentialsList) {
			each.getInfo();
		}
	}
	
	
}
