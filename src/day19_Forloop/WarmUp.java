package day19_Forloop;
import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		
//	    Given:  username: cybertek.batch12@gmail.com
//        password: Javengers
//        write a program for the login functionality of the gmail account. (user input is required)
//        - username can be entered either in upper or lower case
//        - password MUST be entered as it is
//        - if the username does not end with "@gmail.com":
//                print "it's not a valid email"
//        - if username ends with gmail but username or password did not match:
//                print "Invalid username or password"
//        - if the username and passwords are correct:
//                print "loged in successfully"
		
		String password = "Javengers";
		String user = "cybertek.batch12@gmail.com";
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the username: ");
		String userName = in.nextLine().toLowerCase();
		System.out.println("Enter the password as it appears: ");
		String passw = in.nextLine();
		
		if (userName.endsWith("@gmail.com")) {
			if (userName.equalsIgnoreCase(user) && passw.equals("Javengers")) {
				System.out.println("logged in successfully!");
			}else {
				if (!userName.equalsIgnoreCase(user) && !passw.equals(password)) {
					System.out.println("Both password and user name is incorrect");
				}else if (!userName.equalsIgnoreCase(user)) {
					System.out.println("Invalid User name");
				}else {
					System.out.println("Invalid password");
				}
			}
		}else {
			System.out.println("it's not a valid email address!");
		}
		
		
		
	}
}
