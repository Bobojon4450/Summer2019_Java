package replit_064_087;
import java.util.Scanner;

public class Email2_073 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter email: ");
	    String email = scan.next();
	    if(email.contains("@")){
	      String fName = email.substring(0,email.indexOf("_"));
	      String fName2 =fName.substring(0,1).toUpperCase();
	      fName = fName.replaceFirst(fName.substring(0,1), fName2);
	      
	      String lName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
	      String lName2 = lName.substring(0,1).toUpperCase();
	      lName = lName.replaceFirst(lName.substring(0,1), lName2);
	      
	      String domain= email.substring(email.indexOf("@")+1, email.indexOf("."));
	      String topLevelDomain = email.substring(email.indexOf(".")+1);
	      
	      System.out.println("First name: "+fName);
	      System.out.println("Last name: "+lName);
	      System.out.println("Domain: "+domain);
	      System.out.println("Top-Level Domain: "+topLevelDomain);
	    }
	}

}
