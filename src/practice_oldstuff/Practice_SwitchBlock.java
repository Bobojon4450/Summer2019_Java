package practice_oldstuff;

public class Practice_SwitchBlock {

	public static void main(String[] args) {
		
		/*********************************************************
		 * 	SWITCH BLOCK
		 * */
		int statusCode2 = 202;
		
		switch (statusCode2) {
			case 200 : System.out.println("Ok");break;
			case 201 : System.out.println("Created");break;
			case 301 : System.out.println("Moved Permanently");break;
			case 303 : System.out.println("See Other");break;
			case 304 : System.out.println("Not Modified");break;
			case 400 : System.out.println("Bad Request");break;
			case 401 : System.out.println("Unauthorized");break;
			case 403 : System.out.println("Forbidden");break;
			case 404 : System.out.println("Not Found");break;
			case 410 : System.out.println("Gone");break;
			case 500 : System.out.println("Internal Server Error");break;
			case 503 : System.out.println("Service Unavailable");break;
			default  : 
				System.out.println("Invalid Input!!!");
		}
		
		double d = 10.5;//this data-type is not allowed in switch block;
		boolean b = true;//this data-type is not allowed in switch block;
		char ch  = 'W';//this data-type is allowed in switch block;
		
		
		/*
		 * Switch case only verifies if value equals another value. It cannot compare or put condition.
		 * */
		String str = "str";
		
		switch (str) {
			case "A": System.out.println("That's 10");break;
			case "str": System.out.println("That's char");break;
		default:
			System.out.println("Illigal value");
		}

	}

}
