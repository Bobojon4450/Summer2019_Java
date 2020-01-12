package day13_Review;

public class SwitchStatement {

	public static void main(String[] args) {
		
		int num = 5;
		
		switch (num) {
			case 10 - 5:
				System.out.println("Friday");
				break;
			default:
				System.out.println("Invalid Entry");
				break;
			case 7:
				System.out.println("Sunday");
				break;
		}
		System.out.println("---------------------");
		
		String days = "Day";
		
		switch (days) {
			case "Monday" : System.out.println("Monday");break;
			case "Wednesday" : System.out.println("Wednesday");break;
			case "Thursday" : System.out.println("Thursday");break;
			case "Friday" : System.out.println("Friday");break;
			case "Saturday" : System.out.println("Saturday");break;
			case "Sunday" : System.out.println("Sunday");break;
			case "Tuesday" : System.out.println("Tuesday");break;
			default:
				System.out.println("Invalid");break;
		}
		System.out.println("---------------------");
		
		String day2 = "Monday";
		
		switch (day2) {
		default:
			System.out.println("Invalid");
			break;
		case "Monday":
			System.out.println("Monday");
		case "Wednesday":
			System.out.println("Wednesday");
		case "Thursday":
			System.out.println("Thursday");
		case "Friday":
			System.out.println("Friday");
		case "Saturday":
			System.out.println("Saturday");
		case "Sunday":
			System.out.println("Sunday");
		case "Tuesday":
			System.out.println("Tuesday");
		}//here control flow exits through the }, no need to go to default();
		System.out.println("--------------------------");
		
		byte b = 10;
		short c = 10;
		int i = 10;
		char ch2 = 'A';
		
		switch(b) {}
		switch(c) {}
		switch(i) {}
		switch(ch2) {}
		
		
		long lg = 10;
//		switch (lg) {}
		
		float fl = 10;
//		switch (fl) {}
		
 		double d = 10;
//		switch (d) {}
		
		boolean bool = true;
//		switch (bool) {}
		
		char ch = 'A';
		switch (ch) {}
		
		// OR logic
		char grade = 'B';
		if (grade == 'A' || grade == 'B') {
			System.out.println("Passed the exam.");
		}else {
			System.out.println("Failed the exam");
		}
		
		//mirror of the above if();
		switch (grade) {
		case 'A':
		case 'B':
			System.out.println("Passed the exam");
			break;
		default:
			System.out.println("Failed the exam");
			break;
		}
		System.out.println("-----------------------");
		
		
		
		String US = "USA";
		if (US == "USA" || US == "America" || US == "US") {
			System.out.println("American");
		}else {
			System.out.println("Not American");
		}
		
		//mirror of the above if();
		switch (US) {
		case "USA":
		case "US":
		case "America":
			System.out.println("American");
			break;
		default:
			System.out.println("Not American");
			break;
		}	
		
	}
}