package day18_StringMethods_Cont;

public class StringMethod {
	public static void main(String[] args) {
		String a = "Batch 12 is a great batch";
		int num = a.indexOf("g");
		System.out.println(num);
		
		int num2 = a.indexOf("at ");
		System.out.println(num2);
		
		String b = "today is tuesday, toady we have class in the afternoon";
		
		int num3 = b.indexOf("ter");
		System.out.println(num3);
		
		String address = "7925 Jones Branch Dr, McLean, VA 22003";
		int begin = address.indexOf(",")+2;
		int end = address.indexOf(", V");
		String cityName = address.substring(begin, end);
		System.out.println(cityName);
		
		String email = "RandomEmails@gmail.com";
		String emailType = email.substring(email.indexOf("gm"),email.indexOf("."));
		System.out.println(emailType);
		
		
		/*
		 * lastIndexOf(): returns the last occured character's index number as and int value
		 */
		String str = "ABCDEFGHJIB";
		int num4 = str.lastIndexOf("B");
		int num5 = str.indexOf("B");
		System.out.println(num4);
		System.out.println(num5);
		
		String myEmail = "Myemail.school@hotmail.com";
		int begin2 = myEmail.indexOf("@")+1;
		int end2 = myEmail.lastIndexOf(".");
		String myEmailType = myEmail.substring(begin2, end2);
		System.out.println(myEmailType);
		

		
	}
}
