package repl.it_099_108;
import java.util.Scanner;

public class ArraysSplitEmail_108 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    String email = input.nextLine();
	    int count = 0;
	    if (email.contains("@")) {
	    	for (int j = 0; j < email.length(); j++) {
				if ("@".equals(""+email.charAt(j)) ) {
					count++;
				}
			}
	    	if (count > 1) {
	    		System.out.println("invalid email");
			}else {
				splitter(email);
			}
		}else {
			System.out.println("invalid email");
		}
		
	}
	public static void splitter(String input) {
		String arr[] = input.split("@");
	    String id = arr[0].substring((arr.length-arr.length));
	    String domain = arr[1].substring(((arr[1].length()-arr[1].length())));
	    System.out.println("Email id: "+id);
	    System.out.println("Email domain: "+domain);
	}

}
