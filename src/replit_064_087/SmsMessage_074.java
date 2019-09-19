package replit_064_087;
import java.util.*;

public class SmsMessage_074 {

	public static void main(String[] args) {
		/*  We have a message variable already declared and assigned value in this format
			Test data:
				1. Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programming and problem solving}
				2. Sender:<Kuzzat Altay>. From Number:[703-333-2222]. Message:{Hello Everyone!}
		  Output:
		 		Sender: Mike Smith
				Phone Number: 202-123-3456
				Message body: I love programing and problem solving
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the message:");
	    String message = scan.nextLine();
	    String sender = message.substring(message.indexOf("<")+1,message.indexOf(">"));
	    String phoneNumber = message.substring(message.indexOf("[")+1,message.indexOf("]"));
	    String messageBody = message.substring(message.indexOf("{")+1,message.indexOf("}"));
	    
	    System.out.println("Sender: "+sender);
	    System.out.println("Phone Number: "+phoneNumber);
	    System.out.println("Message body: "+messageBody);

	}

}
